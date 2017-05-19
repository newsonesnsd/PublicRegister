package publicregistergroup.controller;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Hashtable;
import java.util.Scanner;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author newsonesnsd
 */
public class LdapAuthen {

    /**
     * @param args the command line arguments
     */
    
    private final static String ldapURI = "ldap://10.1.130.12:389";
    private final static String base = "ou=people,ou=st,dc=kmutt,dc=ac,dc=th";
    private final static String contextFactory = "com.sun.jndi.ldap.LdapCtxFactory";

    
    private static String getDn(String username) {
        return "uid=" + username + "," + base;
    }
    private static DirContext ldapContext () throws Exception {
        Hashtable<String,String> env = new Hashtable <>();
        return ldapContext(env);
    }

    private static DirContext ldapContext (Hashtable <String,String>env) throws Exception {
        env.put(Context.INITIAL_CONTEXT_FACTORY, contextFactory);
        env.put(Context.PROVIDER_URL, ldapURI + "/"+ base);
        DirContext ctx = new InitialDirContext(env);
        return ctx;
    }

    private static String getUid (String user , JLabel welcome) throws Exception {
        DirContext ctx = ldapContext();
        String filter = "(uid=" + user + ")";
        SearchControls ctrl = new SearchControls();
        ctrl.setSearchScope(SearchControls.SUBTREE_SCOPE);
        NamingEnumeration answer = ctx.search("", filter, ctrl);

        String dn;
        if (answer.hasMore()) {
            SearchResult result = (SearchResult) answer.next();
            Attributes attrs = result.getAttributes();
            System.out.println(attrs);
            String tempName = attrs.get("uid")+"";
            tempName = tempName.substring(4);
//            System.out.println("Hi!, " + tempName.substring(4));
//            welcome.setText("Hi , " + tempName.substring(4));
            // LDAP จะมี context มาให้ ต้องตัดออก ไม่สามารถ get ค่ามาโดยตรได้
            welcome.setText("Hi , " + tempName);

            dn = result.getNameInNamespace();
        }
        else {
            dn = null;
            welcome.setText("Error Invalid username , password");
        }
        answer.close();
        return dn;
    }

    private static boolean testBind (String username, String password) throws Exception {
        Hashtable<String,String> env = new Hashtable <>();
        
        env.put(Context.INITIAL_CONTEXT_FACTORY, contextFactory);
        env.put(Context.PROVIDER_URL, ldapURI);
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, getDn(username));
        env.put(Context.SECURITY_CREDENTIALS, password);

        try {
            ldapContext(env);
        }
        catch (javax.naming.AuthenticationException e) {
            return false;
        }
        return true;
    }
        
    public static void login (String name , String password,JLabel welcome) throws Exception{
        Scanner sc = new Scanner(System.in);
        String username = "";
        if(name!=null){
            username = name;
        }
        String dn = getUid( username , welcome );

        if (dn != null) {
            /* Found user - test password */
            if (testBind(dn, password)) {
                welcome.setText( "user '" + username + "' authentication succeeded" );
                System.exit(0);
            }
            else {
                welcome.setText( "user '" + username + "' authentication failed" );
                welcome.setText( "invalid username or password" );
                System.exit(1);
            }
        }
        else {
            welcome.setText( "invalid username or password" );
    //          welcome.setText( "user '" + username + "' not found" );
    //          System.exit(1);
        }
    }

        public static void main(String[] args) throws Exception {
            //boolean isLogin = testBind("59130500011", "News@ne0845221915");
            //System.out.println(isLogin);
            JFrame newFrame = new JFrame("TestLogin");
            newFrame.setSize(800,600);
            JPanel newPanel = new JPanel();
            newFrame.add(newPanel);
            JLabel welcome = new JLabel();
            newFrame.setLocationRelativeTo(null);
            newFrame.setVisible(true);
            newPanel.add(welcome);
            //newFrame.pack();
            getUid("59130500004", welcome);
            System.out.println(testBind("59130500011", "News@ne0845221915"));
        }
    
}
