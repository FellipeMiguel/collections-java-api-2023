package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
    //atributo
    private final List<Book> bookList;

    public BooksCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int yearPublication) {
        Book book = new Book(title, author, yearPublication);
        this.bookList.add(book);
    }
    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book l: bookList) {
                if (l.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(l);
                }
            }
        }
        return booksByAuthor;
    }
    public List<Book> searchByYearInterval(int initialYear, int finalYear){
        List<Book> booksByYearInterval = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book l: bookList) {
                if (l.getYearPublication() >= initialYear && l.getYearPublication() <= finalYear) {
                    booksByYearInterval.add(l);
                }
            }
        }
        return booksByYearInterval;
    }
    public Book searchByTitle(String title){
        Book bookByTitle = null;
        if (!bookList.isEmpty()) {
            for (Book l: bookList) {
                if (l.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = l;
                    break;
                }
            }
        }
        return bookByTitle;
    }

    public static void main(String[] args) {
        BooksCatalog booksCatalog = new BooksCatalog();
        booksCatalog.addBook("Livro 1", "Autor 1", 2015);
        booksCatalog.addBook("Livro 1", "Autor 2", 1987);
        booksCatalog.addBook("Livro 2", "Autor 2", 1997);
        booksCatalog.addBook("Livro 3", "Autor 3", 1947);
        booksCatalog.addBook("Livro 4", "Autor 4", 2000);

        System.out.println(booksCatalog.searchByAuthor("Autor 2"));
        System.out.println(booksCatalog.searchByYearInterval(2000, 2023));
        System.out.println(booksCatalog.searchByTitle("Livro 1"));
    }
}
