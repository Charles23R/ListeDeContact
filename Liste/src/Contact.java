/**
 * Created by RenCh1732786 on 2018-01-22.
 */
public class Contact {

    String prenom="";
    String nom="";
    Adresse adresse=null;
    Occupation occupation=null;
    Telephone telephones[]=new Telephone[10];
    int nbTel;


    //Getters
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public Telephone[] getTelephones() {
        return telephones;
    }

    public int getNbTel() {
        return nbTel;
    }

    //Setters
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public void setTelephones(Telephone[] telephones) {
        this.telephones = telephones;
    }

    public void setNbTel(int nbTel) {
        this.nbTel = nbTel;
    }

    public void addNbTel (){
        this.nbTel++;
    }
}
