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
public class DurmiendoMsj {
    public static void main(String[] args) throws InterruptedException {
        String frasesDebate[]={"me estan hechando monton",
                               "tiene 3 departamentos",
                                "al que robe le cortamos la mano",
                                "hola soy meade"};
        for (int i = 0; i < frasesDebate.length; i++) {
            Thread.sleep(4000);
            System.out.println(frasesDebate[i]);
        }
        
        
    }
    
}
