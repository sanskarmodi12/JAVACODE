public class Dynamicstack {
    int top;
    int cap;
    int []arr;
    Dynamicstack()
    {
        cap=1;
        top=-1;
        arr=new int[cap];
    }
    void checkandgrow()
    {
        if(top+1==cap)
        {
            int temp []=new int[cap*2];
            for(int i=0;i<=top;i++)
            temp[i]=arr[i];
            arr=temp;
          //   count++;
            cap=cap*2;
  
        }
        
        
  
        
    }
    void push(int element)
    {
        // System.out.println("in cg");
        checkandgrow();
        top++;
        arr[top]=element;
        
        
    }
    int poped()
    {
        if(top==-1)
        {
            System.out.println("UNnderflow");
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
        Dynamicstack s1=new Dynamicstack();
        
        s1.push(1);
        //s1.poped();
        s1.push(2);
        s1.push(3);
        s1.push(4);
        
        // s1.push(1);
        System.out.println( "poped is: "+s1.poped());
        s1.push(5);
        System.out.println( "size is: "+s1.getSize());
        System.out.println( "top is: "+s1.arr[s1.top]);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        while(!s1.empty())
        {
            System.out.println( "poped is: "+s1.poped());


        }
        System.out.println( "size is: "+s1.getSize());
    }





}
