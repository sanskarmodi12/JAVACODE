public class Trycatch {
    //a basic knowledge about exception and using try catch
    public static void main(String args[])
    {
        int a=500;
        int b=0;



       // WITH TRY CATCH
        try{
            int c=a/b;
            System.out.println(c);

        }
        catch(Exception e)
        {
            System.out.println("Failed to execute some part");
        }
        //JAVA PROGRAM WILL ALWAYS COME HERE WHTHER EXCEPTION OCCUR OR NOT SINCE USING TRY CATCH BLOCK

        System.out.println("End of the program");

    }

}
