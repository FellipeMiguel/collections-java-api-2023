package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingPeople {
    //atributo
    private List<Person> peopleList;

    public SortingPeople() {
        this.peopleList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        this.peopleList.add(new Person(name, age, height));
    }

    public List<Person> sortingByAge() {
        List<Person> peopleByAge = new ArrayList<>(peopleList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Person> sortingByHeight() {
        List<Person> peopleByHeight = new ArrayList<>(peopleList);
        Collections.sort(peopleByHeight, new ComparatorByHeight());
        return peopleByHeight;
    }

    public static void main(String[] args) {
        SortingPeople sortingPeople = new SortingPeople();
        sortingPeople.addPerson("Nome 1", 20, 1.56);
        sortingPeople.addPerson("Nome 2", 30, 1.80);
        sortingPeople.addPerson("Nome 3", 25, 1.70);
        sortingPeople.addPerson("Nome 4", 17, 1.56);

        System.out.println(sortingPeople.sortingByAge());
        System.out.println(sortingPeople.sortingByHeight());
    }
}
