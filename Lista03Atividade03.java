package lista03atividade03;

public class Lista03Atividade03 {

    public static void main(String[] args) {
        //Declarando as variaveis
        int soma = 0;
        int v = 0;
        //Estrutura de repetição onde a variavel "i" se conta de 1 a 99, sempre adicionando de 2 em 2
        //enquanto isso a variavel "v" incrementa valores de 1 a 1, e realizando a soma da divisão entre "i" e "v"
        //até que a condição de repetição de "i" seja saciada 
        for (int i = 1; i <= 99; i += 2) {
            v++;
            soma = i / v + soma;
        }
        //Apresentando o resultado final presente na variavel soma para o ususario
        System.out.println("Resultado soma " + soma);
    }

}
