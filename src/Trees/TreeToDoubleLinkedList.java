package Trees;

/**
 * head ,prev root
 * inorder
 * can't we just simply store inorder recursion values and then connect then...it is giving correct
 * solution
 */
public class TreeToDoubleLinkedList {


    TreeNode root = null;
    public static boolean flat = false;
    TreeNode head = null;
    TreeNode tail = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.leftChild.rightChild = new TreeNode(30);
//        tree.root.rightChild.leftChild = new TreeNode(13);

        TreeToDoubleLinkedList nodes = new TreeToDoubleLinkedList();
        nodes.getTheNode(tree.root);

    }

    /**
     * Preorder and list
     * @param root
     */
    public TreeNode getTheNode(TreeNode root){
        if (root==null){
            return null;
        }



        return root;
    }

    public TreeNode toDoublyLinkedList(TreeNode root){
        if (root==null){
            return null;
        }


        TreeNode left = toDoublyLinkedList(root.leftChild);
        if ( !flat && left == null){
           flat = true;
           head = root;
       }
//       if ()
//       tail = right;

       root.rightChild = tail;
       root.leftChild = left;

       TreeNode right = toDoublyLinkedList(root.rightChild);

       return head;

    }
}
