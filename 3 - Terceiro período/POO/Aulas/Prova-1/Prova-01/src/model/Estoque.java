package model;

public class Estoque {
    //atributos
    private Produto produto = new Produto();
    private int quantidade;
    
    //métodos
    //builders
    public Estoque(int quantidade) {
        this.quantidade = quantidade;
    }
    public Estoque(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    //getters
    public Produto getProduto(){
        return produto;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    //setters
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public void setDescricaoProduto(String descricao) {
        produto.setDescricao(descricao);
    }
    
    public void setValorProduto(float valor) {
        produto.setValor(valor);
    }
    
    public void setProduto(Fornecedor fornecedor) {
        produto.setFornecedor(fornecedor);
    }
    
    //toString
    @Override
    public String toString() {
        return("Estoque\n "+produto.toString()+"\nQuantidade: "+getQuantidade());
    }
}
