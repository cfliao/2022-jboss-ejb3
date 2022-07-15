package nccu;

import javax.ejb.Remote;

@Remote
public interface Hello {
    public String doHello(String message);
}
