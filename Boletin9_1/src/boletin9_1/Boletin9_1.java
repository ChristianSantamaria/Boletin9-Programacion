/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos = 0;
        int neg = 0;
        int ceros = 0;
        int grupo[] = new int[10];
        grupo[0] = 1;
        grupo[1] = -1;
        grupo[2] = 1;
        grupo[3] = 0;
        grupo[4] = 1;
        grupo[5] = -1;
        grupo[6] = 1;
        grupo[7] = -1;
        grupo[8] = -1;
        grupo[9] = 0;
        
        for(int numero : grupo){
            if(numero > 0)
                pos++;
            else if(numero < 0)
                neg++;
            else
                ceros++;
        }
        
        System.out.println("Hay "+ pos + " numeros positivos");
        System.out.println("Hay "+ neg + " numeros negativos");
        System.out.println("Hay "+ ceros + " ceros");
    }
    
}
