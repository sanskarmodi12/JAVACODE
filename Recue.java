public class Recue {

    int fact(int x)
    {
        if(x==0||x==1)
        return 1;
        return x*fact(x-1);
    }
    public static void main(String args[]){  
        Recue r1=new Recue();
        System.out.println(r1.fact(5));
        System.out.println(r1.fact(3));



    }
}
