package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //        Сортировка выбором :: Selection sort

        int array[] = {53, 6, 1, 1, 53, 42, 7, 9, 0, 8, 12, 43, 12, 33, 51, 56, 551, 42, 10002, 100, 5, 1, 3, 42};

        int curbest = 0; //current best - текущее максимальное (к примеру 0)
        int lapl = array.length - 1; // last place - последнее место (- 1)
        int left = 0; // левый элемент
        int right = 1; // правый элемент

        while (lapl != 0){
            //алгоритм нахождения максимума в массиве
            //right - позиция последнего элемента, начиная с 1-цы

            while (right < (lapl + 1)){
                if (array[left] > array[right]){
                    curbest = array[left];
                    right++;
                } else { // array[left] < array[right]
                    curbest = array[right];
                    left = right;
                    right++;
                }
            }

            //алгоритм подставновки максимума в конец неотсортированного массива
            array[left] = array[lapl]; //значение максимального и последнего значения меняются местами
            array[lapl] = curbest;
            lapl--;
            left = 0; // обнуляем левый элемент
            right = 1; // обнуляем правый элемент
        }
        System.out.println(Arrays.toString(array)); //выводим отсортированный массив в консоль
    }
}
