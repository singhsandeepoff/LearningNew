import java.util.Arrays;

public class CoreJavaBrushUp1 {

    public static void main (String[] args){
        int myNum = 5;
        String website = "Carmaa Car Care";
        char letter = 'C';
        double dec = 4.55;
        boolean result = true;

        System.out.println(myNum +"stored in the memory");

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr2 = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr2));

        //for

        for(int i=0; i<arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }

        String[] name = {"Sandeep", "Singh", "Carmaa"};

        for(int i=0; i<name.length; i++)
        {
            System.out.println(name[i]);
        }

        //enhances for loop

        for (String s:name)
        {
            System.out.println(s);
        }


    }
}
