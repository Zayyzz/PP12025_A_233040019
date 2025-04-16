package pertemuan_5.latihan1;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addHead(2);
        list.addHead(9);
        list.addHead(7);

        System.out.print("");
        tampilList(list);

        list.removeHead();
        System.out.print("");
        tampilList(list);

        list.removeHead();
        list.removeHead();

        System.out.print("");
        tampilList(list);
    }

    // Method bantu untuk menampilkan isi list
    public static void tampilList(StrukturList list) {
        Node current = list.HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}