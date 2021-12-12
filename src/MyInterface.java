import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
 public String reverse(String R) throws RemoteException;
 public char MinChar(String R) throws RemoteException;
 public String CaseChanger(String R) throws RemoteException;
}
