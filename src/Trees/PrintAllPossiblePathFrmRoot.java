package Trees;

import java.util.Stack;

/**
 * Use stack
 * check if already processed then remove else add
 * reaching leaf print all the elements
 */
public class PrintAllPossiblePathFrmRoot {

    TreeNode root = null;
    public static Stack<Integer> stack= new Stack();


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.leftChild.rightChild = new TreeNode(30);
        tree.root.leftChild.rightChild.rightChild = new TreeNode(2);
//        tree.root.rightChild.leftChild = new TreeNode(13);

        PrintAllPossiblePathFrmRoot nodes = new PrintAllPossiblePathFrmRoot();
        nodes.rootToLeafSum(tree.root);

    }

    /**
     * Preorder and list
     * Wrong as it will create problem will removing
     * @param root
     */
//    public void rootToLeafSum(TreeNode root){
//        if (root==null){
//            return;
//        }
//
//        list.add(root.data);
//
//        if (root.leftChild==null && root.rightChild==null){
//
//            for (Integer n : list){
//                System.out.print(n+" ");
//            }
//            System.out.println();
//            list.remove(list.size()-1);
//        }
//
//        rootToLeafSum(root.leftChild);
//        rootToLeafSum(root.rightChild);
////       sum = root.data+rootToLeafSum(root.leftChild) + rootToLeafSum(root.rightChild);
////       return sum;
//
//    }

    /**
     * Preorder and list
     * @param root
     */
    public void rootToLeafSum(TreeNode root){
        if (root==null){
            return;
        }
        stack.add(root.data);
        rootToLeafSum(root.leftChild);

        if (root.leftChild==null && root.rightChild==null){
            //print all the elements

            for (int i=0;i<stack.size();i++){
                System.out.print(stack.elementAt(i)+" ");;
            }
            System.out.println();

        }

        rootToLeafSum(root.rightChild);
        stack.pop();
//       sum = root.data+rootToLeafSum(root.leftChild) + rootToLeafSum(root.rightChild);
//       return sum;

    }
}
