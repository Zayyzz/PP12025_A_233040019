package pertemuan_4.latihan;

public class StrukturListTest {
    Node HEAD;

    public void addHead (int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(int data, int position) {
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

    public void addTail (int data) {
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

        list.addTail(3); // Menambahkan elemen 3 di akhir list
        list.addTail(4); // Menambahkan elemen 4 di akhir list
        list.addMid(7, 2); // Menyisipkan elemen 7 di posisi kedua
        list.addMid(8,2); // Menyisipkan elemen 8 di posisi kedua
        list.addHead(5); // Menambahkan elemen 5 di awal list

        list.printList();
    }
}