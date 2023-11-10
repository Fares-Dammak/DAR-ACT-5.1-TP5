package rmiClient;

import java.rmi.Naming;

//importer l'interface IConvertion
import rmiClient.IConversion;

public class conversionClient {

	public static void main(String[] args) throws Exception {
		//methode lookup pour chercher la referance et lookup return un objet de type remote
		IConversion start = (IConversion) Naming.lookup("rmi://localhost:1099/OD");
		//appel du methode convertMontant pour convertir 10 euro  en dinar
		System.out.println(start.convertirMontant(10));
	}

}
