package lista01atividade05;

import java.util.Scanner;

public class Lista01Atividade05 {

    public static void main(String[] args) {
        //Declarando as variaveis
        int n1;
        double r;
        //Realizando a leitura do valor informado pelo usuario para a variavel n1
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1 = entrada.nextInt();
        //Realizando a operação guardando na variavel r, o resultado da variavel n1 ao quadrado
        r = Math.pow(n1, 2);
        //Apresentando o resultado em "r" para o usuario
        System.out.println("O numero ao quadrado é: " + r);
    }

}
