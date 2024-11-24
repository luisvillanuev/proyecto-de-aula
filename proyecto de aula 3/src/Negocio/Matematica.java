/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author javier
 */
public class Matematica extends Estudiante{
    private boolean Solucciones;

    public Matematica(int codigo, String nombre, String apellido, String pregunta, int anoPub,boolean prestado) {
        super(codigo, nombre, apellido, pregunta, anoPub);
        this.Solucciones=Solucciones;
    }

    public boolean isSolucionado() {
        return Solucciones;
    }

    public void setPrestado(boolean Solucionado) {
        this.Solucciones = Solucciones;
    }

    @Override
    public String toString() {
        return super.toString()+"Solucciones=" + Solucciones +"\n"+"-------------------------"+"\n";
    }
    
    
    
    
}
