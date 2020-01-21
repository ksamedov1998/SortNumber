import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortAndOrganize {

    private int number;
    public SortAndOrganize(int number) {
        this.number=number;
    }

    public int makeNumber(){
        int tens=getLength(number);
        int[] numberAsArray=convertToArray(tens);   //make it array to sort
//        numberAsArray=SortAlgorithms.sortArraywithBubbleSort(numberAsArray);     //sort the array
        numberAsArray=SortAlgorithms.sortArraywithSelectionSort(numberAsArray);     //sort the array
        number=convertToInt(numberAsArray);         //converts sorted array to integer
        return  number;
    }

    private int convertToInt(int[] numberAsArray) {
        StringBuilder builder= new StringBuilder();
        Arrays.stream(numberAsArray).forEach(element->builder.append(element));
         return Integer.parseInt(builder.toString());
    }



    private int[] convertToArray(int tens) {
        int[] arr= new int[tens];
        int iterator=0;
        while(number!=0){
            arr[iterator]=number%10;
            number=number/10;
            iterator++;
        }
        return arr;
    }

    private int getLength(int number) {
        return String.valueOf(number).length();
    }


}
