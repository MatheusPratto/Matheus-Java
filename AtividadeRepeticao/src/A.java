
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class A {
    public static void main(String[] args) {
        int n, s = 0,c = -1,p = -1,i = 0, m100 = 0;
        do{
 n = Integer.parseInt( JOptionPane.showInputDialog(null, "<html>Digite um numero (<em>Valor 0 Imterrompe</em>)</html>"));
        s += n;
        c++;
        
        if (n%2==0){
            p++;
        }else{
            i++;
        }
        if(n >= 100){
            m100++;
        }
        
        
        
        
        }while(n != 0);
        int media = s/c;
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br> Somátoria "+s+"<br>Totais de Numeros "+c+"<br> Quantidade de Pares "+p+"<br>Quantidade de impares "+i+" <br>Numeros acima de 100 "+m100+"<br> Media Total "+media+"</html> ");
    }
    
    
}
