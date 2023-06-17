package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import model.Moradia;
import model.Apto;
import model.Casa;

/**
 *
 * @author jaiss
 */
public class DesenhoGrafico extends JComponent implements Runnable{
    //atributos
    private final Moradia moradia;
    private int px = 0;
    private final int py = 50;
    private final int width;
    private String palavra;

    //métodos
    public DesenhoGrafico(Casa casa, int width, String complemento) {
        moradia = casa;
        this.width = width;
        this.moradia.setTipoMoradia(moradia.getTipoMoradia()+complemento);
        this.palavra = "casa" + complemento;
        
        new Thread(this).start();
    }
    
    public DesenhoGrafico(Apto apto, int width, String complemento) {
        moradia = apto;
        this.width = width;
        this.moradia.setTipoMoradia(moradia.getTipoMoradia()+complemento);
        this.palavra = "apto" + complemento;
        
        new Thread(this).start();
    }
    
    private Color getColor() {
        return switch (moradia.getValorMoradia()) {
            case 0 -> Color.RED;
            case 1 -> Color.BLUE;
            default -> Color.GREEN;
        };
    }
    
    private int getFontSize() {
        return switch (moradia.getTamanhoMoradia()) {
            case 0 -> 14;
            case 1 -> 16;
            default -> 18;
        };
    }
    
    private void move(){
        px++;
        
        if(px == width)
            px = 0;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("Serif", Font.BOLD, getFontSize()));
        g.setColor(getColor());
        g.drawString(palavra, px, py);
    }
    
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                System.out.println("Erro na Thread!");
            }
            move();
            repaint();
        }
    }
    
}
