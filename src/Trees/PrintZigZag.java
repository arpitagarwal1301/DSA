package Trees;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Hint try with 2 stacks ,leftToRight rightToLeft flags
 */
public class PrintZigZag {

    TreeNode root = null;

    public static Map<Integer,List<Integer>> map = new HashMap();

    public static void main(String[] args) {


        TreeNode root1 = new TreeNode(1);
        root1.leftChild = new TreeNode(2);
        root1.rightChild = new TreeNode(3);
        root1.rightChild.rightChild = new TreeNode(7);
        root1.leftChild.leftChild = new TreeNode(4);
        root1.leftChild.rightChild = new TreeNode(5);

        PrintZigZag nodes = new PrintZigZag();
        nodes.printZigZag(root1);
        map.size();

    }

    /**
     * user 2 stacks
     * insert from left to right is stack1 not empty
     * insert from right to left is stack2 not empty
     * @param root
     */
    public void printZigZag(TreeNode root){
        if (root==null){
            return;
        }
        boolean leftToright = false;
        Stack<TreeNode> queue = new Stack<>();
        queue.add(null);
        queue.add(root);


        while (!queue.isEmpty()){
            TreeNode node = queue.pop();

            if (node==null){
                if (leftToright){
                    leftToright= false;
                }else {
                    leftToright = true;
                }

                if (!queue.isEmpty()){
                    queue.add(null);
                }

            }else {

                System.out.println(node.data+" ");
                if (leftToright){
                    //insert child left to right
                    if (node.leftChild!=null){
                        queue.add(node.leftChild);
                    }
                    if (node.rightChild!=null){
                        queue.add(node.rightChild);
                    }
                }else {

                    //insert childs right to left
                    if (node.rightChild!=null){
                        queue.add(node.rightChild);
                    }
                    if (node.leftChild!=null){
                        queue.add(node.leftChild);
                    }
                }

            }








        }

    }


}
