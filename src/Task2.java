import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

//   2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
//  Для генерации случайного числа используйте метод Math.random().
//  Пусть будет возможность создавать массив произвольного размера.
//  Пусть размер массива вводится с консоли.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] < minValue) {
                minValue = array[i];
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));

        System.out.printf("Min array value: %S \n", minValue);
        System.out.printf("Max array value: %S \n", maxValue);
        System.out.printf("Medium array value: %S \n", sum / array.length);
    }
}
