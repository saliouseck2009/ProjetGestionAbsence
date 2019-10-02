package Entite;

/**
 *
 * @author Wilfried
 */
public class Etudiant {

    private int idEtudiant;
    private String nom;
    private String prenom;
    private Classe classe;
    private String emailEtudiant;
    private String telEtudiant;
    private String emailEnseignant;
    private int idUser;
    private String numeroCarte;
    private String statusEtudiant;
    private String dateNaissance;
    

    public Etudiant() {
       
    }

    public Etudiant(int idEtudiant, String nom, String prenom, Classe classe, String emailEtudiant, String telEtudiant, String emailEnseignant, int idUser, String numeroCarte, String statusEtudiant, String dateNaissance) {
        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.emailEtudiant = emailEtudiant;
        this.telEtudiant = telEtudiant;
        this.emailEnseignant = emailEnseignant;
        this.idUser = idUser;
        this.numeroCarte = numeroCarte;
        this.statusEtudiant = statusEtudiant;
        this.dateNaissance = dateNaissance;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
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

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public String getEmailEtudiant() {
        return emailEtudiant;
    }

    public void setEmailEtudiant(String emailEtudiant) {
        this.emailEtudiant = emailEtudiant;
    }

    public String getTelEtudiant() {
        return telEtudiant;
    }

    public void setTelEtudiant(String telEtudiant) {
        this.telEtudiant = telEtudiant;
    }

    public String getEmailEnseignant() {
        return emailEnseignant;
    }

    public void setEmailEnseignant(String emailEnseignant) {
        this.emailEnseignant = emailEnseignant;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getStatusEtudiant() {
        return statusEtudiant;
    }

    public void setStatusEtudiant(String statusEtudiant) {
        this.statusEtudiant = statusEtudiant;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    

    

}
