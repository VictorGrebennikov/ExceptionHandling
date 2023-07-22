package seminar_2;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = readString(scanner);
        System.out.println("Entered string: " + str);
    }

    public static String readString(Scanner scanner) {
        while (true) {
            try {
                String str = scanner.nextLine();
                if (str.isEmpty()) {
                    throw new IllegalArgumentException("Error: empty lines cannot be entered!");
                } else {
                    return str;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}