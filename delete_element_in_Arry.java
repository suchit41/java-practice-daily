import java.util.Arrays;

/**
 * delete_element_in_Arry
 */
public class delete_element_in_Arry {

    public static void main(String[] args) {
        int [] originalArray = {1,2,3,4,5};
        int elementToremove = 3;
        int[] answerArray = removeElement(originalArray, elementToremove);
        System.out.println(Arrays.toString(answerArray));

    }

    public static int[] removeElement(int[] array,int element)
    {
        int[] newArray = new int[array.length-1];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != element){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;

    }
}