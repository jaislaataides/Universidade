package View;

import DAO.EstoqueDAO;
import java.awt.event.ActionEvent;
import model.Estoque;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextField;

    public class Interface extends JFrame implements ActionListener {

        private JPanel pnTitulo, pnInserir, pnBotoes, pnTable;
        private JLabel lbTitulo, lbProduto, lbQuantidade;
        private JTextField tfQuantidade;
        private JComboBox cbProdutos;
        private JButton btSalvar, btExcluir;
        private JTable tbTabela;
        
        EstoqueDAO estoque = new EstoqueDAO();
        
        public Interface() {
            //
            lbTitulo = new JLabel("Controle de estoque - Lançamentos");
            lbProduto = new JLabel("Produto");
            lbQuantidade = new JLabel("Quantidade");
            
            tfQuantidade = new JTextField();
            
            btSalvar = new JButton("Salvar");
            btExcluir = new JButton("Excluir");
            
            cbProdutos = new JComboBox();
            for(Estoque produto : estoque.estoqueProdutos) {
                cbProdutos.addItem(produto);
            }

            //
            pnTitulo.add(lbTitulo);
            
            pnInserir.add(lbProduto);
            pnInserir.add(lbQuantidade);
            pnInserir.add(cbProdutos);
            pnInserir.add(tfQuantidade);
            
            pnBotoes.add(btSalvar);
            pnBotoes.add(btExcluir);
            
            pnTable.add(tbTabela);
            
            
            //criando tabela
            String [] colunas = {"Descricao", "Fornecedor", "Quantidade"};

            
            
            
            this.setTitle("Controle de estoque");

            this.setSize(550,100);

            this.setLocationRelativeTo(null);

            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            this.setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
