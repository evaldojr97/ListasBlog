package lista03atividade10;

import java.util.Scanner;

public class Lista03Atividade10 {

    public static void main(String[] args) {
        //Declarando as variaveis
        int n;
        int d;
        //Realizando a leitura do valor informado pelo usuario para a variavel n
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n = entrada.nextInt();
        System.out.println("Os primeiros numeros PRIMOS anteriores a " + n + " são: ");

        //Verifica quantos divisores o numero n tem e faz uma segunda contagem para se saber
        // quais outros numeros são primos
        for (int j = 1; j <= n; j++) {
            int cont = 0;
            for (int i = 1; i <= n; i++) {
                if (j % i == 0) {
                    cont++;
                }
            }
            //Realiza a verificação de todos os numeros que tiverem apenas dois divisores
            //Apresentando esses numeros ao usuario 
            if (cont == 2) {
                d = j;
                System.out.println(d);
            }
        }
    }
}
