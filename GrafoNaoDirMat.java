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
public class GrafoNaoDirMat extends Grafo{
    // grafo não dirigido construido como matriz de adjacencias
    /*
    public int qtdVertices = 0;
    public int qtdArestas = 0;

    @Override
    public int numVertices() {
        return qtdVertices;
    }

    @Override
    public int numArestas() {
        return qtdArestas;
    }*/

    @Override
    public LinkedList<Vertice> vertices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Aresta> arestas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
