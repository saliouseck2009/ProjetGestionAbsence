/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import BDD.Requete;
import Test.md5;

/**
 *
 * @author seck
 */
public class Admin {
    Requete requete = new Requete();
    md5 hacher = new md5();
    
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
    
    public boolean AjouterUser(User user) {
        String password = new String(user.getPwd());
        String pass = hacher.hachPassword(password);
        String req ="INSERT INTO `user`(`login`, `pwd`, `profil`)"
                + " VALUES ('"+user.getLogin()+"','"+pass+"','"+user.getProfil()+"')";
        return requete.exeCreate(req);
    }
    
    public boolean SupprimerEtudiant(Etudiant et){
        String req = "DELETE FROM `etudiant` WHERE id_etudiant="+et.getIdEtudiant();
        return requete.exeDelete(req);
    }
    public boolean SupprimerEnseignant(Enseignant ens){
        String req = "DELETE FROM `enseignant` WHERE id_etudiant="+ens.getIdEnseignant();
        return requete.exeDelete(req);
    
    }
    public boolean ModifierEtudiant(Etudiant et){
        String req = "UPDATE `etudiant` SET `NOM_ETUDIANT`='"+et.getNom()+"',`PRENOM_ETUDIANT`='"+et.getPrenom()+
                "',`sexe`='"+et.getSexe()+"',`DATENAISSANCE_ETUDIANT`='"+et.getDateNaissance()+
                "',`STATUS_ETUDIANT`='"+et.getStatusEtudiant()+"',`EMAIL_ETUDIANT`='"+et.getEmailEtudiant()+
                "',`TEL_ETUDIANT`='"+et.getTelEtudiant()+"',`NUMEROCARTE`='"+et.getNumeroCarte()+" WHERE id_etudiant='"+et.getIdEtudiant();
        return requete.exeUpdate(req);
    }
     public boolean ModifierEnseignant(Enseignant ens){
        String req = "UPDATE `enseignant` SET `NOM_ENSEIGNANT`='"+ens.getNom()+"',`PRENOM_ENSEIGNANT`='"+ens.getPrenom()+
               "',`EMAIL_ENSEIGNANT`='"+ens.getEmailEnseignant()+
                "',`TEL_ENSEIGNANT`='"+ens.getTelEnseignant()+" WHERE id_enseignant='"+ens.getIdEnseignant();
        return requete.exeUpdate(req);
    }


    
}
