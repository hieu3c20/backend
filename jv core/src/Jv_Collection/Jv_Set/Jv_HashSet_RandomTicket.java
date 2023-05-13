package Jv_Collection.Jv_Set;

import java.util.*;

public class Jv_HashSet_RandomTicket {
    Set<String> randomTicket = new HashSet<>();
    public Jv_HashSet_RandomTicket() {
    }

    public boolean addTicket(String value) {
        return this.randomTicket.add(value);
    }

    public boolean deleteTicket(String value) {
        return this.randomTicket.remove(value);
    }

    public boolean checkIfTicketExists(String value) {
        return this.randomTicket.contains(value);
    }

    public void deleteAllTicket() {
        this.randomTicket.clear();
    }

    public int takeNumberOfTicket() {
        return this.randomTicket.size();
    }

    public String takeOneTicket() {
        String result = "";
        Random rd = new Random();
        int position = rd.nextInt(this.randomTicket.size());
        result = (String) this.randomTicket.toArray()[position];
        return result;
    }

    public void printAllTicket() {
        System.out.println(Arrays.toString(this.randomTicket.toArray()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jv_HashSet_RandomTicket rt = new Jv_HashSet_RandomTicket();
        int choiceUser = 0;
        do {
            System.out.println("______________________________________");
            System.out.println("Menu: ");
            System.out.println("1. Add code ticket.");
            System.out.println("2. Delete code ticket.");
            System.out.println("3. Check code ticket already existed or didnt.");
            System.out.println("4. Delete all code ticket.");
            System.out.println("5. The number of random ticket");
            System.out.println("6. Draws lots to get reward");
            System.out.println("7. Print all ticket");
            System.out.println("0. Exist program");
            System.out.print("Please choose one option: ");
            choiceUser = scan.nextInt();
            scan.nextLine();
            if(choiceUser == 1 || choiceUser == 2 || choiceUser == 3) {
                System.out.print("Enter code number ticket: ");
                String value = scan.nextLine();
                if(choiceUser == 1) {
                    rt.addTicket(value);
                } else if(choiceUser == 2) {
                    rt.deleteTicket(value);
                } else {
                    System.out.println("The result after checked: " + rt.checkIfTicketExists(value));
                }
            }
            else if(choiceUser == 4) {
                rt.deleteAllTicket();
            }
            else if(choiceUser == 5) {
                System.out.println("The number of random ticket is: " + rt.takeNumberOfTicket());
            }
            else if(choiceUser == 6) {
                System.out.println("Draw randomly lots in al ticket: " + rt.takeOneTicket());
            }
            else if(choiceUser == 7) {
                System.out.println("All of attendant ticket is: ");
                rt.printAllTicket();
            }
        } while(choiceUser != 0);
    }
}
