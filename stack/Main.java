package stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nINSERT");
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);

        Stack.print();

        System.out.println("\nPEEK");
        System.out.print("TOP :: " + Stack.peek());

        System.out.println("\n\nPOP");
        System.out.print("DELETE :: " + Stack.pop() + "\n");
        Stack.print();
    }
}
