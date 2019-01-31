/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao01;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Numeros {
    public static void main(String[] args) {
        int n , s=0;
        String resp;
        Scanner scam= new Scanner(System.in);
        do{
            System.out.println("Digite um numero");
            n = scam.nextInt();
            s+=n;
            System.out.println("Quer Continuar ? [S/N]");
            resp = scam.next();
       
        }while(resp.equals("S"));
        System.out.println("A soma de todos os valores é "+ s);
        
        
        
        int x, y;
double z;

x = 5;
y = 2;
z = x / y;
System.out.print(Math.pow(8,2));
        
        
    }
}
