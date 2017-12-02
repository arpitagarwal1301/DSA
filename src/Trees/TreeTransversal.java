package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class TreeTransversal {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.leftChild.leftChild = new TreeNode(3);
        tree.root.rightChild.rightChild = new TreeNode(30);
//        tree.root.rightChild.leftChild = new TreeNode(13);

        TreeTransversal nodes = new TreeTransversal();
        nodes.inorderTransversal(tree.root);

    }

    public void preorderTransversal(TreeNode root){


        if(null == root){
            return;
        }

        Stack<TreeNode> stk = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        stk.add(root);

        while (!stk.isEmpty()){

                    root = stk.pop();
                    System.out.println(root.data);

                    if (root.rightChild!=null){
                        stk.add(root.rightChild);
                    }

                    if (root.leftChild != null){
                        stk.add(root.leftChild);
                    }


                }
    }

    public void preorderTransversalRec(TreeNode root){

                if (root==null){
            return ;
        }
        System.out.println(root.data + " ");
        preorderTransversalRec(root.leftChild);
        preorderTransversalRec(root.rightChild);

    }

    //TODO compelete this
    public void postorderTransversal(TreeNode root){
        if (root == null){
            return;
        }


        Stack<TreeNode> stk = new Stack<>();
        boolean complete = false;
        TreeNode currentNode = root;
        stk.push(currentNode);

        while (!complete){
            TreeNode node = stk.peek();

        }

    }

    public void postorderTransversalRec(TreeNode root){

        if (root==null){
            return ;
        }
        postorderTransversalRec(root.leftChild);
        postorderTransversalRec(root.rightChild);
        System.out.println(root.data + " ");


    }


    public void inorderTransversal(TreeNode root){
        if (root == null){
            return;
        }

        Stack<TreeNode> stk = new Stack<>();
        boolean complete = false;
        TreeNode currentNode = root;

        while (!complete){

            if (currentNode!=null){
                stk.push(currentNode);
                currentNode = currentNode.leftChild;
            }else {
                if (stk.isEmpty()){
                    complete = true;
                }else {
                    TreeNode tempNode = stk.pop();
                    System.out.println(tempNode.data);
                    if (tempNode.rightChild!=null){
                        currentNode = tempNode.rightChild;
                    }
                }
            }
        }
    }

    public void inorderTransversalRec(TreeNode root){
        if (root==null){
            return ;
        }

        inorderTransversalRec(root.leftChild);
        System.out.println(root.data + " ");
        inorderTransversalRec(root.rightChild);
    }


    /**
     * Important
     * @param root
     */
    public void levelOrderTransversal(TreeNode root){

        if (root==null){
            return;
        }
        System.out.println(root.data);
       levelOrderTransversal(root.leftChild);

    }
}
