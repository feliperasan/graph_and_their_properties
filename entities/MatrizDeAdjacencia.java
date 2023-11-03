package entities;

import java.util.ArrayList;

public class MatrizDeAdjacencia extends Grafo {
    private int quantidaDeVertices;
    private ArrayList<Vertices> vertices;

    public MatrizDeAdjacencia() {
    }

    public int[][] construirMatrizDeAdjacencia() {
        int[][] matrizAdjacencia = new int[this.quantidaDeVertices][this.quantidaDeVertices];
        this.iniciarMatrizDeAdjacencia(matrizAdjacencia);

        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia.length; j++) {
                matrizAdjacencia[i][j] = getGrau();
            }
        }

        return matrizAdjacencia;
    }

    public void iniciarMatrizDeAdjacencia(int[][] matrizAdjacencia) {
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            for (int j = 0; j < matrizAdjacencia[i].length; j++) {
                matrizAdjacencia[i][j] = 0;
            }
        }
    }

    public void mostrarMatrizDeAdjacencia(int[][] matrizAdjacencia) {
        for (int i = 0; i < matrizAdjacencia.length; i++) { // itero as linhas
            for (int j = 0; j < matrizAdjacencia[i].length; j++) { // itero as colunas
                if (matrizAdjacencia[i][j] != 0) { // quero imprimir somente as ligações
                    System.out.println(vertices.get(i) + "->" + vertices.get(j)); // Imprime as arestas
                }
            }
        }
    }
}
