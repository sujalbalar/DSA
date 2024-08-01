package linked_list.doubly;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nINSERT Operation");

        LList.addFirst(20);
        LList.addLast(30);
        LList.addLast(40);
        LList.addLast(60);
        LList.addFirst(10);

        LList.print();

        System.out.println("\n\nDELETE Operation");

        LList.deleteFirst();
        LList.print();

        System.out.print("\n");
        LList.deleteLast();
        LList.print();

        System.out.println("\n\nDELETE By Node Value");
        LList.delete(30);
        LList.print();

        System.out.println();

        LList.addAt(30, 2);
        LList.print();

        System.out.println();

        LList.addAt(0, 1);
        LList.print();

        System.out.println("\n INSERT Operation add at specific position");

        LList.addAt(25, 3);
        LList.print();
    }
}
