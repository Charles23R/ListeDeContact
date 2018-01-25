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
        char decider;

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
                    contacts[nbContacts-1].getAdresse().setNumeroPorte(sc.next());
                    System.out.println("  Rue : ");
                    contacts[nbContacts-1].getAdresse().setRue(sc.next());
                    System.out.println("  Appartement (facultatif) : ");
                    contacts[nbContacts-1].getAdresse().setAppartement(sc.next());
                    System.out.println("  Ville : ");
                    contacts[nbContacts-1].getAdresse().setVille(sc.next());
                    System.out.println("  Province : ");
                    contacts[nbContacts-1].getAdresse().setProvince(sc.next());
                    System.out.println("  Pays : ");
                    contacts[nbContacts-1].getAdresse().setPays(sc.next());
                    System.out.println("Occupation : ");
                    contacts[nbContacts-1].setOccupation(new Occupation());
                    System.out.println("  Poste : ");
                    contacts[nbContacts-1].getOccupation().setPoste(sc.next());
                    System.out.println("  Entreprise : ");
                    contacts[nbContacts-1].getOccupation().setEntreprise(new Entreprise());
                    System.out.println("    Nom : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().setNom(sc.next());
                    System.out.println("    Adresse : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().setAdresse(new Adresse());
                    System.out.println("      Numéro de porte : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setNumeroPorte(sc.next());
                    System.out.println("      Rue : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setRue(sc.next());
                    System.out.println("      Appartement : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setNumeroPorte(sc.next());
                    System.out.println("      Ville : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setVille(sc.next());
                    System.out.println("      Province : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setProvince(sc.next());
                    System.out.println("      Pays : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setPays(sc.next());
                    System.out.println("");
                    decider='o';
                    contacts[nbContacts-1].setNbTel(0);
                    while (decider!='n'){
                        System.out.println("Entrer un numéro de téléphone? (o/n)");
                        decider=sc.next().charAt(0);
                        if (decider=='o') {

                            System.out.println("À quoi correspond ce numéro ? (cellulaire, maison, travail...)");
                            contacts[nbContacts-1].getTelephones()[contacts[nbContacts-1].getNbTel()].setInfo(sc.next());
                            System.out.println("Quel est le numéro?");
                            contacts[nbContacts-1].getTelephones()[contacts[nbContacts-1].getNbTel()].setNumero(sc.next());
                            System.out.println("");
                            contacts[nbContacts-1].addNbTel();
                        }
                        else if (decider!='o' && decider!='n'){
                            System.out.println("erreur");
                        }
                    }

                    System.out.println("Votre contact a été entré avec succès !");

                    break;

                case 2: //Modifier un contact



                    System.out.println("Ce contact sera entré à la position #"+nbContacts+".");
                    System.out.println("Veuillez entrer les informations suivantes");
                    System.out.println("Prénom : ");
                    contacts[nbContacts-1].setPrenom(sc.next());
                    System.out.println("Nom : ");
                    contacts[nbContacts-1].setNom(sc.next());
                    System.out.println("Adresse : ");
                    contacts[nbContacts-1].setAdresse(new Adresse());
                    System.out.println("  Numéro de porte : ");
                    contacts[nbContacts-1].getAdresse().setNumeroPorte(sc.next());
                    System.out.println("  Rue : ");
                    contacts[nbContacts-1].getAdresse().setRue(sc.next());
                    System.out.println("  Appartement (facultatif) : ");
                    contacts[nbContacts-1].getAdresse().setAppartement(sc.next());
                    System.out.println("  Ville : ");
                    contacts[nbContacts-1].getAdresse().setVille(sc.next());
                    System.out.println("  Province : ");
                    contacts[nbContacts-1].getAdresse().setProvince(sc.next());
                    System.out.println("  Pays : ");
                    contacts[nbContacts-1].getAdresse().setPays(sc.next());
                    System.out.println("Occupation : ");
                    contacts[nbContacts-1].setOccupation(new Occupation());
                    System.out.println("  Poste : ");
                    contacts[nbContacts-1].getOccupation().setPoste(sc.next());
                    System.out.println("  Entreprise : ");
                    contacts[nbContacts-1].getOccupation().setEntreprise(new Entreprise());
                    System.out.println("    Nom : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().setNom(sc.next());
                    System.out.println("    Adresse : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().setAdresse(new Adresse());
                    System.out.println("      Numéro de porte : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setNumeroPorte(sc.next());
                    System.out.println("      Rue : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setRue(sc.next());
                    System.out.println("      Appartement : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setNumeroPorte(sc.next());
                    System.out.println("      Ville : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setVille(sc.next());
                    System.out.println("      Province : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setProvince(sc.next());
                    System.out.println("      Pays : ");
                    contacts[nbContacts-1].getOccupation().getEntreprise().getAdresse().setPays(sc.next());
                    System.out.println("");
                    decider='o';
                    contacts[nbContacts-1].setNbTel(0);
                    while (decider!='n'){
                        System.out.println("Entrer un numéro de téléphone? (o/n)");
                        decider=sc.next().charAt(0);
                        if (decider=='o') {

                            System.out.println("À quoi correspond ce numéro ? (cellulaire, maison, travail...)");
                            contacts[nbContacts-1].getTelephones()[contacts[nbContacts-1].getNbTel()].setInfo(sc.next());
                            System.out.println("Quel est le numéro?");
                            contacts[nbContacts-1].getTelephones()[contacts[nbContacts-1].getNbTel()].setNumero(sc.next());
                            System.out.println("");
                            contacts[nbContacts-1].addNbTel();
                        }
                        else if (decider!='o' && decider!='n'){
                            System.out.println("erreur");
                        }
                    }

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
