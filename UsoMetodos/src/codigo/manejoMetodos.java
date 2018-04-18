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
public class manejoMetodos {

    public int suma(int a, int b) {
        int resultado;
        resultado = a + b;
        return resultado;
    }

    public double potencia(double x) {
        double resultado;
        resultado = x * x;
        return resultado;

    }

    public boolean adolecentes(int x, int y) {

        if ((x >= 13 && x <= 19) || (y >= 13 && y <= 19)) {
                    return true;
        } else{
            return false;
        }

    }
    
    
    public String nombreCompleto(String x ,String y, String z){
        String r;
        r=x+" "+y+" "+z; 
        return r;
        
        
    }
}
