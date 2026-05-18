/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.ejemplointerfaces;
import ec.edu.ups.ejemplointerfaces.EsquemaRaton;
import java.awt.Frame;
import ec.edu.ups.ejemplointerfaces.MiVentana;
import java.awt.Point;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.*;
/**
 *
 * @author LAB_04
 */
public class EjemploInterfaces {

    public static void main(String[] args) {
//        Button botonHola = new Button("Hola");
//        Button botonNombre = new Button("Nombre");
//        Button botonApellido = new Button("Apellido");
//        Button botonLugar = new Button("Lugar");
//        FlowLayout posicionamientoSecueencial = new FlowLayout();
//        BorderLayout posicionamientoLugar = new BorderLayout();
//        Panel miPanel = new Panel();
//        MiVentana v1 = new MiVentana();
//        MiVentana v2 = new MiVentana("Ventana2",400,200,450,400);
//        v2.setLayout(posicionamientoLugar);
//        v2.setLayout(posicionamientoSecueencial);
//        v2.add(miPanel);
//        v2.setTitle("Boton de Hola");
//        miPanel.add(botonHola,BorderLayout.NORTH);
//        miPanel.add(botonNombre,BorderLayout.WEST);
//        miPanel.add(botonApellido,BorderLayout.EAST);
//        miPanel.add(botonLugar,BorderLayout.CENTER);
//        MiVentana v3 = new MiVentana("Ventana3",400,200,758,100);
          Frame miMarco = new Frame();
          Panel entradaDeDatos = new Panel();
//          TextField Nombre = new TextField(30);
//          TextField Apellido = new TextField(50);
//          TextField Nacionalidad = new TextField("Ecuatoriana",20);
          Button botonEntrada = new Button("Entrada");
          Button botonSalida = new Button("Salida");
          Label titulo = new Label("HOOOOOOOOOOOOOOOLA ANDRES");
//          entradaDeDatos.add(Nombre);
//          entradaDeDatos.add(Apellido);
//          entradaDeDatos.add(Nacionalidad);
          entradaDeDatos.add(botonEntrada);
          entradaDeDatos.add(botonSalida);
          miMarco.add(entradaDeDatos);
          miMarco.setSize(520, 200);
          miMarco.setTitle("Ventana con campos de texto");
          miMarco.setVisible(true);
          botonEntrada.addMouseListener(new EsquemaRaton());
          botonSalida.addMouseListener(new EsquemaRaton());
          
        
      
    }
}
