package circunferencia;

public abstract class Circunferencia {
    
    //atributos
    protected int raio;
    
    //método
    public int getRaio() {
        return raio;
    }
    
    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    protected double getArea() {
        return (Math.PI * Math.pow(raio, 2));
    }
}