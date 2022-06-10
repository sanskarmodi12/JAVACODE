import java.util.ArrayList;
import java.util.LinkedList;

public class Hmap {
    public static class HashMap<K,V>{
        private class HMNode{
            K key;
            V value;

            HMNode(K key,V value)
            {
                this.key=key;
                this.value=value;
            }
        }
        private int size;
        private LinkedList<HMNode> [] buckets; //creating an array of LL

        HashMap()
        {
            initbuckets(4);
            size=0;

        }

        public void initbuckets(int N )
        {
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++)
            {
                buckets[i]=new LinkedList<>();

            }

        }

        public void put(K key,V value)
        {
            int bi=hashfun(key); //finding bucket no.
            int di=getIndexwithinbucket(key,bi); //finding index within which  a particular key is prexsnt
            if(di!=-1)
            {
                //changing the value at exixisting
                HMNode node =buckets[bi].get(di);
                node.value=value;

            }
            else
            {
                //add new node in LL
               HMNode node=new HMNode(key,value );
               buckets[bi].add(node);
               size++;

               double lambda=size*1.0/buckets.length;
               if(lambda>2.0)
               rehash();

            }
        }

        private int hashfun(K key)
        {
            int hc=key.hashCode();
            hc=Math.abs(hc)%buckets.length;
            return hc;
        }
        private int getIndexwithinbucket(K key,int bi)
        {
           int di=0;
            for(HMNode node: buckets[bi])
            {
                if(node.key.equals(key))
                return di;
            }
            return -1;
        }

        public boolean contains(K key,V value)
        {
            int bi=hashfun(key); //finding bucket no.
            int di=getIndexwithinbucket(key,bi);
            if(di==-1)
            return false;
            return true;

        }
        public V get(K key)
        {
            int bi=hashfun(key); //finding bucket no.
            int di=getIndexwithinbucket(key,bi);
            if(di!=-1)
            {
                HMNode node=  buckets[bi].get(di);
                return node .value;
            }
            return null;
        }
        public V remove(K key)
        {
            int bi=hashfun(key); //finding bucket no.
            int di=getIndexwithinbucket(key,bi);
            if(di!=-1)
            {
                HMNode node=  buckets[bi].remove(di);
                return node .value;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys=new ArrayList<>();

            for(int i=0;i<buckets.length;i++)
            {
                for(HMNode node : buckets[i])
                {
                    keys.add(node.key);
                }
            }
            return keys;

        }

        public void rehash()
        {

            LinkedList<HMNode> temp[]=buckets;
            initbuckets(2*temp.length);
            size=0;
            for(int i=0;i<temp.length;i++)
            {
                for( HMNode node :temp[i])
                {
                    put(node.key,node.value);
                }
            }



        }
        public int size()
        {
            return size;
        }

        








    }

    public static void main(String args[]) 
    {
        HashMap h1=new HashMap<>();
        h1.put(1,2);
        h1.put(2,5);
        h1.put(3,7);
        h1.put(1,7);
       ArrayList<K> l1=h1.keySet();
       for(int i=0;i<l1.size();i++)
       {
           System.out.println(l1.get(i));

       }
       System.out.println(h1.get(1));
       System.out.println(h1.size());
    }
    


}
