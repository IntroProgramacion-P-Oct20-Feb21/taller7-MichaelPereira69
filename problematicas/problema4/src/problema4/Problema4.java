/*
 * Generar la serie: +1/1-1/3+1/5-1/7+1/9 
 */
package Problema4;

/**
 *
 * @author reroes
 */
public class Problema4{

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        // variables 
        int numerador = 1;
        int denominador = 1;
        int contador = 1;
        
        while (contador<=8) {
            if((contador%2)==0){
                System.out.printf("%s%d/%d", "-", numerador, denominador);
            }else{
                System.out.printf("%s%d/%d", "+", numerador, denominador);
            }
            contador = contador + 1;
            denominador = denominador + 2;
        }
        System.out.println();
       
    }
    
}
