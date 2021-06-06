/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        if ( edad > 0 & edad <= 2) {
            System.out.println("Es bebé");
        }else if(edad >2 & edad <=12) {
            System.out.println ("Es Niño");
        }else if (edad >12 & edad <=18){
            System.out.println("Es un joven");   
        }else if (edad >18 & edad <=65){
            System.out.println("Es adulto");  
        }else if (edad >65 ){
             System.out.println("Adulto mayor"); 
        }
    }                  
}

            

            
        
       
    
