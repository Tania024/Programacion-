/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2;

/**
 *
 * @author LENOVO
 */
public class Deber2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // For
    int contador = 0 ;
    int suma = 0 ;
    int numero = 0 ;
    int num = 1 ;
    for(contador = 0; contador <=6; contador++){
        System.out.print(numero + ",");
       suma= numero + num;
       numero = num; 
       num = suma;
       
    }        
    }    
}
