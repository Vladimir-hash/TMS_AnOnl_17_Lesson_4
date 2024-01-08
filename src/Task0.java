import java.util.Scanner;


// 0. Создайте массив целых чисел. Напишете программу, которая выводит
// сообщение о том, входит ли заданное число в массив или нет.
// Пусть число для поиска задается с консоли (класс Scanner).


public class Task0 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
            System.out.println("Enter number");
            int number = scanner.nextInt();

            for (int newArray : array) {
                if (newArray == number) {
                    System.out.printf("Number %s include in array!", number);
                } else {
                    System.out.printf("Number %s don't include in array!", number);
                    break;
                }
            }
    }
}