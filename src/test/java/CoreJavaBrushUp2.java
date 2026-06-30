import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};

        //check if this array has multiple of 2

        for (int i=0; i<arr.length; i++)
        {
            if(arr[i] % 2==0)
            {
                System.out.println(arr[i]);
                break; //if we wish to skip the rest of the loop steps if the condition was met in this attempt
            }
            else{
                System.out.println(arr[i] +" is not multiple of 2");
            }
        }
        //create object of the class - object.method
        ArrayList<String> a = new ArrayList<String>();
        a.add("Sandeep");
        a.add("Singh");
        a.add("Carmaa");
        System.out.println(a.get(2));

        for(int i=0; i<a.size();i++)
        {
            System.out.println(a.get(i));
        }

        System.out.println("*************");

        for( String val:a)
        {
            System.out.println(val);
        }

        //Check if a certain item is present in the ArrayList
        System.out.println(a.contains("Sandeep"));

        //Convert array to arraylist
        String[] name = {"Sandeep", "Singh", "Carmaa"};
        List<String> nameArrayList = Arrays.asList(name);
        nameArrayList.contains("Singh");
    }
}
