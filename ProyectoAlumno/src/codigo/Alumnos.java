/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Nancy
 */
public class Alumnos {
    
    private String matricula;
    private int edad;
    private String sexo;
    private String carrera;
    private int semestre;
    private String grupo;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private int calificaciones[];

    public Alumnos(String matricula, int semestre, String grupo, String nombre, int[] calificaciones) {
        this.matricula = matricula;
        this.semestre = semestre;
        this.grupo = grupo;
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "matricula=" + matricula + ", semestre=" + semestre + ", grupo=" + grupo + ", nombre=" + nombre + '}';
    }
    
    
    public int calcularPromedio(){
        int suma=0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma+ calificaciones[i];
        }
        
        return suma/calificaciones.length;
    }
    
    
    
    
    
    
    
    
}
