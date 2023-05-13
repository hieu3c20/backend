package Jv_oop.oopCharacteristic.Inheritances;

// superclass
class Inheritances {
//    vehicle attribute, can not use private because class car can not able to access it
    protected String brand = "Ford";
//    vehicle method
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// subclass
//    Use the extends keyword
class Car extends Inheritances {
//    Car attribute
    private String modelName = "Mustang";
    public static void main(String[]args){
//        create a object
        Car myFastCar = new Car();
//        call honk method from vehicle method on the myFastCar objects
        myFastCar.honk();
//        display value from the CAr class
        System.out.println(myFastCar.brand + " " + myFastCar.modelName );
    }
}


/*
Use inheritances to increase code reusability: tái sử dụng thuộc tính và phương thức khi tạo 1 class mới
Perform difference tasks
use final keyword in order to don't permit access from other class
 */


