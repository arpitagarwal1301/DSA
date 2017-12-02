package Trees;

public class MirrorTree {


    TreeNode root = null;


    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);
        root1.leftChild = new TreeNode(2);
        root1.rightChild = new TreeNode(3);
        root1.leftChild.leftChild = new TreeNode(4);
        root1.leftChild.rightChild = new TreeNode(5);

        root2.leftChild = new TreeNode(3);
        root2.rightChild = new TreeNode(2);
        root2.rightChild.leftChild = new TreeNode(5);
        root2.rightChild.rightChild = new TreeNode(4);

        MirrorTree nodes = new MirrorTree();
        System.out.println(nodes.mirror(root1,root2));;

    }

    private boolean mirror(TreeNode root1, TreeNode root2){
        if (root1==null && root2==null){
            return true;
        }
        if (root1==null || root2==null){
            return false;
        }

        return root1.data==root2.data && mirror(root1.leftChild,root2.rightChild) && mirror(root1.rightChild,root2.leftChild);


    }

}