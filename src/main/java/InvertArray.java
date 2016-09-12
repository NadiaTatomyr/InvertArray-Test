import java.util.Arrays;

/**
 * Created by 1 on 11.09.2016.
 */
public class InvertArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};

        Invert invert = new Invert();
        System.out.println("Initial array = " + Arrays.toString(array));
        array = invert.Invert(array);
        System.out.println("Array after inversion = " + Arrays.toString(array));

    }


}
