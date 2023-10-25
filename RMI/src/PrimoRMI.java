import java.rmi.Remote;
import java.io.Serializable;

public interface PrimoRMI extends Remote  {
    boolean esPrimo(int numero) throws java.rmi.RemoteException;
}