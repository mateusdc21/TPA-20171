/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.LinkedList;

/**
 *
 * @author 20121bsi0198
 */
public abstract class Grafo {
    protected int qtdVertices = 0;
    protected int qtdArestas = 0;

    public int numVertices() {
        return qtdVertices;
    }

    public int numArestas() {
        return qtdArestas;
    }
    
    public abstract LinkedList<Vertice> vertices();
    public abstract LinkedList<Aresta> arestas();
}
