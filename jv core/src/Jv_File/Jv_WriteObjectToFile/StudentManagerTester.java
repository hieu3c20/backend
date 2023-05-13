package Jv_File.Jv_WriteObjectToFile;

import Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student;
import Jv_Collection.Jv_ArrayList.Jv_StudentManager.StudentList;

import java.io.File;
import java.util.Scanner;

public class StudentManagerTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        Jv_Collection.Jv_ArrayList.Jv_StudentManager.StudentList st = new StudentList();
        do {
            System.out.println("================Menu=============== \n" +

                    "1.add student. \n" +
                    "2.print student list. \n" +
                    "3.check number of student. \n" +
                    "4.print number of student in list. \n" +
                    "5.refresh student list. \n" +
                    "6.use id number to find name of student. \n" +
                    "7.delete student by id. \n" +
                    "8.search name of student by character. \n" +
                    "9.print student with mark decrease gradually. \n" +
                    "0.exist program. \n"
            );
            System.out.print("Please choose a function : ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
//                1.add student.
                System.out.print("Enter student id: ");
                String id = sc.nextLine();
                System.out.print("Enter name of student: ");
                String name = sc.nextLine();
                System.out.print("Enter year of birth: ");
                int yearOfBirth = sc.nextInt();
                System.out.print("Enter average mark: ");
                float averageMark = sc.nextFloat();
                Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student sm = new Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student(id, name, yearOfBirth, averageMark);
                st.addStudent(sm);
            } else if (choice == 2) {
//                2.print student list.
                st.printStudentList();
            } else if (choice == 3) {
//                3.check number of student.
                System.out.println("List is empty(true) or not empty(false): " + st.checkStudentList());
            } else if (choice == 4) {
//                4.print number of student in list.
                System.out.println("Number of student: " + st.numberOfStudent());
            } else if (choice == 5) {
//                5.refresh student list.
                st.refreshStudentList();
            } else if (choice == 6) {
//                6.use id number to find name of student.
                System.out.println("Enter student id: ");
                String name = sc.nextLine();
                Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student student = new Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student(name);
                System.out.println("System check student: " + st.findStudentById(student));
            } else if (choice == 7) {
//                7.delete student by id.
                System.out.println("Enter student id: ");
                String name = sc.nextLine();
                Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student student = new Student(name);
                System.out.println("Delete this student (true: success, false: fail): " + st.deteleStudent(student));
            } else if (choice == 8) {
//                8.search name of student by character.
                System.out.print("Enter name of student: ");
                String name = sc.nextLine();
                System.out.print("Result found: ");
                st.searchByName(name);
            } else if (choice == 9) {
//                9.print student with mark decrease gradually.
                st.sortByMark();
                st.printStudentList();
            }
//            else if (choice == 10) {
//                System.out.println("Enter file name you want to save(enter path name and file name). \n " +
//                        "For example: C\\foldername\\filename.txt");
//                String fileName = sc.nextLine();
//                File f = new File(fileName);
//                st.writeObjectToFile(f);
//            }

//            else if(choice == 11) {
//                System.out.println("Enter file name: ");
//                String fileName = sc.nextLine();
//                File f = new File(fileName);
//                st.readDataFromFile(f);
//            }
            }
            while (choice != 0) ;
        }
    }
