package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

    public static List<Integer> fibonacci() {
        List<Integer> fibonacciNumbers = new ArrayList<>();

        int maxValue = 350;
        int previousNumber = 0;
        int currentNumber = 1;
        int nextNumber = 0;

        fibonacciNumbers.add(previousNumber);
        fibonacciNumbers.add(currentNumber);

        while (currentNumber < maxValue) {
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