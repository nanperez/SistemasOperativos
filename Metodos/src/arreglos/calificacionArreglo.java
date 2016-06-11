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
public class calificacionArreglo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        double [] calificaciones = new double[5];
        //double suma = 0;
        double promedio=0;
        
        
        System.out.println("Dame el nombre del alumno");
        nombre = entrada.nextLine();
        //Llenado del arreglo
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Dame el valor de la posicion:"+i);
            calificaciones[i]=entrada.nextDouble();
            //suma = suma+calificaciones[i];
        }
        
        // Calcular el promedio
        //promedio = suma/calificaciones.length;
        //promedio = calcularPromedio1(calificaciones); // Llamado al método
        
        //Imprimir resultados
        System.out.println("Calificaciones del Alumno:"+nombre);
        //System.out.println("Promedio: "+promedio);
        calcularPromedio2(calificaciones);
        System.out.println(Arrays.toString(calificaciones));
        
    }
    
    public static double calcularPromedio1(double calif[]){
        double suma = 0,promedio =0;
        for (int i = 0; i < calif.length; i++) {
            suma = suma+calif[i];
        }
        promedio = suma/calif.length;
        return promedio;
    }
    
    public static void calcularPromedio2(double calif[]){
        double suma = 0,promedio =0;
        for (int i = 0; i < calif.length; i++) {
            suma = suma+calif[i];
        }
        promedio = suma/calif.length;
        System.out.println("El promedio es"+promedio);
        
    }
    
}
