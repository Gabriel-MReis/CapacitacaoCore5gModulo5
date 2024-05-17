package capacitacao.core;

public class Main {
    public static void main(String[] args) {
        Notebook n1 = new Notebook("Alienware", 11700, "i9", "16GB");
        Console c1 = new Console("PS5", 3500, "5", "sony");

        n1.mostraInfo();
        n1.instalarAplicativo();
        c1.mostraInfo();
        c1.jogar();
    }
}