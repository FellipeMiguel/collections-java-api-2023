package main.java.list.OperacoesBasicas;

public class Task {
    //atributo
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                '}';
    }
}
