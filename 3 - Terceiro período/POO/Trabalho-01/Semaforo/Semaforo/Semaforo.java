package semaforo;

public class Semaforo {
    
    //atributos
    protected String sinal;
    protected String tipo;
    private static long tempo_aberto;
    private static long tempo_fechado;

    //métodos
    Semaforo () {
        this(10,5);
    }

    Semaforo (long tempo_aberto, long tempo_fechado) {
        Semaforo.tempo_aberto = tempo_aberto;
        Semaforo.tempo_fechado = tempo_fechado;
    }

    public long getTempoAberto () {
        return tempo_aberto;
    }

    public long getTempoFechado() {
        return tempo_fechado;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getSinal() {
        return sinal;
    }

    public void setTempoFechado(long tempo_fechado) {
        Semaforo.tempo_fechado = tempo_fechado;
    }
    
    public void setTempoAberto(long tempo_aberto) {
        Semaforo.tempo_aberto = tempo_aberto;
    }
    
    public void setTempoAberto() {
        Semaforo.tempo_aberto = getTempoFechado() - 3;
    }
    
    public void setTempoFechado() {
        Semaforo.tempo_fechado = getTempoAberto() + 3;
    }

    public void setTipo() {
        if ("cores".equals(getTipo())) {
            tipo = "digital";
        }
        else {
            tipo = "cores";
        }
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public void abre() {
        sinal = "aberto";
    }

    public void fecha() {
        sinal = "fechado";
    }
    
    public void alerta() {
        sinal = "alerta";
    }

    public boolean estaAberto() {
        return "aberto".equals(getSinal());
    }

    public boolean estaFechado() {
        return "fechado".equals(getSinal());
    }

    @Override
    public String toString() {
        return ("O sinal esta "+getSinal()+", o tempo fechado e de "+getTempoFechado()+" e o tempo aberto e de "+getTempoAberto()+".");
    }
}