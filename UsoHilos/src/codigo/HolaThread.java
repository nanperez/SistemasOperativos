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
public class HolaThread extends Thread{
    
    @Override
    public void run(){
        System.out.println("Hola desde el Thread");
    }
    
    public static void main(String[] args) {
        (new HolaThread()).start();
        
    }
    
    
}
