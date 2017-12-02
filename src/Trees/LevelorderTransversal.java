package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelorderTransversal {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.leftChild.leftChild = new TreeNode(3);
        tree.root.rightChild.rightChild = new TreeNode(30);
//        tree.root.rightChild.leftChild = new TreeNode(13);

        LevelorderTransversal nodes = new LevelorderTransversal();
        nodes.levelOrder(tree.root);
//        nodes.inorderTransversalRec(tree.root);

    }

    public void levelOrder(TreeNode root){

        if (root==null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.data+" ");
            if (node.leftChild!=null){
                queue.add(node.leftChild);
            }
            if (node.rightChild!=null){
                queue.add(node.rightChild);
            }
        }

    }
}
