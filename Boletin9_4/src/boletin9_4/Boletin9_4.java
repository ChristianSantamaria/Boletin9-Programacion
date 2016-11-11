/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero positivo"));
        while (numero != 0){
            for(int i = 1; i <= 10; i++){
               System.out.println(numero +" x " + i + " = " + numero * i);
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero positivo"));
        }
    }
    
}
