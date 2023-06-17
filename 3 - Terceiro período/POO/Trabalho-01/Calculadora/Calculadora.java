package calculadora;

public abstract class Calculadora {
    
    //atributos
    protected double numero_1;
    protected double numero_2;
    
    //métodos
    public double getSoma() {
        return (numero_1 + numero_2);
    }
    
    public double getSubtracao() {
        return (numero_1 - numero_2);
    }
}
