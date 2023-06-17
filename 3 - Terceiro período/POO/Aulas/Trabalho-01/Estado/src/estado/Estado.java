package estado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estado {
    //atributos
    private String nome;
    private String capital;
    private double area;
    private ArrayList<String> divisa = new ArrayList<>();
    
    //métodos
    Estado() {
        this("vazio","vazio",0);
    }
    
    Estado(String nome, String capital, double area) {
        this.nome = nome;
        this.capital = capital;
        this.area = area;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCapital() {
        return capital;
    }
    
    public double getArea() {
        return area;
    }
    
    public ArrayList<String> getDivisa(){
        return divisa;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public void setDivisa() {
        int estados;

        estados = Integer.parseInt(JOptionPane.showInputDialog("Quantos estados fazem divisa com "+getNome()+"?"));
        divisa = new ArrayList(estados);
        
        for (int i = 0; i < estados; i++) {
            divisa.add(i, JOptionPane.showInputDialog("Estado "+((int)i+1)+":"));
        }
    }
    
    public void setDivisa(String estado) {
        divisa.add(estado);
    }
    
    public boolean equals(final Estado outro) {
        return (nome.equals(outro.getNome()) && capital.equals(outro.getCapital()));
    } 
    
    public ArrayList<String> getDivisaComum(final Estado outro) {
        ArrayList<String> divisa_comum = new ArrayList<>();
        
        for (String estado : divisa) {
            for (String estado2 : outro.getDivisa()) {
                if(estado.equals(estado2)){
                    divisa_comum.add(estado);
                }
            }
        }
        return divisa_comum; 
    }
    
    @Override
    public String toString() {
        return ("O estado "+getNome()+", cuja capital e "+getCapital()+", tem "+getArea()+" m2 e faz divisa com: "+getDivisa());
    }
}