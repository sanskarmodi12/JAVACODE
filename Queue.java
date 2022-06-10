

// USING SIMPLE ARRAY STATIC
public class Queue {
    int f;
    int r;
    int size;
    int []arr;

    Queue(int size)
    {
        this.size=size;
        f=-1;
        r=-1;
        arr=new int[size];
    }

    void insert(int element)
    {
        if(r+1==size)
        {
            System.out.println("overflow");
            return ;
        }
        if(f==-1)
        {
            f=0;
        }
        r++;
        arr[r]=element;
        // r++;
        return ;

    }
    int delete()
    {
        if(empty())
        {
            System.out.println("underflow");
            return -1;
        }
        int dval=arr[f];
        f++;
        if(f>r)
        {
            f=r=-1;
        }
        return dval;
    }

    boolean empty()
    {
        if(f==-1)
        return true;
        return false;
    }

    public static void main(String args[])
    {
        Queue q1=new Queue(5);
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
       System.out.println( q1.delete());
       System.out.println( q1.delete());

        // q1.delete();
        q1.insert(5);
        System.out.println( q1.delete());
        System.out.println( q1.delete());
        System.out.println( q1.delete());
        System.out.println( q1.delete());
        q1.insert(6);
        q1.insert(7);
        // q1.delete();
        System.out.println( q1.delete());


    }
}
