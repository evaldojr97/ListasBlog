package lista02atividade04;

import java.io.IOException;
import java.util.Scanner;

public class Lista02Atividade04 {

    public static void main(String[] args) throws IOException {
        //Declarando as variaveis
        int v1, v2, v3;
        //Realizando a leitura dos valores informados pelo usuario para as variaveis v1,v2 e v3
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        v1 = entrada.nextInt();
        System.out.println("Digite um valor: ");
        v2 = entrada.nextInt();
        System.out.println("Digite um valor: ");
        v3 = entrada.nextInt();
        //Realizando a leitura de um caracter para a variavel cod 
        System.out.println("Digite 'c' para crescente ou 'd' para decrescente: ");
        char cod = (char) System.in.read();
        //Caso o caracter informado em cod for "c", ele realiza essa estrutura condicional
        if (cod == 'c') {
            //Estrutura condicional para apresentar os valor contidos em v1,v2 e v3 em ordem crescente
            if ((v1 >= v2) && (v2 >= v3) && (v1 >= v3)) {
                System.out.println("Seus numeros em ordem crescente: " + v3 + " - " + v2 + " - " + v1);
            } else if ((v1 >= v3) && (v1 >= v2) && (v3 >= v2)) {
                System.out.println("Seus numeros em ordem crescente: " + v2 + " - " + v3 + " - " + v1);
            } else if ((v2 >= v1) && (v2 >= v3) && (v1 >= v3)) {
                System.out.println("Seus numeros em ordem crescente: " + v3 + " - " + v1 + " - " + v2);
            } else if ((v2 >= v3) && (v2 >= v1) && (v3 >= v1)) {
                System.out.println("Seus numeros em ordem crescente: " + v1 + " - " + v3 + " - " + v2);
            } else if ((v3 >= v1) && (v3 >= v2) && (v2 >= v1)) {
                System.out.println("Seus numeros em ordem crescente: " + v1 + " - " + v2 + " - " + v3);
            } else if ((v3 >= v1) && (v3 >= v2) && (v1 >= v2)) {
                System.out.println("Seus numeros em ordem crescente: " + v2 + " - " + v1 + " - " + v3);
            }
        //Caso o caracter informado em cod for "d", ele realiza essa estrutura condicional
        } else if (cod == 'd') {
            //Estrutura condicional para apresentar os valor contidos em v1,v2 e v3 em ordem decrescente
            if ((v1 >= v2) && (v2 >= v3) && (v1 >= v3)) {
                System.out.println("Seus numeros em ordem decrescente: " + v1 + " - " + v2 + " - " + v3);
            } else if ((v1 >= v3) && (v1 >= v2) && (v3 >= v2)) {
                System.out.println("Seus numeros em ordem decrescente: " + v1 + " - " + v3 + " - " + v2);
            } else if ((v2 >= v1) && (v2 >= v3) && (v1 >= v3)) {
                System.out.println("Seus numeros em ordem decrescente: " + v2 + " - " + v1 + " - " + v3);
            } else if ((v2 >= v3) && (v2 >= v1) && (v3 >= v1)) {
                System.out.println("Seus numeros em ordem decrescente: " + v2 + " - " + v3 + " - " + v1);
            } else if ((v3 >= v1) && (v3 >= v2) && (v2 >= v1)) {
                System.out.println("Seus numeros em ordem decrescente: " + v3 + " - " + v2 + " - " + v1);
            } else if ((v3 >= v1) && (v3 >= v2) && (v1 >= v2)) {
                System.out.println("Seus numeros em ordem decrescente: " + v3 + " - " + v1 + " - " + v2);
            }

        }

    }

}
