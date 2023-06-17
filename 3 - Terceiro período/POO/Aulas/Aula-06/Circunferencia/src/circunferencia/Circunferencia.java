package circunferencia;

public class Circunferencia {
    
    //atributos
    private int raio;
    
    //método
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
