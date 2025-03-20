package pertemuan_4.latihan;

class StrukturList {
    Node head;

    public StrukturList() {
        this.head = null;
    }

    public void addMid(int data, int position) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curNode = head;
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
}
