/**
 * Created by RenCh1732786 on 2018-01-22.
 */
public class Adresse {

    String numeroPorte="0";
    String rue="";
    String appartement="";
    String ville="";
    String province="";
    String pays="";

    //Getters
    public String getNumeroPorte() {
        return numeroPorte;
    }

    public String getRue() {
        return rue;
    }

    public String getAppartement() {
        return appartement;
    }

    public String getVille() {
        return ville;
    }

    public String getProvince() {
        return province;
    }

    public String getPays() {
        return pays;
    }

    //Setters
    public void setNumeroPorte(String numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setAppartement(String appartement) {
        this.appartement = appartement;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
