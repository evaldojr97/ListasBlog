package lista03atividade02;

public class Lista03Atividade02 {

    public static void main(String[] args) {
        //Estrutura de repetição para se apresentar uma tabuada
        //primeiro "for" realiza a contagem de 0 a 9 para a variavel i,
        //assim como o segundo para a variavel b
        //por fim apresentando a tabuada ao usuario,multiplicando as duas variaveis 
        for (int i = 0; i <= 9; i++) {
            for (int b = 0; b <= 9; b++) {
                System.out.println("Tabuada: " + i + " X " + b + " = " + i * b);
            }

        }
    }

}
