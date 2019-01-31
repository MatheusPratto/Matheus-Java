/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scam = new Scanner(System.in);
        System.out.println("Digite suas duas notas");
   float n1 = scam.nextFloat();
   float n2 =  scam.nextFloat();
   float m = (n1+n1)/2;
   
        System.out.println("Sua média foi "+m);
   if(m>9){
       System.out.println("Parabens");
   }
   
   
    }
    
}
