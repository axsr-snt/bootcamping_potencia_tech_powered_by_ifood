/*
Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”.
Caso contrário, retorne "Nao sao iguais!” sem as aspas.
 */

import java.util.*;

public class Teste {

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
