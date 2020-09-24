/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaonumeros;

import java.util.Scanner;

/**
 * O exemplo faz parte dos estudos de estruturas de repetição DoWhile;
 * Este exemplo soma os numeros informados pelo usuario;
 * @author caio_
 */
public class RepeticaoNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
    
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n; //s = s + n; 
            System.out.print("Quer continuar? [S/N]");
            resp = teclado.next();                     
        } while ((resp.equals("S")) || (resp.equals("s"))); //equals serve para ler o conteúdo que está dentro do objeto;
        System.out.println("A soma de todos os valores é: "+s);
    }
    
}
