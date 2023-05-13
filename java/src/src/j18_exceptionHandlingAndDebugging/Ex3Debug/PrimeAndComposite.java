package j18_exceptionHandlingAndDebugging.Ex3Debug;

public class PrimeAndComposite {
    public static void main(String[] args) {
        int random = random(15);
        System.out.println("number: " + random);
        System.out.println("prime or composite: " + (random == 1 ? "composite" : isPrime(random)));
    }

    public static int random(int range) {
        double random = Math.random() * range + 1;
        return (int) random;
    }

    public static String isPrime(int random) {
        String isPrime = "prime";
        for (int i = 2; i < random; i++) {
            if (random % i == 0) {
                isPrime = "composite";
                break;
            }
        }
        return isPrime;
    }
}
