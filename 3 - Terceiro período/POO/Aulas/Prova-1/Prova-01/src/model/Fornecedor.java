package model;

public class Fornecedor {
    //atributos 
    private String nome;
    private String endereco;
    private String email;
    
    //métodos
    //builders
    public Fornecedor() {
        this("desconhecido", "desconhecido", "deconhecido");
    }
    public Fornecedor(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }
    
    //getters
    public String getNomeFornecedor() {
        return nome;
    }
    
    public String getEmailFornecedor() {
        return email;
    }
    
    public String getEnderecoFornecedor() {
        return endereco;
    }
    
    //setters
    public void setNomeFornecedor(String nome) {
        this.nome = nome;
    }
    
    public void setEmailFornecedor(String email) {
        this.email = email;
    }
    
    public void setEnderecoFornecedor(String endereco) {
        this.endereco = endereco;
    }
    
    //toString
    @Override
    public String toString() {
        return("Fornecedor: "+getNomeFornecedor()+"\nEmail: "+getEmailFornecedor()+"\nEndereco: "+getEnderecoFornecedor());
    }
}
