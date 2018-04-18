/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Scanner;

/**
 *
 * @author naperez
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("menu");
        System.out.println("1. metodo Sumar");  
        System.out.println("2. metodo potencia");
        System.out.println("3. adolescente");
        System.out.println("4.nombre completo");
        Scanner entrada = new Scanner (System.in);
        manejoMetodos ob=new manejoMetodos();
        int res;
        System.out.println("Elige la opción ");
        res=entrada.nextInt();
        entrada.nextLine();
        switch(res){
            case 1:
                System.out.println("Ingresa el valor del entero 1: ");
                int a=entrada.nextInt();
                System.out.println("Ingrese el valor del entero 2: ");
                int b=entrada.nextInt();
                System.out.println(ob.suma(a, b));
                 
                
                
                
             break;   
            case 2:
                System.out.println("dame un valor");
                double n=entrada.nextDouble();
                
                System.out.println(ob.potencia(n));
             break;    
            case 3:
                
                System.out.println("valor 1");
                int x = entrada.nextInt();
                System.out.println("valor 2");
                int y = entrada.nextInt();
                System.out.println(ob.adolecentes(x, y));
                
                
                
                break;
            case 4:
                System.out.println("Dame un nombre");
                String nom=entrada.nextLine();
                System.out.println("Dame el apellido paterno");
                String pat=entrada.nextLine();
                System.out.println("Dame el apellido materno");
                String mat=entrada.nextLine();
                System.out.println(ob.nombreCompleto(nom, pat, mat));
                
            
                break; 
                
            default:
                System.out.println("elige un numero del 1 al 4");
        }
        
    }
    
}
