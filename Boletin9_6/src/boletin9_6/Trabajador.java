/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

/**
 *
 * @author csantamariacameselle
 */
public class Trabajador {
    String nombre;
    int saldo;

public Trabajador(String nombre, int saldo) {
    this.nombre = nombre;
    this.saldo = saldo;
}
public Trabajador() {
}

public boolean calcularSaldo(int sald){
    if(sald >= 1000 && sald <=1750){
        return true;
    }
        return false;
}

public boolean calcularSaldoMill(int sald){
    if(sald < 1000  && sald > 0){
        return true;
    }
        return false;
}

public float calcularPorcenta(int n, int t){
    return (n*100)/t;
}  
    
}
