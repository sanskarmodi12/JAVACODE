import java.util.Scanner;

public class HandleExceptions {
    // user take a number at particular index and divide that number by some other no.
    
    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,3};
        // arr[]={1,2,3,4,5};
        Scanner sc =new Scanner(System.in);


        System.out.println("Enter a index:");

        int in=sc.nextInt();

        System.out.println("Enter the number yoy want to divide with this:");
        int num=sc.nextInt();
        try{
            // System.out.println(arr[num]);
            System.out.println("Value at this index:"+arr[in]);
            System.out.println("final number after div by num"+ arr[in]/num);
        }
        catch(ArithmeticException e)
        {
            
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("some other exception");
        }



    }
}
