
import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class array {
    public static void main(String[] args) {
        int vet[] = {1,2,3,4,5,6,7};
        
   
        int p = Arrays.binarySearch(vet,3);
        System.out.println("Encontrei o valor na posição "+ p );
        
        
    }
}
