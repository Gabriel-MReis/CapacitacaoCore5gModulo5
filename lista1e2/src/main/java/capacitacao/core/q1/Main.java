package capacitacao.core.q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ano = scanner.nextInt();

        scanner.close();
        if(ano % 4 == 0)
            System.out.println(ano + " é bissexto.");
        else
            System.out.println(ano + " não é bissexto.");
    }
}
