package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LvlOrderSum {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.leftChild.leftChild = new TreeNode(3);
        tree.root.rightChild.rightChild = new TreeNode(30);
//        tree.root.rightChild.leftChild = new TreeNode(13);

        LvlOrderSum nodes = new LvlOrderSum();
        nodes.lvlOrderSum(tree.root);
//        nodes.inorderTransversalRec(tree.root);

    }

    public void lvlOrderSum(TreeNode root){
        if (root==null){
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

            int count = 0;

            while (!q.isEmpty()){

                TreeNode node = q.poll();

                if (node==null){
                    System.out.println(count);
                    count = 0;
                    if (!q.isEmpty()){
                        q.add(null);
                    }

                }else {

                    count = count+node.data;

                    if (node.rightChild!=null){
                        q.add(node.rightChild);
                    }

                    if (node.leftChild!=null){
                        q.add(node.leftChild);
                    }


                }

            }



    }
}
