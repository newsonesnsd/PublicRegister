/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicregistergroup.controller;

import java.util.Hashtable;  

import javax.naming.Context;  
import javax.naming.NamingException;  
import javax.naming.ldap.InitialLdapContext;  
import javax.naming.ldap.LdapContext;  

/**
 *
 * @author newso
 */
public class LdapContextCreation {  
    public static void main(String[] args) {  
        LdapContextCreation ldapContxCrtn = new LdapContextCreation();  
        LdapContext ctx = ldapContxCrtn.getLdapContext();  
    }  
    public LdapContext getLdapContext(){  
        LdapContext ctx = null;  
        try{  
            Hashtable env = new Hashtable();  
            env.put(Context.INITIAL_CONTEXT_FACTORY,  "com.sun.jndi.ldap.LdapCtxFactory");  
            env.put(Context.SECURITY_AUTHENTICATION, "Simple");  
            //it can be <domain\\userid> something that you use for windows login  
            //it can also be  
            env.put(Context.SECURITY_PRINCIPAL, "username@domain.com");  
            env.put(Context.SECURITY_CREDENTIALS, "password");  
            //in following property we specify ldap protocol and connection url.  
            //generally the port is 389  
            env.put(Context.PROVIDER_URL, "ldap://server.domain.com");  
            ctx = new InitialLdapContext(env, null);  
            System.out.println("Connection Successful.");  
        }
        catch(NamingException nex){  
            System.out.println("LDAP Connection: FAILED");  
            nex.printStackTrace();  
        }  
        return ctx;  
    }  

}
