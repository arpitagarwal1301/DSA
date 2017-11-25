package Trees;

public class HalfNodes {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
        tree.root.rightChild.leftChild = new TreeNode(13);

        HalfNodes nodes = new HalfNodes();
        System.out.println(nodes.countHalfLeafNode(tree.root));

    }

    public int countHalfLeafNode(TreeNode root){

        if (root==null){
            return 0;
        }else if ( root.rightChild==null && root.leftChild!=null){
            return 1;
        }else if (root.rightChild!=null && root.leftChild==null){
            return 1;
        }

        return countHalfLeafNode(root.leftChild)+countHalfLeafNode(root.rightChild);
    }
}
