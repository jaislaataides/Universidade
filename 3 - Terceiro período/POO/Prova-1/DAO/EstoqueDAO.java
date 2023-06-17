package DAO;

import java.util.ArrayList;
import java.util.List;
import model.Estoque;
import model.Produto;


public class EstoqueDAO {
    //atributos
    public List<Estoque> estoqueProdutos = new ArrayList<>();
    
    //métodos
    public void InsereProduto(Estoque estoque){
        estoqueProdutos.add(estoque);
    }
    public void InsereProduto(Produto produto, int quantidade) {
        Estoque estoque = new Estoque(produto, quantidade);
        estoqueProdutos.add(estoque);
    }
  
    //TODO: métodos de exclusão
}
