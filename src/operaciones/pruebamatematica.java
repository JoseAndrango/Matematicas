/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author usuario
 */
public class pruebamatematica {
    public static void main (String[] args){
        Matematica ob1 = new Matematica();
        ob1.a = 25;
        ob1.b = 35;
        ob1.sumar();
        //no entiendo nada :v
        int res=ob1.sumar1();
        System.out.println("res="+res);
        System.out.println("el resultado de la suma es"+ob1.sumar1());
    }
}
