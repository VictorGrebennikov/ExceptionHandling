package seminar_2;

public class task_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);

            // int[] abc = { 1, 2 }; -> слишком маленьная длина массива
            int[] abc = {1, 2, 3, 4};
            abc[3] = 9;

            // Не верная последовательность перехвата ошибки

            // } catch (Throwable ex) {
            // System.out.println("Что-то пошло не так...");
            // } catch (NullPointerException ex) {
            // System.out.println("Указатель не может указывать на null!");
            // } catch (IndexOutOfBoundsException ex) {
            // System.out.println("Массив выходит за пределы своего размера!");

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // Не верный Exception
    
    // public static void printSum(Integer a, Integer b) throws
    // FileNotFoundException {
    
    public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
    }
}