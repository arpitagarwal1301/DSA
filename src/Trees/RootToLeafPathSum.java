package Trees;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPathSum {

    TreeNode root = null;
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
        tree.root.rightChild.leftChild = new TreeNode(13);

        RootToLeafPathSum nodes = new RootToLeafPathSum();
      nodes.rootToLeafSum(tree.root);

    }

    public void rootToLeafSum(TreeNode root){
       if (root==null){
            return;
       }

        list.add(root.data);

        if (root.leftChild==null && root.rightChild==null){
           int sum =  0;
           for (Integer n : list){
               sum = sum + n;
           }
           System.out.println(sum+" ");
           list.remove(list.size()-1);
       }

       rootToLeafSum(root.leftChild);
       rootToLeafSum(root.rightChild);
//       sum = root.data+rootToLeafSum(root.leftChild) + rootToLeafSum(root.rightChild);
//       return sum;

    }
}
