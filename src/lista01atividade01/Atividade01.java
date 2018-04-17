package lista01atividade01;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        //Declarando as variaveis
        int n1;
        int n2;
        double sm;
        double dif;
        double prod;
        double med;

        //Realizando a leitura dos valores informados pelo usuario para n1 e n2
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        n2 = entrada.nextInt();
        //Realizando as operações, onde as variaveis sm,dif,prod e med...
        //...recebem os resultados de suas respectivas operações, e as imprimindo para o usuario  
        sm = n1 + n2;
        System.out.println("Soma: " + sm);
        dif = n1 - n2;
        System.out.println("Diferença: " + dif);
        prod = n1 * n2;
        System.out.println("Produto: " + prod);
        med = (n1 + n2) / 2;
        System.out.println("Media: " + med);

    }

}
