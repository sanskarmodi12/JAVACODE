import java.util.Scanner;

public class Nestedtrycatch {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        

        Scanner sc=new Scanner(System.in);
        
        try{

            System.out.println("IN FIRST try");
            System.out.println("Enter index");
            int in=sc.nextInt();
            try{
            System.out.println("value at index:" +arr[in]);
        
               }
               catch(ArrayIndexOutOfBoundsException e)
               {
                   System.out.println("index doesnt exists");
                   System.out.println("Exception in second try");
               }

               System.out.println("End of first try");



        }

        catch(Exception e)
        {
            System.out.println("Exception in first try");
        }
    }
}
