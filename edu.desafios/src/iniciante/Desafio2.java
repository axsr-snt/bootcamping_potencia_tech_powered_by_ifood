package iniciante;

import java.util.*;

/*
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
 */
public class Desafio2 {
    public static void main(String[] args) {

        int A, N;

        int resultado = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        for(int i = A; i <= N; i++ ){
            if(i % A == 0){
                resultado = resultado + i;
            }
        }
        System.out.println(resultado);
    }

}
