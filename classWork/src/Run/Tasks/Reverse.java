package Run.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public void getReversedStr() {
        System.out.println("Enter some words or symbols:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] strArr = str.toCharArray();
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.println(strArr[i]);
        }
    }
}