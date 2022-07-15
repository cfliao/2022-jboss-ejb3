package nccu;

import javax.ejb.Stateless;

@Stateless(name="ejb/Hello",
        mappedName="ejb/Hello")
public class HelloBean implements Hello {
    public String doHello(String message) {
        return message + " processed.";
    }
}