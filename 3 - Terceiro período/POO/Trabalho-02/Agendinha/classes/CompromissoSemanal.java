package classes;


public class CompromissoSemanal {
    //atributos
    //nativos
    private String nome;
    private String local;
    private String horario[] = {"M1", "M2", "M3", "M4", "T1", "T2", "T3", "T4", "T5", "T6"};
    private int horarioIndex;
    
    //métodos
    //builders
    public CompromissoSemanal() {
        nome = "indefinido";
        local = "indefinido";
        horarioIndex = -1;
    }
    
    public CompromissoSemanal(int index) {
        nome = "indefinido";
        local = "indefinido";
        horarioIndex = index;
    }
    
    public CompromissoSemanal(int index, String nome) {
        this.nome = nome;
        local = "indefinido";
        horarioIndex = index;
    }
    
    public CompromissoSemanal(int index, String nome, String local) {
        this.nome = nome;
        this.local = local;
        horarioIndex = index;
    }
    
    //setters
    public void setIndex(int index) {
        this.horarioIndex = index;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    //getters
    public int getHorarioIndex() {
        return horarioIndex;
    }
    
    public String getHorario() {
        return horario[horarioIndex];
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getLocal() {
        return local;
    }
    
    //toString
    @Override
    public String toString() {
        return ("   "+getNome()+"\n Local: "+getLocal());
    }
}
