package estado;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        Estado estado_01 = new Estado(JOptionPane.showInputDialog("Estado 1: "),JOptionPane.showInputDialog("Capital: "), Double.parseDouble(JOptionPane.showInputDialog("Dimensão (Em m2): ")));
        Estado estado_02 = new Estado(JOptionPane.showInputDialog("Estado 2: "),JOptionPane.showInputDialog("Capital: "), Double.parseDouble(JOptionPane.showInputDialog("Dimensão (em m2): ")));
    
        estado_01.setDivisa();
        
        estado_02.setDivisa();
        
        //toString
        JOptionPane.showMessageDialog(null,"Estado 1: "+estado_01);
        JOptionPane.showMessageDialog(null,"Estado 2: "+estado_02);
        
        //mostrar divisas
        //JOptionPane.showMessageDialog(null,"Estados que fazem divisa com "+estado_01.getNome()+": "+estado_01.getDivisa());
        //JOptionPane.showMessageDialog(null,"Estados que fazem divisa com "+estado_02.getNome()+": "+estado_02.getDivisa());
        
        //divisa comum
        JOptionPane.showMessageDialog(null, "Estados de divisa comum: "+estado_01.getDivisaComum(estado_02));
        
    }
}