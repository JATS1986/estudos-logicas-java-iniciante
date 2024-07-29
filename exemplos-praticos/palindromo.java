// Criação de um verificador de Polídromo 
// Em que a palavra digitada deve ser a mesma escrita de trás para frente

public class Palindromo {
    public static boolean isPalindromo(String palavra) {
        int i = 0, j = palavra.length() - 1;
        while (i < j) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String palavra = "arara";
        if (isPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");   

        }
    }
}