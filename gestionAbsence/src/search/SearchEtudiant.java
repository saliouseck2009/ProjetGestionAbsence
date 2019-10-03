/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import BDD.Requete;
import Entite.Etudiant;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seck
 */
public class SearchEtudiant {
    Requete requete = new Requete();
    
    public Etudiant RechercherParId(int i) {
        try {
            String req = "SELECT * FROM etudiant WHERE id=" + i;
            Etudiant etudiant = new Etudiant();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            
            while (res.next()) {
                etudiant.setIdEtudiant(i);
                etudiant.setClasse(Sclasse.RechercherParId(res.getInt(2)));
                etudiant.setNom(res.getString(3));
                etudiant.setPrenom(res.getString(4));
                etudiant.setSexe(res.getString(5));
                etudiant.setDateNaissance(res.getString(6));
                etudiant.setStatusEtudiant(res.getString(7));
                etudiant.setEmailEtudiant(res.getString(8));
                etudiant.setTelEtudiant(res.getString(9));
                etudiant.setNumeroCarte(res.getString(10));
                etudiant.setIdUser(i);
                
            }
            return etudiant;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    }
