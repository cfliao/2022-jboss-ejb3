package nccu.ejb3.client;

import nccu.Hello;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class JBossTestCalculatorClient {

    public static void main(String[] args) throws NamingException {
        Properties properties = new Properties();

        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
        properties.put(Context.PROVIDER_URL, "remote+http://localhost:8080");
        InitialContext ic;
        ic = new InitialContext(properties);
        Object ref = ic.lookup("jboss-ejb3client-1.0-SNAPSHOT/ejb/Hello!nccu.Hello");
        Hello hello = (Hello) ref;
        String value = hello.doHello("test");
        System.out.println(value);
    }
}
