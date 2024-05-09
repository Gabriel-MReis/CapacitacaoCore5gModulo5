package capacitacao.core.q6;

public class Main {
    
    public static void main(String[] args) {
        Piloto p1 = new Piloto("Piloto1", false);

        Kart k1 = new Kart("kart1","500", 300, p1);

        k1.motor.mostraInfo();
        k1.piloto.soltaSuperPoder();
        k1.pular();
        k1.soltarTurbo();
        k1.fazerDrift();
    }
}
