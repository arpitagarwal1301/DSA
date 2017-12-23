package Trees.AVLTree;

public class AVLTreeNodeDeletion {

    AVLTreeNode root = null;
    //Driver function
    public static void main(String[] args) {
        AVLTreeNodeDeletion tree = new AVLTreeNodeDeletion();
        tree.root = tree.insertData(9);
//        tree.root = tree.insertData(8);
//        tree.root = tree.insertData(4);
//        tree.root = tree.insertData(6);
//        tree.root = tree.insertData(5);
//        tree.root = tree.insertData(7);


        tree.root = tree.deleteNode(tree.root,9);
//        tree.root = tree.deleteNode(tree.root,5);

    }

    /* Function to insert data */

    public AVLTreeNode insertData(int data)

    {

        root = insert(root,data);
        return root;

    }

    /**
     * Insert
     */
    public AVLTreeNode insert(AVLTreeNode root,int data){
        if (root==null){
            root = new AVLTreeNode(data);
        } else if (data<root.data){
            root.left = insert(root.left,data);

            if (height(root.left)-height(root.right)==2){
                if (data < root.left.data){
                   root = rotateRight(root);
                }else {
                    root = doubleRotateLeft(root);
                }
            }
        }else{
            root.right = insert(root.right,data);

            if (height(root.right)-height(root.left)==2){
                if (data>root.right.data){
                    root = rotateLeft(root);
                }else {
                    root = doubleRotateRight(root);
                }
            }

        }

        root.height = height(root);

        return root;
    }


    public AVLTreeNode rotateRight(AVLTreeNode root){
        AVLTreeNode newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;

        newRoot.height = height(newRoot);
        root.height = height(root);

        return newRoot;
    }

    public int height(AVLTreeNode root){
        if (root==null){
            return 0;
        }else {
           return Math.max(height(root.left),height(root.right))+1;
        }
    }

    public AVLTreeNode doubleRotateRight(AVLTreeNode root){
        root.right = rotateRight(root.right);
        return rotateLeft(root);
    }

    public AVLTreeNode rotateLeft(AVLTreeNode root){
        AVLTreeNode newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;

        newRoot.height = height(newRoot);
        root.height = height(root);

        return newRoot;

    }

    public AVLTreeNode doubleRotateLeft(AVLTreeNode root){
            root.left = rotateLeft(root.left);
            return rotateRight(root);

    }

    public AVLTreeNode deleteNode(AVLTreeNode root, int data){
        if (root==null){
            return null;
        }else if (data > root.data){
            root.right = deleteNode(root.right,data);
            if (height(root.right)-height(root.left)==2){
                if (data>root.right.data){
                    root = rotateLeft(root);
                }else {
                    root = doubleRotateRight(root);
                }
            }
        }else if (data<root.data){
            root.left = deleteNode(root.left,data);
            if (height(root.left)-height(root.right)==2){
                if (data < root.left.data){
                    root = rotateRight(root);
                }else {
                    root = doubleRotateLeft(root);
                }
            }

        }else {


            if (root.left==null && root.right == null){
                //case 1 : leaf
                return null;
            }else if (root.left==null || root.right==null){
                //case 2 : 1 child

                return root.left!=null ? root.left : root.right;

            }else {
                //case 3 : 2 child
                //find the inorder of right subtree and return it and delete the inorder node
                root.data = minValue(root.right);

                root.right = deleteNode(root.right,root.data);
            }
        }
        root.height = height(root);
        return root;

    }

    private int minValue(AVLTreeNode root) {
        while (root.left!=null){
            root = root.left;
        }
        return root.data;
    }



}
