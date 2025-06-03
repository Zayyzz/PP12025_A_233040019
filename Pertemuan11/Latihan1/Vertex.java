package Pertemuan11.Latihan1;

public class Vertex {
    private char label; // label (e.g. 'A')
    private boolean wasVisited;

    public Vertex(char lab) { // constructor
        this.label = lab;
        this.wasVisited = false;
    }

    // Setter & Getter
    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}