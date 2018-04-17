package lista02atividade01;

import java.util.Scanner;

public class Lista02Atividade01 {

    public static void main(String[] args) {
        //Declarando a variavel
        int n1;
        //Realizando a leitura do valor informado pelo usuario para a variavel n1
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1 = entrada.nextInt();

        //Realizando a estrutura condicional para verificar se o numero em n1 é PAR ou IMPAR 
        //e informando para o usuario
        if ((n1 % 2) == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
