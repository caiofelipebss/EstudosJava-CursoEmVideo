package poo01;

/**
 * Primeira aula do curso de POO - Java (Curso em Vídeo);
 * @author caio_
 */
public class Poo01 {


    public static void main(String[] args) {
        
        System.out.println("Caneta 1: ");
        System.out.println("");
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.modelo = "Bic";
        c1.carga = 70 ;
        c1.ponta = 0.7f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
       
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Caneta 2: ");
        System.out.println("");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Faber Castel";
        c2.cor = "vermelha";
        c2.ponta = 0.9f;
        c2.carga = 100;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    
    }
}