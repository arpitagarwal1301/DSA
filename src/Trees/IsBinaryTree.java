package Trees;

public class IsBinaryTree {

    TreeNode root = null;


    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root= new TreeNode(18);
        tree.root.leftChild = new TreeNode(8);
        tree.root.rightChild = new TreeNode(20);
        tree.root.rightChild.rightChild = new TreeNode(10);
        tree.root.rightChild.leftChild = new TreeNode(30);

        IsBinaryTree nodes = new IsBinaryTree();
//        System.out.println();
        try{
            nodes.isBinaryTree(tree.root,-1);
            System.out.println("True");
        }catch (Exception e){
            System.out.println("False");
        }

    }

//    public int isBinaryTree(TreeNode root) throws Exception {
//
//        int min = Integer.MIN_VALUE;
//        if (root==null){
//            return min;
//        }
//
//        min = isBinaryTree(root.leftChild);
//        if (root.data > min ){
//            min = root.data;
//            if (root.rightChild != null){
//                min = isBinaryTree(root.rightChild);
//            }
//        }else {
//            throw new Exception("False");
//        }
//        return min;
//
//
//    }

    public void isBinaryTree(TreeNode root,int prev) throws Exception {

        if (root==null){
            return ;
        }

        //SIMPLE INORDER RECUSTION
        isBinaryTree(root.leftChild,prev);
        //CHECKING THE CURRENT RETURNED VALUE WITH THE PREV VALUE
         if (root.data < prev){
             //we will catch the exception in out driver method and print false
             throw new Exception("false");
         }else {
             prev = root.data;
         }
        isBinaryTree(root.rightChild,prev);
    }

}
