package tree;
import static tree.traversal.Preorder.preorder;
import static tree.traversal.Postorder.postorder;
import static tree.traversal.Inorder.inorder;

public class Main {
    public static void main(String[] args) {
        int[] arr = {50,20,80,10,30,70,90};
        BST.buildTree(arr);

        System.out.println("\nPRE ORDER");
        preorder(BST.HEAD);

        System.out.println("\n\nIN ORDER");
        inorder(BST.HEAD);

        System.out.println("\n\nPOST ORDER");
        postorder(BST.HEAD);
    }
}
