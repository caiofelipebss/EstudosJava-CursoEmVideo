
package projetoigti01;

import java.util.Scanner;

public class Classe01 {
    
    public static void main(String[] args) {
        int n1 = 8, n2 = 5; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n1 += teclado.nextInt();
        n2 = n2 + n1;
        System.out.printf("Valor de n1: %d. \nValor de n2: %d.", n1, n2);
        System.out.println("\nSeu código foi encerrado!");
    }
}
