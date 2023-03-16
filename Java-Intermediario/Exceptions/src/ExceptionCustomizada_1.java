import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_1 {

    public static void main(String[] args) {
        
        String nomeArquivo = JOptionPane.showInputDialog("Nome do Arquivo: ");

        imprimirArquivo(nomeArquivo);
        System.out.println("\nCom exception ou não, o porgrama continua...");
    }

    public static void imprimirArquivo(String nomeArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) { // Qndo der esse erro ele redireciona pro ImpossivelAberturaDeArquivoException
//      ImpossivelAberturaDeArquivoException precisa do nome e diretório dos arquivos como parâmetro
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception { // Criei minha Exception Personalizada
    private String nameFile;
    private String directory;

    public ImpossivelAberturaDeArquivoException(String nameFile, String directory) {
        super("O arquivo " + nameFile + " não foi encontrado no diretório " + directory);
        this.nameFile = nameFile;
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException {" +
                "nameFile=" + nameFile + '\'' +
                ", directory=" + directory + '\'' +
                '}';
    }
}
 