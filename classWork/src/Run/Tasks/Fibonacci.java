package Run.Tasks;

import java.util.Scanner;

public class Fibonacci {
    public static void getFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here you can get series of fibonacci numbers");
        System.out.println("Enter a number(1-30):");
        int n = scanner.nextInt();
        int f = 1;
        int f1 = 1;
        int f2;
        for (int i = 1; i <= n; i++) {
            f2 = f + f1;
            System.out.print(f2 + " ");
            f = f1;
            f1 = f2;
        }
        if (n > 30 || n < 1) {
            System.out.println("Error. It is allowed to enter only 1-30 characters:(");
            System.exit(0);
        }
    }
}
