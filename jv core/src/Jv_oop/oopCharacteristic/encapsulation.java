package Jv_oop.oopCharacteristic;
/*
>Sensitive data is hidden from users.
Inorder to achieve that: 1)declare variable/attributes as private, 2) use get and set methods to access and update value
of private variable

Get method to returns the variable value,
Set method to sets the value

 */
public class encapsulation {
    private String name;
    //getter
    public String getName() {
        return name;
    }
//    setter
    public void setName(String newName) {
        this.name = newName;
    }


    public static void main(String[] args) {
        encapsulation myObj = new encapsulation();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}


