package Run;

import Run.Login.UsernamePassword;
import Run.Tasks.Reverse;
import Run.Tasks.EvenNumber;
import Run.Tasks.Fibonacci;
import Run.Tasks.Replace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String enterUsername = scanner.nextLine();
        System.out.println("Enter your password");
        String enterPassword = scanner.nextLine();
        UsernamePassword namePass = new UsernamePassword(enterUsername, enterPassword);
        namePass.check();
        System.out.println("Choose number (1-5) to get program");
        int programN = scanner.nextInt();
        switch (programN) {
            case 1:
                EvenNumber evenN = new EvenNumber();
                evenN.getEvenNumber();
                break;
            case 2:
                Reverse doRev = new Reverse();
                doRev.getReversedStr();
                break;
            case 3:
                Fibonacci doF = new Fibonacci();
                doF.getFibonacci();
                break;
            case 4:
                Replace doR = new Replace();
                doR.replaceChar();
                break;
            case 5:
                System.out.println("Sorry, it's not done yet:(");
                break;
            default:
                System.out.println("Error. Invalid input.");
                System.exit(0);
        }
    }
}
