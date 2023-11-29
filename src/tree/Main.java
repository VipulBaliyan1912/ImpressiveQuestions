package tree;

import org.w3c.dom.Node;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        BinaryTree bt=new BinaryTree();
        int num =sc.nextInt();
        System.out.print("Preorder traversal : ");bt.preOrderTraversal(bt.root);
        System.out.println();
        System.out.print("Inorder traversal : ");bt.inOrderTransversal(bt.root);
        System.out.println();
        System.out.print("Postorder traversal : ");bt.postOrderTraversal(bt.root);
        System.out.println();
        System.out.println("Sum of Nodes : "+bt.sumOfNodes(bt.root));
        System.out.println("Height of tree : "+bt.heightOfTree(bt.root));
        System.out.println("Maximum element of tree : "+bt.maxOfTree(bt.root));
        System.out.println("Element "+num+" found : " + bt.searchNode(bt.root,num));
        System.out.println("Is this tree a full tree : "+bt.isFullTree(bt.root));
    }
}
