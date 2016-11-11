/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de serie: "));
        
        //A
        int cont = 0;
        for (int i = 0; i < numero; i++) {
            cont += 2;
            System.out.print(cont);
            if((i + 1) != numero)
                System.out.print(" + "); 
        }
        System.out.println();
        //B
        boolean cont2 = false;
        for (int i = 0; i < numero; i++) {
            if(cont2 == false){
                System.out.print("- " + (i + 1));
                cont2 = true;}
            else{
                System.out.print("+ " + (i + 1));
                cont2 = false;
            }
        }
        System.out.println();
        //C
        int conta0 = 0;
        int conta1 = 1;
        int suma = 0;
        boolean v = false;
        
        for (int i = 0; i < numero; i++) {
            if (v == false){
                System.out.print(suma);
                conta0 = suma;
                v = true; 
            }
            else{
                System.out.print(suma);
                conta1 = suma;
                v = false; 
            }
            suma = conta0 + conta1;
            
            if((i + 1) != numero)
                System.out.print(" ,"); 
        }   
    }
    
}
