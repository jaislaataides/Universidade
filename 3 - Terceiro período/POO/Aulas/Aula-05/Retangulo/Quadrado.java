package retangulo;

public class Quadrado extends Retangulo {
    
    //atributos importados da classe retângulo
    
    //métodos
    Quadrado() {
        this (0);
    }
    Quadrado(int lado) {
        super(lado,lado);
    }
    
    public void setLado(int lado) {
        super.setAltura(lado);
        super.setBase(lado);
    }
    
    public int getLado() {
        return super.getAltura();
    }
    
    @Override
    public String toString() {
        return("Quadrado - lado: "+base+" area: "+getArea());
    }
}
