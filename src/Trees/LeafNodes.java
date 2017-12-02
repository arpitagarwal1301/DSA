package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LeafNodes {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
        tree.root.rightChild.leftChild = new TreeNode(13);

        LeafNodes nodes = new LeafNodes();
        System.out.println(nodes.countLeafWithoutRec(tree.root));

    }

    public int countLeafNode(TreeNode root){

        if (root==null){
            return 0;
        }else if (root.rightChild==null && root.leftChild==null){
            return 1;
        }
        //left subtree , right subtree
        return countLeafNode(root.leftChild)+countLeafNode(root.rightChild);

    }

    public int countLeafWithoutRec(TreeNode root){

        if (root==null){
            return 0;
        }

        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            TreeNode node = q.poll();

            //for full nodes != instead of ==
            if (node.rightChild==null && node.leftChild==null){
                count++;
            }


                if (node.leftChild!=null){
                    q.add(node.leftChild);
                }

                if (node.rightChild!=null){
                    q.add(node.rightChild);
                }

        }
        return count;
    }
}
