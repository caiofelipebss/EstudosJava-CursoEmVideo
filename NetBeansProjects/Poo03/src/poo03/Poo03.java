package poo03;
public class Poo03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f ); //Criando um objeto "c1" que é da classe Caneta.
        c1.status();











        
       /*
        * //As duas formas são válidas
        * c1.setModelo("BIC"); // Aqui utilizamos o Método ACESSOR;
        * c1.modelo = "BIC";   // Aqui acessamos diretamente o ATRIBUTO. É possível porque o atributo está PÚBLICO;
        
        * c1.setPonta(0.5f); //Aqui novamente utilizamos o Método Acessor. 
        //c1.ponta = o.5f; //Aqui NÃO podemos acessar diretamente o atributo, pois este tem um acesso PRIVADO;
        
        * c1.status();
        
        * //Poderíamos escrever no lugar de "c1.status()":
        *
        * "System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta);
        *
        */      
    }
    
}
