package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiServicermiService.*;

//classe server qui va untiliser sekeleton
public class ConversionServer {

	public static void main(String[] args) throws Exception {
		//reservation du port
		LocateRegistry.createRegistry(1099);
		//creation du skeleton
		ConversionImpl od = new ConversionImpl();
		System.out.println(od.toString());
		//methode rebind qui va publiet la referance du l'objet distant qui a comme parametre URL et skeleton
		Naming.rebind("rmi://localhost:1099/OD", od);
	}

}
