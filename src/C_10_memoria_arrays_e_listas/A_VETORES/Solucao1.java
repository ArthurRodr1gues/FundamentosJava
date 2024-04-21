package C_10_memoria_arrays_e_listas.A_VETORES;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solucao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        double somaAlturas = 0;
        int countMenor16 = 0;
        List<String> nomesMenor16 = new ArrayList<>(); // Lista para armazenar os nomes das pessoas com menos de 16 anos

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            nomes[i] = scanner.next();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();

            somaAlturas += alturas[i];
            if (idades[i] < 16) {
                nomesMenor16.add(nomes[i]); // Adiciona o nome da pessoa com menos de 16 anos à lista
                countMenor16++;
            }
        }

        System.out.println("Altura média:");
        double mediaAlturas = somaAlturas / n;
        System.out.printf("%.2f%n", mediaAlturas);

        double percentMenor16 = (double) countMenor16 / n * 100;
        System.out.println("Pessoas com menos de 16 anos: " + percentMenor16 + "%");

        System.out.println("Nomes das pessoas com menos de 16 anos:");
        for (String nome : nomesMenor16) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
