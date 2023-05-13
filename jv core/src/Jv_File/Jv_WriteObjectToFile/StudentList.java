package Jv_File.Jv_WriteObjectToFile;

import Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    public ArrayList<Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student>();
    }

    public StudentList(ArrayList<Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student student) {
        this.studentList.add(student);
    }

    //    2.print student list
    public void printStudentList() {
        for (Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student student : this.studentList) {
            System.out.println(student);
        }
    }

//    3.check number of student
    public boolean checkStudentList() {
        return this.studentList.isEmpty();
    }

//   4.print number of student in list.
    public int numberOfStudent() {
        return this.studentList.size();
    }

//   5.refresh student list
    public void refreshStudentList() {
        this.studentList.removeAll(studentList);
    }

//  6.use id number to find name of student.
    public boolean findStudentById(Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student pseudoStudentList) {
        return this.studentList.contains(pseudoStudentList);
    }

//    7.delete student by id.
    public boolean deteleStudent(Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student st) {
        return this.studentList.remove(st);
    }

//     8.search name of student by character.
    public void searchByName(String name) {
        for (Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student student : studentList) {
            if(student.getName().indexOf(name) >= 0) {
                System.out.println(student);
            }
        }
    }

//    9.print student with mark decrease gradually.
    public void sortByMark() {
        Collections.sort(this.studentList, new Comparator<Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student>() {
            @Override
            public int compare(Jv_Collection.Jv_ArrayList.Jv_StudentManager.Student s1, Student s2) {
                if(s1.getAverageMark() < s2.getAverageMark()) {
                    return -1;
                } else if(s1.getAverageMark() > s2.getAverageMark()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

//    10.Write object to file
    public void writeObjectToFile(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Student student : studentList) {
                oos.writeObject(student);
            }
            oos.flush();
            oos.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
//    11.Read object from file
    public void readDataFromFile(File f) {
        try {
            InputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);
            Student sv = null;
            while(true) {
                Object oj = ois.readObject();

                if(oj == null) {
                    break;
                }
                if(oj != null) {
                    sv = (Student) oj;
                    this.studentList.add(sv);
                }
            }
            ois.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
