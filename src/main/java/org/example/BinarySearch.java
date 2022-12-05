package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList( List.of(2, 3, 4, 14, 2, 80, 21, 3, 56, 79));// List.of нужно обернуть в new ArrayList для того чтобы можно было изменять массив, иначе List.of не изменяемый массив
        Collections.sort(numbers);
        //sort(numbers); //сортировка разработанным методом
        System.out.println("numbers.toString() = " + numbers.toString());

    }

    private static void sort(List<Integer> numbers) {
        for (int idxCurr = numbers.size() - 1; idxCurr >= 0; idxCurr--) {
          int max=Integer.MIN_VALUE;// самое маленькое число
            int idxMax=0;
        for (int i = 0; i <= idxCurr; i++) {
            final Integer element = numbers.get(i);
            if (max < element) {
                max= element;
                idxMax=i;
            }
        }
//        var idxCurr = numbers.size() - 1;
        int tmp = numbers.get(idxCurr);
        numbers.set(idxCurr, max);
        numbers.set(idxMax, tmp);

    }
    }
}
