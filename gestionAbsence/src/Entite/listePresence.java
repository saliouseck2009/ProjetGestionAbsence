/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author seck
 */
public class listePresence {
    private Etudiant etudiant;
    private Module module;
    private String heureCours;

    public listePresence() {
    }

    public listePresence(Etudiant etudiant, Module module, String heureCours) {
        this.etudiant = etudiant;
        this.module = module;
        this.heureCours = heureCours;
    }
    

    public String getHeureCours() {
        return heureCours;
    }

    public void setHeureCours(String heureCours) {
        this.heureCours = heureCours;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
    
    
    
}

