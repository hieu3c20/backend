package Jv_Collection.Jv_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Jv_PriorityQueue {
    public static void main(String[] args) {
        Queue<String> studentList = new PriorityQueue<String>();
        studentList.offer("class a");
        studentList.offer("Ho Van B");
        studentList.offer("Ho Van A");

        studentList.offer("class b");
        while(true) {
            String name = studentList.poll();
            if (name == null) {
                break;
            }
            System.out.println(name);
        }

    }

}
