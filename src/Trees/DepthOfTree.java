package Trees;

public class DepthOfTree {
    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
        tree.root.rightChild.leftChild = new TreeNode(13);
//        tree.root.rightChild.leftChild.leftChild = new TreeNode(13);

        DepthOfTree nodes = new DepthOfTree();
        System.out.println(nodes.treeDepth(tree.root));
        System.out.println(nodes.treeHeight(tree.root));

    }

    /**
     * height = depth +1
     * depth == no of edges
     * @param root
     * @return
     */
    private int treeDepth(TreeNode root){
        //root is not counted
        if(root==null){
            return -1;
        }
        //whichever side is returning greter value
        if (treeDepth(root.rightChild) > treeDepth(root.leftChild)){
            return treeDepth(root.rightChild)+1;
        }else {
            return treeDepth(root.leftChild)+1;
        }
    }

    private int treeHeight(TreeNode root){
        //root is not counted
        if(root==null){
            return 0;
        }
        //whichever side is returning greter value
        if (treeHeight(root.rightChild) > treeHeight(root.leftChild)){
            return treeHeight(root.rightChild)+1;
        }else {
            return treeHeight(root.leftChild)+1;
        }
    }

}
