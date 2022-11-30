package iniciante;

import java.util.*;

/*
Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".
Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ;
Se o número for apenas múltiplo de 3 -> "Fizz" ;
Se o número for apenas múltiplo de 5 -> "Buzz";
Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido;
 */
public class Desafio4 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int validacao, num;
        String classificacao;

        num = number.nextInt();

        validacao = Validar(num);

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        classificacao = Classificar(validacao, num);

        System.out.println(classificacao);
    }
    public static int Validar (int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            return 1;
        } else if ( num % 3 == 0 ) {
            return 2;
        } else if ( num % 5 == 0 ) {
            return 3;
        } else {
            return 0;
        }
    }

    public static String Classificar(int codigoValidacao, int numeroDigitado ){
        String resultadoValidacao = null;

        switch(codigoValidacao){
            case 1:
                resultadoValidacao = "FizzBuzz";
                break;
            case 2:
                resultadoValidacao = "Fizz";
                break;
            case 3:
                resultadoValidacao = "Buzz";
                break;
            case 0:
                resultadoValidacao = Integer.toString(numeroDigitado);
                break;
        }
        return resultadoValidacao;

    }
}
