import java.lang.ref.SoftReference;
import java.*;
import java.util.Scanner;

class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b = a / 2;
        int c = 0;
        if (a == 0 || a == 1) {
            System.out.println("It is not a prime number");
        } else {
            for (int i = 2; i <= b; i++) {
                if (a % i == 0) {
                    System.out.println("It is not a prime number");
                    c = 1;
                    break;
                }
            }

            if (c == 0) {
                System.out.println("It is a prime number");

            }
        }
    }
}