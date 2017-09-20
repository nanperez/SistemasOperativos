/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author naperez
 */
public class Alumno {
    
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private int edad;

    public Alumno(String nombre, String apellido_p, String apellido_m) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido_p=" + apellido_p + ", apellido_m=" + apellido_m + ", edad=" + edad + '}';
    }
    
    
}
