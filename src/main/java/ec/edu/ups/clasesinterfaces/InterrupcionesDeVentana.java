/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clasesinterfaces;
import java.awt.event.*;
/**
 *
 * @author USER
 */
public class InterrupcionesDeVentana implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana " + e.getWindow().getName() + "abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Si pulsas aqui se cierra la ventana " + e.getWindow().getName());
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana" + e.getWindow().getName() + "Cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana" + e.getWindow().getName() + "Minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana" + e.getWindow().getName() + "Restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana" + e.getWindow().getName() + "Activa(en uso)");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana" + e.getWindow().getName() + "Desactivada (fuera de  uso)");
    }
    
    
}
