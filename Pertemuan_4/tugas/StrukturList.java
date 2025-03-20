package pertemuan_4.tugas;

public class StrukturList {
    Node HEAD;

    // Konstruktor untuk inisialisasi linked list kosong
    public StrukturList() {
        this.HEAD = null;
    }

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
}