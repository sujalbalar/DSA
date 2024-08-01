package linked_list.doubly;

public class LList {
    public static Node Head;

    public static boolean isEmpty(){
        return Head == null;
    }

    public static void addFirst(int data){
        Node node = new Node(data);
        if(isEmpty()){
            Head = node;
            return;
        }

        node.next = Head;
        Head.previous = node;
        Head = node;
    }

    public static void addLast(int data){
        Node node = new Node(data);
        if(isEmpty()){
            Head = node;
            return;
        }

        Node tmp = Head;
        while(tmp.next != null){
            tmp = tmp.next;
        }

        node.previous = tmp;
        tmp.next = node;
    }

    public static void deleteFirst(){
        if(!isEmpty()){
            Head = Head.next;
            Head.previous = null;
        }
    }

    public static void deleteLast(){

        if(!isEmpty()){
            Node secondLast = Head;
            Node last = Head.next;

            while(last.next != null){
                secondLast = secondLast.next;
                last = last.next;
            }

            secondLast.next = null;
            last.previous = null;
        }
    }

    public static void print(){
        Node tmp = Head;
        while(tmp != null){
            if(tmp.next != null)
                System.out.print(tmp.data + " -> ");
            else
                System.out.print(tmp.data);
            tmp = tmp.next;
        }
    }
}