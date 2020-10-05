package poo03;

public class Caneta {

    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, String c, float p) { //Este é o método Construtor. Para identificar um método construtor é só ver o que tem o mesmo nome de sua classe. 
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo() { //Porque retorna uma String;
        return this.modelo;
    }

    public void setModelo(String m) { //"void" porque não retorna nada;
        this.modelo = m;
    }

    public float getPonta() { //Porque retorna um float; 
        return this.ponta;
    }

    public void setPonta(float p) { //"void" porque não retorna nada;
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
