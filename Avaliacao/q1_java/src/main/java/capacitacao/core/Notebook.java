package capacitacao.core;

public class Notebook extends Produto{
    private String processador;
    private String memoria;

    public Notebook(String nome, double preco, String processador, String memoria) {
        super(nome, preco);
        this.processador = processador;
        this.memoria = memoria;
    }
    
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Processador: " + this.processador);
        System.out.println("Memoria: " + this.memoria);
    }

    public void instalarAplicativo(){
        System.out.println("Instalando aplicativo...");
    }
}
