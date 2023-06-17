package circunferencia;

public class Main {

    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia(2);
        System.out.println(circulo);  
        
        Cilindro cilindro_01 = new Cilindro(circulo, 3);
        System.out.print(cilindro_01);
    }
    
}
