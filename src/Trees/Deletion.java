package Trees;

/**
 * Pre-requisite - should be a BST and no duplicates
 */
public class Deletion {

    TreeNode root = null;


    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
        tree.root.rightChild.leftChild = new TreeNode(13);
//      tree.root.rightChild.leftChild.leftChild = new TreeNode(13);

        Deletion deletion = new Deletion();
        deletion.findDeleteNode(tree.root,5);

    }

    public TreeNode findDeleteNode(TreeNode root,int data){
        if (root==null){
            return null;
        }else if (data > root.data){
          root.rightChild = findDeleteNode(root.rightChild,data);
        }else if (data<root.data){
           root.leftChild = findDeleteNode(root.leftChild,data);
        }else {


            if (root.leftChild==null && root.rightChild == null){
                //case 1 : leaf
                return null;



            }else if (root.leftChild==null || root.rightChild==null){
                //case 2 : 1 child

                return root.leftChild!=null ? root.leftChild : root.rightChild;

            }else {
                //case 3 : 2 child
                //find the inorder of right subtree and return it and delete the inorder node
                root.data = minValue(root.rightChild);

                root.rightChild = findDeleteNode(root.rightChild,root.data);
            }
        }
        return root;

    }

    private int minValue(TreeNode root) {
        while (root.leftChild!=null){
            root = root.leftChild;
        }
        return root.data;
    }
}
