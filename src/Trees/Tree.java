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

        Tree tree  = new Tree();

//        Scanner scn = new Scanner(System.in);
        int arr [] = new int[]{
                2,
                1 ,2, 4, 3, 5, 6, 7};
//        int arr [] = new int[]{116,37,23,108,59,86,64,94,14,105,17,111,65,55,31,79,97,78,25,50,22,66,46,104,98,81,90,68,40,103,77,74,18,69,82,41,4,48,83,67,6,2,95,54,100,99,84,34,88,27,72,32,62,9,56,109,115,33,15,91,29,85,114,112,20,26,30,93,96,87,42,38,60,7,73,35,12,10,57,80,13,52,44,16,70,8,39,107,106,63,24,92,45,75,116,5,61,49,101,71,11,53,43,102,110,1,58,36,28,76,47,113,21,89,51,19,3};
//        int count = 0;
//        System.out.println("Enter the array");
//        while (count<116){
//            tree.insertIntoTreeRec(tree.root,scn.nextInt());
//            count++;
//        }

        for (int i : arr){
           tree.root =  tree.insertIntoTreeRec(tree.root,i);
        }

        IsBinaryTree ancestor = new IsBinaryTree();
        try{
            ancestor.isBinaryTree(tree.root,-1);
            System.out.println("True");
        }catch (Exception e){
            System.out.println("False");
        }
//        System.out.println(ancestor.commonAncestor(tree.root,1,2).data);;
    }


    public TreeNode insertIntoTreeRec(TreeNode root,int data){

        if (root==null){
            return new TreeNode(data);
        }

        if (data > root.data){
           root.setRightChild(insertIntoTreeRec(root.rightChild,data));
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
