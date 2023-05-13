package j18_exceptionHandlingAndDebugging.Contact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    static ContactManager manager = new ContactManager();

    public static void main(String[] args) throws ParseException {
        try {
            Contact contact = new Contact("hieu", "0868975422", "12/30/2002");
            Contact contact3 = new Contact("lam", "0868975333", "12/12/2002");
            Contact contact4 = new Contact("tung", "0868975888", "12/9/2002");
            contact.setBirthDate("12/20/2002");
            Contact contact2 = new Contact(contact);
            contact2.setName("hai");
            contact2.setPhoneNumber("0123456789");
            contact2.setBirthDate("1/1/2002");
            System.out.println(contact);
            System.out.println(contact2);

            manager.addContact(contact);
            manager.addContact(contact2);
            manager.addContact(contact3);
            manager.addContact(contact4);
            System.out.print("here is contact manager\n");
            System.out.println(manager);
            manager.setContact(contact3, 2);
            manager.removeContact("tung");
            loadContacts("contacts");
        } catch (ParseException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process complete");
            manageContact();
        }
    }

    public static void loadContacts(String fileName) throws FileNotFoundException, ParseException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            Contact contact = new Contact(scanFile.next(), scanFile.next(), scanFile.next());
            manager.addContact(contact);
        }
    }

    public static void manageContact() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("would you like to \n\ta) add another contact\n\tb) remove the contact\n\tc) exit");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("a")) {
                System.out.print("\tname: ");
                String name = scan.nextLine();
                System.out.print("\tphone number: ");
                String phoneNumber = scan.nextLine();
                System.out.print("\tbirth date: ");
                String birthDate = scan.nextLine();
                if (name.isBlank() || phoneNumber.isBlank() || phoneNumber.length() < 5) {
                    System.out.println("\nthe input you provided is not valid. Registration failed");
                } else {
                    try {
                        manager.addContact(new Contact(name, phoneNumber, birthDate));
                    } catch (ParseException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        System.out.println("\nupdated contact\n" + manager);
                    }
                }
            } else if (response.equalsIgnoreCase("b")) {
                System.out.print("who would you like to remove? (enter name) ");
                manager.removeContact(scan.nextLine());
                System.out.println("updated contact\n" + manager);
            } else {
                break;
            }
        }
        scan.close();
    }
}
