/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clasesinterfaces;
import java.awt.Checkbox;
import java.awt.event.*;
/**
 *
 * @author USER
 */
public class InterrupcionesDeElemento implements  ItemListener{

    @Override
    public void itemStateChanged(ItemEvent e) {
        Checkbox componente = (Checkbox)e.getSource();
        boolean estado = componente.getState();
        int nuevoEstado = e.getStateChange();
        
        System.out.println("Comnponente: " + e.getItem());
        System.out.println("Estado Actual: " + estado);
        if(nuevoEstado == ItemEvent.SELECTED){
            System.out.println("Seleccionado");
        }else{
            System.out.println("No seleccionado");
        }
        System.out.println();
    }
}
