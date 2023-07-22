package seminar_2;

public class task_2 {
    public static void main(String[] args) {

        // небыл задан массив
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        try {
            // int d = 0; -> на 0 делить нельзя
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}