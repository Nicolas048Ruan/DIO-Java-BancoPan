// Interface - Define um contrato que deve ser seguido pela classe que a implementa
//             Qndo uma classe implementa uma interface, ela se compromete a realizar 
//             todos os comportamentos q a interface disponibiliza

package Aula04.Ex4;

interface OperacaoMatematica { // Interface

    void soma(double operando1, double operando2);

    void subtracao(double operando1, double operando2);

    void multiplicacao(double operando1, double operando2);

    void divisao(double operando1, double operando2);

}
