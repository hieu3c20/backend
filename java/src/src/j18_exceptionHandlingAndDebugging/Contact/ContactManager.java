package j18_exceptionHandlingAndDebugging.Contact;

import java.util.ArrayList;

public class ContactManager {
    ArrayList<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<Contact>();
    }

    public Contact getContact(int index) {
        return new Contact(contacts.get(index));
    }

    public void setContact(Contact contact, int index) {
        contacts.set(index, new Contact(contact));
    }

    public void addContact(Contact contact) {
        contacts.add(new Contact(contact));
    }

    public void removeContact(String name) {
        if (this.contacts.isEmpty()) {
            throw new IllegalStateException("can not remove from an empty list");
        }
        for (int i = 0; i < this.contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                contacts.remove(i);
            }
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.contacts.size(); i++) {
            temp += contacts.get(i).toString();
            temp += "\n";
        }
        return temp;
    }
}
