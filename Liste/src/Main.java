import java.util.Scanner;

/**
 * Created by RenCh1732786 on 2018-01-22.
 */
public class Main {
    public static void main(String[] args) {

        boolean programme=true;
        int choixMain;
        Contact contacts[]=new Contact[20];
        int nbContacts=0;

        //Initialisation du scanner
        Scanner sc= new Scanner(System.in);

        while (programme){
            System.out.println("Bienvenue dans l'application Contacts!");
            System.out.println("1- Ajouter un contact");
            System.out.println("2- Modifier un cantact");
            System.out.println("3- Afficher les contacts");
            System.out.println("4- Quitter");
            choixMain=sc.nextInt();

            switch (choixMain){
                case 1: //Ajouter un contact

                    nbContacts++;
                contacts[nbContacts-1]= new Contact();
                System.out.println("Ce contact sera entré à la position #"+nbContacts+".");
                    System.out.println("Veuillez entrer les informations suivantes");
                    System.out.println("Prénom : ");
                    contacts[nbContacts-1].setPrenom(sc.next());
                    System.out.println("Nom : ");
                    contacts[nbContacts-1].setNom(sc.next());
                    System.out.println("Adresse : ");
                    contacts[nbContacts-1].setAdresse(new Adresse());
                    System.out.println("  Numéro de porte : ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                    break;

                case 2: //Modifier un contact
                    break;

                case 3: //Afficher les contacts

                    for (int i=0; i<contacts.length; i++) {
                    if (contacts[i]!=null){
                        System.out.println((i+1)+"- "+contacts[i].getPrenom()+" "+contacts[i].getNom());
                    }
                    }
                    break;

                case 4: //Quitter

                    programme=false;
                    System.out.println("Tous vos contacts ont été supprimés! À la prochaine!");
                    break;

                default: //Erreur
                    System.out.println("Erreur");
            }
        }

        //Fermeture du scanner

    }
}
