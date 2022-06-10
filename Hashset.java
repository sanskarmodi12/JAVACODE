 //USING SIMPLE ARRAY trying to form unordered hashet

public class Hashset {
    int size;
    int []arr;


    Hashset()
    {
        size=0;
        arr=new int[100001];

    }
    


    void add(int key)
    {
        if(arr[key]==1)
        {
            return ;
        }
        arr[key]=1;
        size++;

    }

    void remove(int key)
    {
        if(arr[key]==0)
        return ;
        arr[key]=0;
        size--;
        return ;

    }


    boolean contains(int key)
    {
        if(arr[key]==1)
        return true;
        return false;

    }

    int getSize(){
    return size;}


    public static void main(String args[])
    {
        Hashset hs=new Hashset();
        hs.add(2);
        hs.add(5);

        hs.add(7);

        hs.remove(5);

        System.out.println(hs.contains(5));
        System.out.println(hs.contains(7));

    }


    
}
