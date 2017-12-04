package Trees;

import java.util.*;

/**
 * can't do recursively because it will enter the left tree and take the left nodes even if the right nodes are visible at the top of the tree
 */
public class TopViewGeeksForGeeks {

    TreeNode root = null;

    public static Map<Integer,List<Integer>> map = new HashMap();

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        root1.leftChild = new TreeNode(2);
        root1.rightChild = new TreeNode(3);
        root1.rightChild.rightChild = new TreeNode(7);
        root1.leftChild.leftChild = new TreeNode(4);
        root1.leftChild.rightChild = new TreeNode(5);

        TopViewGeeksForGeeks nodes = new TopViewGeeksForGeeks();
        nodes.printVerticalNodes(root1);
        map.size();

    }


    public void printVerticalNodes(TreeNode root){

        if (root==null){
            return;
        }
        int count=0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);


        while (!queue.isEmpty()){
            TreeNode node = queue.poll();

            List<Integer> list = map.get(count);

            if (list ==null || list.size()==0){
                 list = new ArrayList<>();
                list.add(node.data);
                map.put(count,list);
            }

            if (node.leftChild!=null){
                count = count-1;
                queue.add(node.leftChild);
            }

            if (node.rightChild!=null){
                count = count+1;
                queue.add(node.rightChild);
            }

        }


//        else {
//            list.add(root.data);
//            map.put(count,list);
//        }
//        printVerticalNodes(root.leftChild,count-1);
//        printVerticalNodes(root.rightChild,count+1);

    }
}
