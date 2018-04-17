package lista01atividade03;

import java.util.Scanner;

public class Lista01Atividade03 {

    public static void main(String[] args) {
        //Declarando as variaveis
        double volume;
        double raio;
        double raio2;
        double altura;
        //Realizando a leitura dos valores informados pelo usuario para as variaveis raio e altura
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor do raio: ");
        raio = entrada.nextInt();
        System.out.println("Valor da Altura: ");
        altura = entrada.nextInt();
        //Realizando o calculo e apresentando o valor de volume
        raio2 = raio * raio;
        volume = 3.14 * raio2 * altura;
        System.out.println("O volume é: " + volume);

    }

}
