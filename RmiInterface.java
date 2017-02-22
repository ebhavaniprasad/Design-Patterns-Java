
import java.rmi.*;

// Ryan: Please include usefull comments in each file.
public interface RmiInterface extends java.rmi.Remote
{
   String sayWelcome() throws RemoteException;   
   // Ryan: Why do these functions not throw a Remote Exception?
   // All remote function calls should throw this exception!
   String login();
   String resetPassword(String password);
   //String getRegister() throws RemoteException; // customer method
   void addtoCart() throws RemoteException;      // customer method   
   void itemsAvaliable() throws RemoteException; // customer method
   String addItems() throws RemoteException;   // administrator method
   double updateItems() throws RemoteException;   // administrator method
}
