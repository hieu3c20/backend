//package pra.AdditionalExercise.Ex_OOP.BookManager;
//
//import java.util.Scanner;
//
//public class BookTester {
//    public static void main(String[] args) {
//        Book book1 = new Book("Ho Van Hieu", 2000, 2020, "Ho van Hieu");
//        Book book2 = new Book("Nguyen Manh Hai", 3000, 2021, "Nguyen Manh Hai");
//
//
//        System.out.println("Name of book: "+book1.getNameOfBook());
//        System.out.println("Compare book:");
//        if (book1.compareBook(book2) == true) {
//            System.out.println("It is public the same year");
//        }else if(book1.compareBook(book2) == false) {
//            System.out.println("It is pubic in difference year");
//        }
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Book after sell book Ho Van Hieu: ");
//        System.out.print("1.10% 2.20% 3.30%");
//        System.out.println("Enter reduce percentage price: ");
//        int input = sc.nextInt();
//        input  = 0;
//
//        do {
//            switch (input) {
//                case 1:
//                    System.out.println("Book price: " + book1.afterSell(10));
//                    break;
//                case 2:
//                    System.out.println("Book price: " + book1.afterSell(20));
//                    break;
//                case 3:
//                    System.out.println("Book price: " + book1.afterSell(30));
//                    break;
//                default:
//                    System.out.println("Invalid value!");
//            }
//        }while (input != 0);
//    }
//}
