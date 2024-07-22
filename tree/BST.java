package tree;

public class BST {

    public static Node HEAD;
    static int index = 0;

    public static class Node {
        public int data;
        public Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        } 
    }

    public static Node insert(Node tmp, int data){
        if(tmp == null){
            Node node = new Node(data);
            if(HEAD == null)
                HEAD = node;
            return node;
        }

        if(data < tmp.data)
            tmp.left = insert(tmp.left, data);
        else
            tmp.right = insert(tmp.right, data);
        return tmp;
    }

    public static void buildTree(int[] arr){
        while(index < arr.length){
            insert(HEAD, arr[index++]);
        }
    }
}