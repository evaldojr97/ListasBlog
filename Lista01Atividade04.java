package lista01atividade04;

import java.util.Scanner;

public class Lista01Atividade04 {

    public static void main(String[] args) {
        //Declarando as variaveis
        int a;
        int b;
        int c;

        //Realizando a leitura dos valores informados pelo usuario para as variaveis a e b
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        a = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        b = entrada.nextInt();
        //Efetuando a troca dos valores de A para B e de B para A utilizando uma variavel C de apoio
        c = a;
        a = b;
        b = c;

        //Apresentando a troca para o usuario        
        System.out.println("O valor de A é: " + a);
        System.out.println("O valor de b é: " + b);
    }

}
