package Strings;

public class TernarySearchTree {

    public static void main(String[] args) {

        TernarySearchTree searchTree = new TernarySearchTree();
        searchTree.insert("arpit");

    }

    TSTNode root ;
    private void insert(String str) {
        char arr[] = str.toCharArray();

        root = new TSTNode();




    }

    private void search(String str){
        char arr[] = str.toCharArray();
    }

    private class TSTNode{
        char data ;
        TSTNode eq;
        TSTNode left;
        TSTNode right;
        boolean isEnd;

        public TSTNode() {
            isEnd = false;
            eq = null;
            left = null;
            right = null;
        }
    }

}
