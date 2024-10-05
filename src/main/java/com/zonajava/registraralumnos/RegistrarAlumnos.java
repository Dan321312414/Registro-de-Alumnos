package com.zonajava.registraralumnos;

import Controlador.ControladorAlumno;
import Vista.GUI;
import Modelo.Alumno;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import javax.swing.UIManager;

public class RegistrarAlumnos {
    public static void main(String[] args) {
        
        try {
       
        UIManager.setLookAndFeel(new NoireLookAndFeel()); 
    } catch (Exception e) {
        e.printStackTrace();
    }
         
        Alumno modelo = new Alumno();   
        GUI vista = new GUI();
        ControladorAlumno controlador = new ControladorAlumno(vista, modelo);

    
        controlador.inicializarVista();
    }
}