package capacitacao.core.q6;

public class Kart {
    public String nome;
    public Piloto piloto;
    public Motor motor;

    public Kart(String nome, String cilindrada, float velocidadeMaxima, Piloto piloto){
        this.nome = nome;
        motor = new Motor(cilindrada, velocidadeMaxima);
        this.piloto = piloto;
    }

    public void pular(){
        System.out.println(this.piloto.nome + " esta pulando.");
    }

    public void soltarTurbo(){
        System.out.println(this.piloto.nome + " usou turbo.");
    }

    public void fazerDrift(){
        System.out.println(this.piloto.nome + " esta fazendo um drift.");
    }
}
