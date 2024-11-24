/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author javier
 */
public class Registro {
    static ArrayList<Estudiante>listaEstudiante;

    public Registro() {
        listaEstudiante=new  ArrayList<Estudiante>();
    }

    public static ArrayList<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public static void setListaEstudiante(ArrayList<Estudiante> listaEstudiante) {
        Registro.listaEstudiante = listaEstudiante;
    }
    
    public static void agregarEst(Estudiante est){
        boolean repetido=false;
        for(Estudiante d:listaEstudiante){
            if(d.getCodigo()==est.getCodigo()){
                repetido=true;
                JOptionPane.showMessageDialog(null, "no se puede agregar puesto que el nro de est ya existe");
                break;
            }
        }
        if(repetido==false){
            listaEstudiante.add(est);
            JOptionPane.showMessageDialog(null, "Estudiante agregado satisfactoriamente");
        }
        
    }
    public static void eliminarDoc(int cod){
        boolean existe=false;
        for(Estudiante d:listaEstudiante){
            if(d.getCodigo()==cod){
                existe=true;
                listaEstudiante.remove(d);
                JOptionPane.showMessageDialog(null, "Estudiante eliminado");
                 break;
            }
        }
        if(existe==false){
            JOptionPane.showMessageDialog(null, "no existe un Estudiante con el codigo ingresado");
        }
        
    }
    public static void listar(){
        for(Estudiante d:listaEstudiante){
            System.out.println(d.toString());
        }
    }
    
    
    
}
