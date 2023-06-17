package data;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Data dataBase = new Data(Data.validaDia(), Data.validaMes(), (Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "))));
    
        JOptionPane.showMessageDialog(null, dataBase.displayData());
    }      
}
