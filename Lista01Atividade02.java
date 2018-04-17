package lista01atividade02;

import java.util.Scanner;

public class Lista01Atividade02 {

    public static void main(String[] args) {
        //Declarando as variaveis
        double C;
        double F;
        //Realizando a leitura do valor informado pelo usuario para a variavel C ( de graus Centígrados)
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Centígrados: ");
        C = entrada.nextInt();
        //Realizando a conversão de graus Centígrados para Fahrenheit e imprimindo para o usuario.
        F = (9 * C + 160) / 5;
        System.out.println("Temperatura em graus Fahrenheit: " + F);

    }

}
