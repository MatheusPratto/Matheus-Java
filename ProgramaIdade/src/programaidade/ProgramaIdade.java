/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scam= new Scanner(System.in);
        System.out.println("Em que ano voce nasceu ?");
int nasc = scam.nextInt();
nasc = 2019-nasc;
if(nasc>=18){
    System.out.println("Maior de idade sua idade é "+nasc);
}else{
    System.out.println("Menor de Idade sua idade é "+nasc);
}
        }
    
}
