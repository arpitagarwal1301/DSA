package Trees;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hint try with 2 stacks ,leftToRight rightToLeft flags
 * TODO
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

    }


}
