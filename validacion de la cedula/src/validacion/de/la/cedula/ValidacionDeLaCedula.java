/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion.de.la.cedula;

/**
 *
 * @author LENOVO
 */
public class ValidacionDeLaCedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] vector = {0,1,0,6,7,1,7,6,7};
            int contador=0;
            int contador2=0;
            int compr=0;
            for (int i=0;i<9;i++){
                if (i==0){
                    contador2=vector [i]*2;
                    contador+=contador2;
                }else if (i%2==0){
                    contador2=vector [i]*2;
                    if (contador2>=10){
                        contador2= contador2-9;
                        contador+=contador2;
                   }else {
                        contador+=contador2;
                    }
                }else{
                    contador+=vector[i];
                }System.out.println("");
                compr= contador%10;
                if (compr==0){
                    System.out.println("Si el numero termina en: "+compr+" es incorecto");
                }else{
                    compr=10-compr;
                    System.out.println("Si el numero termina en: "+compr+" es correcto");
                }            
            }
        }
    
}

