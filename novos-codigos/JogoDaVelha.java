import java.util.Scanner;

public class JogoDaVelha {
    static char[][] tabuleiro = new char[3][3];
    static char jogadorAtual = 'X';

    public static void main(String[] args) {
        inicializarTabuleiro();
        imprimirTabuleiro();

        while (!verificarFimDeJogo()) {
            obterJogada();
            imprimirTabuleiro();
        }
    }

    static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    static void imprimirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void obterJogada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jogador " + jogadorAtual + ", escolha uma linha (1-3): ");
        int linha = scanner.nextInt() - 1;
        System.out.print("Jogador " + jogadorAtual + ", escolha uma coluna (1-3): ");
        int coluna = scanner.nextInt() - 1;

        while (tabuleiro[linha][coluna] != '-') {
            System.out.println("Posição já ocupada. Tente novamente.");
            System.out.print("Jogador " + jogadorAtual + ", escolha uma linha (1-3): ");
            linha = scanner.nextInt() - 1;
            System.out.print("Jogador " + jogadorAtual + ", escolha uma coluna (1-3): ");
            coluna = scanner.nextInt() - 1;
        }

        tabuleiro[linha][coluna] = jogadorAtual;
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    static boolean verificarFimDeJogo() {
        // Verificar linhas, colunas e diagonais
        // ... (implementação detalhada abaixo)
        return false; // Retorna true se o jogo terminou
    }
}