package circunferencia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o raio, depois a altura do primeiro cilindro: ");
        
        Cilindro cilindro_01 = new Cilindro(scanner.nextInt(), scanner.nextInt());
        
        System.out.println("\nGerando um segundo cilindro sem entrada de raio ou altura...\n");
        
        Cilindro cilindro_02 = new Cilindro();
        
        System.out.println("Cilindro_01: "+cilindro_01);
        System.out.println("Cilindro_02: "+cilindro_02);
    }
}
