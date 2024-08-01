package linked_list.doubly;

public class Main {
    public static void main(String[] args) {
        LList.addFirst(20);
        LList.addLast(30);
        LList.addLast(40);
        LList.addLast(50);
        LList.addFirst(10);

        LList.print();

        System.out.println("\n\nDELETE Operation\n");

        System.out.println("DELETE FIRST");
        LList.deleteFirst();
        LList.print();

        System.out.println("\n\nDELETE LAST");
        LList.deleteLast();
        LList.print();
    }
}
