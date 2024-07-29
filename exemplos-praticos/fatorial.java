// Criação de um programa para calcular o fatorial de um número

import java.util.Scanner;

public class Fatorial {
    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num   
 = scanner.nextInt();   

        
        int fatorial = calcularFatorial(num);
        System.out.println("O fatorial de " + num + " é " + fatorial);
    }
}