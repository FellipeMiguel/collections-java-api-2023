package main.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class SetGuest {
    //atributo
    private Set<Guest> guests;

    public SetGuest() {
        this.guests = new HashSet<>();
    }

    public void addGuest(String name, int invitationCode) {
        guests.add(new Guest(name, invitationCode));
    }

    public void removeGuestByInvitationCode(int invitationCode) {
        Guest guestToRemove = null;
        for (Guest g : guests) {
            if (g.getInvitationCode() == invitationCode) {
                guestToRemove = g;
                break;
            }
        }
        guests.remove(guestToRemove);
    }

    public int countGuests() {
        return guests.size();
    }

    public void showGuests() {
        System.out.println(guests);
    }

    public static void main(String[] args) {
        SetGuest guests = new SetGuest();
        System.out.println("Existem " + guests.countGuests() + " na lista de convidados");

        guests.addGuest("Nome 1", 1234);
        guests.addGuest("Nome 2", 1235);
        guests.addGuest("Nome 3", 1235);
        guests.addGuest("Nome 4", 1236);

        System.out.println("Existem " + guests.countGuests() + " na lista de convidados");

        guests.removeGuestByInvitationCode(1234);

        System.out.println("Existem " + guests.countGuests() + " na lista de convidados");

        guests.showGuests();
    }
}
