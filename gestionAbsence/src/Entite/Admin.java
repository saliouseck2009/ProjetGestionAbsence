/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import BDD.Requete;

/**
 *
 * @author seck
 */
public class Admin {
    Requete requete = new Requete();
    
    public boolean AjouterEtudiant(Etudiant e) {
          String req ="INSERT INTO etudiant (nom_etudiant,prenom_etudiant,sexe,datenaissance_etudiant,numerocarte,email_etudiant,"
                    + "tel_etudiant )"
                    + "VALUES ('"+e.getNom()+"','"+e.getPrenom()+"','"+e.getSexe()+
                    "','"+e.getDateNaissance()+"','"+e.getNumeroCarte()+"','"+e.getEmailEtudiant()+
                    "','"+e.getTelEtudiant()+"')";
        return requete.exeCreate(req);
    }
    
    public boolean AjouterEnseignant(Enseignant ens) {
        String req ="INSERT INTO `enseignant`(`NOM_ENSEIGNANT`, `PRENOM_ENSEIGNANT`, `EMAIL_ENSEIGNANT`, `TEL_ENSEIGNANT`)"
                + " VALUES ('"+ens.getNom()+"','"+ens.getPrenom()+"','"+ens.getEmailEnseignant()+"','"+ens.getTelEnseignant()+"')";
        return requete.exeCreate(req);
    }
    public boolean User(User user) {
        String req ="INSERT INTO `user`(`login`, `pwd`, `profil`, `TEL_ENSEIGNANT`)"
                + " VALUES ('"+user.getLogin()+"','"+user.getPwd()+"','"+user.getProfil()+"')";
        return requete.exeCreate(req);
    }


    
}
