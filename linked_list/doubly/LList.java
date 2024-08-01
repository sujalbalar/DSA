package linked_list.doubly;

public class LList {
    public static Node Head;
    public static int count;

    public static boolean isEmpty(){
        return Head == null;
    }

    public static void addFirst(int data){
        Node node = new Node(data);
        count++;
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

        count++;
        Node tmp = Head;
        while(tmp.next != null){
            tmp = tmp.next;
        }

        node.previous = tmp;
        tmp.next = node;
    }

    public static void addAt(int data, int pos){
        int current = 1;

        if(isEmpty() || pos == 1){
            addFirst(data);
        }
        else{
            Node node = new Node(data);
            Node tmp = Head;
            Node previous = tmp.previous;

            if(pos <= count) {
                while (current < pos && tmp.next != null) {
                    tmp = tmp.next;
                    previous = tmp.previous;
                    current++;
                }

                previous.next = node;
                node.previous = previous;
                node.next = tmp;
                tmp.previous = node;
                count++;
            }
        }
    }

    public static void deleteFirst(){
        if(!isEmpty()){
            Head = Head.next;
            Head.previous = null;
            count--;
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
            count--;
        }
    }

    public static void delete(int data){
        if(!isEmpty()){
            if(Head.data == data){
                deleteFirst();
                return;
            }

            Node tmp = Head.next;
            Node previous = tmp.previous;
            Node next = tmp.next;

            while(tmp.next != null){
                if(tmp.data != data) {
                    tmp = tmp.next;
                    previous = tmp.previous;
                    next = tmp.next;
                }
                else
                    break;
            }
            previous.next = tmp.next;
            if(next != null)
                next.previous = tmp.previous;
            count--;
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