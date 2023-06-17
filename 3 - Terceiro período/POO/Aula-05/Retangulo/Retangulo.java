package retangulo;

public class Retangulo {
    
    //atributos
    protected int base, altura;
    
    //métodos
    Retangulo() {
        this(0,0);
    }
    
    Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void setAltura(int altura) {
       this.altura = altura; 
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public int getBase() {
        return base;
    }
    
    public int getArea() {
        return base * altura;
    }
    
    @Override
    public String toString() {
        return("Retangulo - base: "+base+" altura: "+altura+" area: "+getArea());
    }
}
