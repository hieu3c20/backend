package Jv_Collection.Jv_DeQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        Queue<String> studentList = new PriorityQueue<>();
        studentList.offer("class a");
        studentList.offer("Ho Van B");
        studentList.offer("Ho Van A");

        studentList.offer("class b");
        while (true) {
            String name = studentList.poll();
            if (name == null) {
                break;
            }
            System.out.println(name);
        }
    }
}