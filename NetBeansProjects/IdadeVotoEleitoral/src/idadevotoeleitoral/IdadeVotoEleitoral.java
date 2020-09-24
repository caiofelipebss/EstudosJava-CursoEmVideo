/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadevotoeleitoral;

import java.util.Scanner;

/**
 *
 * @author caio_
 */
public class IdadeVotoEleitoral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Digite seu ano de nascimento: ");
        Scanner teclado = new Scanner(System.in);
        int nasc = teclado.nextInt();
        int i = (2020 - nasc);
        if (i<16) { 
            System.out.println("Não vota!");   
        } 
        else {
            if (((i >= 16) && (i<18)) || (i>70)) {
                System.out.println("Opcional!");
            } else { 
                System.out.println("Obrigatório!");
        }  
    }   
    }
}
