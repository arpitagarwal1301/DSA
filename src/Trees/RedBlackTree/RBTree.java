package Trees.RedBlackTree;

public class RBTree {

    RBTNode root = null;
    //Driver function
    public static void main(String[] args) {
        RBTree tree = new RBTree();
        tree.root = tree.insertData(9);
        tree.root = tree.insertData(8);
        tree.root = tree.insertData(4);
        tree.root = tree.insertData(6);
        tree.root = tree.insertData(5);

    }

    /* Function to insert data */

    public RBTNode insertData(int data)

    {
        if (height(root)==0){
            root = new RBTNode(data,RBTNode.BLACK);
            return root;
        }

        root = insert(root,data);
        return root;

    }

    /**
     * Insert
     */
    public RBTNode insert(RBTNode root, int data){

        if (root==null){
            root = new RBTNode(data,RBTNode.RED);
        } else if (data<root.data){
            root.left = insert(root.left,data);

            if (root.color !=RBTNode.BLACK){

            }

        }else{
            root.right = insert(root.right,data);

            //instead of height check the colors for rb tree
            if (root.color != RBTNode.BLACK){

            }

        }

        return root;
    }


    public RBTNode rotateRight(RBTNode root){
        RBTNode newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;

        newRoot.height = height(newRoot);
        root.height = height(root);

        return newRoot;
    }

    public int height(RBTNode root){
        if (root==null){
            return 0;
        }else {
           return Math.max(height(root.left),height(root.right))+1;
        }
    }

    public RBTNode doubleRotateRight(RBTNode root){
        root.right = rotateRight(root.right);
        return rotateLeft(root);
    }

    public RBTNode rotateLeft(RBTNode root){
        RBTNode newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;

        newRoot.height = height(newRoot);
        root.height = height(root);

        return newRoot;

    }

    public RBTNode doubleRotateLeft(RBTNode root){
            root.left = rotateLeft(root.left);
            return rotateRight(root);

    }

    /**
     * Delete
     */
    public void delete(){

    }



}
