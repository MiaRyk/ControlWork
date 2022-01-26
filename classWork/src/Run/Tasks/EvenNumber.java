package Run.Tasks;

import java.util.Scanner;

public class EvenNumber {
    public void getEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number and find out if it is even or not:");
        int number = scanner.nextInt();
        System.out.println(number);
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Error.Not even number");
        }
    }
}