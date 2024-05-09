package capacitacao.core.q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i =0;
        int idade;
        int somaidades =0;

        do {

            do {
                idade = scanner.nextInt();
            } while (idade <= 0);
            i++;
            somaidades += idade;
        } while (i < 5);
        scanner.close();
        System.out.println(somaidades);
    }
}
