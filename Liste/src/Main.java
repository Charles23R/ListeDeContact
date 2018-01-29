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
        Telephone telephone=new Telephone();
        int numContact=0;
        String chaine;

        //Initialisation du scanner
        Scanner sc= new Scanner(System.in);

        while (programme){
            System.out.println("Bienvenue dans l'application Contacts!");
            System.out.println("1- Ajouter un contact");
            System.out.println("2- Modifier un contact");
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
                            telephone.setInfo(sc.next());
                            System.out.println("Quel est le numéro?");
                            telephone.setNumero(sc.next());
                            contacts[nbContacts-1].getTelephones()[contacts[nbContacts-1].getNbTel()]=telephone;
                            System.out.println("");
                        }
                        else if (decider!='o' && decider!='n'){
                            System.out.println("erreur");
                        }
                    }

                    System.out.println("Votre contact a été entré avec succès !");

                    break;

                case 2: //Modifier un contact

                    System.out.println("Quel est le numéro du contact");
                numContact=sc.nextInt();


                    System.out.println("Veuillez entrer les informations suivantes");
                    System.out.println("Prénom : ("+contacts[numContact-1].getPrenom()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].setPrenom(chaine);
                    }
                    System.out.println("Nom : ("+contacts[numContact-1].getNom()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].setNom(chaine);
                    }
                    System.out.println("Adresse : ");
                    System.out.println("  Numéro de porte : ("+contacts[numContact-1].getAdresse().getNumeroPorte()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getAdresse().setNumeroPorte(chaine);
                    }
                    System.out.println("  Rue : ("+contacts[numContact-1].getAdresse().getRue()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getAdresse().setRue(chaine);
                    }
                    System.out.println("  Appartement (facultatif) : ("+contacts[numContact-1].getAdresse().getAppartement()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getAdresse().setAppartement(chaine);
                    }
                    System.out.println("  Ville : ("+contacts[numContact-1].getAdresse().getVille()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getAdresse().setVille(chaine);
                    }
                    System.out.println("  Province : ("+contacts[numContact-1].getAdresse().getProvince()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getAdresse().setProvince(chaine);
                    }
                    System.out.println("  Pays : ("+contacts[numContact-1].getAdresse().getPays()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getAdresse().setPays(chaine);
                    }
                    System.out.println("Occupation : ");
                    System.out.println("  Poste : ("+contacts[numContact-1].getOccupation().getPoste()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getOccupation().setPoste(chaine);
                    }
                    System.out.println("  Entreprise : ");
                    System.out.println("    Nom : ("+contacts[numContact-1].getOccupation().getEntreprise().getNom()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getOccupation().getEntreprise().setNom(chaine);
                    }
                    System.out.println("    Adresse : ");
                    System.out.println("      Numéro de porte : ("+contacts[numContact-1].getOccupation().getEntreprise().getAdresse().getNumeroPorte()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getOccupation().getEntreprise().getAdresse().setNumeroPorte(chaine);
                    }
                    System.out.println("      Rue : ("+contacts[numContact-1].getOccupation().getEntreprise().getAdresse().getRue()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getOccupation().getEntreprise().getAdresse().setRue(chaine);
                    }
                    System.out.println("      Appartement : ("+contacts[numContact-1].getOccupation().getEntreprise().getAdresse().getNumeroPorte()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getOccupation().getEntreprise().getAdresse().setAppartement(chaine);
                    }
                    System.out.println("      Ville : ("+contacts[numContact-1].getOccupation().getEntreprise().getAdresse().getVille()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getOccupation().getEntreprise().getAdresse().setVille(chaine);
                    }
                    System.out.println("      Province : ("+contacts[numContact-1].getOccupation().getEntreprise().getAdresse().getProvince()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getOccupation().getEntreprise().getAdresse().setProvince(chaine);
                    }
                    System.out.println("      Pays : ("+contacts[numContact-1].getOccupation().getEntreprise().getAdresse().getPays()+")");
                    chaine=sc.nextLine().trim();
                    if (!chaine.equals("")){
                        contacts[numContact-1].getOccupation().getEntreprise().getAdresse().setPays(chaine);
                    }
                    System.out.println("");

                    for (int j=0; j<contacts[numContact-1].getTelephones().length; j++){
                        if (contacts[numContact-1].getTelephones()[j].getNumero().equals(" ")){
                        }
                        else{
                            System.out.println("  "+contacts[numContact-1].getTelephones()[j].getInfo()+" : "+contacts[numContact-1].getTelephones()[j].getNumero());
                            chaine=sc.nextLine().trim();
                            if (!chaine.equals("")){
                                contacts[numContact-1].getTelephones()[j].setNumero(chaine);
                            }
                        }
                    }
                    decider='o';
                    while (decider!='n'){
                        System.out.println("Entrer un numéro de téléphone? (o/n)");
                        decider=sc.next().charAt(0);
                        if (decider=='o') {

                            System.out.println("À quoi correspond ce numéro ? (cellulaire, maison, travail...)");
                            contacts[numContact-1].getTelephones()[contacts[nbContacts-1].getNbTel()].setInfo(sc.next());
                            System.out.println("Quel est le numéro?");
                            contacts[numContact-1].getTelephones()[contacts[nbContacts-1].getNbTel()].setNumero(sc.next());
                            System.out.println("");
                            contacts[numContact-1].addNbTel();
                        }
                        else if (decider!='o' && decider!='n'){
                            System.out.println("erreur");
                        }
                    }

                    break;

                case 3: //Afficher les contacts

                    System.out.println("Vous avez "+nbContacts+" contact(s)");

                    for (int i=0; i<nbContacts; i++) {
                        System.out.println("Contact #"+(i+1)+" :");
                        System.out.println("-------------");
                        System.out.println("Prénom : "+contacts[i].getPrenom());
                        System.out.println("Nom : "+contacts[i].getNom());
                        System.out.println("Adresse : ");
                        System.out.println("  Numéro de porte : "+contacts[i].getAdresse().getNumeroPorte());
                        System.out.println("  Rue : "+contacts[i].getAdresse().getRue());
                        System.out.println("  Appartement (facultatif) : "+contacts[i].getAdresse().getAppartement());
                        System.out.println("  Ville : "+contacts[i].getAdresse().getVille());
                        System.out.println("  Province : "+contacts[i].getAdresse().getProvince());
                        System.out.println("  Pays : "+contacts[i].getAdresse().getPays());
                        System.out.println("Occupation : ");
                        System.out.println("  Poste : "+contacts[i].getOccupation().getPoste());
                        System.out.println("  Entreprise : ");
                        System.out.println("    Nom : "+contacts[i].getOccupation().getEntreprise().getNom());
                        System.out.println("    Adresse : ");
                        System.out.println("      Numéro de porte : "+contacts[i].getOccupation().getEntreprise().getAdresse().getNumeroPorte());
                        System.out.println("      Rue : "+contacts[i].getOccupation().getEntreprise().getAdresse().getRue());
                        System.out.println("      Appartement : "+contacts[i].getOccupation().getEntreprise().getAdresse().getNumeroPorte());
                        System.out.println("      Ville : "+contacts[i].getOccupation().getEntreprise().getAdresse().getVille());
                        System.out.println("      Province : "+contacts[i].getOccupation().getEntreprise().getAdresse().getProvince());
                        System.out.println("      Pays : "+contacts[i].getOccupation().getEntreprise().getAdresse().getPays());
                        System.out.println("Téléphones : ");
                        for (int j=0; j<contacts[i].getTelephones().length; j++){
                            if (contacts[i].getTelephones()[j].getNumero().equals(" ")){
                            }
                            else{
                                System.out.println("  "+contacts[i].getTelephones()[j].getInfo()+" : "+contacts[i].getTelephones()[j].getNumero());
                            }
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
