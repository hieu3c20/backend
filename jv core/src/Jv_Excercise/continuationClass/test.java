package pra.continuationClass;

public class test {

    public static void sayingHello(String name, int age ){
        System.out.println("Print " + name);
        System.out.println("My age is : " + age);
    }

    public static int findMax(int a,int b,int c){
        int maxValue = a;
        if (b > maxValue) {
            maxValue = b;
        }
        if (c > maxValue) {
            maxValue = c;
        }
        return maxValue;
    }

    public static boolean checkIsEven(int number){
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }



    }

    public static String fullName(String firstName, String lastName) {
        String name = firstName + " " + lastName;
        return name;
    }

    public static void main(String[] args) {
//        String name1 = "hai";
//        String name2 = "hieu";
//        int age = 19;
//        sayingHello("hai", 19);
//        sayingHello(name2 , age);

//        int max = findMax(10,15,19);
//        int max2 = findMax(1232,23438,3248);
//        System.out.println(findMax(10,15,19));
//        System.out.println(max2);

//        boolean isEven = checkIsEven(19032);
//        System.out.println(checkIsEven(19002));

//        String fullName1 = fullName("Ho", "Hieu");
//        System.out.println(fullName1);
        String firstName = "Hieu";
        String lastName = "Ho";
        System.out.println(fullName(firstName, lastName));



    }

}
