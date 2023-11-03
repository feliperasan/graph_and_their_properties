import entities.Grafo;
import entities.Vertice;

public class Program {
  public static void main(String[] args) {


    Grafo grafo = new Grafo();
    Vertice x = grafo.addVertice("x", 10);
    Vertice y = grafo.addVertice("y", 5);
    Vertice z = grafo.addVertice("z", 5);

    grafo.addAresta(x, y, 10);
    grafo.addAresta(y, z, 10);
    grafo.addAresta(x, z, 10);
    
    grafo.getTamanho();
    grafo.getGrau(x);
    grafo.getGrau(y);
    grafo.getGrau(z);
    
    grafo.removerAresta(y, z);

    grafo.getTamanho();
    grafo.getGrau(x);
    grafo.getGrau(y);
    grafo.getGrau(z);
  }
}