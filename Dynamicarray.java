public class Dynamicarray {
  public int arr [];
  int size;
  int count;
  public Dynamicarray ()
  {
      size=1;
      arr=new int[size];
      count=0;
  }
  void checkandgrow()
  {
      if(count==size)
      {
          int temp []=new int[size*2];
          for(int i=0;i<count;i++)
          temp[i]=arr[i];
          arr=temp;
        //   count++;
        size=size*2;

      }
      
      

      
  }


  private void insert(int x)
  {
      checkandgrow();
      arr[count]=x;
      count++;

  }
  public int size(){
  return count;}

  public void delete()
  {
      if(count>0)
      {
          arr[count-1]=0;
          count--;

      }
  }
  
  
    public static void main(String args[])
    {
        Dynamicarray d1=new Dynamicarray();
        d1.insert(2);
        d1.insert(3);
        d1.insert(4);
        d1.insert(5);
        d1.insert(6);
        for(int i=0;i<d1.size();i++)
        {
            System.out.println(d1.arr[i]);


        }

    }
}
