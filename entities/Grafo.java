package entities;

import java.util.ArrayList;

public class Grafo {
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }

    public void getGrau(Vertice vertice) {
        int grau = 0;
        for (Aresta aresta : arestas) {
            if (aresta.getV0() == vertice || aresta.getV1() == vertice) {
                grau++;
            }
        }

        System.out.println(grau);
    }

    public void getTamanho() {
        System.out.println("|V| = " + vertices.size());
        System.out.println("|E| = " + arestas.size());
    }

    public void getSubGrafo() {

    }

    public Vertice addVertice(String label, int peso) {
        Vertice novo = new Vertice(label, peso);
        this.vertices.add(novo);
        return novo;
    }

    public void removeVertice(Vertice vertice) {
        this.vertices.remove(vertice);
    }

    public void addAresta(Vertice origem, Vertice destino, int peso) {
        this.arestas.add(new Aresta(origem, destino, peso));
    }

    public void removerAresta(Vertice origem, Vertice destino) {
        this.arestas.removeIf(x -> x.getV0().equals(origem) && x.getV1().equals(destino));
    }

}
