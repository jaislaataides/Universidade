package classes;

import java.time.LocalDate;

public class Data {
    //atributos
    //delegados
    private final LocalDate hoje = LocalDate.now();
    
    //nativos
    private int dia;
    private int mes;
    private int ano;
    
    //métodos
    public Data() {
        this(1, 1);
    }
    public Data(int dia) {
        this.dia = dia;
        this.mes = hoje.getMonthValue();
        this.ano = hoje.getYear();
    }
    
    public Data(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.ano = hoje.getYear();
    }
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setData(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.ano = hoje.getDayOfMonth();
    }
    
    public void setData(int dia) {
        this.dia = dia;
        this.mes = hoje.getMonthValue();
        this.ano = hoje.getYear();
    }
    
    public void setDataToToday() {
        this.dia = hoje.getDayOfMonth();
        this.mes = hoje.getMonthValue();
        this.ano = hoje.getYear();
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
    
    public String getDiaSemanaHoje() {
        switch(hoje.getDayOfWeek()) {
            case SUNDAY -> {
                return ("Domingo");
            }
            
            case MONDAY -> {
                return ("Segunda - feira");
            }
                
            case TUESDAY -> {
                return ("Terça - feira");
            }
            
            case WEDNESDAY -> {
                return ("Quarta - feira");
            }
                
            case THURSDAY -> {
                return("Quinta - feira");
            }
            
            case FRIDAY -> {
                return ("Sexta - feira");
            }
            
            case SATURDAY -> {
                return ("Sábado");
            }
            default -> {
               return("?"); 
            }
        }
        
    }
    
    public int getIndexDiaSemanaHoje() {
        switch (getDiaSemanaHoje()){
            case "Domingo" -> {
                return 1;
            }
            case "Segunda - feira" -> {
                return 2;
            }
            case "Terça - feira" -> {
                return 3;
            }
            case "Quarta - feira" -> {
                return 4;
            }
            case "Quinta - feira" -> {
                return 5;
            }
            case "Sexta - feira" -> {
                return 6;
            }
            case "Sábado" -> {
                return 7;
            }
            default -> {
                return 0;
            }
        }
    }
    
    
     
     @Override
    public String toString() {
        return "Data: "+getDia()+"/"+getMes()+"/"+getAno();
    }
}
