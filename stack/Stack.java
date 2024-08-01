package stack;

class Stack {

    static StackPlate Top;

    public static boolean isEmpty(){
        return Top == null;
    }

    public static void push(int data){
        StackPlate plate = new StackPlate(data);

        if(!isEmpty()){
            plate.next = Top;
        }
        Top = plate;
    }

    public static int pop(){
        int top = -1;
        if(!isEmpty()){
            top = Top.data;
            Top = Top.next;
        }
        return top;
    }

    public static int peek(){
        if(!isEmpty())
            return Top.data;
        else
            return -1;
    }

    public static void print(){
        StackPlate tmp = Top;
        while(tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
