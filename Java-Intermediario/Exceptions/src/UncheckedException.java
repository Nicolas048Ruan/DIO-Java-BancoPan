import javax.swing.*;

// Fazer a divisão de dois valores inteiros
public class UncheckedException {

    public static void main(String[] args) {

        boolean continuaLoop = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: "); // Mostra uma janela com o input
            String b = JOptionPane.showInputDialog("Denominador: ");
    
            // Com isso a exception não aparece
            try{ // Tente
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado); 
                continuaLoop = false;   
            } catch (NumberFormatException e) { // Exception q pode dar erro
                e.printStackTrace(); // Isso é para que as exceptions aparecam na tela
                JOptionPane.showMessageDialog(null,  // Mostra uma janela cm a mensagem
                    "Entrada inválida informe um número inteiro! " + e.getMessage());// e.getMessage mostra o tipo da Exception
            } catch (ArithmeticException e) {
                e.printStackTrace(); // Isso é para que as exceptions aparecam na tela
                JOptionPane.showMessageDialog(null,  // Mostra uma janela cm a mensagem
                    "Impossível dividir por 0! ");
    
            } finally { // Opcional 
                System.out.println("Chegou no finally!");
            }
    
        } while(continuaLoop);

        System.out.println("O código continua ...");
    }

    private static int dividir(int a, int b) { return a / b; }    
}
