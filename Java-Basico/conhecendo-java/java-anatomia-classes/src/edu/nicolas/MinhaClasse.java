package edu.nicolas;

public class MinhaClasse {

    public static void main(String[] args) {
        
        // System.out.println("Olá, tenham um bom dia!");

        // final String BR = "Brasil";  O final torna a variável imudável

        String primeiroNome = "Nicolas";
        String segundoNome = "Ruan";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    // O método é composto por: tipo de retorno, nome do método e os parâmetros
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
