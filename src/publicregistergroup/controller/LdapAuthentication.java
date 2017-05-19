package publicregistergroup.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Hashtable;

import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class LdapAuthentication {
	public static void main(String[] args) {
            String username = "";
            String password = "";
            String base = "ou=People,ou=st,dc=kmutt,dc=ac,dc=th";
            String dn = "uid=" + username + "," + base;
            String ldapURL = "ldap://10.1.130.12:389";

            // Setup environment for authenticating

            Hashtable<String, String> environment;
            environment = new Hashtable<String, String>();
            environment.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
            environment.put(Context.PROVIDER_URL, ldapURL);
            environment.put(Context.SECURITY_AUTHENTICATION, "simple");
            environment.put(Context.SECURITY_PRINCIPAL, dn);
            environment.put(Context.SECURITY_CREDENTIALS, password);

            try {
                DirContext authContext;
                authContext = new InitialDirContext(environment);

                // user is authenticated
                System.out.println("Done");
            }
            catch (AuthenticationException ex) {
                // Authentication failed
                System.out.println(ex);
            }
            catch (NamingException ex){
                ex.printStackTrace();
            }
	}
}
