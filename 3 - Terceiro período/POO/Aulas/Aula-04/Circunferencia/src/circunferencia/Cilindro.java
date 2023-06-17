package circunferencia;

public class Cilindro {
    
    //atributos
    private Circunferencia circulo;
    private int altura;
    
    //métodos
    Cilindro(Circunferencia circulo, int altura) {
        this.altura = altura;
        this.circulo = circulo;
    }
    
    public Circunferencia getCirculo() {
        return circulo;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setCirculo(Circunferencia circulo) {
        this.circulo = circulo;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public double getVolume() {
        return (circulo.getArea()*getAltura());
    }
    
    @Override
    public String toString() {
        return ("Cilindro -- raio: "+circulo.getRaio()+" -- altura: "+altura+" -- volume: "+String.format("%.2f",getVolume()));
    }
}
