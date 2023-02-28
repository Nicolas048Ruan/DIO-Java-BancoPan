public class Operadores {
    
    public static void main(String[] args) {
        
        // Operador de Atribuição
        /*
         *
         * Representado pelo símbolo de igualdade "=".
         * 
         * String nome = "GLEYSON";
         * int idade = 22;
         * double peso = 68.5;
         * char sexo = 'M';
         * boolean doadorOrgao = false;
         * Date dataNascimento = new Date();
         * 
         */


        // Operadores Aritméticos
        /*
         * 
         * + (adição), - (subtração), * (multiplicação) e / (divisão)
         *
         *
         * double soma = 10.5 + 15.7;
         * int subtração = 113 - 25;
         * int multiplicacao = 20 * 7;
         * int divisao = 15 / 3;
         * int modulo = 18 % 3;
         * double resultado = (10 * 7) + (20/4);
         *
         *
         * String nomeCompleto = "LINGUAGEM" + "JAVA";
         * System.out.println(nomeCompleto);
         *
         * String nomeCompleto2 = "LINGUAGEM".concat(" ").concat("JAVA");
         * System.out.println(nomeCompleto2); 
         *
         * String concatenacao ="?"; 
         *
         * concatenacao = 1+1+1+"1";
         * System.out.println(concatenacao); // output: 31
         *
         * concatenacao = 1+"1"+1+1;
         * System.out.println(concatenacao); // output: 1111
         *
         * concatenacao = 1+"1"+1+"1";
         * System.out.println(concatenacao); // output: 1111
         *
         * concatenacao = "1"+1+1+1;
         * System.out.println(concatenacao); // output: 1111
         *
         * concatenacao = "1"+(1+1+1);
         * System.out.println(concatenacao); // output: 13
         * 
         */


        // Operadores Unários
        /*
         *
         * (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
         * (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
         * (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
         * (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
         * (!) Operador unário lógico de negação – nega o valor de uma expressão booleana
         *
         * int numero = 5;
         * // System.out.println(- numero);
         *
         * numero = - numero;
         * System.out.println(numero);
         *
         * // numero = + numero;
         * numero = numero * -1;
         * System.out.println(numero);
         *
         *
         * int numero = 5;
         *
         * System.out.println(numero++); // Adiciona 1 após a impressão
         *
         * System.out.println(++numero); // Adiciona 1 antes da impressão
         *
         * // Mesma coisa acontece com o símbolo de --
         * System.out.println(numero--);
         * System.out.println(--numero);
         *
         * boolean variavel = true;
         *System.out.println(!variavel); // O ! "inverti" o valor da variável
         *
         * variavel = !variavel;
         * System.out.println(variavel);
         *
         */


        // Operador Ternário
        /*
         *
         * O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
         * 
         * <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
         * 
         * int a, b;
         *
         * a = 5;
         * b = 5;
         * // String resultado = a == b ? "verdadeiro" : "falso";
         * int resultado = a == b ? 1 : 0;
         *
         * System.out.println(resultado);
         *
         */

        
        // Operadores Relacionais
        /*
         *
         * == Quando desejamos verificar se uma variável é IGUAL A outra.
         * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
         * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
         * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
         * < Quando desejamos verificar se uma variável é MENOR QUE outra.
         * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
         * 
         * int numero1 = 1;
         * int numero2 = 2;
         * 
         * if(numero1 > numero2){
         *    System.out.print("Numero 1 maior que numero 2");
         * }
         * 
         * if(numero1 < numero2){
         *    System.out.print("Numero 1 menor que numero 2");
         * }
         *
         * if(numero1 >= numero2){
         *    System.out.print("Numero 1 maior ou igual que numero 2");
         * }
         *
         * if(numero1 <= numero2){
         *    System.out.print("Numero 1 menor ou igual que numero 2");
         * }
         *
         * if(numero1 != numero2){
         *    System.out.print("Numero 1 é diferente de numero 2");
         * }
         *
         * if(numero1 == numero2){
         *    System.out.print("Numero 1 é igual ao numero 2");
         * }
         * 
         * 
         * String nome1 = "Nico";
         * String nome2 = new String("Nico");
         * 
         * System.out.println(nome1.equals(nome2)); // Usar equals qndo for objeto
         * 
         */

         
        // Operadores Lógicos
        /*
         *
         * && Operador Lógico "E"
         * || Operador Lógico "OU"
         * 
         */


        boolean cond1 = true;

        boolean cond2 = true;

        if (cond1 && cond2){
            System.out.println("As duas são verdadeiras");
        }

        if (cond1 || cond2){
            System.out.println("Uma das duas são verdadeiras");
        }

        System.out.println("FIM");
    }
}
