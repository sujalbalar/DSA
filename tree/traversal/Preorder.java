package tree.traversal;
import static tree.BST.Node;

public class Preorder {
    public static void preorder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
