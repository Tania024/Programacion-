/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2parte3;

/**
 *
 * @author LENOVO
 */
public class Deber2parte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // While
    int contador = 0 ;
    int suma = 0 ;
    int numero = 0 ;
    int num = 1 ;
    while (contador<=6) {
        System.out.print(numero + ",");
       suma= numero + num;
       numero = num; 
       num = suma;
       contador ++;
    } 
    }
    
}
