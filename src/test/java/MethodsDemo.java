public class MethodsDemo
{
    public static void main(String[] args)
    {
        MethodsDemo m = new MethodsDemo();
        String name = m.getData();
        System.out.println(name);
        MethodsDemo2 m2 = new MethodsDemo2();
        m2.getUserData();
        getData2();
     //   String name2 = m2.getUserData();
     //   System.out.println(name2);

    }

    public String getData()
    {
        System.out.println("hello world");
        return "Sandeep";
    }

    public static String getData2()
    {
        System.out.println("hello world");
        return "Sandeep";
    }
}
