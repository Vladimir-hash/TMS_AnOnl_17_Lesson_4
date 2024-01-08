import java.util.Arrays;

public class AdditionalTask3 {

//   3. Создайте массив строк. Заполните его произвольными именами людей.
//   Отсортируйте массив.
//   Результат выведите на консоль.

    public static void main(String[] args) {
        String[] arrayNames = {"Вася", "Петя", "Коля", "Андрей"};
        Arrays.sort(arrayNames);
        System.out.println(Arrays.toString(arrayNames));
    }
}
