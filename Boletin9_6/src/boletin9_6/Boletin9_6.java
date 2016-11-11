/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pregunta = JOptionPane.showInputDialog("Quiere añadir un nuevo tranbajador?");
        Trabajador t = new Trabajador();
        int porcen = 0;
        int saldoE = 0;
        int totalTrabajadores = 0;
        
        while(pregunta.equals("si")){
            String nombre = JOptionPane.showInputDialog("Nombre: ");
            int sueldo = Integer.parseInt(JOptionPane.showInputDialog("Sueldo: "));
            t = new Trabajador(nombre, sueldo);
            
            if (t.calcularSaldo(sueldo) == true)
                saldoE ++;
            if (t.calcularSaldoMill(sueldo) == true)
                porcen ++;
            
            totalTrabajadores ++;
            pregunta = JOptionPane.showInputDialog("Quiere añadir otro tranbajador?");
        }
        
        System.out.println("El numero de trabajadores con sueldo entre 1000 y 1750 € son: "+ saldoE);
        System.out.println("El porcentaje de trabajadores con sueldo menor a 1000 son: "+ t.calcularPorcenta(porcen, totalTrabajadores) + "%");
        
        
        
        
    }
    
}
