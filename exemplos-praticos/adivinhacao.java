// Crie um jogo onde o computador escolhe um número aleatório e o usuário tenta adivinhar. 
// O programa deve dar dicas como "é maior" ou "é menor".

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;

        while (true) {
            System.out.print("Digite um número entre 1 e 100: ");
            int chute = scanner.nextInt();
            tentativas++;

            if (chute == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                break;
            } else if (chute < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }
        }
    }
}
