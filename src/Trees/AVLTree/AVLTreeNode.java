package Trees.AVLTree;

public class AVLTreeNode {

    int height;
    int data;
    AVLTreeNode right;
    AVLTreeNode left;

    public AVLTreeNode(int data) {
        this.data = data;
        this.right =null;
        this.left =null;
        this.height = 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public AVLTreeNode getRight() {
        return right;
    }

    public void setRight(AVLTreeNode right) {
        this.right = right;
    }

    public AVLTreeNode getLeft() {
        return left;
    }

    public void setLeft(AVLTreeNode left) {
        this.left = left;
    }
}
