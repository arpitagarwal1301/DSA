package Trees;

public class RootToLeafPathSum {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
        tree.root.rightChild.leftChild = new TreeNode(13);

        RootToLeafPathSum nodes = new RootToLeafPathSum();
        System.out.println(nodes.rootToLeafSum(tree.root));

    }

    public int rootToLeafSum(TreeNode root){
        int sum = 0;
       if (root==null){
            sum =0;
       }
       sum = root.data+rootToLeafSum(root.leftChild) + rootToLeafSum(root.rightChild);
       return sum;
    }
}
