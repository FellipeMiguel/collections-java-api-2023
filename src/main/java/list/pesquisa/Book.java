package main.java.list.pesquisa;

public class Book {
    //atributos
    private String title;
    private String author;
    private int yearPublication;

    public Book(String title, String author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
