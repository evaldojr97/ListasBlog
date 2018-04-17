package lista03atividade09;

import java.util.Scanner;

public class Lista03Atividade09 {

    public static void main(String[] args) {
        //Declarando as variaveis
        int n;
        int d = 0;
        //Realizando a leitura do valor informado pelo usuario para a variavel n
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n = entrada.nextInt();

        //Verifica quantos divisores o numero n tem
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                d++;
            }
        }
        //Verifica se o numero n é primo ou não
        if (d == 2) {
            System.out.println(n + " - é primo");
        } else {
            System.out.println(n + " - não é primo");
        }
    }
}
