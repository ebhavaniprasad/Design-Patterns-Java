
import java.rmi.*;

public interface RmiInterface extends java.rmi.Remote
{
   String sayWelcome() throws RemoteException;   
   String login();
   String resetPassword(String password);
   //String getRegister() throws RemoteException; // customer method
   void addtoCart() throws RemoteException;      // customer method   
   void itemsAvaliable() throws RemoteException; // customer method
   String addItems() throws RemoteException;   // administrator method
   double updateItems() throws RemoteException;   // administrator method
}
