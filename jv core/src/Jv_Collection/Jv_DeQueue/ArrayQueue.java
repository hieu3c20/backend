package Jv_Collection.Jv_DeQueue;


import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayQueue {
    public static void main(String[] args) {
        Deque<String> studentList = new ArrayDeque<>();
        studentList.offer("Ho Van A");
        studentList.offer("Ho Van B");
        studentList.offer("class A");
        studentList.offer("class B");
        studentList.addFirst("Class first");
        studentList.addLast("Class end");

        while(true) {
            String name = studentList.poll();
            if (name == null) {
                break;
            }
            System.out.println(name);
        }
    }
}
