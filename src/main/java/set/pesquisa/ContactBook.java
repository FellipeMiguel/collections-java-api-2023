package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    //atributo
    private Set<Contact> contacts;

    public ContactBook() {
        this.contacts = new HashSet<>();
    }

    public void addContact(String name, int number) {
        contacts.add(new Contact(name, number));
    }

    public void showContact() {
        System.out.println(contacts);
    }

    public Set<Contact> searchContactByName(String name) {
        Set<Contact> contactByName = new HashSet<>();
        for (Contact c: contacts) {
            if (c.getName().startsWith(name)) {
                contactByName.add(c);
            }
        }
        return contactByName;
    }

    public Contact updateContactNumber(String name, int newNumber) {
        Contact updatedContact = null;
        for (Contact c: contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newNumber);
                updatedContact = c;
                break;
            }
        }
        return updatedContact;
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.showContact();

        contactBook.addContact("Fellipe M Dino", 123456789);
        contactBook.addContact("Fellipe", 1234876789);
        contactBook.addContact("Fellipe M", 5786412);
        contactBook.addContact("Ester", 123456789);
        contactBook.addContact("Ester Pereira Sousa", 4785621);

        contactBook.showContact();

        System.out.println(contactBook.searchContactByName("Fellipe"));
        System.out.println("Contado atualizado " + contactBook.updateContactNumber("Fellipe", 11111111));

        contactBook.showContact();
    }
}
