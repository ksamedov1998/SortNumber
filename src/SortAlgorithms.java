import java.lang.reflect.Array;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;

public class SortAlgorithms {
    public static int[] sortArraywithBubbleSort(int[] array) {
        /*
         *       5 1 3 7 10 ->
         *       max= 5;
         *       checks greaters if not return same and next index if finds save index and swap the elements
         *       BUBBLE SORT
         * */
        int index = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = array[i];
            index = i;
            for (int j = i; j < array.length; j++) {
                if (max < array[j]) {
                    max = array[j];
                    index = j;
                }
            }
            if (max != array[i]) {
                array[index] = array[i];
                array[i] = max;
            }
        }
        return array;
    }

    public static int[] sortArraywithSelectionSort(int[] array) {
        /*
         *       5 1 3 7 10 ->
         *       5 1 3 7 10
         *       5 3 1 7 10
         *       5 3 7 1 10
         *       5 3 7 10 1
         *       Selection Sort
         * */
        boolean swapHappened = true;
        while (swapHappened) {
            boolean internSwapHappened = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    System.out.println(array[i] + "<" + array[i + 1] + " , swap it ");
                    int opt = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = opt;
                    internSwapHappened = true;
                } else {
                    System.out.println(array[i] + ">" + array[i + 1]);
                }
            }
            if (!internSwapHappened) {
                swapHappened = false;
            }
        }
        return array;
    }

    public static int[] sortArraywithInsertionSort(int[] array) {
        /*
         *       5 1 3 7 10 ->
         *       5 3 1 7 10
         *       7 5 3 1 10
         *       10 7 5 3 1
         *       Insertion Sort
         * */
        for (int i = 1; i < array.length; i++) {
            int holder = array[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (holder > array[j]) {
                    System.out.println(array[i] + ">" + array[j] + ", swap it");
                    int opt = array[index];
                    array[index] = array[j];
                    array[j] = opt;
                    index--;
                } else {
                    break;
                }
                System.out.println(array[i] + "<" + array[j]);
            }
        }
        return array;
    }

    public static int[] sortArraywithQuickSort(int[] array) {

        /*
         *       5 1 3 7 10 ->
         *       5 3 1 7 10
         *       7 5 3 1 10
         *       10 7 5 3 1
         *      Quick Sort
         * */
        array=sort(array,0,array.length);
        return array;
    }


    public static int[] sort(int[] array,int beginIndex,int lastIndex){
        if (beginIndex!=lastIndex) {
            int low = beginIndex+1;
            int high = lastIndex - 1;
            int temp;
            int pivotIndex = beginIndex;
            for (int i = beginIndex; i <lastIndex - 1; ) {
                if (low < high) {
                    if (array[low] < array[high]) {
                        temp = array[low];
                        array[low] = array[high];
                        array[high] = temp;
                        high--;
                    } else if (array[low] > array[i]) {
                        temp = array[low];
                        array[low] = array[i];
                        array[i] = temp;
                        i++;
                        low++;
                        pivotIndex = i;
                    } else {
                        low++;
                    }
                } else {
                    break;
                }
            }
            sort(array, beginIndex, pivotIndex);
            sort(array, pivotIndex+1, array.length);
        }
        return  array;
    }
}
