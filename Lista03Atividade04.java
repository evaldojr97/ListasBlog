package lista03atividade04;

public class Lista03Atividade04 {

    public static void main(String[] args) {
        //Estrutura de repetição onde a variavel "i" se conta de 1000 a 1999, sempre adicionando de 1 em 1
        for (int i = 1000; i <= 1999; i++) {
            //Durante essa contagem é realizada a condição de que todo numero presente em i
            // que dividido por 11 der resto 5, seja apresentado ao usuario
            if (i % 11 == 5) {
                System.out.println("Numeros entre 1000 e 1999 que divididos por 11 dão resto 5: " + i);
            }

        }
    }

}
