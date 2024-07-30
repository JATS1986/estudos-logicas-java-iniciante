import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class SalvarTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto que deseja salvar: ");
        String texto = scanner.nextLine();

        JFileChooser fileChooser = new JFileChooser();
        int resposta = fileChooser.showSaveDialog(null);

        if (resposta == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
                bw.write(texto);
                System.out.println("Texto salvo com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Operação cancelada pelo usuário.");
        }
    }
}