package entities;

public class Vertice {
    private String label;
    private int peso;
    
    public Vertice(String label, int peso) {
        this.peso = peso;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
    public int getPeso() {
        return peso;
    }
}
