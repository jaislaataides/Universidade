package calculadora;

public class CalculadoraCompleta extends Calculadora {
    //atributos
    String operador;
    
    //métodos
    public void setNumero1(double numero_01) {
        super.numero_1 = numero_01;
    }
    
    public void setNumero2(double numero_02) {
        super.numero_2 = numero_02;
    }
    
    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    public double getNumero1() {
        return super.numero_1;
    }
    
    public double getNumero2() {
        return super.numero_2;
    }
    
    public String getOperador() {
        return operador;
    }
    
    @Override
    public double getSoma() {
        return super.getSoma();
    }
    
    @Override
    public double getSubtracao() {
        return super.getSubtracao();
    }    
    
    public double getMultiplicacao() {
        return (getNumero1() * getNumero2()); 
    }
    
    public double getDivisao() {
        return (getNumero1() / getNumero2());
    }
    
    public void calcula(double num1, String operador, double num2) {
        setNumero1(num1);
        setOperador(operador);
        setNumero2(num2);
    }
    
    public double getResultado() {
        return switch (getOperador()) {
            case "+" -> getSoma();
            case "-" -> getSubtracao();
            case "*" -> getMultiplicacao();
            case "/" -> getDivisao();
            default  -> 0;
        };
    }
    
    @Override
    public String toString() {
        return ("\n"+getNumero1()+" "+getOperador()+" "+getNumero2()+" = "+getResultado());
    }
}