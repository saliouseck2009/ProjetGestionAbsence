package Entite;


public class Enseignant  {

    private int idEnseignant;
    private String nom;
    private String prenom;
    private String emailEnseignant;
    private String telEnseignant;
    private int idUser;
    

    public Enseignant() {
       
    }

    public Enseignant(int idEnseignant, String nom, String prenom, String emailEnseignant, String telEnseignant, int idUser) {
        this.idEnseignant = idEnseignant;
        this.nom = nom;
        this.prenom = prenom;
        this.emailEnseignant = emailEnseignant;
        this.telEnseignant = telEnseignant;
        this.idUser = idUser;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmailEnseignant() {
        return emailEnseignant;
    }

    public void setEmailEnseignant(String emailEnseignant) {
        this.emailEnseignant = emailEnseignant;
    }

    public String getTelEnseignant() {
        return telEnseignant;
    }

    public void setTelEnseignant(String telEnseignant) {
        this.telEnseignant = telEnseignant;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

  


    
}
