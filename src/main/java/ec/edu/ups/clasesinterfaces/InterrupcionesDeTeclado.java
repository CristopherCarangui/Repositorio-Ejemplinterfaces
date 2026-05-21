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
public class InterrupcionesDeTeclado extends KeyAdapter{
    @Override
    public void keyTyped(KeyEvent e){
        System.out.println(e.getKeyChar());
        if(e.getKeyChar() == '*'){
            System.exit(0);
        }
    }
    
    
    
}
