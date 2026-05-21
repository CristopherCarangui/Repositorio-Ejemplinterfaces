/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.ejemplointerfaces;
import ec.edu.ups.clasesinterfaces.EsquemaRaton;
import ec.edu.ups.ejemplointerfaces.MiVentana;
import ec.edu.ups.clasesinterfaces.InterrupcionesDeRaton;
import ec.edu.ups.clasesinterfaces.InterrupcionesDeTeclado;
import ec.edu.ups.clasesinterfaces.InterrupcionesDeVentana;
import ec.edu.ups.clasesinterfaces.InterrupcionesDeAccion;
import ec.edu.ups.clasesinterfaces.InterrupcionesDeEnfoque;
import ec.edu.ups.clasesinterfaces.InterrupcionesDeElemento;
import java.awt.*;
/**
 *
 * @author LAB_04
 */
public class EjemploInterfaces {

    public static void main(String[] args) {
        Frame miVentana3 = new Frame();
        miVentana3.setSize(600, 400);
        miVentana3.setTitle("Mi ventana de ejemplo");
        miVentana3.setVisible(true);
        MiVentana v1 = new MiVentana();
        MiVentana v2 = new MiVentana("Ventana2");
        MiVentana v3 = new MiVentana("Ventana3", 400, 200);
        
         //Frames de Poscicionamiento
        Frame miMarco = new Frame();    
        miMarco.setSize(600, 400);
        miMarco.setTitle("Mi ventana de ejemplo");
        miMarco.setLocation(new Point(100, 220));
        miMarco.setVisible(true);
        
        //Ventna de bonton hola
        Frame miVentana2 = new Frame();    
        Button botonHola1 = new Button("Hola");
        miVentana2.setSize(400, 200);
        miVentana2.setTitle("Ventana con boton");
        miVentana2.setVisible(true);
        miVentana2.add(botonHola1);

        //Ventas de flowlayout
        Frame miVentana4 = new Frame();
        Panel miPanel2 = new Panel();
        Button botonArea = new Button("Calcular area");
        Button botonPerimetro = new Button("Calcular perimetro");
        Button botonSuma = new Button("Calcular suma");
        Button botonResta = new Button("Calcular resta");
        miVentana4.setSize(600, 200);
        miVentana4.setTitle("VENTANA CON BOTONES");
        miVentana4.setVisible(true);
        miVentana4.add(miPanel2);
        FlowLayout posicionamientoSecuencial = new FlowLayout(FlowLayout.RIGHT);
        miPanel2.setLayout(posicionamientoSecuencial);
        miPanel2.add(botonArea);
        miPanel2.add(botonPerimetro);
        miPanel2.add(botonSuma);
        miPanel2.add(botonResta);
        
        //ventana de borderlayout
        Frame miMarcos = new Frame();
        Panel panelMenuNorte = new Panel();
        Panel panelGeneral = new Panel();
        BorderLayout puntosCardinales = new BorderLayout();
        FlowLayout opcionesMenu = new FlowLayout();
        Button botonOpcion1 = new Button("Opción 1");
        Button botonOpcion2 = new Button("Opción 2");
        Button botonOpcion3 = new Button("Opción 3");
        Button botonSur = new Button("Sur");
        Button botonEste = new Button("Este");
        Button botonOeste = new Button("Oeste");
        Button botonCentro = new Button("Centro");
        panelGeneral.setLayout(puntosCardinales);
        panelMenuNorte.setLayout(opcionesMenu);
        miMarcos.add(panelGeneral);
        panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
        panelMenuNorte.add(botonOpcion1);
        panelMenuNorte.add(botonOpcion2);
        panelMenuNorte.add(botonOpcion3);
        panelGeneral.add(botonSur, BorderLayout.SOUTH);
        panelGeneral.add(botonEste, BorderLayout.EAST);
        panelGeneral.add(botonOeste, BorderLayout.WEST);
        panelGeneral.add(botonCentro, BorderLayout.CENTER);
        miMarcos.setSize(400, 150);
        miMarcos.setTitle("Ventana con BorderLayout");
        miMarcos.setVisible(true);
        
        //Ventana de etiquetas
        Frame miMarcos2 = new Frame();
        Label titulo = new Label("Notas de matematicas");
        
        miMarcos2.add(titulo);
        miMarcos2.setSize(200, 100);
        miMarcos2.setTitle("Ventana con etiqueta");
        miMarcos2.setVisible(true);
        
        //Ventana de Textos
        Frame miMarcos3 = new Frame();
        Panel entradaDeDatos = new Panel(new FlowLayout());
        TextField  Nombre = new TextField(15);
        TextField  Apellidos = new TextField(60);
        TextField  Nacionalidad = new TextField("Española", 15);
        
        entradaDeDatos.add(Nombre);
        entradaDeDatos.add(Apellidos);
        entradaDeDatos.add(Nacionalidad);
        
        miMarcos3.add(entradaDeDatos);
        miMarcos3.setSize(500, 130);
        miMarcos3.setTitle("Ventana con campos de texto");
        miMarcos3.setVisible(true);
        System.out.println("Entras nuevas");
        //Ventana con MouseListener
        Frame miVentana = new Frame("Esquema de Eventos");
        Panel miPanel = new Panel();
        Button botonHola = new Button("Saludo");
        Button botonAdios = new Button("Despedida");
        miPanel.add(botonHola);
        miPanel.add(botonAdios);

        miVentana.add(miPanel);
        miVentana.setSize(200, 100);
        miVentana.setVisible(true);
        botonHola.addMouseListener(new EsquemaRaton());
        botonAdios.addMouseListener(new EsquemaRaton());

        //Ventana con MouseAdapter
        final int NUM_OPCIONES = 12;
        Label mensaje = new Label("Mensaje asocialdo al boton pulsado");
        Button[] botones = new Button[NUM_OPCIONES];
        for (int i = 0; i < NUM_OPCIONES; i++) {
            botones[i] = new Button("Opcion" + i);
            if (i < 10) {
                botones[i].setName("0" + i);
            } else {
                botones[i].setName(String.valueOf(i));
            }
        }
        Frame miVentanaUno = new Frame("Pruebas eventos del raton");
        Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES + 1, 1));
        panelPrincipal.add(mensaje);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            panelPrincipal.add(botones[i]);
        }
        miVentanaUno.add(panelPrincipal);
        miVentanaUno.setSize(400, 600);
        miVentanaUno.setVisible(true);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            botones[i].addMouseListener(new InterrupcionesDeRaton(mensaje));
        }
        //Ventana con KeyAdapter
        Frame miVentanaDos = new Frame("Prueba eventos de raton");
        Panel miPanelDos = new Panel();
        Button boton1 = new Button("Silecion");
        Button boton2 = new Button("Maquina de escribir");
        miPanelDos.add(boton1);
        miPanelDos.add(boton2);
        boton2.addKeyListener(new InterrupcionesDeTeclado());
        miVentanaDos.add(miPanelDos);
        miVentanaDos.setSize(400, 400);
        miVentanaDos.setVisible(true);

        //Ventana con WindowListener
        Frame miVentanaTres = new Frame("Prueba eventos de ventana");
        miVentanaTres.setSize(200, 100);
        miVentanaTres.setVisible(true);

        Frame otraVentana = new Frame("Prueba eventos de ventana");
        otraVentana.setSize(200, 100);
        otraVentana.setVisible(true);

        miVentanaTres.addWindowListener(new InterrupcionesDeVentana());
        otraVentana.addWindowListener(new InterrupcionesDeVentana());

        //Ventana con ActionListener
        Frame miVentanaCuatro = new Frame("Prueba eventos de accion");
        Panel miPanelTres = new Panel(new GridLayout(3, 1));
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

        botonA.addActionListener(new InterrupcionesDeAccion());
        campoDeTexto.addActionListener(new InterrupcionesDeAccion());
        lista.addActionListener(new InterrupcionesDeAccion());

        miVentanaCuatro.add(miPanelTres);
        miVentanaCuatro.setSize(400, 200);
        miVentanaCuatro.setVisible(true);

        //Ventana con FocusListener
        Frame miVentanaCinco = new Frame("Prueba eventos de enfoque");
        Panel miPanelCinco = new Panel();
        Button botonTres = new Button("Componentes 1 ");
        Button botonCuatro = new Button("Componentes 2 ");
        miPanelCinco.add(botonTres);
        miPanelCinco.add(botonCuatro);
        miVentanaCinco.add(miPanelCinco);
        miVentanaCinco.setSize(300, 200);
        miVentanaCinco.setVisible(true);
        botonCuatro.addFocusListener(new InterrupcionesDeEnfoque());

        //Ventana con ItemListener
        Frame miVentanaSeis = new Frame("Prueba eventos de elementos");
        Panel miPanelSeis = new Panel(new GridLayout(4, 1));
        Checkbox diesel = new Checkbox("Diesel", true);
        Checkbox farosXenon = new Checkbox("Faros de Xenon", false);
        Checkbox llantasAleacion = new Checkbox("Llantas de aleacion", false);
        Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada", true);

        miPanelSeis.add(diesel);
        miPanelSeis.add(farosXenon);
        miPanelSeis.add(llantasAleacion);
        miPanelSeis.add(pinturaMetalizada);

        diesel.addItemListener(new InterrupcionesDeElemento());
        farosXenon.addItemListener(new InterrupcionesDeElemento());
        llantasAleacion.addItemListener(new InterrupcionesDeElemento());
        pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());

        miVentanaSeis.add(miPanelSeis);
        miVentanaSeis.setSize(400, 200);
        miVentanaSeis.setVisible(true);
            
            
            
            
            
            
          
        
      
    }
}
