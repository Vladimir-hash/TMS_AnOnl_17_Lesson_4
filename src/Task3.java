import java.util.Arrays;

public class Task3 {

//   3. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
//   Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это
//   значение оказалось больше (либо сообщите, что их средние арифметические равны).

    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,5};
        int[] secondArray = {1,5,9,1,5};
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        int firstArraySum = 0;
        int secondArraySum = 0;
        for (int i = 0, j = 0; i < firstArray.length; i++, j++) {
            firstArraySum += firstArray[i];
            secondArraySum += secondArray[j];

        }
        int averageOne =  firstArraySum /  firstArray.length;
        int averageTwo =  secondArraySum /  secondArray.length;
        System.out.println(averageOne);
        System.out.println(averageTwo);

        if (averageOne < averageTwo) {
            System.out.println("Average value of the second array more than average value of the first array ");
        } else if  (averageOne == averageTwo) {
            System.out.println("Average value of the second array equal average value of the first array ");
        } else {
            System.out.println("Average value of the first array more than average value of the second array ");
        }
    }
}
