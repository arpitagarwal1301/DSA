package Trees;


/**
 * Given an array that represents a tree in such a way that array indexes are values in tree nodes and array values give the
 * parent node of that particular index (or node). The value of the root node index would always be -1 as there is no parent for root.
 * Construct the standard linked representation of given Binary Tree from this given representation.
 * https://www.geeksforgeeks.org/construct-a-binary-tree-from-parent-array-representation/
 */
public class CreateTreeFrmArray {

    TreeNode root = null;
    int arr[] = new int[]{-1, 0, 0, 1, 1, 3, 5};
    public static void main(String[] args) {
        CreateTreeFrmArray tree = new CreateTreeFrmArray();
        tree.createTree();
    }

    public void createTree(){
        for (int i=0;i<arr.length;i++){

        }
    }
}
