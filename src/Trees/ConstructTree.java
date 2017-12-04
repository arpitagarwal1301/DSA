package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ConstructTree {

    public static void main(String[] args) {
        // for pre in
        Queue<Integer> preOrder = new LinkedList<>();
         preOrder.add(5);
         preOrder.add(3);
         preOrder.add(2);
         preOrder.add(4);
         preOrder.add(6);

         //for post in
        Stack<Integer> postOrder = new Stack<>();
        postOrder.add(2);
        postOrder.add(4);
        postOrder.add(3);
        postOrder.add(6);
        postOrder.add(5);

        //For post , pre
        Queue<Integer> postOrderRev = new LinkedList<>();
        postOrderRev.add(5);
        postOrderRev.add(6);
        postOrderRev.add(3);
        postOrderRev.add(4);
        postOrderRev.add(2);

        //for in
        Queue<Integer> inOrder = new LinkedList<>();
        inOrder.add(2);
        inOrder.add(3);
        inOrder.add(4);
        inOrder.add(5);
        inOrder.add(6);
        ConstructTree tree = new ConstructTree();
//        TreeNode node = tree.constructFromPreIn(preOrder,inOrder);
//        TreeNode node = tree.constructFromPostIn(postOrder,inOrder);
        TreeNode node = tree.constructFrmPostPre(preOrder,postOrderRev);
    }

    public TreeNode constructFromPreIn(Queue<Integer> preOrder, Queue<Integer> inOrder){
        //pop first element
        int n = preOrder.poll();

        //if stack empty then return the node
        if (preOrder.isEmpty()){
            return new TreeNode(n);
        }

        //if root null then create first root
        TreeNode root = new TreeNode(n);

        //this will contain list left of root in inOrder queue
        Queue<Integer> inOrderNewL = new LinkedList<>();
        //this will contain list right of root in inOrder queue
        Queue<Integer> inOrderNewR = new LinkedList<>();


        while (!inOrder.isEmpty() && inOrder.peek()!=n){
            inOrderNewL.add(inOrder.poll());
        }

        while (!inOrder.isEmpty()){
            if (inOrder.peek()!=n)
                inOrderNewR.add(inOrder.poll());
            else
                inOrder.poll();
        }

        //if left inorder list is not empty
        if (!inOrderNewL.isEmpty())
            root.leftChild = constructFromPreIn(preOrder,inOrderNewL);
        //if right inorder list is not empty
        if (!inOrderNewR.isEmpty())
            root.rightChild = constructFromPreIn(preOrder,inOrderNewR);

        return root;
    }

    public TreeNode constructFromPostIn(Stack<Integer> postOrder, Queue<Integer> inOrder){
        //pop first element
        int n = postOrder.pop();

        //if stack empty then return the node
        if (postOrder.isEmpty()){
            return new TreeNode(n);
        }

        //if root null then create first root
        TreeNode root = new TreeNode(n);

        //this will contain list left of root in inOrder queue
        Queue<Integer> inOrderNewL = new LinkedList<>();
        //this will contain list right of root in inOrder queue
        Queue<Integer> inOrderNewR = new LinkedList<>();


        while (!inOrder.isEmpty() && inOrder.peek()!=n){
            inOrderNewL.add(inOrder.poll());
        }

        while (!inOrder.isEmpty()){
            if (inOrder.peek()!=n)
                inOrderNewR.add(inOrder.poll());
            else
                inOrder.poll();
        }

        //if right inorder list is not empty
        if (!inOrderNewR.isEmpty())
            root.rightChild = constructFromPostIn(postOrder,inOrderNewR);

        //if left inorder list is not empty
        if (!inOrderNewL.isEmpty())
            root.leftChild = constructFromPostIn(postOrder,inOrderNewL);

        return root;
    }

    /**
     *
     * @param preOrder
     * @param postOrder Need reverse post order input in the queue
     * @return
     */
    public TreeNode constructFrmPostPre(Queue<Integer> preOrder,Queue<Integer> postOrder){
        int n = preOrder.poll();
         postOrder.poll();
        if (preOrder.isEmpty()){
            return new TreeNode(n);
        }

        TreeNode root = new TreeNode(n);

        int tempN = preOrder.peek().intValue();

        Queue<Integer> stkPostOrderL = new LinkedList<>();
        Queue<Integer> stkPostOrderR = new LinkedList<>();

        while (!postOrder.isEmpty() && postOrder.peek().intValue()!=tempN){
            stkPostOrderR.add(postOrder.poll());
        }

        while (!postOrder.isEmpty()){
            stkPostOrderL.add(postOrder.poll());
        }

        if (!stkPostOrderL.isEmpty()){
            root.leftChild = constructFrmPostPre(preOrder,stkPostOrderL);
        }

        if (!stkPostOrderR.isEmpty()){
            root.rightChild = constructFrmPostPre(preOrder,stkPostOrderR);
        }

        return root;

    }
}
