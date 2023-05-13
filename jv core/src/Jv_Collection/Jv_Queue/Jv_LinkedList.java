package Jv_Collection.Jv_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Jv_LinkedList {
    public static void main(String[] args) {
        Queue<String> studentList = new LinkedList<>();

        studentList.offer("Class 1");
        studentList.offer("Ho Van A");
        studentList.offer("Ho Van B");
        studentList.offer("Class 2");

        while (true) {
            String name = studentList.poll();
            if (name == null) {
                break;
            }
            System.out.println(name);
        }
    }
}
