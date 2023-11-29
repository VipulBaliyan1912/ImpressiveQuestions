package tree;

import org.w3c.dom.Node;

public class BinaryTree {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    BinaryTree(){
        root =new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }
    int sumOfNodes(Node node){
        if(node==null){
            return 0;
        }
        else{
            return node.data+sumOfNodes(node.left)+sumOfNodes(node.right);
        }
    }
    int heightOfTree(Node node){
        if(node==null){
            return 0;
        }
        else{
            return Math.max(heightOfTree(node.left),heightOfTree(node.right))+1;
        }
    }
    int maxOfTree(Node node){
        if(node==null){
            return -1;
        }
        else{
            return Math.max(node.data,Math.max(maxOfTree(node.left),maxOfTree(node.right)));
        }
    }
    boolean searchNode(Node node,int target){
        if(node==null)
            return false;
        else if(node.data == target)
            return true;
        else
            return searchNode(node.left,target) || searchNode(node.right,target);
    }
    boolean isFullTree(Node node){
        if(node == null)
            return true;
        if(node.left == null && node.right == null)
            return true;
        if(node.left != null && node.right != null)
            return isFullTree(node.left) && isFullTree(node.right);
        return false;
    }
    void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    void inOrderTransversal(Node node) {
        if (node != null) {
            inOrderTransversal(node.left);
            System.out.print(node.data + " ");
            inOrderTransversal(node.right);
        }
    }
    void postOrderTraversal(Node node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data+" ");
        }
    }
}
