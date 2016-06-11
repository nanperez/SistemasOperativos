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
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Dame un valor");
        valor = entrada.nextInt();
        m1(valor); //Llamada al método
        
        
    }
    
    public static void m1(int v){
        if(v>0)
            System.out.println("P");
        else
            System.out.println("N");
    }
    
}
