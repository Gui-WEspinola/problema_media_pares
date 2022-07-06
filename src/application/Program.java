package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();
        int[] vect = new int[n];
        double mediaPares = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
            if (vect[i] % 2 == 0){
                mediaPares += vect[i];
            }
        }

        mediaPares = mediaPares / vect.length;

        if (mediaPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
        }
    }
}
