package blb;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JTextField;

public class Grafo {
    //atributos
    private final List<Vertice> grafo;
    private Vertice inicio;
    private Vertice fim;
    
    //métodos
    public Grafo() {
        this.grafo = new ArrayList<>();
    }

    public Vertice getInicio() {
        return inicio;
    }

    public Vertice getFim() {
        return fim;
    }

    public void setInicio(Vertice inicio) {
        this.inicio = inicio;
    }

    public void setFim(Vertice fim) {
        this.fim = fim;
    }
    
    public void adicionaVertice(Vertice vertice) {
        grafo.add(vertice);
    }
    
    //MÉTODO validade: verifica se a matriz foi preenchida corretamente.
    //descrição do método : compara os textos campos em que se deve haver equivalência (matriz[i][j], matriz[j][i])
    //na tabela de adjacência e retorna false caso o preenchimento não corresponda a uma matriz satisfatível.
    //OBS : por comparar string e não inteiros: 001 != 01 != 1 e etc.
    public boolean validade(JTextField[][] matriz, int tam) {  
        for (int i = 1; i < tam; i++) {
            for(int j = 1; j < tam; j++) {
                if(!matriz[i][j].getText().equals(matriz[j][i].getText())){
                    return false;
                }
            }
        } 
        return true;
    }
    
    //MÉTODO bl : Rotula λ dos vertices.
    //descrição do método: coloca cada vértice na lista, coloca como visitado,
    //incrementa λ quando necessário e adiciona os vizinhos na lista com λ incremenado.
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
    
    //MÉTODO backtracking : utiliza lambda para reconstruir o caminho no sentido inverso.
    //descrição do método : busca o vértice final e, a partir dele, encontra elementos do caminho por meio do rótulo. 
    //Além disso, retorna uma string com o nome de cada vértice sinalizado como parte do caminho.
    public String[] backtracking(Vertice inicio, Vertice fim) {
        Stack<Vertice> pilha = new Stack<>();
        String[] caminho;
        boolean encontrado;
        int i;
        
        //rotula os vértices por meio da busca em largura
        bl(inicio);
        
        //adiciona os vértices em uma pilha para ter a ordem invertida mais tarde
        pilha.add(fim);
        
        //utiliza o último vértice para encontrar seu anterior, repetidamente, de modo que chegue até o inicial.
        for(i = pilha.peek().getLambda() - 1; i >= 0; i--) {
            encontrado = false;
                        
            for(Vertice v : pilha.peek().getVizinhos()){
                if(v.getLambda() == i && !encontrado){
                    pilha.add(v);
                    encontrado = true;
                }
            }
        }
        
        caminho = new String[pilha.size()];

        //desmonta a pilha e salva o nome dos vértices na ordem correta
        i = 0;
        while(!pilha.empty()) {
            caminho[i] = pilha.peek().getNome();
            pilha.pop();
            i++;
        }
        
        return caminho;
    }
    
    //MÉTODO mostraCaminhoMaisCurto : retorna mensagem com informações sobre um caminho mais curto entre dois vértices
    //descrição do método : utiliza um array de string (retorno do método backtracking) para gerar a mensagem com os 
    //nomes dos vértices que compõem um caminho mais curto entre dois vértices.
    public String mostraCaminhoMaisCurto(Vertice inicio, Vertice fim, String s, String e) {
        String mensagem;
        String[] caminho = backtracking(inicio, fim);
        
        if(inicio == fim) {
            mensagem = "RESULTADO   :   \nOs vértices selecionados são o mesmo, por isso, o caminho mais curto é de 0 arestas.";
            
        } else if(fim.getLambda() == 0) {
            mensagem = "RESULTADO   :   não há caminho mais curto entre "+inicio.getNome()+" e "+fim.getNome()+".";
            
        }else{
            mensagem = "RESULTADO   :   Um caminho mais curto desse grafo tem "+fim.getLambda()+" arestas e é dado por : ";
            
            for (String caminho1 : caminho) {
                mensagem += caminho1;
                mensagem += ", ";
            }
        }
        return mensagem;
    }
    //feito por jaislaataides
}