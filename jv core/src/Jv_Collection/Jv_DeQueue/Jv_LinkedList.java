package Jv_Collection.Jv_DeQueue;

import java.util.Deque;
import java.util.LinkedList;

public class Jv_LinkedList {
    public static void main(String[] args) {
        Deque<String> studentList = new LinkedList<>();
        studentList.offer("Ho Van A");
        studentList.offer("Ho Van B");
        studentList.offer("Ho Van C");
        studentList.offer("Ho Van D");
        studentList.add("Ho van E");
        while(true) {
            String name = studentList.getFirst();

            if (name == "Ho Van A") {
                System.out.println(name);
                break;
            }

        }

    }
}
