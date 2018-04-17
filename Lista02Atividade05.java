package lista02atividade05;

import java.io.IOException;
import java.util.Scanner;

public class Lista02Atividade05 {

    public static void main(String[] args) throws IOException {
        //Declarando as variaveis
        int n1, n2, n3;
        int m, s, n;
        //Realizando a leitura dos valores informados pelo usuario para as variaveis n1,n2 e n3
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        n2 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        n3 = entrada.nextInt();
        //Realizando a leitura de um caracter para a variavel cod
        System.out.println("Digite 'm' para media, 's' para somar ou 'n' para multiplicar os numeros");
        char cod = (char) System.in.read();
        //Estrutura condicional para caso o caracter informado em cod for m,s ou n
        //Realizando assim as suas respectivas operações e as apresentando ao usuario
        switch (cod) {
            case 'm':
                m = (n1 + n2 + n3) / 2;
                System.out.println("Media: " + m);
                break;
            case 's':
                s = n1 + n2 + n3;
                System.out.println("Soma: " + s);
                break;
            case 'n':
                n = n1 * n2 * n3;
                System.out.println("Multiplicação: " + n);
                break;
            default:
                break;
        }
    }

}
