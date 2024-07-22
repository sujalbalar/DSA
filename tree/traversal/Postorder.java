package tree.traversal;
import tree.BST.Node;

public class Postorder {
    public static void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
