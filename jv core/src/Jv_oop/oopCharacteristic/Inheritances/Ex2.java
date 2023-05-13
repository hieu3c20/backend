package Jv_oop.oopCharacteristic.Inheritances;

public class Ex2 {
    static class People {
        private String fullName;
        private double birthYear;

        public People(String fullName, int birthYear) {
            this.fullName = fullName;
            this.birthYear = birthYear;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public double getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public void eat() {
            System.out.println("eat eat!");
        }
        public void drink() {
            System.out.println("drink drink!");
        }
        public void sleep() {
            System.out.println("sleep sleep!");
        }
    }
    static class Student extends People {
        private String className;
        private String schoolName;

        public Student(String fullName, int birthYear, String className, String schoolName) {
            super(fullName, birthYear);
            this.className = className;
            this.schoolName = schoolName;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        public void doHomework() {
            System.out.println("do homework");
        }
    }

    public static void main(String[] args) {
        Student st = new Student("Ho Van Hieu", 2002, "3C20", "Hanoi University");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++\nIntroduction:");
        System.out.printf("%10s | %.0f | %5s | %10s | %n", st.getFullName() ,    st.getBirthYear()
                            ,  st.getClassName() ,   st.getSchoolName());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("his character: " );
        st.eat(); st.drink(); st.doHomework();
    }
}


