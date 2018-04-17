package lista03atividade07;

import java.util.Scanner;

public class Lista03Atividade07 {

    public static void main(String[] args) {
        //Declarando variaveis
        double mfinal, maiorm = 0, menorm = 0, mturma = 0;
        int con = 0;

        Scanner entrada = new Scanner(System.in);
        //Estrutura de repetição para ler um numero indeterminado de medias
        do {
            System.out.println("Digite a media final: ");
            mfinal = entrada.nextDouble();
            con++;
            //Se a media informada pelo usuario for menor ou igual a zero,
            // media da turma recebe o seu proprio valor somado a media informada
            if (mfinal >= 0) {
                mturma = mturma + mfinal;
            }
            //Se a media informada pelo usuario for menor que o valor na variavel maiorm (inicializada com o valor 0),
            //maiorm recebe o valor de mfinal, desse modo sempre que haver um numero maior em mfinal ele será guardado em maiorm 
            if (mfinal > maiorm) {
                maiorm = mfinal;
            } else {
                //da mesma forma o menorm(tambem iniciada com 0) se então mfinal não for maior que maiorm
                //dese-se guardar esse valor em menorm, desse modo todos os outros valores que forem menores serão guardados em menorm  
                menorm = mfinal;
            }
            //Condição para sair do loop
        } while (mfinal >= 0);

        //Impressão para o usuario os resultados finais de maiorm (Marior media), menorm (Menor media) e mturma(MEdia da turma) 
        System.out.println("A maior media é: " + maiorm);
        System.out.println("A menor media é: " + menorm);
        System.out.println("A media da turma é: " + mturma / (con - 1));
    }

}
