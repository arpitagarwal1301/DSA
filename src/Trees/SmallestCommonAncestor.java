package Trees;

public class SmallestCommonAncestor {

    TreeNode root = null;


    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
//        tree.root.rightChild.leftChild = new TreeNode(13);

        SmallestCommonAncestor nodes = new SmallestCommonAncestor();
        System.out.println(nodes.commonAncestor(tree.root,2,14).data);

    }


    public TreeNode commonAncestor(TreeNode root,int v1, int v2){

        if (root.data < v1 && root.data < v2){
          return commonAncestor(root.rightChild,v1,v2);
       }else if (root.data > v1 && root.data > v2){
         return  commonAncestor(root.leftChild,v1,v2);
       }

        return root;
    }

}
