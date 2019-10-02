/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import BDD.Requete;
import Entite.Etudiant;
import java.sql.ResultSet;

/**
 *
 * @author seck
 */
public class SearchEtudiant {
    Requete requete = new Requete();
 public Etudiant RechercherParId(int i) {
        String req = "SELECT * FROM etudiant WHERE id=" + i;
        Etudiant etudiant = new Etudiant();
        ResultSet res = requete.exeRead(req);
        try {
            while (res.next()) {
                etudiant.setIdEtudiant(i);
                etudiant.set
                etudiant.setNom(res.getString(2));
                etudiant.setPrenom(res.getString(3));
                etudiant.setClasse(cDAO.RechercherParId(res.getInt(4)));
            }
            return etudiant;
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
