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
public class Prueba {
    
    private static Prueba p;// objeto estatico
    
    private int numero = 0;
    
    private Prueba(){}// constructor privado 
    
    public static Prueba getPrueba(){ // Metodo con el cual accedemos al objeto
        if(p == null){ // como el objeto no ha sido creado, creamos la unica instancia
            p = new Prueba();
        }
        return p; //devolvemos el objeto
    }
    
    public void setNumero(int num){
        this.numero = num;
    }
    
    public int getNum(){
        return this.numero;
    }
    
    
}
