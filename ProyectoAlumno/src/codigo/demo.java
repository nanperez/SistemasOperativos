/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Scanner;

/**
 *
 * @author Nancy
 */
public class demo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        
        String matricula;
        int semestre;
        String grupo;
        String nombre;
        
        int calificaciones[] = new int[5];
        
        System.out.println("Matricula:");
        matricula = entrada.nextLine();
        
        System.out.println("Grupo");
        grupo = entrada.nextLine();
        
        System.out.println("Nombre");
        nombre = entrada.nextLine();
        
        
        System.out.println("Semestre");
        semestre = entrada.nextInt();
        
        System.out.println("Dame las calificaciones");        
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i]=entrada.nextInt();
        }
        
        Alumnos a1=new Alumnos(matricula,semestre,grupo,nombre,calificaciones);
        //a1.toString();
        System.out.println(a1.toString());
        
    }
    
}
