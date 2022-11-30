package iniciante;

import java.util.*;

/*
Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”.
Caso contrário, retorne "Nao sao iguais!” sem as aspas.
 */
public class Desafio1 {

    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.

        Scanner leitor = new Scanner(System.in);

        int A;
        int B;

        String resultado;

        System.out.println();
        A = leitor.nextInt();

        System.out.println();
        B = leitor.nextInt();

        if (A == B) {
            resultado = "Sao iguais!";
        } else {
            resultado = "Nao sao iguais!";
        }

        System.out.println(resultado);

    }
}
