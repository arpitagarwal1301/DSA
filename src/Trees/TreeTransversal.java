package Trees;

public class TreeTransversal {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
//        tree.root.rightChild.leftChild = new TreeNode(13);

        TreeTransversal nodes = new TreeTransversal();
        nodes.postorderTransversal(tree.root);

    }

    public void preorderTransversal(TreeNode root){
        if (root==null){
            return ;
        }

        System.out.println(root.data + " ");
        preorderTransversal(root.leftChild);
        preorderTransversal(root.rightChild);

    }

    public void postorderTransversal(TreeNode root){
        if (root==null){
            return ;
        }

        postorderTransversal(root.leftChild);
        postorderTransversal(root.rightChild);
        System.out.println(root.data + " ");

    }

    public void inorderTransversal(TreeNode root){
        if (root==null){
            return ;
        }

        postorderTransversal(root.leftChild);
        System.out.println(root.data + " ");
        postorderTransversal(root.rightChild);
    }
}
