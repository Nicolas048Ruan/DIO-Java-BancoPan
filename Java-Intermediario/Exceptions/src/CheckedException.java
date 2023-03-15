import java.io.*;
import javax.swing.*;

// Imprimir oq está dentro de um arquivo no console
public class CheckedException {
    
    public static void main(String[] args) { // Se adicionou em um tem q adicionar em outro
        String nomeArquivo = "romances-blake-crouch.txt";

        // Caso n queira adicionar um throws, é possível fazer um o try
        try {
            ImprimirArquivo(nomeArquivo);
        } catch (FileNotFoundException e) { // Erro no nome do arquivo
            // e.printStackTrace();
            // Se n der certo a impressão, vai aparecer uma janela de aviso
            JOptionPane.showMessageDialog(null,
                "Revise o nome do arquivo que você vai imprimir! " + e.getCause());
        } catch (IOException e) { // Pode ser vários erros pq muitos da class ImprimirArquivo() usam o IOException
            JOptionPane.showMessageDialog(null,
                "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    // Esse IOException arrumou tbm o FileNotFoundException pq ele é mãe dele, é mais generico
    public static void ImprimirArquivo(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo); // Vai pegar o arquivo e iniciar um obj tipo File

        // Vai criar um Buffer cm td o documento
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();// Vai ler linha por linha q está dentro do Buffer

        // Obj q vai indicar a saida no console
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line); // Vai imprimir cada linha no console
            bw.newLine(); // Pula para uma nova linha
            line = br.readLine();
        } while (line != null); // Vai continuar até n ter nd para ser lido no documento
        bw.flush(); // Descarregar
        br.close(); // Fechar arquivo
    }
}
