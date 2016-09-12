import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by 1 on 11.09.2016.
 */
public class InvertArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int tempValue;
        int arrayLength = Array.getLength(array);

        System.out.println("Initial array = " + Arrays.toString(array));

        for (int i = 0; i < arrayLength / 2; i++) {
            tempValue = array[i];
            array[i] = array[arrayLength - i - 1];
            array[arrayLength - i - 1] = tempValue;
        }

        System.out.println("Array after inversion = " + Arrays.toString(array));

    }
}
