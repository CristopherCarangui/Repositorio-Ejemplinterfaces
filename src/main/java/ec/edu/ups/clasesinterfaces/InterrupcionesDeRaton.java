/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clasesinterfaces;
import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.awt.event.*;
/**
 *
 * @author USER
 */
public class InterrupcionesDeRaton extends MouseAdapter{
    private Label mensaje;

    public InterrupcionesDeRaton(Label mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public void mouseClicked(MouseEvent evento ){
        Component componentes = (Component) evento.getSource();
        String nombre = componentes.getName();
        String opcion = nombre.substring(nombre.length()-2,nombre.length());
        mensaje.setText("Ejecutar la accion" + opcion);             
    }
    
    @Override
    public void mouseEntered(MouseEvent evento){
        Component componentes = (Component) evento.getSource();
        componentes.setBackground(Color.red);
    }
    
    public void mouseExited(MouseEvent evento){
        Component componentes = (Component) evento.getSource();
        componentes.setBackground(Color.ORANGE);
    }
    
    
    
    
}
