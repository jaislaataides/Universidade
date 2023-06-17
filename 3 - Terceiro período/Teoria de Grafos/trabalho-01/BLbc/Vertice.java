package blbc;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
    //atributos
    private boolean visitado = false;
    private int lambda;
    private int mi;
    private String nome;
    private List <Vertice> vizinhos;
                
    //métodos
    public Vertice(int lambda) {
        this.lambda =  lambda;
        this.mi = 0;
        vizinhos = new ArrayList<>();
    }
    
    public Vertice() {
        lambda = 0;
        mi = 0;
        vizinhos = new ArrayList<>();
    }
    
    public void setLambda(int lambda) {
        this.lambda = lambda;
    }

    public void setMi(int mi) {
        this.mi = mi;
    }
    
    public void increaseMi(int mi){
        this.mi += mi;
    }
    
    public void setVisited(boolean visitado) {
        this.visitado = visitado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean isVisited() {
        return visitado;
    }

    public int getLambda() {
        return lambda;
    }

    public int getMi() {
        return mi;
    }
    
    public List<Vertice> getVizinhos() {
        return vizinhos;
    }
    
    public void adicionaAresta(Vertice v) {
        vizinhos.add(v);
    }
//feito por jaislaataides
}
