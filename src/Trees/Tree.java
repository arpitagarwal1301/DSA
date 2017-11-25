package Trees;

public class Tree {

    TreeNode root = null;


    public static void main(String[] args) {
//        Tree tree = new Tree();
//        tree.insert(1);
//        tree.insert(5);
//        tree.insert(11);
//        tree.insert(3);
//        tree.insert(7);

        Tree tree = new Tree();
        tree.root= new TreeNode(10);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(14);
        tree.root.rightChild.rightChild = new TreeNode(30);
//        tree.root.rightChild.leftChild = new TreeNode(133);


//        System.out.println(tree.findDataRec(tree.root,3).data);
//        tree.findData(tree.root,13);
        tree.insertIntoTreeRec(tree.root,133);
                tree.findData(tree.root,133);


    }


    public TreeNode insertIntoTreeRec(TreeNode root,int data){

        if (root==null){
            return new TreeNode(data);
        }

        if (data > root.data){
           root.setRightChild(insertIntoTreeRec(root.rightChild,data)); ;
        }else {
            root.setLeftChild(insertIntoTreeRec(root.leftChild,data));
        }
        return root;
    }


    public void findData(TreeNode root,int data){

        while (root!=null){
            if (data > root.data){
                root = root.rightChild;
            }else if (data < root.data){
                root = root.leftChild;
            }else {
                System.out.println(root.data);
                break;
            }
        }

        if (root==null){
            System.out.println("not present");
        }
    }

    /**
     * base condition
     * current node
     * recursion
     * @param root
     * @param data
     * @return
     */
    public TreeNode findDataRec(TreeNode root,int data){


        if (root == null){
            return  null;
        } else if (root.data==data){
            return  root;
        }else if (root.data > data){
           return  findDataRec(root.leftChild,data);
        }else {
            return findDataRec(root.rightChild,data);
        }
    }

}
