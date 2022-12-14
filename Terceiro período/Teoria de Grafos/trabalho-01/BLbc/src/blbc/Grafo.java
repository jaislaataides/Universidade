package blbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JTextField;

public class Grafo extends Vertice{
    //atributos
    private List<Vertice> grafo = new ArrayList<>();
    private Vertice primeiro;
    private Vertice ultimo;
    private int comprimento_do_caminho;  

    //métodos
    public void adicionaVertice(Vertice vertice) {
        grafo.add(vertice);
    }
    
    public void setPrimeiro(Vertice v) {
        primeiro = v;
    }
    
    public void setUltimo(Vertice v) {
        ultimo = v;
    }

    public Vertice getPrimeiro() {
        return primeiro;
    }

    public Vertice getUltimo() {
        return ultimo;
    }

    public int getComprimento_do_caminho() {
        return comprimento_do_caminho;
    }
    
    public void limpaGrafo() {
        grafo.clear();
    }
    
    public List<Vertice> getGrafo() {
        return grafo;
    }
    
    //MÉTODO validade: verifica se a matriz foi preenchida corretamente, 
    //de modo que as arestas devem estar condizendo entre linha e coluna de cada vértice
    public boolean validade(JTextField[][] matriz, int tam) {  
        int[] celula = new int[2];
        
        for (int i = 1; i < tam; i++) {
            for(int j = 1; j < tam; j++) {
                celula[0] = Integer.parseInt(matriz[i][j].getText());
                celula[1] = Integer.parseInt(matriz[j][i].getText());
                
                if(celula[0] != celula[1]){
                    return false;
                }
            }
        } 
        return true;
    }
    
    //MÉTODO bl : Rotula λ dos vertices.
    //descrição do método: coloca o vertice de início na lista, coloca como visitado,
    //incrementa λ quando necessário e adiciona os vizinhos na lista com λ incrementado.
    public void bl(Vertice inicio) {
        List<Vertice> lista = new ArrayList<>();
        int lambda = 1;
        int temp;
        
        //seta todos os vértices como não visitados e seu grau como 999
        for(Vertice v : grafo) {
            v.setVisited(false);
            v.setLambda(999);
        }
        
        //adiciona o primeiro vertice na lista e coloca seu grau como 0
        lista.add(inicio);
        inicio.setLambda(0);
        
        //analisa cada Vertice da lista
        for(int i = 0; i < lista.size(); i++) {
            lista.get(i).setVisited(true);
                
                for(Vertice vertice : lista.get(i).getVizinhos()) {
                    temp = vertice.getLambda();
                    
                    //compara se o vértice já teve um grau menor e não foi visitado
                    if(!vertice.isVisited() && temp > lambda){
                        //atribui grau λ + 1
                        vertice.setLambda(lista.get(i).getLambda()+1);
                        //adiciona os vértices vizinhos ao analisado na lista
                        lista.add(vertice);
                    }
                }
            //incrementa o grau de distância
            lambda++;
        }
        lista.clear();
    }
    
    //MÉTODO numeroDeCaminhos : calcula o número de caminhos com backtracking
    //detalhes da implementação : esquema de passos apresentados no material da disciplina
    public int numeroDeCaminhos(Vertice inicio, Vertice fim) {
        //chama o método que rotula os vértices por proximidade do inicial (lambda)
        bl(inicio);
        
        //inicia TODOS os vértices com mi = 0
        for(Vertice v : grafo) {
            v.setMi(0);
        }

        //passo 1: inicia o vértice final com mi valendo 1 e os de mesmo grau valendo 0 (ordem inversa)
        fim.setMi(1);
        
        //passo 2 e 3 : analisa os vértices no sentido contrário da busca inicial(backtracking) e rotula seus respectivos mi's
        for(int i = fim.getLambda(); i >= 0; i--) {
            for(Vertice v : grafo) {
                //encontra os vértices do grafo que satisfazem as condições quanto a lambda = i - 1
                if(v.getLambda() == i - 1) {
                    for(Vertice u : v.getVizinhos()) {
                        //dentre os encontrados, encontra os vértices que têm adjacência com os que satisfazem a condição lambda = i
                        if(u.getLambda() == i) {
                            //realiza o somatório do rótulo mi
                            v.increaseMi(u.getMi());
                        }
                    }
                }
            }
        }

        comprimento_do_caminho = fim.getLambda();
        
        //retorna o numero de caminhos
        return inicio.getMi();
    }
    
    //MÉTODO  : obterCaminhosMaisCurtos
    //descrição do método : utiliza os rótulos para maipular loops e obter caminhos diferentes que, a princípio,
    //ficam armazenados em uma pilha para serem desempilhados em um arraylist.
    public String obterCaminhosMaisCurtos(Vertice inicio, Vertice fim) {
        List<Vertice>[] caminho = new ArrayList[inicio.getMi()];
        Stack<Vertice> pilha = new Stack();
        String mensagem;
        boolean encontrado;
        
        for(Vertice v : grafo) {
            v.setVisited(false);
        }
        
        for(int i = 0; i < inicio.getMi(); i++) {
            pilha.add(fim);
        
            for(int j = pilha.peek().getLambda() - 1; j > 0; j--) {
                encontrado = false;

                for(Vertice v : pilha.peek().getVizinhos()) {
                    if(v.getLambda() == j && !encontrado && !v.isVisited()) {
                        pilha.add(v);
                        v.setVisited(true);
                        encontrado = true;
                    }
                }
            }
            
            pilha.add(inicio);

            caminho[i] = new ArrayList<>();
            
            while(!pilha.empty()) {
                caminho[i].add(pilha.peek());
                pilha.pop();
            }
        }
        
        
        //manipula a string a ser retornada pela função
        mensagem = "        ⋮⋮         ";
        
        for(int i = 0; i < inicio.getMi(); i++) {
            mensagem += "caminho  "+(i+1)+"  :  ";
            for(Vertice v : caminho[i]) {
                mensagem += v.getNome()+"  ";
            }
            if(i != inicio.getMi() -1) mensagem += "   -  ";
        }

        return mensagem;
    }
    
    public String mostraCaminhoMaisCurto(Vertice inicio, Vertice fim) {
        if(inicio == fim) {
            return "RESULTADO   :   \nOs vértices selecionados são o mesmo, por isso, o caminho mais curto é de 0 arestas.";
        }else if (numeroDeCaminhos(inicio, fim) == 0 && getComprimento_do_caminho() == 999){
            return "RESULTADO   :   \nNão há caminho mais curto entre "+inicio.getNome()+" e "+fim.getNome()+". Isso significa que o grafo é desconexo.";
        }else if(numeroDeCaminhos(inicio, fim) == 1 && getComprimento_do_caminho() == 1) {
            return "RESULTADO   :   \nHá "+numeroDeCaminhos(inicio, fim)+" caminho mais curto entre "+inicio.getNome()+" e "+fim.getNome()+", ele tem "+getComprimento_do_caminho()+" aresta de comprimento.";   
        }else if(numeroDeCaminhos(inicio, fim) == 1){
            return "RESULTADO   :   \nHá "+numeroDeCaminhos(inicio, fim)+" caminho mais curto entre "+inicio.getNome()+" e "+fim.getNome()+", ele tem "+getComprimento_do_caminho()+" arestas de comprimento.";
        }else{
            return "RESULTADO   :   \nHá "+numeroDeCaminhos(inicio, fim)+" caminhos mais curtos entre "+inicio.getNome()+" e "+fim.getNome()+", eles têm "+getComprimento_do_caminho()+" arestas de comprimento.";
        }
    }
    //feito por jaislaataidess
}