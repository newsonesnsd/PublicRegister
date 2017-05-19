package publicregistergroup.controller;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Hashtable;
import javax.naming.AuthenticationException;
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
public class LdapAuthen {

    /**
     * @param args the command line arguments
     */
    
    private final static String LdapUrl = "ldap://10.1.130.12:389";
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
        env.put(Context.PROVIDER_URL, LdapUrl + "/"+ base);
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

    public static boolean getLogin (String username, String password) {
        Hashtable<String,String> env = new Hashtable <>();
        
        env.put(Context.INITIAL_CONTEXT_FACTORY, contextFactory);
        env.put(Context.PROVIDER_URL, LdapUrl);
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, getDn(username));
        env.put(Context.SECURITY_CREDENTIALS, password);

        try {
            if (password != null && !password.isEmpty()) {
                ldapContext(env);
                System.out.println("ผ่านจ้า");
            }
            else {
                AuthenticationException authen;
                authen = new AuthenticationException();
                return false;
            }
        }
        catch (javax.naming.AuthenticationException e) {
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
        
    public static void loginWelcome (String name , String password,JLabel welcome) throws Exception{
        String username = "";
        if(name!=null){
            username = name;
        }
        String dn = getUid(username , welcome);

        if (dn != null) {
            /* Found user - test password */
            if (getLogin(dn, password)) {
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
    
}
