
package Intento2;

import javax.swing.JOptionPane;

public class Logicaa extends Info {
    int cod;
    char sexo;
    String direccion, motivo, fecha;

    public Logicaa(int cod, char sexo, String direccion, String motivo, String fecha, String nom, String apell, String medico, String centro) {
        super(nom, apell, medico, centro);
        this.cod = cod;
        this.sexo = sexo;
        this.direccion = direccion;
        this.motivo = motivo;
        this.fecha = fecha;
    }
    
    public void paciente() {
        String nombre, apellido;
        
        nombre=JOptionPane.showInputDialog("Ingrese el nombre: ");
        apellido=JOptionPane.showInputDialog("Ingrese el apellido:  ");
        
        if (nombre.equals(super.getNom())&& apellido.equals(super.getApell())) {
            imprimir();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el paciente");
        }
    }
    
    public void medico() {
       String med;
       
       med = JOptionPane.showInputDialog("Ingrese el nombre del medico: ");
       
        if (med.equals(super.getMedico())) {
            imprimir();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el paciente");
        }
    }
    
    public void centroAtencion() {
        String centro;
        
        centro = JOptionPane.showInputDialog("Ingrese el lugar de atencion: ");
        
        if (centro.equals(super.getCentro())) {
            imprimir();
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el paciente");
        }
    }
    public void imprimir() {
        JOptionPane.showMessageDialog(null,"Codigo: "+cod+ "\nNombre: "+super.getNom()+"\nApellido: "+super.getApell()+
                "\nSexo: "+sexo+ "\nDireccion: "+direccion+ "\nCentro: "+super.getCentro()+"\nMotivo: "+motivo+
                "\nMedico: "+super.getMedico()+ "\nFecha: "+fecha);
    }
}
