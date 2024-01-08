import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    // 1. Создайте массив целых чисел. Удалите все вхождения заданного  числа из массива.
    // Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
    // В результате должен быть новый массив без указанного числа.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 8, 3, 4, 8, 6, 5};
        int count = 0;

        System.out.print("Input the number to check: ");
        int number = scanner.nextInt();

        for (int i : array) {
            if (number == i) {
                count++;
            }
        }

        if (count != 0) {
            int[] newArray = new int[array.length - count];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (number != array[i] ) {
                    newArray[j] = array[i];
                    j++;
                }
            }

            System.out.printf("Old array: %S \n", Arrays.toString(array));
            System.out.printf("New array: %S \n", Arrays.toString(newArray));
        } else {
            System.out.printf("Number %S didn't include in array %S !", number, Arrays.toString(array));

        }
    }
    }