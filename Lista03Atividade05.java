package lista03atividade05;

import java.util.Scanner;

public class Lista03Atividade05 {

    public static void main(String[] args) {
        //Declarando variaveis   
        int somap = 0;
        int somai = 0;
        int n1;
        Scanner sc = new Scanner(System.in);
        //Estrutura de repetição onde a variavel "i" se conta de 0 a 1000, sempre adicionando de 1 em 1
        for (int i = 0; i <= 1000; i++) {
            //Realiza a leitura do valor informado pelo usuario para a variavel n1 
            System.out.println("Digite: ");
            n1 = sc.nextInt();
            //Onde a variavel i recebe o valor em n1
            i = n1;
            //Estrutura condicional onde se o valor em i dividido por 2 der resto 0
            //apresente a soma dos números pares e caso não dê resto 0, apresente soma dos números ímpares
            if ((i % 2) == 0) {
                somap = i + somap;
            } else {
                somai = i + somai;

            }
        }
        //Apresentando para o usuario o resultado final das somas, valores guardados em somap e somai
        System.out.println("Total de par: " + somap);
        System.out.println("Total de impar: " + somai);
    }

}
