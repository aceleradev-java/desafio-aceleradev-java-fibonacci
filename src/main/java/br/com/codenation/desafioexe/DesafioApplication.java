package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
    private static final int  MAX_VALUE = 350;

    public static List<Integer> fibonacci() {
        List<Integer> fibonacciNumbers = new ArrayList<>();

        int previousNumber = 0;
        int currentNumber = 1;
        int nextNumber = 0;

        fibonacciNumbers.add(previousNumber);
        fibonacciNumbers.add(currentNumber);

        while (currentNumber < MAX_VALUE) {
            nextNumber = currentNumber + previousNumber;
            fibonacciNumbers.add(nextNumber);
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
        return fibonacciNumbers;
    }

    public static Boolean isFibonacci(Integer number) {
        return fibonacci().contains(number);
    }
}