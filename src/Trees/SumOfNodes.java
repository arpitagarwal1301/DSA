package Trees;

public class SumOfNodes {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
        tree.root.rightChild.leftChild = new TreeNode(13);
        tree.root.rightChild.leftChild.leftChild = new TreeNode(13);

        SumOfNodes nodes = new SumOfNodes();
        System.out.println(nodes.sum(tree.root));

    }

    private int sum(TreeNode root){
        //root is not counted
        if(root==null){
            return 0;
        }
        //for last node sum(root.leftChild) == 0 and sum(root.rightChild)==0 so it will return root.data
        //now for 2nd last root.data + previous root.data and so on...
        return root.data + sum(root.leftChild) + sum(root.rightChild);
    }

    private int sumOfEvenNodes(TreeNode root){
        //root is not counted
        if(root==null){
            return 0;
        }

        if (root.data%2 == 0){
            return root.data + sum(root.leftChild) + sum(root.rightChild);
        }else {
            return sum(root.leftChild) + sum(root.rightChild);
        }
    }
}
