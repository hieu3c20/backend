package Jv_Collection.Jv_ArrayList.Jv_StudentManager;

import java.util.Objects;

/*
================================Construct a program list student manager ============================
1. information of student include
- id number
- name
- year of birth
- average mark
2. Requirement
- Use arrayList
- print menu for use, including
    1.add student
   `2.print student list
    3.check number of student
    4.print number of student in list
    5.refresh student list
    6.use id number to find name of student
    7.delete student by id
    8.search name of student by character
    9.print student with mark decrease gradually
    0.exist program
 */
public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int yearOfBirth;
    private float averageMark;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, int yearOfBirth, float averageMark) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.averageMark = averageMark;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

//  Redefine data type
    @Override
    public String toString() {
        return "Student List: \n[id= " + id + ", name= " + name + ", yearOfBirth= " + yearOfBirth + ", averageMark= " + averageMark + "]";
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getYearOfBirth() == student.getYearOfBirth() && Float.compare(student.getAverageMark(), getAverageMark()) == 0 && Objects.equals(getId(), student.getId()) && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getYearOfBirth(), getAverageMark());
    }
}
