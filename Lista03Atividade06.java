package lista03atividade06;

import java.util.Scanner;

public class Lista03Atividade06 {

    public static void main(String[] args) {
        //Declarando variaveis
        double n1, n2, n3;
        double s, p, m;
        Scanner sc = new Scanner(System.in);

        boolean a = true;
        //Estrutura de repetição while
        while (a) {
            //Realizando a leitura dos valores informados pelo usuario para as variaveis n1,n2 e n3
            System.out.println("N1: ");
            n1 = sc.nextInt();
            System.out.println("N2: ");
            n2 = sc.nextInt();
            System.out.println("N3: ");
            n3 = sc.nextInt();
            //Se os numeros informados em n1,n2 e n3 estiverem na ordem crescente
            if ((n3 > n2) && (n3 > n1) && (n2 > n1)) {
                //Realiza as seguintes operações, guardando seus resultados nas variaveis "s","p" e "m"
                s = n1 + n2 + n3;
                p = n1 * n2 * n3;
                m = (n1 + n2 + n3) / 3;
                //Apresentando o resultado ao usuario
                System.out.println("Soma: " + s);
                System.out.println("Produto: " + p);
                System.out.println("Media: " + m);
            } else {
                //Caso não estiver em ordem crescente, apresenta para o usuario, uma mensagem de invalido  
                System.out.println("INVALIDO");
                break;
            }

        }

    }

}
