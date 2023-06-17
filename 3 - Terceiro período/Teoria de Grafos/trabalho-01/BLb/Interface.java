package blb;

import java.awt.FlowLayout;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Interface extends JFrame implements MouseListener{
    //atributos
    //-- constantes --
    private final String[] letra = {" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private final String[] vertices;
    private static int linhas;
    private String entrada;
    
    //grafo
    private Grafo grafo;
    private Vertice[] vertice;
    
    //tela
    private final JTextField[][] campo;
    private final JPanel[] painel;
    private final JButton botao;
    private final JLabel lbTitulo, lbComando, lbResultado, lbInicio, lbFim;
    private final javax.swing.JComboBox<String> cbInicio, cbFim;
    
    //métodos
    // ------ TELA -------
    public Interface() {
        //atributos       
        entrada = JOptionPane.showInputDialog(null,"Quantos vértices tem esse grafo?");
        if(entrada == null) entrada = "1";
        linhas = Integer.parseInt(entrada) + 1;
        if(linhas > 27) linhas = 27;
        
        //instâncias
        campo = new JTextField[linhas][linhas];
        painel = new JPanel[11];
        
        for(int i = 0; i < 11; i++) {
            painel[i] = new JPanel();
        }
        
        //painel[0] = titulo e comando                    ||| painel[1] = painel com os 5 sequentes
        //painel[2] = painel vazio à esquerda             ||| painel[3] = tabela 
        //painel[4] = painel vazio à direita da tabela    ||| painel[5] = comandos e combobox
        //painel[6] = painel vazio à direita da combobox  ||| painel[7] = painel do botao
        //painel[8] = painel do resultado                 
        
        botao = new JButton();
        
        lbTitulo = new JLabel();
        lbComando = new JLabel(); 
        lbInicio =  new JLabel();
        lbFim = new JLabel();
        lbResultado = new JLabel();
        
        cbInicio = new javax.swing.JComboBox<>();
        cbFim = new javax.swing.JComboBox<>();
        
        
        //criação do array de vertices para uso na combobox
        vertices = new String[linhas-1];
        for (int i = 0; i < linhas-1; i++) {
            vertices[i] = letra[i+1];
        }
        
        //manipulações
        //criação do modelo usado na combobox
        cbInicio.setModel(new javax.swing.DefaultComboBoxModel<>(vertices));
        cbFim.setModel(new javax.swing.DefaultComboBoxModel<>(vertices));
        
        lbTitulo.setText("Busca em largura com backtracking");
        lbTitulo.setFont(new Font("Times new Roman", Font.BOLD, 25));
        lbTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        painel[0].add(lbTitulo); 
        painel[0].setLayout(new GridLayout(2, 1));
        
        lbComando.setText("Preencha a tabela de adjacência abaixo");
        lbComando.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        painel[0].add(lbComando);
        
        for (int i = 2; i < 7; i++) {
            painel[1].add(painel[i]);
        }
        
        painel[1].setLayout(new GridLayout(1, 5));
        
        painel[3].setLayout(new GridLayout(linhas, linhas));
        
        lbResultado.setText(" ");
        
        lbInicio.setText("Selecione o vértice de início:");
        painel[5].add(lbInicio);
        painel[5].add(cbInicio);
        lbFim.setText("Selecione o vértice final");
        painel[5].add(lbFim);
        painel[5].add(cbFim);
        painel[5].setLayout(new GridLayout(4, 4));
        
        botao.setText("Calcular caminho mais curto");
        botao.addMouseListener(this);
        painel[7].add(botao);
        painel[7].setLayout(new FlowLayout());
        
        painel[8].add(lbResultado);
        painel[8].setLayout(new FlowLayout());
        
        this.add(painel[0]);
        this.add(painel[1]);
        this.add(painel[7]);
        this.add(painel[8]);
        
        this.setLayout(new GridLayout(4, 1));

        //coloca os campos de texto da tabela de adjacência na tabela
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < linhas; j++){
                campo[i][j] = new JTextField();
                painel[3].add(campo[i][j]);
            }
        }

        //coloca a primeira linha e a primeira coluna como índices (letras) e inabilita a edição
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < linhas; j++) {
                campo[i][j].setHorizontalAlignment(javax.swing.JTextField.CENTER);
                
                if(j == 0) {
                    campo[i][j].setText(letra[i]);
                    campo[i][j].setEditable(false);
                    campo[j][i].setText(letra[i]);
                    campo[j][i].setEditable(false);
                }
            }
        }
        
        //padronização da janela
        this.setTitle("BLb");
        this.setSize(1200, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    //MÉTODO mouseClicked : dispara as funcionalidades e atribuições quando o botão é clicado
    @Override
    public void mouseClicked(MouseEvent e) {
        int aux;
        grafo = new Grafo();
        vertice = new Vertice[linhas-1];
        
        if (grafo.validade(campo, linhas)){
            //loop que cria os vertices e adiciona ao grafo
            for(int i = 0; i < linhas - 1; i++) {
                vertice[i] = new Vertice();
                vertice[i].setNome(letra[i + 1]);
                grafo.adicionaVertice(vertice[i]);
            }
            
            //--anotações quanto a vertice e endereçamento na matriz
            //--vertice[0] = vértice A
            //--campo[1][1...n] = A
            //--campo[1..n] [1] = A
            
            //loop que adiciona as arestas de cada vertice
            //(na realidade adiciona os vértices vizinhos a uma lista, o que simula o sistema de arestas)
            for (int i = 1; i < linhas; i++) {
                for (int j = 1; j< linhas; j++) {
                    aux = Integer.parseInt(campo[i][j].getText());
                    if(aux > 0) {
                        vertice[i - 1].adicionaAresta(vertice[j - 1]);
                    }
                }
            }
            
            //atribui um vértice a s (start) e um a e(end), por meio do valor selecionado na combobox 
            grafo.setInicio(vertice[cbInicio.getSelectedIndex()]);
            grafo.setFim(vertice[cbFim.getSelectedIndex()]);
            
            //exibe o resultado no campo da interface
            lbResultado.setText(grafo.mostraCaminhoMaisCurto(grafo.getInicio(), grafo.getFim(), letra[cbInicio.getSelectedIndex() + 1], letra[cbFim.getSelectedIndex() + 1]));
        }
        else {
            //exibe mensagem caso a matriz não tenha sido preenchida de maneira correta
            lbResultado.setText("A matriz de adjacência não foi preenchida corretamente");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    //feito por jaislaataides
}