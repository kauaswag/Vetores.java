import java.util.Scanner;

public class Busca2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números deseja inserir?");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        // Receber números em ordem crescente
        for (int i = 0; i < n; i++) {
            double numero;
            while (true) {
                System.out.println("Digite o número " + (i + 1) + "º valor:");
                numero = scanner.nextDouble();

                if (i == 0 || numero >= vetor[i - 1]) { // Garante ordem crescente
                    vetor[i] = numero;
                    break;
                } else {
                    System.out.println("O número deve ser maior ou igual ao anterior (" + vetor[i - 1] + "). Tente novamente.");
                }
            }
        }

        // Exibir os valores digitados
        System.out.println("Números digitados:");
        for (double valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();

        // Solicitar número para pesquisar
        System.out.println("Insira um número real para buscar:");
        double numeroParaBuscar = scanner.nextDouble();

        // Pesquisa sequencial
        boolean encontrado = false;
        for (double valor : vetor) {
            if (valor == numeroParaBuscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numeroParaBuscar + " está na lista.");
        } else {
            System.out.println("O número " + numeroParaBuscar + " não está na lista.");
        }

        scanner.close();
    }
}