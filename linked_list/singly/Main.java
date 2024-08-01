package linked_list.singly;

public class Main{
    public static void main(String[] args) {

        LList.addFirst(10);
        LList.addLast(20);
        LList.addLast(30);
        LList.addLast(40);
        LList.addLast(50);
        LList.addLast(60);
        LList.addFirst(0);

        LList.print();

        System.out.println("\nDELETE OPERATION");

        System.out.println("\nDELETE FIRST\n");
        LList.deleteFirst();

        LList.print();

        System.out.println("\nDELETE LAST\n");
        LList.deleteLast();

        LList.print();

        System.out.println("\nDELETE By Node Value\n");
        LList.delete(30);

        LList.print();
    }
}