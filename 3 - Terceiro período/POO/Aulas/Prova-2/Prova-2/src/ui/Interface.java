package ui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import model.Moradia;
import model.Apto;
import model.Casa;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jaiss
 */
public class Interface extends JFrame {

    //atributos
    private Moradia moradia = new Casa(0, 0, 0);
    private Casa casa = null;
    private Apto apto = null;
    private DesenhoGrafico desenho = new DesenhoGrafico(new Casa(0, 500, 0), 0, " ");

    private final String[] tiposDeEndereco = {"Residencial", "Comercial"};
    private final String[] tipos = {"Casa", "Apto"};
    private final String[] tamanhos = {"pequena", "média","grande"};
    private final String[] valores = {"baixo", "médio", "alto"};

    private int index_moradia, index_Tipo, index_Tamanho, index_Valor;

    private final javax.swing.JComboBox<String> cbMoradia, cbTipo, cbTamanho, cbValor;
    private final JLabel lbMoradia, lbTipo, lbTamanho, lbValor;
    private final JButton botao;
    private final JPanel[] painel;

    public Interface() {
        painel = new JPanel[6];

        for (int i = 0; i < 6; i++) {
            painel[i] = new JPanel();
        }

        lbMoradia = new JLabel();
        lbMoradia.setText("Tipo de Moradia");

        lbTipo = new JLabel();
        lbMoradia.setText("Tipo de Endereco");

        lbTamanho = new JLabel();
        lbMoradia.setText("Tamanho da Moradia");

        lbValor = new JLabel();
        lbMoradia.setText("Valor da Moradia");

        cbMoradia = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        cbTamanho = new javax.swing.JComboBox<>();
        cbValor = new javax.swing.JComboBox<>();

        cbMoradia.setModel(new javax.swing.DefaultComboBoxModel<>(tipos));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(tiposDeEndereco));
        cbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(tamanhos));
        cbValor.setModel(new javax.swing.DefaultComboBoxModel<>(valores));

        botao = new JButton();
        botao.addActionListener((java.awt.event.ActionEvent evt) -> {
            index_moradia = cbMoradia.getSelectedIndex();
            index_Tipo = cbTipo.getSelectedIndex();
            index_Tamanho = cbTamanho.getSelectedIndex();
            index_Valor = cbValor.getSelectedIndex();

            desenho = null;
            
            if (index_moradia == 0) {
                casa = new Casa(index_moradia, index_Tamanho, index_Valor);
                desenho = new DesenhoGrafico(casa, 500, getComplemento());
            } else {
                apto = new Apto(index_moradia, index_Tamanho, index_Valor);
                desenho = new DesenhoGrafico(apto, 500, getComplemento());
            }
        });
        botao.setText("Atualiza desenho");

        painel[0].add(lbMoradia);
        painel[0].add(cbMoradia);
        painel[0].setLayout(new GridLayout(2, 1));

        painel[1].add(lbTipo);
        painel[1].add(cbTipo);
        painel[1].setLayout(new GridLayout(2, 1));

        painel[2].add(lbTamanho);
        painel[2].add(cbTamanho);
        painel[2].setLayout(new GridLayout(2, 1));

        painel[3].add(lbValor);
        painel[3].add(cbValor);
        painel[3].setLayout(new GridLayout(2, 1));

        painel[4].add(botao);
        painel[4].setLayout(new FlowLayout());
        
        painel[5].add(desenho);
        painel[5].setLayout(new GridLayout(1,1));

        for (int i = 0; i < 6; i++) {
            this.add(painel[i]);
        }

        this.setLayout(new GridLayout(6, 1));

        this.setTitle("Prova-2");
        this.setSize(500, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private String getComplemento() {
        return switch (index_Tipo) {
            case 1 ->
                "=>C";
            case 0 ->
                "=>R";
            default ->
                " ";
        };
    }
}
