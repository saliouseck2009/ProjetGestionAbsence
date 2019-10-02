package Entite;


public class Classe {

    private int idClasse;
    private String nomClasse;
    private String anneeScolaire;
  

    public Classe() {
    }

    public Classe(int idClasse, String nomClasse, String anneeScolaire) {
        this.idClasse = idClasse;
        this.nomClasse = nomClasse;
        this.anneeScolaire = anneeScolaire;
    }

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public String getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setAnneeScolaire(String anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }



    
}
