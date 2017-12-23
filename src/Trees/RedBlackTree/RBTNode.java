package Trees.RedBlackTree;


/**
 * 0 - black color
 * 1 - white color
 */
public class RBTNode {

    public static final int RED = 0;
    public static final int BLACK = 1;

    int height;
    int data;
    RBTNode right;
    RBTNode left;
    int color;

    public RBTNode(int data,int color){
        this.data = data;
        this.right =null;
        this.left =null;
        this.height = 0;
        this.color = color;
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

    public RBTNode getRight() {
        return right;
    }

    public void setRight(RBTNode right) {
        this.right = right;
    }

    public RBTNode getLeft() {
        return left;
    }

    public void setLeft(RBTNode left) {
        this.left = left;
    }


}

