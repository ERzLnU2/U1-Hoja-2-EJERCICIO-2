/**
 * @author DAW120
   📌 EJERCICIO 2, Hoja 2.   
   🔴 Indica la salida por pantalla del siguiente programa con OPERADORES LOGICOS:
 */

package com.solomongo.ejercicio2_hoja2;
public class Ejercicio2_Hoja2 {                 // la Clase    
     public static void main(String [] args){   // el constructor
        boolean w, x=true, y=true,z=false;      // en bool saldrá true/false; lo asigna.
       
        // aqui opera con OPERADORES LOGICOS (y, or)
        w=y && x || x && z || y && z;
        
        // 🏴‍ aqui se indica lo que sale en pantalla: (w=true) 
        System.out.println("\n\tEl resultado es: "+w+"\r");
    }
}
