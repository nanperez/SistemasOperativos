/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Nancy
 */
public class ejercicio2 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1,valor2;
        System.out.println("Dame el primer valor");
        valor1 = entrada.nextInt();
        System.out.println("Dame el otro valor");
        valor2 = entrada.nextInt();
        mymethod(valor1,valor2);
    }
    
    
    public static boolean mymethod(int v1,int v2){
        boolean respuesta;
        if(v2%v1==0)
            respuesta = true;
        else
            respuesta = false;
        
        
       return respuesta;     
    }
    
}
