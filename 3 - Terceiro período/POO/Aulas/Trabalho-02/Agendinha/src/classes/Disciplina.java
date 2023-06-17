package classes;

public class Disciplina {
    //atributos
    private String nome;
    private String professor;
    private int codigo;
    private static int ultimoCodigo = 0;
    
    //métodos
    //builders
    public Disciplina() {
        this.professor = "profesor";
        this.nome = "nome";
    }
    public Disciplina(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
    }
    
    public Disciplina(String nome, String professor, int codigo) {
        this.nome = nome;
        this.professor = professor;
        this.codigo = codigo;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
    public void setCodigo() {
        setCodigo(ultimoCodigo+1);
    }
 
    //getters
    public String getNome() {
        return nome;
    }
    
    public String getProfessor() {
        return professor;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public static int getCodigoStatic() {
        return ultimoCodigo;
    }
   
    //toString
    @Override
    public String toString() {
        return ("Disciplina: "+getNome()+"\nProfessor(a): "+getProfessor()+"\nCodigo :"+getCodigo());
    }
}
