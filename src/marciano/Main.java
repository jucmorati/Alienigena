/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marciano;

/**
 *
 * @author Camilo-lu22isa-felipe-luis
 */
public class Main {
    public static void main (String [] args){
        String planeta;
        int numojos;
        int numvidas;
        String color;
    
        java.util.Scanner sc=new java.util.Scanner (System.in);
        System.out.println("ingrese la altura del marciano");
        planeta=sc.next();
        System.out.println("ingrese el color del marciano");
        color=sc.next();
        System.out.println("ingrese el numero de vidas del marciano");
        numvidas=sc.nextInt();
        System.out.println("ingrese el numero de ojos del marciano");
        numojos=sc.nextInt();
       
        Marte marciano = new Marte ( planeta,  color,  numvidas, numojos);
        System.out.println(marciano);
         System.out.println("ingrese la altura del jupiteriano");
       String planeta1 =sc.next();
        System.out.println("ingrese el color del jupiteriano");
        String color1=sc.next();
        System.out.println("ingrese el numero de vidas del jupiteriano");
       int  numvidas1=sc.nextInt();
        System.out.println("ingrese el numero de ojos del jupiteriano");
       int  numojos1=sc.nextInt();
       
        Jupiter jupiteriano = new Jupiter ( planeta1,  color1,  numvidas1, numojos1);
        System.out.println(jupiteriano);
    }
    
}
