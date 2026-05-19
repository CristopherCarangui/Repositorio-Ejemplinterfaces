/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.ejemplointerfaces;
import ec.edu.ups.ejemplointerfaces.EsquemaRaton;
import ec.edu.ups.ejemplointerfaces.MiVentana;
import ec.edu.ups.ejemplointerfaces.InterrupcionesDeRaton;
import ec.edu.ups.ejemplointerfaces.InterrupcionesDeTeclado;
import ec.edu.ups.ejemplointerfaces.InterrupcionesDeVentana;
import ec.edu.ups.ejemplointerfaces.InterrupcionesDeAction;
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
          
//          final int NUM_OPCIONES = 12;
//          Label mensaje = new Label("Mensaje asocialdo al boton pulsado");
//          Button[] botones = new Button[NUM_OPCIONES];
//          for(int i = 0;i<NUM_OPCIONES; i++){
//              botones[i] = new Button("Opcion" + i);
//              if(i<10){
//                  botones[i].setName("0" + i);
//              }else{
//                  botones[i].setName(String.valueOf(i));
//              }
//          }
//          Frame miVentanaUno = new Frame("Pruebas eventos del raton");
//          Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES+1,1));
//          panelPrincipal.add(mensaje);
//          for(int i=0;i<NUM_OPCIONES;i++){
//              panelPrincipal.add(botones[i]);
//          }
//          miVentanaUno.add(panelPrincipal);
//          miVentanaUno.setSize(400, 600);
//          miVentanaUno.setVisible(true);
//          for(int i = 0;i<NUM_OPCIONES;i++){
//              botones[i].addMouseListener(new InterrupcionesDeRaton(mensaje));
//          }
//          Frame miVentanaDos = new Frame("Prueba eventos de raton");
//          Panel miPanelDos = new Panel();
//          Button boton1 = new Button("Silecion");
//          Button boton2 = new Button("Maquina de escribir");
//          miPanelDos.add(boton1);
//          miPanelDos.add(boton2);
//          boton2.addKeyListener(new InterrupcionesDeTeclado());
//          miVentanaDos.add(miPanelDos);
//          miVentanaDos.setSize(400,400);
//          miVentanaDos.setVisible(true);
          
//          Frame miVentanaTres = new Frame("Prueba eventos de ventana");
//          miVentanaTres.setSize(200,100);
//          miVentanaTres.setVisible(true);
//          
//          Frame otraVentana = new Frame("Prueba eventos de ventana");
//          otraVentana.setSize(200,100);
//          otraVentana.setVisible(true);
//          
//          miVentanaTres.addWindowListener(new InterrupcionesDeVentana());
//          otraVentana.addWindowListener(new InterrupcionesDeVentana());
            Frame miVentanaCuatro = new Frame("Prueba eventos de accion");
            Panel miPanelTres = new Panel(new GridLayout(3,1));
            Button botonA = new Button("Etiqueta del boton");
            TextField campoDeTexto = new TextField("Texto de Campo 8");
            List lista = new List(3);
            lista.add("Opcion 1 de la lista");
            lista.add("Opcion 2 de la lista");
            lista.add("Opcion 3 de la lista");
            lista.add("Opcion 4 de la lista");
            miPanelTres.add(botonA);
            miPanelTres.add(campoDeTexto);
            miPanelTres.add(lista);
            
            botonA.addActionListener(new InterrupcionesDeAction());
            campoDeTexto.addActionListener(new InterrupcionesDeAction());
            lista.addActionListener(new InterrupcionesDeAction());
            
            miVentanaCuatro.add(miPanelTres);
            miVentanaCuatro.setSize(400,200);
            miVentanaCuatro.setVisible(true);
            
          
        
      
    }
}
