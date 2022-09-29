/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import clases.cubo;

/**
 *
 * @author aniba
 */
public class EjercicioCuboAnibal {
    public static void main(String[] args) {
        cubo cubo1 = new cubo(7,4,10);
        cubo cubo2 = new cubo(4,5,6);
        System.out.println(cubo1);
        System.out.println(cubo2);
        cubo1.volumen();
        cubo2.volumen();
        
        
    }
    
    
    
}
