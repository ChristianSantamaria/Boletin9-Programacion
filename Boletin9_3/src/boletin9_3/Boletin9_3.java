/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar = false;
        
        while(validar == false){
            int b = Integer.parseInt(JOptionPane.showInputDialog("Escriba una base positiva"));
            int h = Integer.parseInt(JOptionPane.showInputDialog("Escriba una altura positiva"));
            if (b >= 0 && h >= 0){
                System.out.println("El area es: "+ b * h);
                validar = true;
            }
            else
                validar = false;
            
        }
        
    }
    
}
