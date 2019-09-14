/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasingleton;

/**
 *
 * @author USUARIO
 */
public class PruebaSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prueba p1;
        Prueba p2;
        
        p1 = Prueba.getPrueba();
        p1.setNumero(8);
        System.out.println(p1.getNum());
        
        p2 = Prueba.getPrueba();
        System.out.println(p2.getNum());
        
        
    }
    
}
