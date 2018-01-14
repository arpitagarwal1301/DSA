package Trees.RedBlackTree;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class RBTree {

    RedBlackTreeNode root = null;
    public static void main(String[] args) {
        RBTree tree = new RBTree();
       tree.root =  tree.insert(tree.root,1);
       tree.root =  tree.insert(tree.root,3);
       tree.root =  tree.insert(tree.root,5);
       tree.root =  tree.insert(tree.root,8);
    }

    public enum Color {
        RED, BLACK
    }

    private static RedBlackTreeNode createBlackRedBlackTreeNode(int data) {
        RedBlackTreeNode RedBlackTreeNode = new RedBlackTreeNode();
        RedBlackTreeNode.data = data;
        RedBlackTreeNode.color = Color.BLACK;
        RedBlackTreeNode.left = createNullLeafRedBlackTreeNode(RedBlackTreeNode);
        RedBlackTreeNode.right = createNullLeafRedBlackTreeNode(RedBlackTreeNode);
        return RedBlackTreeNode;
    }

    private static RedBlackTreeNode createNullLeafRedBlackTreeNode(RedBlackTreeNode parent) {
        RedBlackTreeNode leaf = new RedBlackTreeNode();
        leaf.color = Color.BLACK;
        leaf.isNullLeaf = true;
        leaf.parent = parent;
        return leaf;
    }

    private static RedBlackTreeNode createRedRedBlackTreeNode(RedBlackTreeNode parent, int data) {
        RedBlackTreeNode RedBlackTreeNode = new RedBlackTreeNode();
        RedBlackTreeNode.data = data;
        RedBlackTreeNode.color = Color.RED;
        RedBlackTreeNode.parent = parent;
        RedBlackTreeNode.left = createNullLeafRedBlackTreeNode(RedBlackTreeNode);
        RedBlackTreeNode.right = createNullLeafRedBlackTreeNode(RedBlackTreeNode);
        return RedBlackTreeNode;
    }

    public RedBlackTreeNode insert(RedBlackTreeNode root, int data) {
        return insert(null, root, data);
    }

    private RedBlackTreeNode insert(RedBlackTreeNode parent, RedBlackTreeNode root, int data) {
        if (root == null || root.isNullLeaf) {
            // if parent is not null means tree is not empty
            // so create a red leaf RedBlackTreeNode
            if (parent != null) {
                return createRedRedBlackTreeNode(parent, data);
            } else { // otherwise create a black root RedBlackTreeNode if tree
                // is empty
                return createBlackRedBlackTreeNode(data);
            }
        }

        // duplicate insertion is not allowed for this tree.
        if (root.data == data) {
            throw new IllegalArgumentException("Duplicate date " + data);
        }
        // if we go on left side then isLeft will be true
        // if we go on right side then isLeft will be false.
        boolean isLeft;
        if (root.data > data) {
            RedBlackTreeNode left = insert(root, root.left, data);
            // if left becomes root parent means rotation
            // happened at lower level. So just return left
            // so that RedBlackTreeNodes at upper level can set their
            // child correctly
            if (left == root.parent) {
                return left;
            }
            // set the left child returned to be left of root RedBlackTreeNode
            root.left = left;
            // set isLeft to be true
            isLeft = true;
        } else {
            RedBlackTreeNode right = insert(root, root.right, data);
            // if right becomes root parent means rotation
            // happened at lower level. So just return right
            // so that RedBlackTreeNodes at upper level can set their
            // child correctly
            if (right == root.parent) {
                return right;
            }
            // set the right child returned to be right of root RedBlackTreeNode
            root.right = right;
            // set isRight to be true
            isLeft = false;
        }

        if (isLeft) {
            // if we went to left side check to see Red-Red conflict
            // between root and its left child
            if (root.color == Color.RED && root.left.color == Color.RED) {
                // get the sibling of root. It is returning optional means
                // sibling could be empty
                Optional<RedBlackTreeNode> sibling = findSiblingNode(root);
                // if sibling is empty or of BLACK color
                if (!sibling.isPresent() || sibling.get().color == Color.BLACK) {
                    // check if root is left child of its parent
                    if (isLeftChild(root)) {
                        // this creates left left situation. So do one right
                        // rotate
                        rightRotate(root, true);
                    } else {
                        // this creates left-right situation so do one right
                        // rotate followed
                        // by left rotate

                        // do right rotation without change in color. So sending
                        // false.
                        // when right rotation is done root becomes right child
                        // of its left
                        // child. So make root = root.parent because its left
                        // child before rotation
                        // is new root of this subtree.
                        rightRotate(root.left, false);
                        // after rotation root should be root's parent
                        root = root.parent;
                        // then do left rotate with change of color
                        leftRotate(root, true);
                    }

                } else {
                    // we have sibling color as RED. So change color of root
                    // and its sibling to Black. And then change color of their
                    // parent to red if their parent is not a root.
                    root.color = Color.BLACK;
                    sibling.get().color = Color.BLACK;
                    // if parent's parent is not null means parent is not root.
                    // so change its color to RED.
                    if (root.parent.parent != null) {
                        root.parent.color = Color.RED;
                    }
                }
            }
        } else {
            // this is mirror case of above. So same comments as above.
            if (root.color == Color.RED && root.right.color == Color.RED) {
                Optional<RedBlackTreeNode> sibling = findSiblingNode(root);
                if (!sibling.isPresent() || sibling.get().color == Color.BLACK) {
                    if (!isLeftChild(root)) {
                        leftRotate(root, true);
                    } else {
                        leftRotate(root.right, false);
                        root = root.parent;
                        rightRotate(root, true);
                    }
                } else {
                    root.color = Color.BLACK;
                    sibling.get().color = Color.BLACK;
                    if (root.parent.parent != null) {
                        root.parent.color = Color.RED;
                    }
                }
            }
        }
        return root;
    }

    public boolean validateRedBlackTree(RedBlackTreeNode root) {

        if (root == null) {
            return true;
        }
        // check if root is black
        if (root.color != Color.BLACK) {
            System.out.print("Root is not black");
            return false;
        }
        // Use of AtomicInteger solely because java does not provide any other
        // mutable int wrapper.
        AtomicInteger blackCount = new AtomicInteger(0);
        // make sure black count is same on all path and there is no red red
        // relationship
        return checkBlackNodesCount(root, blackCount, 0) && noRedRedParentChild(root, Color.BLACK);
    }

    private void rightRotate(RedBlackTreeNode root, boolean changeColor) {
        RedBlackTreeNode parent = root.parent;
        root.parent = parent.parent;
        if (parent.parent != null) {
            if (parent.parent.right == parent) {
                parent.parent.right = root;
            } else {
                parent.parent.left = root;
            }
        }
        RedBlackTreeNode right = root.right;
        root.right = parent;
        parent.parent = root;
        parent.left = right;
        if (right != null) {
            right.parent = parent;
        }
        if (changeColor) {
            root.color = Color.BLACK;
            parent.color = Color.RED;
        }
    }

    private void leftRotate(RedBlackTreeNode root, boolean changeColor) {
        RedBlackTreeNode parent = root.parent;
        root.parent = parent.parent;
        if (parent.parent != null) {
            if (parent.parent.right == parent) {
                parent.parent.right = root;
            } else {
                parent.parent.left = root;
            }
        }
        RedBlackTreeNode left = root.left;
        root.left = parent;
        parent.parent = root;
        parent.right = left;
        if (left != null) {
            left.parent = parent;
        }
        if (changeColor) {
            root.color = Color.BLACK;
            parent.color = Color.RED;
        }
    }

    private Optional<RedBlackTreeNode> findSiblingNode(RedBlackTreeNode root) {
        RedBlackTreeNode parent = root.parent;
        if (isLeftChild(root)) {
            return Optional.ofNullable(parent.right.isNullLeaf ? null : parent.right);
        } else {
            return Optional.ofNullable(parent.left.isNullLeaf ? null : parent.left);
        }
    }

    private boolean isLeftChild(RedBlackTreeNode root) {
        RedBlackTreeNode parent = root.parent;
        if (parent.left == root) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkBlackNodesCount(RedBlackTreeNode root, AtomicInteger blackCount, int currentCount) {

        if (root.color == Color.BLACK) {
            currentCount++;
        }

        if (root.left == null && root.right == null) {
            if (blackCount.get() == 0) {
                blackCount.set(currentCount);
                return true;
            } else {
                return currentCount == blackCount.get();
            }
        }
        return checkBlackNodesCount(root.left, blackCount, currentCount)
                && checkBlackNodesCount(root.right, blackCount, currentCount);
    }

    private boolean noRedRedParentChild(RedBlackTreeNode root, Color parentColor) {
        if (root == null) {
            return true;
        }
        if (root.color == Color.RED && parentColor == Color.RED) {
            return false;
        }

        return noRedRedParentChild(root.left, root.color) && noRedRedParentChild(root.right, root.color);
    }



}
