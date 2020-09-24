/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author caio_
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* String nome1 = "Caio";
       * String nome2 = "Caio";
       * String nome3 = new String("Caio");
       * String res; 
       * res = (nome1 == nome2)?"Igual":"Diferente";
       * System.out.println(res);
       */
       
       String nome1 = "Caio";
       String nome2 = "Caio";
       String nome3 = new String("Caio");
       String res;
       res = (nome1.equals(nome3))?"Igual":"Diferente"; 
       System.out.println(res);
       
       /* Como 'nome1' é um objeto, ele pode ter métodos. Para OBJETOS, em vez de utilizar '==', iremos utilizar 'equals'.
        * Esse '.equals' é um método que verifica se o CONTEÚDO de objetos diferentes são iguais.
        * O objeto 'nome1' é diferente de 'nome3', pois o objeto 'nome3' foi instanciado de forma diferente (usou-se a cláusula 'new').
        * Então ele não tem tecnicamente a mesma estrutura de 'nome1' e 'nome2', assim não são iguais. APENAS O CONTEÚDO DELES SÃO IGUAIS.
        */
       
    }
    
}
