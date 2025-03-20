package pertemuan_4.tugas;

public class StrukturListTest {
    Node HEAD;

    public void addHead (double data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(double data, int position) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
            return;
        }
        if (position == 1) {
            newNode.next = HEAD;
            HEAD = newNode;
            return;
        }
        Node curNode = HEAD;
        Node prevNode = null;
        int i = 1;
        while (curNode != null && i < position) {
            prevNode = curNode;
            curNode = curNode.getNext();
            i++;
        }
        prevNode.next = newNode;
        newNode.next = curNode;
    }

    public void addTail (double data) {
        Node posNode = null, curNode = null;

        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        }
        else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void printList() {
        Node temp = HEAD;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StrukturListTest list = new StrukturListTest();

        System.out.print("a.");
        list.addHead(2.1); // Menambahkan elemen 2.1 di awal list
        list.addTail(4.5); // Menambahkan elemen 4.5 di akhir list
        list.addMid(3.4,2); // Menyisipkan elemen 3.4 di posisi kedua
        list.printList();

        StrukturListTest list2 = new StrukturListTest();

        System.out.print("b.");
        list2.addHead(2.1); // Menambahkan elemen 2.1 di awal list
        list2.addHead(3.4); // Menambahkan elemen 3.4 di awal list
        list2.addTail(4.5); // Menambahkan elemen 4.5 di akhir list
        list2.addMid(1.1,3); // Menyisipkan elemen 1.1 di posisi ketiga
        list2.addTail(5.5); // Menambahkan elemen 5.5 di akhir list
        list2.printList();
    }
}
