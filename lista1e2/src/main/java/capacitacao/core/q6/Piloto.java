package capacitacao.core.q6;

public class Piloto {
    public String nome;
    public boolean vilao;

    public Piloto(String nome, boolean vilao){
        this.nome = nome;
        this.vilao = vilao;
    }

    public void soltaSuperPoder(){
        System.out.println("Soltando super poder.");
    }
}
