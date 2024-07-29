// Desenvolva um programa que gere senhas aleatórias com base em critérios definidos pelo usuário

import java.util.Random;
import java.util.Scanner;

public class GeradorSenhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o tamanho da   
 senha: ");
        int tamanho = scanner.nextInt();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        System.out.println("Senha gerada: " + senha.toString());   

    }
}