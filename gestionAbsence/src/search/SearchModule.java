/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import BDD.Requete;
import Entite.Enseignant;
import Entite.Module;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seck
 */
public class SearchModule {
    Requete requete=new Requete();
    Module mod = new Module();
     ////////////////Rechercher par idmodule///////////////////
    
     public ArrayList<Module> RechercherParIdmodule(int id_module) {
        try {
            String req = "SELECT * FROM module WHERE id_module='" + id_module + "'" ;
            ArrayList<Module> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                mod.setIdModule(res.getInt(1));
                mod.setNomModule(res.getString(2));
                mod.setHeureDebut(res.getInt(3));
                mod.setHeureFin(res.getInt(4));
                liste.add(mod);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     ////////////////Rechercher par nom///////////////////
    
     public ArrayList<Module> RechercherParnom(String nom) {
        try {
            String req = "SELECT * FROM module WHERE nom_module='" + nom + "'" ;
            ArrayList<Module> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                mod.setIdModule(res.getInt(1));
                mod.setNomModule(res.getString(2));
                mod.setHeureDebut(res.getInt(3));
                mod.setHeureFin(res.getInt(4));
                liste.add(mod);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     ////////////////Rechercher par heurdebut///////////////////
    
     public ArrayList<Module> RechercherParHeurdebut(int heurdebut) {
        try {
            String req = "SELECT * FROM module WHERE heure_debut='" + heurdebut + "'" ;
            ArrayList<Module> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                mod.setIdModule(res.getInt(1));
                mod.setNomModule(res.getString(2));
                mod.setHeureDebut(res.getInt(3));
                mod.setHeureFin(res.getInt(4));
                liste.add(mod);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
     ////////////////Rechercher par heurfin///////////////////
    
     public ArrayList<Module> RechercherParHeurfin(int heurfin) {
        try {
            String req = "SELECT * FROM module WHERE heure_fin='" + heurfin + "'" ;
            ArrayList<Module> liste = new ArrayList<>();
            ResultSet res = requete.exeRead(req);
            SearchClasse Sclasse = new SearchClasse();
            SearchUser Suser = new SearchUser();
            
            while (res.next()) {
                mod.setIdModule(res.getInt(1));
                mod.setNomModule(res.getString(2));
                mod.setHeureDebut(res.getInt(3));
                mod.setHeureFin(res.getInt(4));
                liste.add(mod);
            }
            return liste;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
