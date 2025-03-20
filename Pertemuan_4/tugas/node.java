package pertemuan_4.tugas;

public class Node {
    public double data;
    public Node next;

    //** Inisialisasi atribut node */

    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    //** Setter & Getter */

    public double getData() {
        return (int) data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}