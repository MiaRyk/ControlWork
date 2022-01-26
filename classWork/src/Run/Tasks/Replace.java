package Run.Tasks;

import java.util.Scanner;

public class Replace {
    public void replaceChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some words or random symbols(1-30 symbols):");
        String previousStr = scanner.nextLine();
        String newStr = previousStr.replace("a", "@");
        previousStr.replace("o", "0");
        if (previousStr.length() <= 30 & previousStr.length() > 0) {
            System.out.println("Modified string: " + newStr);
        } else {
            System.out.println("Error. It is not allowed to enter more than 30 characters:(");
            System.exit(0);
        }
    }
}
