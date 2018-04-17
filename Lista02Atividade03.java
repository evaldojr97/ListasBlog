package lista02atividade03;

import java.util.Scanner;

public class Lista02Atividade03 {

    public static void main(String[] args) {
        //Declarando as variaveis
        double N1, N2, N3;
        double m;
        //Realizando a leitura dos valores informados pelo usuario para as variaveis N1,N2 e N3    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota 1: ");
        N1 = entrada.nextDouble();
        System.out.println("Nota 2: ");
        N2 = entrada.nextDouble();
        System.out.println("Nota 3: ");
        N3 = entrada.nextDouble();
        //Realizando a estrutura condicional para verificar se dentre as 3 notas
        //qual a maior delas
        if ((N1 > N2) && (N1 > N3)) {
            System.out.println("Sua maior nota é: " + N1);
        } else if ((N2 > N1) && (N2 > N3)) {
            System.out.println("Sua maior nota é: " + N2);
        } else if ((N3 > N2) && (N3 > N1)) {
            System.out.println("Sua maior nota é: " + N3);
        }
        //E a média destas notas(valor guardado em "m")
        m = (N1 + N2 + N3) / 3;
        //Informando o resultado para o usuario
        System.out.printf("A media das três notas é: %.2f\n ", m);
    }
}
