package lista03atividade01;

import java.util.Arrays;
import java.util.Scanner;

public class Lista03Atividade01 {

    public static void main(String[] args) {
        //Declarando uma variavel contadoras utilizando de um vetor
        double numero[] = new double[15];
        //Declarando a variavel scanner
        Scanner entrada = new Scanner(System.in);
        //Estrutura de repetição para se ler os 15 valores informados no vetor acima
        for (int i = 1; i <= numero.length; i++) {
            System.out.println("Digite o numero " + i + ":");
            numero[i - 1] = entrada.nextDouble();
        }
        //Através de um array apresentando para o usuario o maior e o menor numero informados no vetor anterior
        Arrays.sort(numero);
        System.out.println("O maior é: " + numero[14]);
        System.out.println("O menor é: " + numero[0]);

    }

}
