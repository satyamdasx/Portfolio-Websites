class Hello
{
    public static void main (String[]args)
    {
        int a=5,b=0,c;
        try
        {
            c=a/b;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println("Can't Divide by zero");
        }
    }
}