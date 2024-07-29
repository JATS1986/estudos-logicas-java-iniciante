# Estudo de Lógica de JAVA para Iniciantes 

Será apresentado um pequeno contexto sobre a programação JAVA.

## Um Breve Histórico

Java, criada pela Sun Microsystems (atualmente Oracle), surgiu no início dos anos 90 com o objetivo de criar uma linguagem de programação que fosse "escreva uma vez, execute em qualquer lugar" (WORA). A ideia era desenvolver aplicações que pudessem rodar em diferentes plataformas sem a necessidade de recompilação.

Inicialmente, Java foi concebida para programar pequenos dispositivos eletrônicos, mas rapidamente se tornou popular para o desenvolvimento de aplicações web, desktop e enterprise. A plataforma Java, composta pela linguagem, pela máquina virtual Java (JVM) e por um conjunto de bibliotecas, oferece um ambiente robusto e seguro para o desenvolvimento de software.

## Introdução à Usabilidade e Aplicações

Java é uma linguagem de programação orientada a objetos, conhecida por sua sintaxe clara e concisa. Sua sintaxe se inspira em C++, mas remove alguns de seus recursos mais complexos, tornando-a mais fácil de aprender e utilizar.

## Principais áreas de aplicação:

* Desenvolvimento web: Java é amplamente utilizada para criar aplicações web robustas e escaláveis, tanto na parte do servidor (com frameworks como Spring e Jakarta EE) quanto na parte do cliente (com tecnologias como JavaFX).
* Desenvolvimento empresarial: Java é a linguagem de escolha para muitas empresas ao redor do mundo para construir sistemas de grande porte, como sistemas de gestão empresarial (ERP), sistemas de gerenciamento de relacionamento com o cliente (CRM) e sistemas bancários.
* Aplicações móveis: Embora o Android utilize principalmente a linguagem Kotlin, Java ainda é uma opção válida para o desenvolvimento de aplicativos Android.
* Big data: Frameworks como Apache Spark e Hadoop, que são amplamente utilizados para processar grandes volumes de dados, são construídos em Java.
* Jogos: Java é utilizada para criar jogos, tanto simples quanto complexos, com o auxílio de engines de jogos como LibGDX.

## Finalidade da Programação Java

A principal finalidade da programação Java é criar software que seja:

- Portátil: As aplicações Java podem rodar em qualquer plataforma que possua uma JVM instalada.
- Robusto: O sistema de tipos forte e a verificação de erros em tempo de compilação ajudam a evitar muitos tipos de erros comuns em programação.
- Seguro: Java possui mecanismos de segurança que ajudam a proteger as aplicações contra ataques maliciosos.
- Concorrente: A linguagem suporta a programação concorrente, permitindo que múltiplas tarefas sejam executadas simultaneamente.
- Orientada a objetos: A programação orientada a objetos permite organizar o código de forma mais modular e reutilizável.
- Avanços da Programação Java

## A linguagem Java continua evoluindo e se adaptando às novas demandas do mercado. Alguns dos avanços mais recentes incluem:

1. Java 17 e além: Novas versões da linguagem estão sendo lançadas regularmente, trazendo novos recursos e melhorias de desempenho.
2. Microsserviços: Java é uma excelente opção para construir aplicações baseadas em microsserviços, que são pequenas unidades de software independentes.
3. Inteligência artificial e machine learning: Frameworks como Deeplearning4j e TensorFlow permitem o desenvolvimento de aplicações de inteligência artificial e machine learning em Java.
4. Cloud computing: Java se integra perfeitamente com as principais plataformas de cloud computing, como Amazon Web Services, Google Cloud Platform e Microsoft Azure.

## Apresentando alguns exemplos simples sobre a progrmação em JAVA

O tradicional programa "Olá, Mundo!" é o ponto de partida para qualquer linguagem de programação:

```JAVA
public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```
A explicação sobre esse código, linha a linha:
- public class OlaMundo: Declara uma classe pública chamada OlaMundo.
- public static void main(String[] args): É o método principal onde a execução do programa começa.
- System.out.println("Olá, mundo!");: Imprime a mensagem "Olá, mundo!" na console.

Variáveis e Tipos de Dados

```JAVA
public class Variaveis {
    public static void main(String[] args) {
        int idade = 25;
        double altura = 1.75;
        String nome = "João";
        char inicial = 'J';
        boolean isEstudante = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        // ... e assim por diante
    }
}
```
A explicação sobre as partes do código não apresentadas anteriormente:
int: Número inteiro.
double: Número de ponto flutuante.
String: Sequência de caracteres.
char: Um único caractere.
boolean: Valor lógico (verdadeiro ou falso).

Operadores Aritméticos

```JAVA
public class Operadores {
    public static void main(String[] args) {
        int x = 10, y = 5;
        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        int divisao = x / y;
        int modulo = x % y; // Resto da divisão

        System.out.println("Soma: " + soma);
        // ... e assim por diante
    }
}
```
Estruturas Condicionais (if, else)

```JAVA
public class Condicionais {
    public static void main(String[] args) {
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");   

        }
    }
}
```
A explicação sobre as partes do código não apresentadas anteriormente:
- if: Executa um bloco de código se a condição for verdadeira.
- else: Executa um bloco de código se a condição for falsa.

Estruturas de Repetição (for)
```JAVA
public class Lacos {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Contador: " + i);
        }
    }
}
```
A explicação sobre as partes do código não apresentadas anteriormente:
- for: Repete um bloco de código um número determinado de vezes.

Um Exemplo Mais Completo: Calculadora Simples
```JAVA
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite   
 o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite   
 o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");   

        // ... outras opções

        int opcao = scanner.nextInt();

        double resultado;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            // ... outros casos
            default:
                System.out.println("Opção inválida.");
        }

        System.out.println("Resultado: " + resultado);
    }
}
```
A explicação sobre as partes do código não apresentadas anteriormente:
- Scanner: Para ler a entrada do usuário.
- switch-case: Para realizar decisões com base em diferentes valores.

## Exemplos didáticos

Vejam exemplos práticos de uso cotidiano na pasta "exemplos-praticos".

## Conclusão

Java é uma linguagem de programação madura e robusta, com uma vasta comunidade de desenvolvedores e uma ampla gama de ferramentas e frameworks. Sua versatilidade e portabilidade a tornaram uma das linguagens mais populares do mundo. Com os avanços contínuos da plataforma, Java continuará sendo uma escolha relevante para o desenvolvimento de software nos próximos anos.
