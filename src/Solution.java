//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "42\r\n" + //
                "3.1415\r\n" + //
                "Welcome to HackerRank's Java tutorials!";
        System.out.println(mockInput);
        Scanner scanner = new Scanner(mockInput);
        int intValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();
        String stringValue = scanner.nextLine();
        
        scanner.close();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
    }
}
