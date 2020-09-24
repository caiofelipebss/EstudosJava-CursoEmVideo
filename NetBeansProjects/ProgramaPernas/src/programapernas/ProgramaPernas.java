/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author caio_
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas? ");
        int pernas = teclado.nextInt();
        System.out.print("Isso é um(a) ");
        String tipo;
            switch(pernas){
                case 1: 
                    tipo = "Saci";
                    break;
                
                case 2:
                    tipo = "bípede";
                    break;
                            
                case 4:
                    tipo = "Quadrúpede";
                    break;
                
                case 6: case 8:
                    tipo = "Aranha";
                    break;                    
              
                default: //Representa o "OutroCaso" e não precisa colocar "break" no final;
                    tipo = "ET";                               
            }
            System.out.println(tipo);
    }
    
}
