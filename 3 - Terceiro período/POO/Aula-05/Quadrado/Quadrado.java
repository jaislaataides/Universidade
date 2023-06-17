package quadrado;

public class Quadrado {
    
    //atributos
    private float lado;
    
    //métodos
    Quadrado() {
        this.lado = 2;
    }
    
    Quadrado(float lado) {
        this.lado = lado;
    }
    
    public void setLado(float lado) {
        this.lado = lado;
    }
    
    public float getArea() {
        return lado*lado;
    }
    
    @Override
    public String toString() {
        return ("Quadrado - lado: "+lado+" u.c.  area: "+getArea()+" u.a.");
    } 
}
