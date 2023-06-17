package classes;

public class Aula extends CompromissoSemanal{
    //atributos
    Disciplina disciplina; 
    
    //métodos
    //builders
    public Aula() {
        super();
        disciplina = new Disciplina();
    }
    
    public Aula(Disciplina disciplina, int index) {
        super(index, disciplina.getNome());
        this.disciplina = disciplina;
    }
    
    public Aula(Disciplina disciplina, String local,int index) {
        super(index, disciplina.getNome(), local);
        this.disciplina = disciplina;
    }
    
    //setters
    private void setNome(Disciplina disciplina){
        super.setNome(disciplina.getNome());
    }
    
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
        setNome(disciplina);
    }
    
    @Override
    public void setIndex(int index){
        super.setIndex(index);
    }
    
    @Override
    public void setLocal(String local) {
        super.setLocal(local);
    }
    
    //getters
    public int getCodigoDisciplina() {
        return disciplina.getCodigo();
    }
    
    public String getNomeDisciplina(){
        return disciplina.getNome();
    }
    
    public String getNomeProfessor() {
        return disciplina.getProfessor();
    }
    
    //toString
    @Override
    public String toString() {
        return (super.toString()+"\n"+disciplina.toString());
    }
}