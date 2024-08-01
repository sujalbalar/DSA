package linked_list.singly;

class LList {
    public static Node Head = null;

    public static void addFirst(int data){
        Node node = new Node(data);
        if(Head == null){
            Head = node;
            return;
        }

        node.next = Head;
        Head = node;
    }

    public static void addLast(int data){
        Node node = new Node(data);

        if(Head == null){
            Head = node;
            return;
        }

        Node tmp = Head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    public static void deleteFirst(){
        if(Head == null)
            return;

        Head = Head.next;
    }

    public static void deleteLast(){
        Node secondLast = Head;
        Node last = Head.next;

        while(last.next != null){
            secondLast = secondLast.next;
            last = last.next;
        }

        secondLast.next = null;
    }

    public static void delete(int data){
        Node prv = Head;
        
        if(Head == null){
            return;
        }
        else if(Head.data == data){
            deleteFirst();
            return;
        }
        
        Node tmp = Head.next;

        while(tmp != null){
            if(tmp.data == data){
                prv.next = tmp.next;
            }
            prv = prv.next;
            tmp = tmp.next;
        }
    }

    public static void print(){
        Node tmp = Head;
        while(tmp != null) {
            if(tmp.next != null)
                System.out.print(tmp.data + " -> ");
            else
                System.out.print(tmp.data + "\n");
            tmp = tmp.next;
        }
    }
}