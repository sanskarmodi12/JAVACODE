public class Stack {

    int top;
    int []arr;
    int size;
    Stack(int size)
    {
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    Stack()
    {
        this.size=0;
        arr=new int[size];
        top=-1; 
    }


    void push(int element)
    {
        if(top+1==size)
        {
            System.out.println("overflow");
            return ;
        }
        top++;
        arr[top]=element;
        
    }
    
    int poped()
    {
        if(top==-1)
        {
            System.out.println("underflow");
            return -1;
        }
        int popedval=arr[top];
        top--;
        return popedval;


    }

    int getSize()
    {
        return (top+1);
    }

    boolean empty()
    {
        if(top==-1)
        return true;
        return false;
    }


    public static void main(String args[])
    {
        Stack s1=new Stack(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        // s1.push(1);
        System.out.println( "poped is: "+s1.poped());
        s1.push(5);
        System.out.println( "size is: "+s1.getSize());
        System.out.println( "top is: "+s1.arr[s1.top]);
        while(!s1.empty())
        {
            System.out.println( "poped is: "+s1.poped());


        }
        System.out.println( "size is: "+s1.getSize());
    }
}
