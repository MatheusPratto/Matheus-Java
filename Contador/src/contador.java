/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matheus
 */
public class contador {
    public static void main(String[] args) {
        int cc = 1;
        
        while(cc<=10){
            cc++;
            if(cc == 5 || cc == 7 || cc==9){
                continue;
            }
            System.out.println("teste" + cc);
           
        }
    }
}
