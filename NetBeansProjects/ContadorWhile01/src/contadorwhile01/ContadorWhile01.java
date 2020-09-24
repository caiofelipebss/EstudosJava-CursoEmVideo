/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorwhile01;

/**
 *
 * @author caio_
 */
public class ContadorWhile01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        // Repetição com teste no INÍCIO (while)
        
        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 4) { 
                continue; //fluxo de um laço, os valores "2" e "4" vão sair da contagem
            }
            if (cc == 7){
                break; //contagem vai parar aqui, ou seja, vai até o "7". 
            }
                
            System.out.println("cambalhota " + cc);
            
        }
    }
    }
    
    

