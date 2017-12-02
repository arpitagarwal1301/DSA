package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class FindMax {


    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(14);
        tree.root.rightChild = new TreeNode(5);
        tree.root.leftChild.leftChild = new TreeNode(3);
        tree.root.rightChild.rightChild = new TreeNode(30);
        tree.root.rightChild.leftChild = new TreeNode(6);

        FindMax nodes = new FindMax();
//        nodes.findMaxIterative(tree.root);;
        System.out.println(nodes.findMin(tree.root));;
//        System.out.println(nodes.findMax(tree.root));;
//        nodes.inorderTransversalRec(tree.root);

    }

    public int findMax(TreeNode root){
        int max = 0;
        if (root==null){
            return max;
        }

        if (root!=null){

            int lmax = findMax(root.leftChild);
            int rmax = findMax(root.rightChild);

            max =  Math.max(lmax,rmax);

            if (root.data>max){
                max = root.data;
            }
        }

        return max;
    }

    public int findMin(TreeNode root){
        int min = Integer.MAX_VALUE;
        if (root==null){
            return min;
        }

        min = findMin(root.leftChild);
        min = findMin(root.rightChild);

        if (root.data<min){
            min = root.data;
        }

        return min;

    }


    public void findMaxIterative(TreeNode root){
        int max = Integer.MIN_VALUE;
        if (root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.data>max){
                max = node.data;
            }
            if (node.leftChild!=null){
                queue.add(node.leftChild);
            }
            if (node.rightChild!=null){
                queue.add(node.rightChild);
            }
        }

        System.out.println(max);
    }
}
