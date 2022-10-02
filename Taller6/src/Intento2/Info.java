
package Intento2;

import javax.swing.JOptionPane;

public class Info {
    
    private String nom;
    private String apell;
    private String medico;
    private String centro;
    
    public Info(String nom, String apell, String medico, String centro) {
        this.nom = nom;
        this.apell = apell;
        this.medico = medico;
        this.centro = centro;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }
}
