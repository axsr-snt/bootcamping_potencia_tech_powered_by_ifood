package iniciantes;

import java.util.*;

/*
Uma busca sequencial se caracteriza por percorrermos todos os  elementos de uma estrutura em busca do elemento “X”
desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações
de A[N] = X. Caso a condição seja verdadeira.                                                                                                                                                                                                 “X” existe na estrutura e a busca será concluída com sucesso.
 */
public class Desafio5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int X, posicao = 0;
        boolean existe = false;
        String resposta = null;

        X = leitor.nextInt();

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == X){
                existe = true;
                posicao = i;
                break;}
        }

        if (existe == true) {
            resposta = "Achei " + X + " na posicao " + posicao;
        } else {
            resposta = "Numero " + X + " nao encontrado!";
        }

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        System.out.println(resposta);

    }
}
