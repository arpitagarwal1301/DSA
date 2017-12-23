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
        nodes.toDoublyLinkedList(tree.root,null);

    }


    public void toDoublyLinkedList(TreeNode root,TreeNode prev){
        if (root==null){
            return ;
        }

        toDoublyLinkedList(root.leftChild,prev);
        if (prev==null){
            head = root;
        }else {
            root.leftChild = prev;
            prev.rightChild = root;
        }
        prev = root;

        toDoublyLinkedList(root.rightChild,prev);


    }
}
