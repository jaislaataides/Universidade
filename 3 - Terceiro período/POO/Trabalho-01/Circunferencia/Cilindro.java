package circunferencia;

public class Cilindro extends Circunferencia{
    
    //atributos
    private int altura;
    
    //métodos
    Cilindro() {
        this(1, 1);
    }
    Cilindro(int raio, int altura) {
        this.altura = altura;
        super.setRaio(raio);
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    @Override
    public void setRaio(int raio) {
        super.setRaio(raio);
    }
    
    @Override
    public int getRaio() {
        return super.getRaio();
    }
    
    public int getAltura() {
        return altura;
    }
    
    @Override
    public double getArea() {
        return super.getArea();
    }
    
    public double getVolume() {
        return (getArea()*getAltura());
    }
    
    @Override
    public String toString() {
        return (" { raio: "+getRaio()+" -- altura: "+getAltura()+" -- volume: "+String.format("%.2f",getVolume())+" }");
    }
}