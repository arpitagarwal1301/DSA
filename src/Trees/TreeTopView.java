package Trees;

public class TreeTopView {


//    TreeNode root = null;


    public static void main(String[] args) {

//
//        Tree tree = new Tree();
//        tree.root= new TreeNode(1);
//        tree.root.rightChild = new TreeNode(2);
//        tree.root.rightChild.rightChild = new TreeNode(5);
//        tree.root.rightChild.rightChild.rightChild = new TreeNode(6);
////        tree.root.rightChild.leftChild = new TreeNode(6);
//
//        TreeTopView nodes = new TreeTopView();
//
//        nodes.treeTopView(tree.root,tree.root);

    }

    public void treeTopView(TreeNode root1,TreeNode root2){

        if (root1==null && root2==null){
            return;
        }

        if (root1==root2){
            System.out.print(root1.data+" ");
            treeTopView(root1.leftChild,root2.rightChild);;
        }else if (root1==null){
            System.out.print(root2.data+" ");
            treeTopView(null,root2.rightChild);
        }else if (root2==null){
            System.out.print(root1.data+" ");
            treeTopView(root1.leftChild,null);
        } else {
            System.out.print(root1.data+" "+root2.data+" ");
            treeTopView( root1.leftChild,root2.rightChild);
        }

    }


}
