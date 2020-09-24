 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 * for each = PARA CADA. 
 * Esse "for" só pode ser utilizado em vetores.  
 * @author caio_
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int num[] = {3, 5, 1, 8, 4};
//        
//        // Para cada elemento de NUM, coloque dentro de VALOR. 
//        for (int valor: num){ 
//            System.out.println(valor);
//        }
    
        // Para cada elemento de V, coloque dentro de valor.
        double v[] = {1.33, 9, 1.56, 4.43, -8.93, 2.12, 2, 3.0, 0.12, -3.23};
        
        //Para colocar/mostrar os valores do vetor em ordem, basta digitar Arrays.sort();
        Arrays.sort(v);
        
        for (double valor: v){
            System.out.println(valor);
        }    
    }
}
    
