package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

    public static List<Integer> fibonacci() {
        List<Integer> fibonacciNumbers = new ArrayList<>();

        int valorMaximo = 350;
        int numeroAnterior = 0;
        int numeroAtual = 1;
        int proximoNumero = 0;

        fibonacciNumbers.add(numeroAnterior);
        fibonacciNumbers.add(numeroAtual);

        while (numeroAtual < valorMaximo) {
            proximoNumero = numeroAtual + numeroAnterior;
            fibonacciNumbers.add(proximoNumero);
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }
        return fibonacciNumbers;
    }

    public static Boolean isFibonacci(Integer number) {
        return fibonacci().contains(number);
    }
}