package semaforo;

import javax.swing.JOptionPane;

public class Cruzamento {
    
    //atributos
    private final Semaforo semaforo_01 = new Semaforo();
    private final Semaforo semaforo_02 = new Semaforo();
    private int segundos = 0;
    
    //métodos
    public void setTempoAberto(long tempo_aberto) {
        semaforo_01.setTempoAberto(tempo_aberto);
    }
    
    public void setTempoAberto() {
        semaforo_01.setTempoAberto();
    }
    
    public void setTempoFechado(long tempo_fechado) {
        semaforo_02.setTempoFechado(tempo_fechado);
    }
    
    public void setTempoFechado() {
        semaforo_02.setTempoFechado();
    }
    
    public void Sincroniza() throws InterruptedException {
        semaforo_01.setTempoAberto(10);
        semaforo_01.setTempoFechado(13);
        
        for (;;) {
            if (segundos == (semaforo_01.getTempoFechado()*2)){
                segundos =0;
            }
            
            if(segundos == 0){
                semaforo_01.abre();
                semaforo_02.fecha();
                JOptionPane.showMessageDialog(null, "\n"+segundos+" seg \n"+"Semáforo 1: "+semaforo_01.getSinal()+"\nSemáforo 2: "+semaforo_02.getSinal());               
            }
            
            if(segundos == (semaforo_01.getTempoAberto())){
                semaforo_01.alerta();
                JOptionPane.showMessageDialog(null, "\n"+segundos+" seg \n"+"Semáforo 1: "+semaforo_01.getSinal()+"\nSemáforo 2: "+semaforo_02.getSinal());      
            }
            
            if (segundos == (semaforo_01.getTempoFechado())){
                semaforo_01.fecha();
                semaforo_02.abre();
                JOptionPane.showMessageDialog(null, "\n"+segundos+" seg \n"+"Semáforo 1: "+semaforo_01.getSinal()+"\nSemáforo 2: "+semaforo_02.getSinal());      
            }
            
            if(segundos == (semaforo_01.getTempoAberto()+semaforo_01.getTempoFechado())){
                semaforo_02.alerta();
                JOptionPane.showMessageDialog(null, "\n"+segundos+" seg \n"+"Semáforo 1: "+semaforo_01.getSinal()+"\nSemáforo 2: "+semaforo_02.getSinal());      
            }
                
            Thread.sleep(1000);
            segundos++;
        }  
    }
}

