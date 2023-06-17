package circunferencia;

public class Circunferencia {
    
    //atributos
    protected int raio;
    
    //método
    Circunferencia() {
        this(1);
    }
    
    Circunferencia(int a) {
        this.raio = a;
    }

    public double getRaio() {
        return raio;
    }
    
    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public float getArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }
    
    @Override
    public String toString() {
        return ("Circunferencia - raio: "+getRaio()+" - area : "+getArea());
    }
    

}
