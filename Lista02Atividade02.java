package lista02atividade02;

import java.util.Scanner;

public class Lista02Atividade02 {

    public static void main(String[] args) {
        //Declarando as variaveis
        int L1, L2, L3;
        //Realizando a leitura dos valores informados pelo usuario para as variaveis L1,L2 e L3
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor de L1: ");
        L1 = entrada.nextInt();
        System.out.println("Valor de L2: ");
        L2 = entrada.nextInt();
        System.out.println("Valor de L3: ");
        L3 = entrada.nextInt();
        //Realizando a estrutura condicional para verificar se os 3 valores realmente formam
        //um triângulo e caso sim, informar se é um triângulo isósceles, escaleno ou equilátero,
        //informando o resultado para o usuario

        if ((L1 + L2 > L3) || (L2 + L3 > L1) || (L3 + L1 > L2)) {

            System.out.println("Os valores informados formam um triângulo!");

            if ((L1 == L2) && (L2 == L3)) {
                System.out.println("Triângulo: Equilátero");
            } else if ((L1 == L2) || (L2 == L3) || (L1 == L3)) {
                System.out.println("Triângulo: Isósceles");
            } else if ((L1 != L2) && (L2 != L3) && (L1 != L3)) {
                System.out.println("Triângulo: Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

    }
}
