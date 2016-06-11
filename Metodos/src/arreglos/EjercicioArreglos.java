/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nancy
 */
public class EjercicioArreglos {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int [] valores = new int[3];
        //int valor;
        //Llenado del arreglo
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Dame un valor");
            valores[i] = teclado.nextInt();
           // valores[i] = valor;
            
        }
        //Opcion 1 para imprimir los valores del arreglo
        System.out.println(Arrays.toString(valores));
        
        //Opcion 2 para imprimir arreglos
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor:"+i+"-"+valores[i]);
        }
        
    }
    
}
