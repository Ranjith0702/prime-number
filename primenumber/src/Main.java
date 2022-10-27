import java.lang.ref.SoftReference;
import java.*;
import java.util.Scanner;

class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of counts: ");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter a number: ");
        for (int i : a) {
            a[i] = sc.nextInt();
            int b = a[i] / 2;
            int c = 0;

            if (a[i] == 0 || a[i] == 1) {
                System.out.println("It is not a prime number");
            } else {
                for (int j = 2; j <= b; j++) {
                    if (a[i] % j == 0) {
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
}