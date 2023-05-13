package pra.continuationClass;

public class Dog {
//    fields- property
    private String name;
    int age;
    String hobbies;
    String sound;

//    constructor
    public Dog(String name, int age, String hobbies ) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
        this.sound = "gao gao";
    }

//    method
    public void getOlder() {
        this.age += 1;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getHobbies() {
        return this.hobbies;
    }

    public void reName(String newName) {
        this.name = newName;
    }

    public void barking() {
        System.out.println(this.sound);

    }

    public void getInfo() {
        System.out.println("My name is: " + getName());
        System.out.println("My age is: " + getAge());
        System.out.println("My hobbies are: " + getHobbies());
        System.out.println("sound is" + this.sound);
    }

    public static void main(String[] args) {
        Dog hai = new Dog("Hai", 19, "barking");
        Dog hieu = new Dog("Hieu", 23, "eating");

        System.out.println( hai.getName());
        hai.reName("Hai2");
        System.out.println("after rename: " + hai.getName());
        hai.barking();
        hai.getInfo();


        hieu.getInfo();
        hieu.reName("Hieu2");
        hieu.barking();
        System.out.println(hieu.getAge());
        hieu.name = "Hieu3";
        hieu.age = 19;
        hieu.hobbies = "playing game";
        hieu.getInfo();

    }
}
