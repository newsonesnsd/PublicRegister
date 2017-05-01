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
import javax.swing.JLabel;

/**
 *
 * @author newsonesnsd
 */
public class JavaLDAP {

    /**
     * @param args the command line arguments
     */
    
    private final static String ldapURI = "ldap://10.1.130.12:389/ou=people,ou=st,dc=kmutt,dc=ac,dc=th";
    private final static String contextFactory = "com.sun.jndi.ldap.LdapCtxFactory";

    private static DirContext ldapContext () throws Exception {
        Hashtable<String,String> env = new Hashtable <String,String>();
        return ldapContext(env);
    }

    private static DirContext ldapContext (Hashtable <String,String>env) throws Exception {
        env.put(Context.INITIAL_CONTEXT_FACTORY, contextFactory);
        env.put(Context.PROVIDER_URL, ldapURI);
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
                        String tempName = attrs.get("cn")+"";
//                        System.out.println("Hi!, " + tempName.substring(4));
                        welcome.setText("Hi , " + tempName.substring(4));
            
                        dn = result.getNameInNamespace();
        }
        else {
            dn = null;
                        welcome.setText("Error Valid username , password");
        }
        answer.close();
        return dn;
    }

    private static boolean testBind (String dn, String password) throws Exception {
        Hashtable<String,String> env = new Hashtable <String,String>();
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, dn);
        env.put(Context.SECURITY_CREDENTIALS, password);

        try {
            ldapContext(env);
        }
        catch (javax.naming.AuthenticationException e) {
            return false;
        }
        return true;
    }
        
    public void login (String name , String password,JLabel welcome) throws Exception{
        Scanner sc = new Scanner(System.in);
        String username = "";
        if(name!=null){
            username = name;
        }
        String dn = getUid( username , welcome );

        if (dn != null) {
            /* Found user - test password */
            if ( testBind( dn, password ) ) {
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
            //Scanner input = new Scanner(System.in);
            //String user = input.nextLine();
            //String pws = input.nextLine();
            //JavaLDAP jvld = new JavaLDAP();
            JLabel welcome = new JLabel("Login");
            welcome.setVisible(true);
            //jvld.login(pws, pws, welcome);
        }
    
}
