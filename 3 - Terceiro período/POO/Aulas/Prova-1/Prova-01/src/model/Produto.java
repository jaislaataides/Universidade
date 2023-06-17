package model;

public class Produto {
    //atributos
    private String descricao;
    private float valor_custo;
    private Fornecedor fornecedor = new Fornecedor();
        
    //métodos
    //builders
    public Produto() {
        this(" ", 0);
    }
    
    public Produto(String descricao, float valor_custo) {
        this.descricao = descricao;
        this.valor_custo = valor_custo;
    }
    
    public Produto(String descricao, float valor_custo, Fornecedor fornecedor) {
        this.descricao = descricao;
        this.valor_custo =  valor_custo;
        this.fornecedor = fornecedor;
    }
    
    //getters
    public String getDescricao() {
        return descricao;
    }
    
    public float getValor() {
        return valor_custo;
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    
    //setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setValor(float valor_custo) {
        this.valor_custo = valor_custo;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public void setFornecedor(String nome, String email, String endereco) {
        fornecedor.setNomeFornecedor(nome);
        fornecedor.setEmailFornecedor(email);
        fornecedor.setEnderecoFornecedor(endereco);
    }
    
    //toString
    @Override
    public String toString() {
        return("Produto : "+getDescricao()+"\nValor: "+getValor()+"\n"+fornecedor.toString());
    }
}
