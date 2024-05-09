package capacitacao.core.q6;

public class Motor {
    public String cilindrada;
    public float velocidadeMaxima;

    public Motor(String cilindrada, float velocidadeMaxima){
        this.cilindrada = cilindrada;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostraInfo(){
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima);
    }
}
