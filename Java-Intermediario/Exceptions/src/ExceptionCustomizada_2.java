import javax.swing.*;

public class ExceptionCustomizada_2 {
    
    public static void main(String[] args) {

        int [] numerador = {4, 5, 8, 10, 2, 7};
        int [] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < numerador.length; i++) {

            try {
                if (numerador[i] % 2 != 0){
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                }

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Não divisivel por 0!");
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Sobrou um número na lista!");
            }
        }
        System.out.println("O programa continua...");
    }
}
