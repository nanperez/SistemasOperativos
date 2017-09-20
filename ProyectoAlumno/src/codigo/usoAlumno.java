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
public class usoAlumno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alumno arregloAlumnos[] = new Alumno[10];  // Declaración de un arreglo
        
        Alumno objeto;  // Declaración de un objeto
        String nombre, ap_p, ap_m;
        int edad;
        
        System.out.println("--------Captura de datos--------");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            
            System.out.print("Apellido paterno: ");
            ap_p = entrada.nextLine();
            
            System.out.print("Apellido materno: ");
            ap_m = entrada.nextLine();
            
            arregloAlumnos[i] = new Alumno(nombre, ap_p,ap_m);
        }
        
        System.out.println("------Imprimir objetos del arreglo---------");
        for (int i = 0; i < 10; i++) {
            System.out.println(arregloAlumnos[i].toString());
        }
        
    }
}
