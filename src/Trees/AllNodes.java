package Trees;

public class AllNodes {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
//        tree.root.rightChild.leftChild = new TreeNode(13);

        AllNodes nodes = new AllNodes();
        System.out.println(nodes.countNodes(tree.root));

    }

    public int countNodes(TreeNode node){
        //0 if root is zero
        if (node==null){
            return  0;
        }

        //Left subtree count + right subtree count + node itself
        return countNodes(node.leftChild)+countNodes(node.rightChild)+1;

    }

//    public int countNodes(TreeNode node){
//        int count = 0;
//        if (node==null){
//            return  1;
//        }
//
//        count = count+ countNodes(node.leftChild)+countNodes(node.rightChild);
////        count = count+ countNodes(node.rightChild);
//
//        return count-2+1;
//    }
}
