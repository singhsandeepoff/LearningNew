public class CoreJavaBrushUp3 {
    public static void main(String[] args)
    {
        //string is an object

        String s1 = "Sandeep Singh";

        String s2 = new String("Sandeep");

        String s = "Sandeep Kumar Singh";
        String[] splittedString = s.split("Kumar");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());
      //  System.out.println(splittedString[2]);

        for(int i=0; i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }

        //Reverse the string
        for(int i=s.length()-1; i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }

    }
}
