package data;

import java.util.Random;
import javax.swing.JOptionPane;

public class Data {
    //atributos 
    private int dia;
    private int mes;
    private int ano;
    
    Random random = new Random();
    
    //métodos
    Data() {
        this.dia = random.nextInt(28);
        this.mes = random.nextInt(12);
        this.ano = random.nextInt(2022);
    }
    
    Data(int dia, int mes) {
        this(dia, mes, 2022);
    }
    
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String displayData() { 
        return (getDia()+"/"+getMes()+"/"+getAno());
    }
    
    public static int validaDia() {
        //a validação não é a mais acurada possível pois desassociei o dia do mês
        int dia;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Insira um dia válido: "));
        
        for(;;){
            if(dia <= 31 && dia > 0){
                return dia;
            }

            dia = Integer.parseInt(JOptionPane.showInputDialog("O dia que você digitou não é válido, digite novamente: ")); 
        }
    }
    
    public static int validaMes() {
        int mes;
        mes = Integer.parseInt(JOptionPane.showInputDialog("Insira um mês válido: "));
        
        for(;;){
            if (mes > 0 && mes < 13) {
                return mes;
            }
            mes = Integer.parseInt(JOptionPane.showInputDialog("O mês que você digitou não é válido, digite novamente: ")); 
        }
    }
    
}
