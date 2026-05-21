/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clasesinterfaces;
import java.awt.Component;
import java.awt.event.*;
/**
 *
 * @author USER
 */
public class InterrupcionesDeAccion  implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Component componentes = (Component) e.getSource();
        String accionRealizada = e.getActionCommand();
        System.out.println("Componente: " + componentes.getName());
        System.out.println("Suceso: " + accionRealizada);
        System.out.println();
    }
    
}
