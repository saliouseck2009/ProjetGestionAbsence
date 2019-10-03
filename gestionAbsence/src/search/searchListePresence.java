/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import BDD.Requete;
import Entite.Classe;
import Entite.Etudiant;
import Entite.User;
import Entite.listePresence;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seck
 */
public class searchListePresence {
    Requete requete = new Requete();
    listePresence list=new listePresence();
    ////////////////Recherche par Etudiant///////////////////
    
    public ArrayList<Etudiant> RechercherParEtudiant(Etudiant e) {
        try {
            String req = "SELECT * FROM etudiant WHERE id_classe=" + e.getIdEtudiant();
            Etudiant etudiant = new Etudiant();
            ArrayList<Etudiant> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                etudiant.setIdEtudiant(1);
                etudiant.setClasse(Sclasse.RechercherParId(res.getInt(2)));
                etudiant.setNom(res.getString(3));
                etudiant.setPrenom(res.getString(4));
                etudiant.setSexe(res.getString(5));
                etudiant.setDateNaissance(res.getString(6));
                etudiant.setStatusEtudiant(res.getString(7));
                etudiant.setEmailEtudiant(res.getString(8));
                etudiant.setTelEtudiant(res.getString(9));
                etudiant.setNumeroCarte(res.getString(10));
                etudiant.setUser(Suser.RechercherParId(res.getInt(11)));
                liste.add(etudiant);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     
}
