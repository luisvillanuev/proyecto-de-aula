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
public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;
    private String pregunta;
    private int anoPub;
    
    

    public Estudiante(int codigo, String Nombrecompleto, String apellido, String pregunta, int anoPub) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pregunta = pregunta;
        this.anoPub = anoPub;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombrecompleto() {
        return nombre;
    }

    public String getGmail() {
        return apellido;
    }

    public String getPregunta() {
        return pregunta;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombrecompleto(String Nombrecompleto) {
        this.nombre = nombre;
    }

    public void setGmail(String gmail) {
        this.apellido = apellido;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

   

    @Override
    public String toString() {
        return "codigo=" + codigo +"\n"+ ", nombre=" + nombre +"\n"+ ", apellido=" + apellido + "\n"+ ", pregunta=" + pregunta +"\n"+  ", anoPub=" + anoPub +"\n";
    }
    
    
}
