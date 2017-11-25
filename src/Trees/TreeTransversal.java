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
//        nodes.inorderTransversalRec(tree.root);

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

    public void postorderTransversal(TreeNode root){
        if (root == null){
            return;
        }


        Boolean flag = false;
        Stack<TreeNode> stk = new Stack<>();
        stk.add(root);
        TreeNode topRoot = root;
        do{
            TreeNode tempNode = stk.pop();

            if (tempNode==topRoot){
                //revert flag
//                flag = true ? true:false;
                if (flag){
                    flag = false;
                }else {
                    flag = true;
                }
            }

            if (tempNode.leftChild==null && tempNode.rightChild==null){
                //revert flag is leaf
                flag = false;
            }

            //if flag true then add into stack else only pop and print
            if (flag){

                if (tempNode.rightChild!=null){
                    stk.add(tempNode.rightChild);
                }
                if (tempNode.leftChild!=null){
                    stk.add(tempNode.leftChild);
                }
                stk.add(tempNode);

            }else {

                System.out.println(tempNode.data);
                while (!stk.isEmpty() && stk.peek()!=topRoot ){
                    TreeNode node = stk.pop();
                    System.out.println(node.data);
                }

                if (!stk.isEmpty()){
                    topRoot = stk.peek();
                }
            }
        }while (topRoot!=stk.peek());
        System.out.println(stk.pop().data);

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


        Boolean flag = false;
        Stack<TreeNode> stk = new Stack<>();
        stk.add(root);
        TreeNode topRoot = root;
        while (!stk.isEmpty()){
            TreeNode tempNode = stk.pop();

            if (tempNode==topRoot){
                //revert flag
//                flag = true ? true:false;
                if (flag){
                    flag = false;
                }else {
                    flag = true;
                }
            }

            if (tempNode.leftChild==null && tempNode.rightChild==null){
                //revert flag is leaf
                flag = false;
            }

            //if flag true then add into stack else only pop and print
            if (flag){

                if (tempNode.rightChild!=null){
                    stk.add(tempNode.rightChild);
                }
                stk.add(tempNode);
                if (tempNode.leftChild!=null){
                    stk.add(tempNode.leftChild);
                }
            }else {
                System.out.println(tempNode.data);
                while (!stk.isEmpty() && stk.peek()!=topRoot){
                    TreeNode node = stk.pop();
                    System.out.println(node.data);
                }

                if (!stk.isEmpty()){
                    System.out.println(stk.pop().data);
                }

                if (!stk.isEmpty()){
                    topRoot = stk.peek();
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
