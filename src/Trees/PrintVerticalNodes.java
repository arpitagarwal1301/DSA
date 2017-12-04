package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hint : pass count-1 for left and count+1 for right
 * Important : we can also print the roots depth wise just pass count+1 for left and right node
 */
public class PrintVerticalNodes {


    TreeNode root = null;

    public static Map<Integer,List<Integer>> map = new HashMap();

    public static void main(String[] args) {


        TreeNode root1 = new TreeNode(1);
        root1.leftChild = new TreeNode(2);
        root1.rightChild = new TreeNode(3);
        root1.rightChild.rightChild = new TreeNode(7);
        root1.leftChild.leftChild = new TreeNode(4);
        root1.leftChild.rightChild = new TreeNode(5);

        PrintVerticalNodes nodes = new PrintVerticalNodes();
        nodes.printVerticalNodes(root1,0);
        map.size();

    }

    public void printVerticalNodes(TreeNode root, int count){

        if (root==null){
            return;
        }


        printVerticalNodes(root.leftChild,count-1);
        List<Integer> list = map.get(count);
        if (list ==null || list.size()==0){
            List<Integer> list1 = new ArrayList<>();
            list1.add(root.data);
            map.put(count,list1);

        }else {
            list.add(root.data);
            map.put(count,list);
        }
        printVerticalNodes(root.rightChild,count+1);

    }

}
