package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SumNumber {
    final List<Integer> numbers;

    public SumNumber() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }

    public int calcSum() {
        int sum = 0;
        if (!numbers.isEmpty()) {
            for (int num : numbers) {
                sum += num;
            }
        }
        return sum;
    }
    public int findLargestNumber(){
        int largestNumber = 0;
        if (!numbers.isEmpty()) {
            for (int num : numbers) {
                if (num >= largestNumber) {
                    largestNumber = num;
                }
            }
        }
        return largestNumber;
    }
    public int findSmallestNumber(){
        int smallestNumber = 0;
        if (!numbers.isEmpty()) {
            for (int num : numbers) {
                if (num <= smallestNumber) {
                    smallestNumber = num;
                }
            }
        }
        return smallestNumber;
    }
    public void showNumber(){
        if (!numbers.isEmpty()) {
            System.out.println(this.numbers);
        }
    }

    public static void main(String[] args) {
        SumNumber sumNumber = new SumNumber();

        sumNumber.addNumber(5);
        sumNumber.addNumber(0);
        sumNumber.addNumber(0);
        sumNumber.addNumber(-2);
        sumNumber.addNumber(10);

        System.out.println("Números adicionados");
        sumNumber.showNumber();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + sumNumber.calcSum());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + sumNumber.findLargestNumber());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + sumNumber.findSmallestNumber());


    }
}
