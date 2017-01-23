/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.clinica;

import javax.swing.JOptionPane;

/**
 *
 * @author CORE I3
 */
class Clinico {
    private int codigo;
    private int fecha;
    private int idPaciente;
    private int idMedico;
    private String observaciones;

    public Clinico(int codigo, int fecha, int idPaciente, int idMedico, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.observaciones = observaciones;
    }
    
    public void verClinico(){
        JOptionPane.showMessageDialog(null,"Codigo: "+codigo+" \n Fecha: "+fecha+"\n IDpaciente: "+idPaciente
                +"\n IDmedigo: "+idMedico+"\n Observaciones: "+observaciones);
    }
    
}
