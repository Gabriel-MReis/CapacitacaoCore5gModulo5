package capacitacao.core;

public class Console extends Produto{
    private String geracao;
    private String marca;

    public Console(String nome, double preco, String geracao, String marca) {
        super(nome, preco);
        this.geracao = geracao;
        this.marca = marca;   
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Geracao: " + this.geracao);
        System.out.println("Marca: " + this.marca);
    }

    public void jogar(){
        System.out.println("Carregando o jogo...");
        System.out.println("Jogo iniciou");
    }
}
