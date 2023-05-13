package Jv_oop.oopCharacteristic;

import java.util.Scanner;

public class PakageAPI {
/*    group related classes(imagine as a folder in a file directory)
in order to : avoid conflicts and write a better maintainable code, divided into 2 categories:
> Built-in package(from java API): class and package- import depend on you
> User-defined package(from programmer)
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputFromUser = sc.nextLine();
        System.out.println("This is my package");
    }
}
