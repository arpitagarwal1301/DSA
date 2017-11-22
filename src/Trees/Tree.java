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
        tree.root.rightChild.leftChild = new TreeNode(13);


        System.out.println(tree.findDataRec(tree.root,3).data);
//        System.out.println(tree.findData(tree.root,13));

    }


    public void insertIntoTree(){

    }

    public int findData(TreeNode root,int data){
        int result = 0;
//        if (root == null){
//            System.out.println();
//        }
        if (root.data == data){
//            System.out.println(data);
            return data;
        }else if (data < root.data){
          result =   findData(root.leftChild,data);
        }else if (data >root.data){
           result =  findData(root.rightChild,data);
        }
        return result;
    }

    public TreeNode findDataRec(TreeNode root, int data){

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
