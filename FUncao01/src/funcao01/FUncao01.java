/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author matheus
 */
public class FUncao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FAtor f = new FAtor();
        f.setvValor(5);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
    
}
