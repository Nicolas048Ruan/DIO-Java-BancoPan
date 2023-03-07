// Interface - Define um contrato que deve ser seguido pela classe que a implementa
//             Qndo uma classe implementa uma interface, ela se compromete a realizar 
//             todos os comportamentos q a interface disponibiliza


package Aula04.Ex4;

public class Calculadora implements OperacaoMatematica { // Implementando Interface
    
    @Override
    public void soma(double operando1, double operando2){
        System.out.println("Soma: " + operando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("Subtração: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("Multiplicação: " + operando1 * operando2);
    }

    @Override
    public void divisao(double operando1, double operando2){
        System.out.println("Divisão: " + operando1 / operando2);
    }
}
