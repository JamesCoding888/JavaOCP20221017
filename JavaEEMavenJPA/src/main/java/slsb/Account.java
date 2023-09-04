package slsb;

import javax.ejb.Local;

@Local
public interface Account {
    public abstract void accountLogin(String accountName, String email); // public abstract could be hided!
    
}
