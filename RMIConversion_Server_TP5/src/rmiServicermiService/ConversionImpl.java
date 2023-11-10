package rmiServicermiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//la classe ConversionImpl qui implement IConversion est va jouer le role du skeleton dans l'architecture
public class ConversionImpl extends UnicastRemoteObject implements IConversion  {
	
	//consturcteur par defaut :
	//public si la classe ServerRMI existe alleir du package
	//protected si la classe ServerRMI existe dans meme package
	public ConversionImpl() throws RemoteException {
		super();
	}
	
	
	@Override
	//methode convertirMontant du l'interface IConversion convertir un montant (mt) d’Euro au Dinar.
	public double convertirMontant(double mt) {
		return mt*3.3;
	}
	
	
}
