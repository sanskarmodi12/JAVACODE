public class Arraylist {
    Object arr[];
    int count;
    int cap;
    Arraylist ()
    {
        cap=1;
        count=0;
        arr=new Object[cap];
    }

    void checkandgrow()
  {
      if(count==cap)
      {
          Object temp []=new Object[cap*2];
          for(int i=0;i<count;i++)
          temp[i]=arr[i];
          arr=temp;
        //   count++;
        cap=cap*2;

      }
      
      

      
  }
    void add(Object item)
    {
        checkandgrow();
        arr[count]=item;
        count++;

    }

   public int getSize()
    {
        return count;

    }
    //remove at index i

    void remove(int i)
    {
        if(i>=count||i<0)
        return ;
        for(int in=i;in<count-1;in++)
        {
            arr[in]=arr[in+1];

        }
        count--;

    }

    private void display()
    {
        for(int i=0;i<count;i++)
        System.out.println(arr[i]);
    }
    public static void main(String args[])
    {
        Arraylist l1=new Arraylist();
        l1.add(1);
        l1.add(2);
        l1.add("san");
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.display();
        l1.remove(2);
        l1.display();
        System.out.println(l1.getSize());  


    }




}
