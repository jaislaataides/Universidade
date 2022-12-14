package blb;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
    //atributos
    private List<Vertice> vizinhos;
    private int lambda;
    private String nome;
    private boolean visitado = false;
    
    //métodos
    public Vertice() {
        lambda = 0;
        vizinhos = new ArrayList<>();
    }
    
    public Vertice(int lambda) {
        this.lambda = lambda;
        vizinhos = new ArrayList<>();
    }

    public void setVizinhos(List<Vertice> vizinhos) {
        this.vizinhos = vizinhos;
    }

    public void setLambda(int lambda) {
        this.lambda = lambda;
    }

    public void setVisited(boolean visitado) {
        this.visitado = visitado;
    }

    public void adicionaVizinho(Vertice v) {
        vizinhos.add(v);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public List<Vertice> getVizinhos() {
        return vizinhos;
    }

    public int getLambda() {
        return lambda;
    }

    public boolean isVisited() {
        return visitado;
    }
    
    public void adicionaAresta(Vertice v) {
        vizinhos.add(v);
    }
    //feito por jaislaataides
}