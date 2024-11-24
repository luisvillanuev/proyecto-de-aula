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
public class estadistica extends Estudiante{
    private int hora;
    private int numero;
    private String mes;

    public estadistica(int codigo, String nombre, String apellido, String pregunta, int anoPub,int hora,int numero,String mes) {
        super(codigo, nombre, apellido, pregunta, anoPub);
        this.hora=hora;
        this.numero=numero;
        this.mes=mes;
    }

    public int getVolumen() {
        return hora;
    }

    public void setVolumen(int volumen) {
        this.hora = hora;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return super.toString()+"hora=" + hora +"\n"+  ", numero=" + numero + "\n"+ ", mes=" + mes +"\n";
    }
    
    
    
}
