package classes;

public class Agendamento {
    //atributos
    //delegados
    private Disciplina disciplina = new Disciplina();
    private Data data = new Data();
    
    //nativos
    private final String tipos[] = {"atividade", "seminario", "prova", "outro"};
    private String tipo;
    private int index;
    private int codigo;
    private static int ultimoCodigo = (Disciplina.getCodigoStatic()*100) + 1;
    
    
    //métodos
    //builders
    public Agendamento(String nome, String professor) {
        disciplina.setNome(nome);
        disciplina.setProfessor(professor);
    }
    
    public Agendamento(String nome, String professor, int dia) {
        disciplina.setNome(nome);
        disciplina.setProfessor(professor);
        data.setData(dia);
    }
    
    public Agendamento(String nome, String professor, int dia, int mes) {
        disciplina.setNome(nome);
        disciplina.setProfessor(professor);
        data.setData(dia, mes);
    }
    
    public Agendamento(String nome, String professor, int dia, int mes, int ano) {
        disciplina.setNome(nome);
        disciplina.setProfessor(professor);
        data.setData(dia, mes);
    }
    
    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setCodigo() {
        setCodigo(ultimoCodigo + 1);
    }
    
    public void setData(int dia) {
        data.setData(dia);
    }
    
    public void setData(int dia, int mes) {
        data.setData(dia, mes);
    }
    
    public void setDisciplina(String nome) {
        disciplina.setNome(nome);
    }
    
    public void setDisciplina(String nome, String professor) {
        disciplina.setNome(nome);
        disciplina.setProfessor(professor);
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setTipo(int i) {
        if(i >= 0 && i < tipos.length) {
            tipo = tipos[i];
        }else{
            setTipo("indefinido");
        }
    }
    
    //getters
    public Data getData() {
        return data;
    }
    
    public Disciplina getDisciplina () {
        return disciplina;
    }
    
    public int getDia() {
        return data.getDia();
    }
    
    public int getMes() {
        return data.getMes();
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public int getTipoIndex() {
        return index;
    }
    
    //toString
    @Override
    public String toString() {
        return ("Atividade : "+getCodigo()+"\nTipo : "+getTipo()+"\n"+data.toString()+"\nDisciplina : "+disciplina.getNome());
    }
}