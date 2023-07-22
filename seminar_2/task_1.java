package seminar_2;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float number:");
        float number = readFloat(scanner);
        System.out.println("Entered number is: " + number);
    }

    public static float readFloat(Scanner scanner) {
        while (true) {
            try {
                String str = scanner.nextLine();
                if (!str.contains(".")) {
                    throw new NumberFormatException();
                }
                float number = Float.parseFloat(str);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format. Enter a float number:");
            }
        }
    }
}