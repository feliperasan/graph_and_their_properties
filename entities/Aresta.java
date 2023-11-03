package entities;

public class Aresta {
    private String label; //@remind O que ele quer dizer com Label?
    private int peso;
    private Vertice v0; // ORIGEM
    private Vertice v1; // DESTINO

    public Aresta(Vertice v0, Vertice v1, int peso) {
        this.v0 = v0;
        this.v1 = v1;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Vertice getV0() {
        return v0;
    }

    public void setV0(Vertice v0) {
        this.v0 = v0;
    }

    public Vertice getV1() {
        return v1;
    }

    public void setV1(Vertice v1) {
        this.v1 = v1;
    }
}
