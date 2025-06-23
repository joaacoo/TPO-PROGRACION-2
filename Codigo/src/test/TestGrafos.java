package test;

import modelo.Grafo;
import servicios.Dijkstra;

public class TestGrafos {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // Crear nodos (almacén y puntos de entrega)
        for (int i = 0; i <= 5; i++) {
            grafo.agregarNodo(i);
        }

        // Agregar rutas urbanas (con tiempo en minutos como peso)
        grafo.agregarArista(0, 1, 10);
        grafo.agregarArista(0, 2, 3);
        grafo.agregarArista(1, 2, 1);
        grafo.agregarArista(1, 3, 2);
        grafo.agregarArista(2, 3, 8);
        grafo.agregarArista(2, 4, 2);
        grafo.agregarArista(3, 5, 7);
        grafo.agregarArista(4, 3, 5);
        grafo.agregarArista(4, 5, 1);

        System.out.println("Lista de adyacencia del grafo:");
        grafo.mostrarListaAdyacencia();

        System.out.println("\nEjecución de Dijkstra desde el almacén (nodo 0):");
        Dijkstra.ejecutar(grafo, 0);
    }
}
