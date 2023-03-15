import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

// Imprimir um arquivo no console
public class CheckedException {
    
    public static void main(String[] args) throws IOException { // Se adicionou em um tem q adicionar em outro
        String nomeArquivo = "romances-blake-crouch.txt";
        ImprimirArquivo(nomeArquivo);

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
            bw.newLine();
            line = br.readLine();
        } while (line != null); // Vai continuar até n ter nd para ser lido no documento
        bw.flush(); // Descarregar
        br.close(); // Fechar arquivo
    }
}
