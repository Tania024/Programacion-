/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber4;

/**
 *
 * @author LENOVO
 */
public class Deber4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int [ ][ ]A ={{5,6,2,1,3},
                                {1,2,3,4,5},
                                {6,7,8,9,0}};
     System.out.println("La matriz dada es: ");
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println("La matriz transpuesta es: ");
        for(int j = 0; j < A[0].length; j++){
            for(int i = 0; i < A.length; i++){
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }
    }
}