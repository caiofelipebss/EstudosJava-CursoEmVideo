/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author caio_
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("DIGITE O NOME DO ALUNO:");
        String nome = teclado.nextLine();
        
        System.out.println("DIGITE A NOTA DO ALUNO: ");
        float nota = teclado.nextFloat();
        System.out.println("A nota de " + nome + " é " + nota);
    }
        // TODO code application logic here
    } 
    

