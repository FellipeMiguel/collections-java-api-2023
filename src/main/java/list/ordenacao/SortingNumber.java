package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNumber {
    List<Integer> numbers;

    public SortingNumber() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }
    public List<Integer> sortingAscending() {
        List<Integer> ascendingNumber = new ArrayList<>(this.numbers);
        if (!numbers.isEmpty()) {
            Collections.sort(ascendingNumber);
            return ascendingNumber;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> sortingDescending() {
        List<Integer> descendingNumber = new ArrayList<>(this.numbers);
        if (!numbers.isEmpty()) {
            descendingNumber.sort(Collections.reverseOrder());
            return descendingNumber;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void showNumbers() {
        if (!numbers.isEmpty()) {
            System.out.println(this.numbers);
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        SortingNumber numeros = new SortingNumber();

        // Adicionando números à lista
        numeros.addNumber(2);
        numeros.addNumber(5);
        numeros.addNumber(4);
        numeros.addNumber(1);
        numeros.addNumber(99);

        // Exibindo a lista de números adicionados
        numeros.showNumbers();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.sortingAscending());

        // Exibindo a lista
        numeros.showNumbers();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.sortingDescending());

        // Exibindo a lista
        numeros.showNumbers();
    }
}
