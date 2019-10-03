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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seck
 */
public class SearchEtudiant {
    Requete requete = new Requete();
    
    ////////////////Recherche par classe///////////////////
    
    public ArrayList<Etudiant> RechercherParClasse(Classe c) {
        try {
            String req = "SELECT * FROM etudiant WHERE id_classe=" + c.getIdClasse();
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
    
    ////////////////Recherche par id///////////////////
    
    public Etudiant RechercherParId(int i) {
        try {
            String req = "SELECT * FROM etudiant WHERE id_Etudiant=" + i;
            Etudiant etudiant = new Etudiant();
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
                
            }
            return etudiant;
        } catch (SQLException ex) {
            Logger.getLogger(SearchEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    ////////////////Recherche par nom///////////////////
    
    public ArrayList<Etudiant> RechercherParNom(String nom) {
        try {
            String req = "SELECT * FROM etudiant WHERE nom_etudiant='" + nom + "'" ;
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
    
    ////////////////Recherche par prenom///////////////////
    
     public ArrayList<Etudiant> RechercherParPrenom(String prenom) {
        try {
            String req = "SELECT * FROM etudiant WHERE prenom_etudiant='" + prenom + "'" ;
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
     
     ////////////////Recherche par sexe///////////////////
     
      public ArrayList<Etudiant> RechercherParSexe(char sexe) {
        try {
            String req = "SELECT * FROM etudiant WHERE sexe='" + sexe + "'" ;
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
      
      ////////////////Recherche par date///////////////////
      
       public ArrayList<Etudiant> RechercherParDate(String date) {
        try {
            String req = "SELECT * FROM etudiant WHERE datenaissance_etudiant='" + date + "'" ;
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
       
       ////////////////Recherche par status///////////////////
       
        public ArrayList<Etudiant> RechercherParStatus(String status) {
        try {
            String req = "SELECT * FROM etudiant WHERE status_etudiant='" + status + "'" ;
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
        
         ////////////////Recherche par telephone///////////////////
       
        public ArrayList<Etudiant> RechercherParTelephone(String tel) {
        try {
            String req = "SELECT * FROM etudiant WHERE tel_etudiant='" + tel + "'" ;
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
        
         ////////////////Recherche par numero carte///////////////////
       
        public ArrayList<Etudiant> RechercherParNumeroCatre(String num) {
        try {
            String req = "SELECT * FROM etudiant WHERE numerocarte='" + num + "'" ;
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
        
            ////////////////Recherche par idUser///////////////////
       
        public ArrayList<Etudiant> RechercherParUser(User user) {
        try {
            String req = "SELECT * FROM etudiant WHERE id_user='" + user.getId_user() + "'" ;
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
