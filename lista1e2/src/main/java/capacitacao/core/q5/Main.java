package capacitacao.core.q5;

public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi(100);

        System.out.println(z1.vida);
        z1.comer();
        z1.correr();
    }
}
