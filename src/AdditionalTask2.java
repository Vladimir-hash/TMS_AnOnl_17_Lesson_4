import java.util.Arrays;

public class AdditionalTask2 {

//  2. Создайте массив и заполните массив.
//  Выведите массив на экран в строку.
//  Замените каждый элемент с нечётным индексом на ноль.
//  Снова выведете массив на экран на отдельной строке.

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
