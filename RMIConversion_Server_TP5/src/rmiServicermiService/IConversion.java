package rmiServicermiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversion extends Remote {
	//on ajout RemoteExeception pour eviter tous exeption posible
	double convertirMontant(double mt) throws RemoteException;

}
