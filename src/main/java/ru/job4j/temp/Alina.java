package ru.job4j.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.*;

public class Alina {

    /* Создаем метод для вычисления дискриминанта */
    public static int discriminant (int a, int b, int c) {
        return  b * b - 4 * a * c; /* вычисляем дискриминант */
    }

    /* Решаем квадратное ураснение с дискриминантой больше 0 */
    public static int[] quadratic (int a, int b, int c) {
        int x1 = (-b + (int) sqrt(discriminant(a, b, c))) / (2 * a); /*  находим х1 */
        int x2 = (-b - (int) sqrt(discriminant(a, b, c))) / (2 * a); /* находим х2 */
        int[] result = {x1, x2}; /* создаем массив с результатом */
        return result;
    }

    /* создаем генератор случайных чисел. В Питоне можно проще */
    public static int rnd (int first, int last) {
        Random random = new Random();
        return random.nextInt(last - first + 1) + first;
    }

    /* Создаем массив */
    public static int[] array (int a, int b, int c, int first, int last) {
        int sizeArray = abs(quadratic(a, b, c)[0] + quadratic(a, b, c)[1]) * 3; /* вычисляем размер массива */
        int[] array = new int[sizeArray]; /* создаем массив нужного размера */
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd(first, last);
        }
        return array;
    }

    /* Создаем массив с числами из диапазона */
    public static ArrayList<Integer> element (int[] array, int min, int max) {
        ArrayList<Integer> element = new ArrayList<>();
        for (int number : array) {
            if (number > min && number < max) {
                element.add(number);
            }
        }
        return element;
    }

    /* Считаем сумму элементов в выборке*/
    public static int sumElement (ArrayList<Integer> element) {
        int sum = 0;
        for (int number : element) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 17;
        int c = 18;
        int first = 0;
        int last = 320;
        int min = 5;
        int max = 45;
        int[] array = array(a, b, c, first, last);
        System.out.println("Создан массив:");
        for (int number : array) {
            System.out.print(number + ", ");
        }
        System.out.println();
        System.out.println("Корни уравнения: Х1 = " + quadratic(a, b, c)[0] + " и Х2 = " + quadratic(a, b, c)[1] );
        System.out.println("Выборка в диапазоне от " + first + " до " + last + ": "+ element(array, min, max));
        System.out.println("Количество элементов в выборке: " + element(array, min, max).size());
        System.out.println("Сумма элементов в выборке: " + sumElement(element(array, min, max)));
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd(5, 7);

        }
        System.out.println(Arrays.toString(arr));
    }
}
