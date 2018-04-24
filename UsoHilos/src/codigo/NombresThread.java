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
public class NombresThread extends Thread{
    
    public NombresThread(String nombre){
        super(nombre);
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+getName());
        }
        System.out.println("Termina thread "+getName());
    }
    
    public static void main(String[] args) {
        new NombresThread("Margarita").start();
        new NombresThread("Mead").start();
        System.out.println("Termina el thread del main");
        
    }
    
}
