package java.rmiClient;

import rmiService.IBanque;

import java.rmi.Naming;
import java.rmi.RemoteException;

// Importez les classes nécessaires liées à votre banque distante

public class BanqueClient {
    public static void main(String[] args) {
        try {
            // Obtention de l'instance du registre RMI sur le serveur distant

            // Recherche du service bancaire par son nom enregistré dans le registre RMI
            IBanque stub = (IBanque) Naming.lookup("rmi://localhost:1099/BanqueObject");

            // Maintenant, vous avez le stub du service bancaire, vous pouvez appeler ses méthodes distantes
            // Par exemple, appelons la méthode getInfoCompte avec le code de compte 123
            String infoCompte = stub.getInfoCompte(123);

            System.out.println("Information du compte : " + infoCompte);

            // Vous pouvez également appeler d'autres méthodes du service RMI ici

        } catch (RemoteException e) {
            System.err.println("Erreur RemoteException : " + e.toString());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erreur : " + e.toString());
            e.printStackTrace();
        }
    }
}
