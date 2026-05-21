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
public class InterrupcionesDeEnfoque  implements FocusListener{

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Se ha encontrado en el componente");
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("Se ha salido del componente");
    }
    
    
}
