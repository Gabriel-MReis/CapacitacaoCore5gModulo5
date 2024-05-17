package capacitacao.core;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void mostraInfo(){
        System.out.println("Produto: " + this.nome);
        System.out.println("Preco: " + this.preco);
    }

}
