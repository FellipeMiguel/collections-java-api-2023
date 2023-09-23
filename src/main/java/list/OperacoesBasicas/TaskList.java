package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    //atributo
    private final List<Task> listTask;

    public TaskList() {
        this.listTask = new ArrayList<>();
    }

    public void addTask(String description) {
        listTask.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> tasksForRemove = new ArrayList<>();
        for (Task t : listTask) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                tasksForRemove.add(t);
            }
        }
        listTask.removeAll(tasksForRemove);
    }

    public int getTotalOfTasks() {
        return listTask.size();
    }

    public void getTasksDescriptions() {
        System.out.println(listTask);
    }

    public static void main(String[] args) {
        TaskList listTask = new TaskList();
        System.out.println("O número total de elementos na lista é " + listTask.getTotalOfTasks());

        listTask.addTask("Tarefa 1");
        listTask.addTask("Tarefa 1");
        listTask.addTask("Tarefa 3");
        System.out.println("O número total de elementos na lista é " + listTask.getTotalOfTasks());

        listTask.removeTask("Tarefa 3");
        System.out.println("O número total de elementos na lista é " + listTask.getTotalOfTasks());

        listTask.getTasksDescriptions();
    }
}
