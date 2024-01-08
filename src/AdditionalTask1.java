import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask1 {

//    4. Создайте массив из n случайных целых чисел и выведите его на экран. Размер массива пусть задается с консоли и
//   размер массива может быть больше 5 и меньше или равно 10. Если n не удовлетворяет условию - выведите сообщение об этом.
//   Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//   Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int count = 0;

        if (5 < size && size <= 10) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Enter correct size of array pls");
        }


        for (int i : array) {
            if (i % 2 != 0) count++;
        }

        if (count != 0) {
            int[] secondArray = new int[array.length - count];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    secondArray[j] = array[i];
                    j++;
                }
            }

            System.out.println(Arrays.toString(secondArray));
        }
    }
}
