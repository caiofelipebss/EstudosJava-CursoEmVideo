package poo02;

/**
 * Primeira aula do curso de POO - Java (Curso em Vídeo);
 * @author caio_
 */
public class Poo02 {


    public static void main(String[] args) {
        
        // dentro do método main, pode-se utilizar os métodos e atributos públicos e protegidos, desde que esteja utilizando objetos dessa classe.

        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.modelo = "Bic";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}