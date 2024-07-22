package tree.traversal;
import tree.BST.Node;

public class Inorder {
    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
