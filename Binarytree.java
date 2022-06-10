public class Binarytree {
    // private int data;÷
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data)
        {
            this.data=data;
        }
    }
    public  void createBinaryTree(){
    
        //Binarytree t1=new Binarytree();
        TreeNode first=new TreeNode(1);
        TreeNode sec=new TreeNode(2);
        TreeNode thi=new TreeNode(3);
        TreeNode four=new TreeNode(4);
        TreeNode fivth=new TreeNode(5);

       // TreeNode root;
        root=first;
        first.left=sec;
        first.right=thi;
        sec.left=four;
        sec.right=fivth;
        



    }


    void inOrder(TreeNode root)
    {
        if(root==null)
        return ;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);


    }

    public static void main(String args[])
    {
        Binarytree b1= new Binarytree();
        b1.createBinaryTree();
        b1.inOrder(b1.root);


    }





    
}
