// import com.apple.eawt.event.RotationListener;

public class BST {
    TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data)
        {
            this.data=data;
        }
    }

    public void insert(int key)
    {
        root=insert(root,key);
    }

    public TreeNode insert(TreeNode root,int key)
    {
        if(root==null)
        {
            TreeNode n1=new TreeNode(key);
            return n1;

        }

        if(root.data<key)
        root.right=insert(root.right,key);
        else
        root.left=insert(root.left,key);

        return root;

    }
    void inOrder()
    {
        inOrder(root);
    }

    void inOrder(TreeNode root)
    {
        if(root==null)
        return ;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);


    }

    int inorderSuc(TreeNode  node)
    {
        // int ans=node.data;
        while(node.left!=null)
        {

            node=node.left;
        }
        int ans=node.data;
        // return node.data;

      root=  searchAndDel(root, ans);
        return ans;

    }
    void delete(int key)
    {
        root=searchAndDel( root,key);
        return ;
    }

    TreeNode searchAndDel(TreeNode root,int key)
    {
        if(root==null)
        return root;
        if(root.data==key)
        {
            //both childs not presnt
            if(root.left==root.right&& root.left==null)
            return null;
            //one child present
            if(!(root.left!=null&&root.right!=null))
            {
                if(root.left!=null)
                return root.left;
                return root.right;

            }
            //both roots are not presnt
            //findinordersuc
            // int isc=inorderSuc(root.right);
            int isc=inorderSuc(root.right);

            // searchAndDel(root,isc);
            
            root.data=isc;
            // return  root;




            return root;
    }
        if(root.data<key)
        root.right= searchAndDel(root.right,key);
        root.left= searchAndDel(root.left, key);
        return root;

    }

   
    public static void main(String args[])
    {
        BST b1=new BST();
    //    TreeNode root;
       b1.insert(3);
       b1.insert(6);
      b1.insert(9);
       b1.insert(4);
      
      b1.insert(10);
      b1.insert(11);
      b1.insert(18);
    //   b1.insert(11);
    //   b1.inOrder();
      b1.delete(6);
    //   b1.inOrder();
      b1.delete(11);
      b1.delete(18);
      b1.inOrder();


       
    }

    


}
