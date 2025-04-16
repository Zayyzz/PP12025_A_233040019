package pertemuan_5.latihan1;

public class StrukturList {
    Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void removeHead() {
        if (HEAD == null) {
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }
}
