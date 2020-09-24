/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclasse;

/**
 *
 * @author caio_
 */
public class SubClasse extends SuperClasse {
    public void umMetodo(int j){
        System.out.print("O valor de j é"+j);
    }
}

class Teste {
    public static void main(String args[]){
        SubClasse sub = new SubClasse();
        sub.umMetodo(5);
    }
}
