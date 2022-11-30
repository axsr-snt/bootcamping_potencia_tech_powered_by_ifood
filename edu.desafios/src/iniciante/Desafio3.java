package iniciante;

import java.util.*;

/*
Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.
 */
public class Desafio3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int N, resultado;

        N = leitor.nextInt();

        resultado = somatorio(N);

        //TODO: Imprima o somatório de N (utilize o método "somatorio").
        System.out.println(resultado);


    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    public static int somatorio(int N) {
        if (N == 0) {
            return 0;
        } else {
            return N + somatorio(N - 1);
        }
    }
}
