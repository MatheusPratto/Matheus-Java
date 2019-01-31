/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_primitivos;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Tipos_Primitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // float nota = 8.5;
      
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno");
             String nome =scan.nextLine();
             System.out.println("Digite a nota do aluno");
             float nota = scan.nextFloat();
    //    System.out.println("A nota é "+nota);
   
     System.out.printf("A nota do %s é %.2f \n",nome, nota);
    }
    
}
