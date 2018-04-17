package lista03atividade08;

import java.util.Scanner;

public class Lista03Atividade08 {

    public static void main(String[] args) {
        //Declarando variaveis
        int n1, par = 1, impar = 1;
        //
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero aqui: ");
        //Lendo a variavel n1 
        n1 = entrada.nextInt();

        System.out.println("Os primeiros numeros PARES anteriores a " + n1 + " são: ");
        //enquanto a variavel par for menor ou igual ao numero guardado na variavel n1
        while (par <= n1) {
            //condição para verificar se o numero guardado na variavel par de fato é um numero PAR
            // se par dividido por 2 der resto 0, de fato no numero ali guardado é par
            if ((par % 2) == 0) {
                System.out.println(par);
            }
            //Acrescentando mais um numero a variavel par
            par++;

        }
        System.out.println("Os primeiros numeros IMPARES anteriores a " + n1 + " são: ");
        while (impar <= n1) {
            //condição para verificar se o numero guardado na variavel impar de fato é um numero IMPAR
            // se impar dividido por 2 o resto for diferente de 0, de fato no numero ali guardado é impar
            if ((impar % 2) != 0) {
                System.out.println(impar);
            }
            //Acrescentando mais um numero a variavel impar
            impar++;
        }
    }

}
