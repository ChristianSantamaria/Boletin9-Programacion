/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        double producto = 1;
        
        for(int x = 10; x <= 90; x++){
            suma += x;
            producto *= x;
        }
        
        System.out.println("La suma es: "+ suma);
        System.out.println("El producto es: "+ producto);
    }
    
}
