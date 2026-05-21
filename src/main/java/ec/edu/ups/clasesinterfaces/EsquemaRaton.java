/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.clasesinterfaces;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Frame;
/**
 *
 * @author LAB_04
 */
public class EsquemaRaton implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent evento){
        System.out.println("click");
        Frame miMarco = new Frame();
        miMarco.setSize(520, 200);
        miMarco.setTitle("Ventana con campos de texto");
        miMarco.setVisible(true);
    }
    
    @Override
    public void mouseReleased(MouseEvent evento){
        System.out.println("mouse");
    }
    
    @Override
    public void mouseEntered(MouseEvent evento){
        evento.getComponent().setBackground(Color.red);
    }
    @Override
    public void mouseExited(MouseEvent evento){
        evento.getComponent().setBackground(Color.GRAY);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Presion");
        
    }
    
    
}
