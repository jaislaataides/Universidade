package Interfaces;

import classes.Data;
import classes.Agendamento;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
        
public class CalendarioMes extends javax.swing.JFrame {
    //atributos
    private int ano_fixo = 0;
    private int mes_fixo = 0;
    private int ano_altera = 0;
    private int mes_altera = 0;
    
    List<Agendamento> agendamentos = new ArrayList<>();

    //métodos
    public CalendarioMes() {
        initComponents();
        inicializaCalendario();
        geraCalendario();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        pnCalendario = new javax.swing.JPanel();
        selecao_mes = new javax.swing.JComboBox<>();
        selecao_ano = new javax.swing.JComboBox();
        pnSheet = new javax.swing.JPanel();
        lbDom = new javax.swing.JLabel();
        lbSeg = new javax.swing.JLabel();
        lbTer = new javax.swing.JLabel();
        lbQua = new javax.swing.JLabel();
        lbQui = new javax.swing.JLabel();
        lbSex = new javax.swing.JLabel();
        lbSab = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf15 = new javax.swing.JTextField();
        tf22 = new javax.swing.JTextField();
        tf29 = new javax.swing.JTextField();
        tf36 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        tf16 = new javax.swing.JTextField();
        tf23 = new javax.swing.JTextField();
        tf30 = new javax.swing.JTextField();
        tf37 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf10 = new javax.swing.JTextField();
        tf17 = new javax.swing.JTextField();
        tf24 = new javax.swing.JTextField();
        tf31 = new javax.swing.JTextField();
        tf38 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf11 = new javax.swing.JTextField();
        tf18 = new javax.swing.JTextField();
        tf25 = new javax.swing.JTextField();
        tf32 = new javax.swing.JTextField();
        tf39 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf19 = new javax.swing.JTextField();
        tf12 = new javax.swing.JTextField();
        tf26 = new javax.swing.JTextField();
        tf33 = new javax.swing.JTextField();
        tf40 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf13 = new javax.swing.JTextField();
        tf20 = new javax.swing.JTextField();
        tf27 = new javax.swing.JTextField();
        tf41 = new javax.swing.JTextField();
        tf34 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        tf14 = new javax.swing.JTextField();
        tf28 = new javax.swing.JTextField();
        tf21 = new javax.swing.JTextField();
        tf42 = new javax.swing.JTextField();
        tf35 = new javax.swing.JTextField();
        tfSaudacao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btVerHorario = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btAjuda = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setResizable(false);

        pnCalendario.setBackground(new java.awt.Color(255, 233, 233));
        pnCalendario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selecao_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        selecao_mes.setFocusable(false);
        selecao_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecao_mesActionPerformed(evt);
            }
        });

        selecao_ano.setEditable(true);
        selecao_ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecao_anoActionPerformed(evt);
            }
        });

        pnSheet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnSheet.setOpaque(false);

        lbDom.setText("DOM");

        lbSeg.setText(" SEG");

        lbTer.setText(" TER");

        lbQua.setText("QUA");
        lbQua.setMaximumSize(new java.awt.Dimension(29, 16));
        lbQua.setMinimumSize(new java.awt.Dimension(29, 16));

        lbQui.setText("  QUI");

        lbSex.setText(" SEX");

        lbSab.setText(" SAB");

        tf1.setEditable(false);
        tf1.setBackground(new java.awt.Color(255, 225, 225));
        tf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf1.setText("0");
        tf1.setBorder(null);
        tf1.setMinimumSize(new java.awt.Dimension(200, 20));
        tf1.setPreferredSize(new java.awt.Dimension(200, 20));
        tf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf1MousePressed(evt);
            }
        });
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        tf8.setEditable(false);
        tf8.setBackground(new java.awt.Color(255, 225, 225));
        tf8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf8.setText("0");
        tf8.setBorder(null);
        tf8.setMinimumSize(new java.awt.Dimension(200, 20));
        tf8.setPreferredSize(new java.awt.Dimension(200, 20));
        tf8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf8MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf8MousePressed(evt);
            }
        });
        tf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf8ActionPerformed(evt);
            }
        });

        tf15.setEditable(false);
        tf15.setBackground(new java.awt.Color(255, 225, 225));
        tf15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf15.setText("0");
        tf15.setBorder(null);
        tf15.setMinimumSize(new java.awt.Dimension(200, 20));
        tf15.setPreferredSize(new java.awt.Dimension(200, 20));
        tf15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf15MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf15MousePressed(evt);
            }
        });
        tf15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf15ActionPerformed(evt);
            }
        });

        tf22.setEditable(false);
        tf22.setBackground(new java.awt.Color(255, 225, 225));
        tf22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf22.setText("0");
        tf22.setBorder(null);
        tf22.setMinimumSize(new java.awt.Dimension(200, 20));
        tf22.setPreferredSize(new java.awt.Dimension(200, 20));
        tf22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf22MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf22MousePressed(evt);
            }
        });
        tf22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf22ActionPerformed(evt);
            }
        });

        tf29.setEditable(false);
        tf29.setBackground(new java.awt.Color(255, 225, 225));
        tf29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf29.setText("0");
        tf29.setBorder(null);
        tf29.setMinimumSize(new java.awt.Dimension(200, 20));
        tf29.setPreferredSize(new java.awt.Dimension(200, 20));
        tf29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf29MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf29MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf29MousePressed(evt);
            }
        });
        tf29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf29ActionPerformed(evt);
            }
        });

        tf36.setEditable(false);
        tf36.setBackground(new java.awt.Color(255, 225, 225));
        tf36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf36.setText("0");
        tf36.setBorder(null);
        tf36.setMinimumSize(new java.awt.Dimension(200, 20));
        tf36.setPreferredSize(new java.awt.Dimension(200, 20));
        tf36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf36MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf36MousePressed(evt);
            }
        });
        tf36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf36ActionPerformed(evt);
            }
        });

        tf2.setEditable(false);
        tf2.setBackground(new java.awt.Color(255, 225, 225));
        tf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf2.setText("0");
        tf2.setBorder(null);
        tf2.setMinimumSize(new java.awt.Dimension(200, 20));
        tf2.setPreferredSize(new java.awt.Dimension(200, 20));
        tf2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf2MousePressed(evt);
            }
        });
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });

        tf9.setEditable(false);
        tf9.setBackground(new java.awt.Color(255, 225, 225));
        tf9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf9.setText("0");
        tf9.setBorder(null);
        tf9.setMinimumSize(new java.awt.Dimension(200, 20));
        tf9.setPreferredSize(new java.awt.Dimension(200, 20));
        tf9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf9MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf9MousePressed(evt);
            }
        });
        tf9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf9ActionPerformed(evt);
            }
        });

        tf16.setEditable(false);
        tf16.setBackground(new java.awt.Color(255, 225, 225));
        tf16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf16.setText("0");
        tf16.setBorder(null);
        tf16.setMinimumSize(new java.awt.Dimension(200, 20));
        tf16.setPreferredSize(new java.awt.Dimension(200, 20));
        tf16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf16MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf16MousePressed(evt);
            }
        });
        tf16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf16ActionPerformed(evt);
            }
        });

        tf23.setEditable(false);
        tf23.setBackground(new java.awt.Color(255, 225, 225));
        tf23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf23.setText("0");
        tf23.setBorder(null);
        tf23.setMinimumSize(new java.awt.Dimension(200, 20));
        tf23.setPreferredSize(new java.awt.Dimension(200, 20));
        tf23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf23MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf23MousePressed(evt);
            }
        });
        tf23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf23ActionPerformed(evt);
            }
        });

        tf30.setEditable(false);
        tf30.setBackground(new java.awt.Color(255, 225, 225));
        tf30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf30.setText("0");
        tf30.setBorder(null);
        tf30.setMinimumSize(new java.awt.Dimension(200, 20));
        tf30.setPreferredSize(new java.awt.Dimension(200, 20));
        tf30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf30MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf30MousePressed(evt);
            }
        });
        tf30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf30ActionPerformed(evt);
            }
        });

        tf37.setEditable(false);
        tf37.setBackground(new java.awt.Color(255, 225, 225));
        tf37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf37.setText("0");
        tf37.setBorder(null);
        tf37.setMinimumSize(new java.awt.Dimension(200, 20));
        tf37.setPreferredSize(new java.awt.Dimension(200, 20));
        tf37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf37MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf37MousePressed(evt);
            }
        });
        tf37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf37ActionPerformed(evt);
            }
        });

        tf3.setEditable(false);
        tf3.setBackground(new java.awt.Color(255, 225, 225));
        tf3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf3.setText("0");
        tf3.setBorder(null);
        tf3.setMinimumSize(new java.awt.Dimension(200, 20));
        tf3.setPreferredSize(new java.awt.Dimension(200, 20));
        tf3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf3MousePressed(evt);
            }
        });
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });

        tf10.setEditable(false);
        tf10.setBackground(new java.awt.Color(255, 225, 225));
        tf10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf10.setText("0");
        tf10.setBorder(null);
        tf10.setMinimumSize(new java.awt.Dimension(200, 20));
        tf10.setPreferredSize(new java.awt.Dimension(200, 20));
        tf10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf10MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf10MousePressed(evt);
            }
        });
        tf10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf10ActionPerformed(evt);
            }
        });

        tf17.setEditable(false);
        tf17.setBackground(new java.awt.Color(255, 225, 225));
        tf17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf17.setText("0");
        tf17.setBorder(null);
        tf17.setMinimumSize(new java.awt.Dimension(200, 20));
        tf17.setPreferredSize(new java.awt.Dimension(200, 20));
        tf17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf17MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf17MousePressed(evt);
            }
        });
        tf17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf17ActionPerformed(evt);
            }
        });

        tf24.setEditable(false);
        tf24.setBackground(new java.awt.Color(255, 225, 225));
        tf24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf24.setText("0");
        tf24.setBorder(null);
        tf24.setMinimumSize(new java.awt.Dimension(200, 20));
        tf24.setPreferredSize(new java.awt.Dimension(200, 20));
        tf24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tf24MouseDragged(evt);
            }
        });
        tf24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf24MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf24MousePressed(evt);
            }
        });
        tf24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf24ActionPerformed(evt);
            }
        });

        tf31.setEditable(false);
        tf31.setBackground(new java.awt.Color(255, 225, 225));
        tf31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf31.setText("0");
        tf31.setBorder(null);
        tf31.setMinimumSize(new java.awt.Dimension(200, 20));
        tf31.setPreferredSize(new java.awt.Dimension(200, 20));
        tf31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf31MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf31MousePressed(evt);
            }
        });
        tf31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf31ActionPerformed(evt);
            }
        });

        tf38.setEditable(false);
        tf38.setBackground(new java.awt.Color(255, 225, 225));
        tf38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf38.setText("0");
        tf38.setBorder(null);
        tf38.setMinimumSize(new java.awt.Dimension(200, 20));
        tf38.setPreferredSize(new java.awt.Dimension(200, 20));
        tf38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf38MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf38MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf38MousePressed(evt);
            }
        });
        tf38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf38ActionPerformed(evt);
            }
        });

        tf4.setEditable(false);
        tf4.setBackground(new java.awt.Color(255, 225, 225));
        tf4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf4.setText("0");
        tf4.setBorder(null);
        tf4.setMinimumSize(new java.awt.Dimension(200, 20));
        tf4.setPreferredSize(new java.awt.Dimension(200, 20));
        tf4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf4MousePressed(evt);
            }
        });
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });

        tf11.setEditable(false);
        tf11.setBackground(new java.awt.Color(255, 225, 225));
        tf11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf11.setText("0");
        tf11.setBorder(null);
        tf11.setMinimumSize(new java.awt.Dimension(200, 20));
        tf11.setPreferredSize(new java.awt.Dimension(200, 20));
        tf11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf11MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf11MousePressed(evt);
            }
        });
        tf11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf11ActionPerformed(evt);
            }
        });

        tf18.setEditable(false);
        tf18.setBackground(new java.awt.Color(255, 225, 225));
        tf18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf18.setText("0");
        tf18.setBorder(null);
        tf18.setMinimumSize(new java.awt.Dimension(200, 20));
        tf18.setPreferredSize(new java.awt.Dimension(200, 20));
        tf18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf18MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf18MousePressed(evt);
            }
        });
        tf18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf18ActionPerformed(evt);
            }
        });

        tf25.setEditable(false);
        tf25.setBackground(new java.awt.Color(255, 225, 225));
        tf25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf25.setText("0");
        tf25.setBorder(null);
        tf25.setMinimumSize(new java.awt.Dimension(200, 20));
        tf25.setPreferredSize(new java.awt.Dimension(200, 20));
        tf25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf25MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf25MousePressed(evt);
            }
        });
        tf25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf25ActionPerformed(evt);
            }
        });

        tf32.setEditable(false);
        tf32.setBackground(new java.awt.Color(255, 225, 225));
        tf32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf32.setText("0");
        tf32.setBorder(null);
        tf32.setMinimumSize(new java.awt.Dimension(200, 20));
        tf32.setPreferredSize(new java.awt.Dimension(200, 20));
        tf32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf32MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf32MousePressed(evt);
            }
        });
        tf32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf32ActionPerformed(evt);
            }
        });

        tf39.setEditable(false);
        tf39.setBackground(new java.awt.Color(255, 225, 225));
        tf39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf39.setText("0");
        tf39.setBorder(null);
        tf39.setMinimumSize(new java.awt.Dimension(200, 20));
        tf39.setPreferredSize(new java.awt.Dimension(200, 20));
        tf39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf39MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf39MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf39MousePressed(evt);
            }
        });
        tf39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf39ActionPerformed(evt);
            }
        });

        tf6.setEditable(false);
        tf6.setBackground(new java.awt.Color(255, 225, 225));
        tf6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf6.setText("0");
        tf6.setBorder(null);
        tf6.setMinimumSize(new java.awt.Dimension(200, 20));
        tf6.setPreferredSize(new java.awt.Dimension(200, 20));
        tf6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf6MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf6MousePressed(evt);
            }
        });
        tf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf6ActionPerformed(evt);
            }
        });

        tf19.setEditable(false);
        tf19.setBackground(new java.awt.Color(255, 225, 225));
        tf19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf19.setText("0");
        tf19.setBorder(null);
        tf19.setMinimumSize(new java.awt.Dimension(200, 20));
        tf19.setPreferredSize(new java.awt.Dimension(200, 20));
        tf19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf19MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf19MousePressed(evt);
            }
        });
        tf19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf19ActionPerformed(evt);
            }
        });

        tf12.setEditable(false);
        tf12.setBackground(new java.awt.Color(255, 225, 225));
        tf12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf12.setText("0");
        tf12.setBorder(null);
        tf12.setMinimumSize(new java.awt.Dimension(200, 20));
        tf12.setPreferredSize(new java.awt.Dimension(200, 20));
        tf12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf12MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf12MousePressed(evt);
            }
        });
        tf12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf12ActionPerformed(evt);
            }
        });

        tf26.setEditable(false);
        tf26.setBackground(new java.awt.Color(255, 225, 225));
        tf26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf26.setText("0");
        tf26.setBorder(null);
        tf26.setMinimumSize(new java.awt.Dimension(200, 20));
        tf26.setPreferredSize(new java.awt.Dimension(200, 20));
        tf26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf26MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf26MousePressed(evt);
            }
        });
        tf26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf26ActionPerformed(evt);
            }
        });

        tf33.setEditable(false);
        tf33.setBackground(new java.awt.Color(255, 225, 225));
        tf33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf33.setText("0");
        tf33.setBorder(null);
        tf33.setMinimumSize(new java.awt.Dimension(200, 20));
        tf33.setPreferredSize(new java.awt.Dimension(200, 20));
        tf33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf33MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf33MousePressed(evt);
            }
        });
        tf33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf33ActionPerformed(evt);
            }
        });

        tf40.setEditable(false);
        tf40.setBackground(new java.awt.Color(255, 225, 225));
        tf40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf40.setText("0");
        tf40.setBorder(null);
        tf40.setMinimumSize(new java.awt.Dimension(200, 20));
        tf40.setPreferredSize(new java.awt.Dimension(200, 20));
        tf40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf40MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf40MousePressed(evt);
            }
        });
        tf40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf40ActionPerformed(evt);
            }
        });

        tf5.setEditable(false);
        tf5.setBackground(new java.awt.Color(255, 225, 225));
        tf5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf5.setText("0");
        tf5.setBorder(null);
        tf5.setMinimumSize(new java.awt.Dimension(200, 20));
        tf5.setPreferredSize(new java.awt.Dimension(200, 20));
        tf5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf5MousePressed(evt);
            }
        });
        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });

        tf13.setEditable(false);
        tf13.setBackground(new java.awt.Color(255, 225, 225));
        tf13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf13.setText("0");
        tf13.setBorder(null);
        tf13.setMinimumSize(new java.awt.Dimension(200, 20));
        tf13.setPreferredSize(new java.awt.Dimension(200, 20));
        tf13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf13MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf13MousePressed(evt);
            }
        });
        tf13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf13ActionPerformed(evt);
            }
        });

        tf20.setEditable(false);
        tf20.setBackground(new java.awt.Color(255, 225, 225));
        tf20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf20.setText("0");
        tf20.setBorder(null);
        tf20.setMinimumSize(new java.awt.Dimension(200, 20));
        tf20.setPreferredSize(new java.awt.Dimension(200, 20));
        tf20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf20MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf20MousePressed(evt);
            }
        });
        tf20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf20ActionPerformed(evt);
            }
        });

        tf27.setEditable(false);
        tf27.setBackground(new java.awt.Color(255, 225, 225));
        tf27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf27.setText("0");
        tf27.setBorder(null);
        tf27.setMinimumSize(new java.awt.Dimension(200, 20));
        tf27.setPreferredSize(new java.awt.Dimension(200, 20));
        tf27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf27MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf27MousePressed(evt);
            }
        });
        tf27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf27ActionPerformed(evt);
            }
        });

        tf41.setEditable(false);
        tf41.setBackground(new java.awt.Color(255, 225, 225));
        tf41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf41.setText("0");
        tf41.setBorder(null);
        tf41.setMinimumSize(new java.awt.Dimension(200, 20));
        tf41.setPreferredSize(new java.awt.Dimension(200, 20));
        tf41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf41MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf41MousePressed(evt);
            }
        });
        tf41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf41ActionPerformed(evt);
            }
        });

        tf34.setEditable(false);
        tf34.setBackground(new java.awt.Color(255, 225, 225));
        tf34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf34.setText("0");
        tf34.setBorder(null);
        tf34.setMinimumSize(new java.awt.Dimension(200, 20));
        tf34.setPreferredSize(new java.awt.Dimension(200, 20));
        tf34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf34MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf34MousePressed(evt);
            }
        });
        tf34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf34ActionPerformed(evt);
            }
        });

        tf7.setEditable(false);
        tf7.setBackground(new java.awt.Color(255, 225, 225));
        tf7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf7.setText("0");
        tf7.setBorder(null);
        tf7.setMinimumSize(new java.awt.Dimension(200, 20));
        tf7.setPreferredSize(new java.awt.Dimension(200, 20));
        tf7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf7MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf7MousePressed(evt);
            }
        });
        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });

        tf14.setEditable(false);
        tf14.setBackground(new java.awt.Color(255, 225, 225));
        tf14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf14.setText("0");
        tf14.setBorder(null);
        tf14.setMinimumSize(new java.awt.Dimension(200, 20));
        tf14.setPreferredSize(new java.awt.Dimension(200, 20));
        tf14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf14MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf14MousePressed(evt);
            }
        });
        tf14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf14ActionPerformed(evt);
            }
        });

        tf28.setEditable(false);
        tf28.setBackground(new java.awt.Color(255, 225, 225));
        tf28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf28.setText("0");
        tf28.setBorder(null);
        tf28.setMinimumSize(new java.awt.Dimension(200, 20));
        tf28.setPreferredSize(new java.awt.Dimension(200, 20));
        tf28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf28MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf28MousePressed(evt);
            }
        });
        tf28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf28ActionPerformed(evt);
            }
        });

        tf21.setEditable(false);
        tf21.setBackground(new java.awt.Color(255, 225, 225));
        tf21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf21.setText("0");
        tf21.setBorder(null);
        tf21.setMinimumSize(new java.awt.Dimension(200, 20));
        tf21.setPreferredSize(new java.awt.Dimension(200, 20));
        tf21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf21MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf21MousePressed(evt);
            }
        });
        tf21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf21ActionPerformed(evt);
            }
        });

        tf42.setEditable(false);
        tf42.setBackground(new java.awt.Color(255, 225, 225));
        tf42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf42.setText("0");
        tf42.setBorder(null);
        tf42.setMinimumSize(new java.awt.Dimension(200, 20));
        tf42.setPreferredSize(new java.awt.Dimension(200, 20));
        tf42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf42MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf42MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf42MousePressed(evt);
            }
        });
        tf42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf42ActionPerformed(evt);
            }
        });

        tf35.setEditable(false);
        tf35.setBackground(new java.awt.Color(255, 225, 225));
        tf35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf35.setText("0");
        tf35.setBorder(null);
        tf35.setMinimumSize(new java.awt.Dimension(200, 20));
        tf35.setPreferredSize(new java.awt.Dimension(200, 20));
        tf35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf35MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf35MousePressed(evt);
            }
        });
        tf35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSheetLayout = new javax.swing.GroupLayout(pnSheet);
        pnSheet.setLayout(pnSheetLayout);
        pnSheetLayout.setHorizontalGroup(
            pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSheetLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(lbDom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf15, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf22, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf29, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf23, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf30, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf37, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(lbSeg, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTer, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf17, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf24, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf18, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf25, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf39, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(lbQua, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tf26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(lbQui, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(lbSex, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(tf13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSab, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf28, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf21, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf42, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tf35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
        );
        pnSheetLayout.setVerticalGroup(
            pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSheetLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDom)
                    .addComponent(lbSeg)
                    .addComponent(lbTer)
                    .addComponent(lbQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQui)
                    .addComponent(lbSex)
                    .addComponent(lbSab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pnCalendarioLayout = new javax.swing.GroupLayout(pnCalendario);
        pnCalendario.setLayout(pnCalendarioLayout);
        pnCalendarioLayout.setHorizontalGroup(
            pnCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCalendarioLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(pnCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnCalendarioLayout.createSequentialGroup()
                        .addComponent(selecao_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selecao_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnSheet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        pnCalendarioLayout.setVerticalGroup(
            pnCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCalendarioLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecao_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecao_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(pnSheet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tfSaudacao.setEditable(false);
        tfSaudacao.setBackground(new java.awt.Color(217, 217, 226));
        tfSaudacao.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        tfSaudacao.setForeground(new java.awt.Color(102, 0, 102));
        tfSaudacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSaudacao.setBorder(null);
        tfSaudacao.setFocusable(false);
        tfSaudacao.setSelectionColor(new java.awt.Color(204, 204, 255));
        tfSaudacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSaudacaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGENDA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(351, 351, 351))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btVerHorario.setText("Ver horários");
        btVerHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVerHorarioMouseClicked(evt);
            }
        });
        btVerHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerHorarioActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btAjuda.setText("Ajuda");
        btAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btVerHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVerHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(pnCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(tfSaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecao_anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecao_anoActionPerformed
        geraCalendario();
    }//GEN-LAST:event_selecao_anoActionPerformed

    private void selecao_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecao_mesActionPerformed
        geraCalendario();
    }//GEN-LAST:event_selecao_mesActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf36ActionPerformed

    private void tf29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf29ActionPerformed

    private void tf22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf22ActionPerformed

    private void tf15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf15ActionPerformed

    private void tf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf8ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf9ActionPerformed

    private void tf16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf16ActionPerformed

    private void tf23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf23ActionPerformed

    private void tf30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf30ActionPerformed

    private void tf37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf37ActionPerformed

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf10ActionPerformed

    private void tf17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf17ActionPerformed

    private void tf24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf24ActionPerformed

    private void tf31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf31ActionPerformed

    private void tf38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf38ActionPerformed

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void tf11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf11ActionPerformed

    private void tf18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf18ActionPerformed

    private void tf25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf25ActionPerformed

    private void tf32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf32ActionPerformed

    private void tf39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf39ActionPerformed

    private void tf19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf19ActionPerformed

    private void tf12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf12ActionPerformed

    private void tf26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf26ActionPerformed

    private void tf33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf33ActionPerformed

    private void tf40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf40ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void tf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6ActionPerformed

    private void tf13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf13ActionPerformed

    private void tf20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf20ActionPerformed

    private void tf27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf27ActionPerformed

    private void tf41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf41ActionPerformed

    private void tf34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf34ActionPerformed

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf7ActionPerformed

    private void tf14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf14ActionPerformed

    private void tf28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf28ActionPerformed

    private void tf21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf21ActionPerformed

    private void tf42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf42ActionPerformed

    private void tf35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf35ActionPerformed

    private void tfSaudacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudacaoActionPerformed
        
    }//GEN-LAST:event_tfSaudacaoActionPerformed

    //switch frame to horario
    private void btVerHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerHorarioActionPerformed
        Horario h = new Horario();
        
        this.dispose();
        
        h.setVisible(true);
    }//GEN-LAST:event_btVerHorarioActionPerformed

    private void btAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjudaActionPerformed
        JOptionPane.showMessageDialog(null, """
                                            Para ver as atividades cadastradas, basta passar o mouse no dia no calendário!
                                            Para editar ou inserir pressione o botão esquerdo do mouse sobre o dia desejado!""");
    }//GEN-LAST:event_btAjudaActionPerformed

    private void btVerHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVerHorarioMouseClicked
        // 
    }//GEN-LAST:event_btVerHorarioMouseClicked

    /*---------------------- MOUSE CLICKED ---------------------------------------------------------------------------*/
    
    //printaAtividades para cada botão clicado
    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        //printaAgendamento(tf1);
    }//GEN-LAST:event_tf1MouseClicked

    private void tf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MouseClicked
        //printaAgendamento(tf2);
    }//GEN-LAST:event_tf2MouseClicked

    private void tf3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf3MouseClicked
        //printaAgendamento(tf3);  
    }//GEN-LAST:event_tf3MouseClicked

    private void tf4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf4MouseClicked
        //printaAgendamento(tf4);
    }//GEN-LAST:event_tf4MouseClicked

    private void tf5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf5MouseClicked
        //printaAgendamento(tf5);
    }//GEN-LAST:event_tf5MouseClicked

    private void tf6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf6MouseClicked
        //printaAgendamento(tf6);
    }//GEN-LAST:event_tf6MouseClicked

    private void tf7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf7MouseClicked
        //printaAgendamento(tf7);
    }//GEN-LAST:event_tf7MouseClicked

    private void tf8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf8MouseClicked
        //printaAgendamento(tf8);
    }//GEN-LAST:event_tf8MouseClicked

    private void tf9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf9MouseClicked
        //printaAgendamento(tf9);
    }//GEN-LAST:event_tf9MouseClicked

    private void tf10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf10MouseClicked
        //printaAgendamento(tf10);
    }//GEN-LAST:event_tf10MouseClicked

    private void tf11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf11MouseClicked
        //printaAgendamento(tf11);
    }//GEN-LAST:event_tf11MouseClicked

    private void tf12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf12MouseClicked
        //printaAgendamento(tf12);
    }//GEN-LAST:event_tf12MouseClicked

    private void tf13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf13MouseClicked
        //printaAgendamento(tf13);
    }//GEN-LAST:event_tf13MouseClicked

    private void tf14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf14MouseClicked
        //printaAgendamento(tf14);
    }//GEN-LAST:event_tf14MouseClicked

    private void tf15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf15MouseClicked
        //printaAgendamento(tf15);
    }//GEN-LAST:event_tf15MouseClicked

    private void tf16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf16MouseClicked
        //printaAgendamento(tf16);
    }//GEN-LAST:event_tf16MouseClicked

    private void tf17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf17MouseClicked
        //printaAgendamento(tf17);
    }//GEN-LAST:event_tf17MouseClicked

    private void tf18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf18MouseClicked
        //printaAgendamento(tf18);
    }//GEN-LAST:event_tf18MouseClicked

    private void tf19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf19MouseClicked
        //printaAgendamento(tf19);
    }//GEN-LAST:event_tf19MouseClicked

    private void tf20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf20MouseClicked
        //printaAgendamento(tf20);
    }//GEN-LAST:event_tf20MouseClicked

    private void tf21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf21MouseClicked
        //printaAgendamento(tf21);
    }//GEN-LAST:event_tf21MouseClicked

    private void tf22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf22MouseClicked
        //printaAgendamento(tf22);
    }//GEN-LAST:event_tf22MouseClicked

    private void tf23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf23MouseClicked
        //printaAgendamento(tf23);
    }//GEN-LAST:event_tf23MouseClicked

    private void tf24MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf24MouseDragged
        //printaAgendamento(tf24);
    }//GEN-LAST:event_tf24MouseDragged

    private void tf24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf24MouseClicked
        //printaAgendamento(tf24);
    }//GEN-LAST:event_tf24MouseClicked

    private void tf25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf25MouseClicked
        //printaAgendamento(tf25);
    }//GEN-LAST:event_tf25MouseClicked

    private void tf26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf26MouseClicked
        //printaAgendamento(tf26);
    }//GEN-LAST:event_tf26MouseClicked

    private void tf27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf27MouseClicked
        //printaAgendamento(tf27);
    }//GEN-LAST:event_tf27MouseClicked

    private void tf28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf28MouseClicked
        //printaAgendamento(tf28);
    }//GEN-LAST:event_tf28MouseClicked

    private void tf29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf29MouseClicked
        //printaAgendamento(tf29);
    }//GEN-LAST:event_tf29MouseClicked

    private void tf30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf30MouseClicked
        //printaAgendamento(tf30);
    }//GEN-LAST:event_tf30MouseClicked

    private void tf31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf31MouseClicked
        //printaAgendamento(tf31);
    }//GEN-LAST:event_tf31MouseClicked

    private void tf32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf32MouseClicked
        //printaAgendamento(tf32);
    }//GEN-LAST:event_tf32MouseClicked

    private void tf33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf33MouseClicked
        //printaAgendamento(tf33);
    }//GEN-LAST:event_tf33MouseClicked

    private void tf34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf34MouseClicked
        //printaAgendamento(tf34);
    }//GEN-LAST:event_tf34MouseClicked

    private void tf35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf35MouseClicked
        //printaAgendamento(tf35);
    }//GEN-LAST:event_tf35MouseClicked

    private void tf36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf36MouseClicked
        //printaAgendamento(tf36);
    }//GEN-LAST:event_tf36MouseClicked

    private void tf37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf37MouseClicked
        //printaAgendamento(tf37);
    }//GEN-LAST:event_tf37MouseClicked

    private void tf38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf38MouseClicked
        //printaAgendamento(tf38);
    }//GEN-LAST:event_tf38MouseClicked

    private void tf39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf39MouseClicked
        //printaAgendamento(tf39);
    }//GEN-LAST:event_tf39MouseClicked

    private void tf40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf40MouseClicked
        //printaAgendamento(tf40);
    }//GEN-LAST:event_tf40MouseClicked

    private void tf41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf41MouseClicked
        //printaAgendamento(tf41);
    }//GEN-LAST:event_tf41MouseClicked

    private void tf42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf42MouseClicked
        //printaAgendamento(tf42);
    }//GEN-LAST:event_tf42MouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair?","SAIR", 

            JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btSairActionPerformed

/*---------------------- MOUSE PRESSED ---------------------------------------------------------------------------*/
    
    private void tf1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MousePressed
        geraAgendamento(tf1);
    }//GEN-LAST:event_tf1MousePressed

    private void tf2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MousePressed
        geraAgendamento(tf2);
    }//GEN-LAST:event_tf2MousePressed

    private void tf3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf3MousePressed
        geraAgendamento(tf3);
    }//GEN-LAST:event_tf3MousePressed

    private void tf4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf4MousePressed
        geraAgendamento(tf4);
    }//GEN-LAST:event_tf4MousePressed

    private void tf5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf5MousePressed
        geraAgendamento(tf5);
    }//GEN-LAST:event_tf5MousePressed

    private void tf6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf6MousePressed
        geraAgendamento(tf6);
    }//GEN-LAST:event_tf6MousePressed

    private void tf7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf7MousePressed
        geraAgendamento(tf7);
    }//GEN-LAST:event_tf7MousePressed

    private void tf8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf8MousePressed
        geraAgendamento(tf8);
    }//GEN-LAST:event_tf8MousePressed

    private void tf9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf9MousePressed
        geraAgendamento(tf9);
    }//GEN-LAST:event_tf9MousePressed

    private void tf10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf10MousePressed
        geraAgendamento(tf10);
    }//GEN-LAST:event_tf10MousePressed

    private void tf11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf11MousePressed
        geraAgendamento(tf11);
    }//GEN-LAST:event_tf11MousePressed

    private void tf12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf12MousePressed
        geraAgendamento(tf12);
    }//GEN-LAST:event_tf12MousePressed

    private void tf13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf13MousePressed
        geraAgendamento(tf13);
    }//GEN-LAST:event_tf13MousePressed

    private void tf14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf14MousePressed
        geraAgendamento(tf14);
    }//GEN-LAST:event_tf14MousePressed

    private void tf15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf15MousePressed
        geraAgendamento(tf15);
    }//GEN-LAST:event_tf15MousePressed

    private void tf16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf16MousePressed
        geraAgendamento(tf16);
    }//GEN-LAST:event_tf16MousePressed

    private void tf17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf17MousePressed
        geraAgendamento(tf17);
    }//GEN-LAST:event_tf17MousePressed

    private void tf18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf18MousePressed
        geraAgendamento(tf18);
    }//GEN-LAST:event_tf18MousePressed

    private void tf19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf19MousePressed
        geraAgendamento(tf19);
    }//GEN-LAST:event_tf19MousePressed

    private void tf20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf20MousePressed
       geraAgendamento(tf20);
    }//GEN-LAST:event_tf20MousePressed

    private void tf21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf21MousePressed
        geraAgendamento(tf21);
    }//GEN-LAST:event_tf21MousePressed

    private void tf22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf22MousePressed
        geraAgendamento(tf22);
    }//GEN-LAST:event_tf22MousePressed

    private void tf23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf23MousePressed
        geraAgendamento(tf23);
    }//GEN-LAST:event_tf23MousePressed

    private void tf24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf24MousePressed
        geraAgendamento(tf24);
    }//GEN-LAST:event_tf24MousePressed

    private void tf25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf25MousePressed
        geraAgendamento(tf25);
    }//GEN-LAST:event_tf25MousePressed

    private void tf26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf26MousePressed
        geraAgendamento(tf26);
    }//GEN-LAST:event_tf26MousePressed

    private void tf27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf27MousePressed
        geraAgendamento(tf27);
    }//GEN-LAST:event_tf27MousePressed

    private void tf28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf28MousePressed
        geraAgendamento(tf28);
    }//GEN-LAST:event_tf28MousePressed

    private void tf29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf29MousePressed
        geraAgendamento(tf29);
    }//GEN-LAST:event_tf29MousePressed

    private void tf30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf30MousePressed
        geraAgendamento(tf30);
    }//GEN-LAST:event_tf30MousePressed

    private void tf31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf31MousePressed
        geraAgendamento(tf31);
    }//GEN-LAST:event_tf31MousePressed

    private void tf32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf32MousePressed
        geraAgendamento(tf32);
    }//GEN-LAST:event_tf32MousePressed

    private void tf33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf33MousePressed
        geraAgendamento(tf33);
    }//GEN-LAST:event_tf33MousePressed

    private void tf34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf34MousePressed
        geraAgendamento(tf34);
    }//GEN-LAST:event_tf34MousePressed

    private void tf35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf35MousePressed
        geraAgendamento(tf35);
    }//GEN-LAST:event_tf35MousePressed

    private void tf36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf36MousePressed
        geraAgendamento(tf36);
    }//GEN-LAST:event_tf36MousePressed

    private void tf37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf37MousePressed
        geraAgendamento(tf37);
    }//GEN-LAST:event_tf37MousePressed

    private void tf38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf38MousePressed
        geraAgendamento(tf38);
    }//GEN-LAST:event_tf38MousePressed

    private void tf39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf39MousePressed
        geraAgendamento(tf39);
    }//GEN-LAST:event_tf39MousePressed

    private void tf40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf40MousePressed
        geraAgendamento(tf40);
    }//GEN-LAST:event_tf40MousePressed

    private void tf41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf41MousePressed
        geraAgendamento(tf41);
    }//GEN-LAST:event_tf41MousePressed

    private void tf42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf42MousePressed
        geraAgendamento(tf42);
    }//GEN-LAST:event_tf42MousePressed

    private void tf1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseEntered
        printaAgendamento(tf1);
    }//GEN-LAST:event_tf1MouseEntered

    private void tf6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf6MouseEntered
        printaAgendamento(tf6);
    }//GEN-LAST:event_tf6MouseEntered

    private void tf2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MouseEntered
        printaAgendamento(tf2);
    }//GEN-LAST:event_tf2MouseEntered

    private void tf3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf3MouseEntered
        printaAgendamento(tf3);
    }//GEN-LAST:event_tf3MouseEntered

    private void tf4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf4MouseEntered
        printaAgendamento(tf4);
    }//GEN-LAST:event_tf4MouseEntered

    private void tf5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf5MouseEntered
       printaAgendamento(tf5);         
    }//GEN-LAST:event_tf5MouseEntered

    private void tf7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf7MouseEntered
        printaAgendamento(tf7);
    }//GEN-LAST:event_tf7MouseEntered

    private void tf8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf8MouseEntered
        printaAgendamento(tf8);
    }//GEN-LAST:event_tf8MouseEntered

    private void tf9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf9MouseEntered
        printaAgendamento(tf9);
    }//GEN-LAST:event_tf9MouseEntered

    private void tf10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf10MouseEntered
        printaAgendamento(tf10);
    }//GEN-LAST:event_tf10MouseEntered

    private void tf11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf11MouseEntered
        printaAgendamento(tf11);
    }//GEN-LAST:event_tf11MouseEntered

    private void tf12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf12MouseEntered
        printaAgendamento(tf12);
    }//GEN-LAST:event_tf12MouseEntered

    private void tf13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf13MouseEntered
        printaAgendamento(tf13);
    }//GEN-LAST:event_tf13MouseEntered

    private void tf14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf14MouseEntered
        printaAgendamento(tf14);
    }//GEN-LAST:event_tf14MouseEntered

    private void tf15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf15MouseEntered
        printaAgendamento(tf15);
    }//GEN-LAST:event_tf15MouseEntered

    private void tf16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf16MouseEntered
        printaAgendamento(tf16);
    }//GEN-LAST:event_tf16MouseEntered

    private void tf17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf17MouseEntered
        printaAgendamento(tf17);
    }//GEN-LAST:event_tf17MouseEntered

    private void tf18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf18MouseEntered
        printaAgendamento(tf18);
    }//GEN-LAST:event_tf18MouseEntered

    private void tf19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf19MouseEntered
        printaAgendamento(tf19);
    }//GEN-LAST:event_tf19MouseEntered

    private void tf20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf20MouseEntered
        printaAgendamento(tf20);
    }//GEN-LAST:event_tf20MouseEntered

    private void tf21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf21MouseEntered
        printaAgendamento(tf21);
    }//GEN-LAST:event_tf21MouseEntered

    private void tf22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf22MouseEntered
        printaAgendamento(tf22);
    }//GEN-LAST:event_tf22MouseEntered

    private void tf23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf23MouseEntered
        printaAgendamento(tf23);
    }//GEN-LAST:event_tf23MouseEntered

    private void tf24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf24MouseEntered
        printaAgendamento(tf24);
    }//GEN-LAST:event_tf24MouseEntered

    private void tf25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf25MouseEntered
        printaAgendamento(tf25);
    }//GEN-LAST:event_tf25MouseEntered

    private void tf26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf26MouseEntered
        printaAgendamento(tf26);
    }//GEN-LAST:event_tf26MouseEntered

    private void tf27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf27MouseEntered
        printaAgendamento(tf27);
    }//GEN-LAST:event_tf27MouseEntered

    private void tf28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf28MouseEntered
        printaAgendamento(tf28);
    }//GEN-LAST:event_tf28MouseEntered

    private void tf29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf29MouseExited
        printaAgendamento(tf29);
    }//GEN-LAST:event_tf29MouseExited

    private void tf30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf30MouseEntered
        printaAgendamento(tf30);
    }//GEN-LAST:event_tf30MouseEntered

    private void tf31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf31MouseEntered
        printaAgendamento(tf31);
    }//GEN-LAST:event_tf31MouseEntered

    private void tf32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf32MouseEntered
        printaAgendamento(tf32);
    }//GEN-LAST:event_tf32MouseEntered

    private void tf33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf33MouseEntered
        printaAgendamento(tf33);
    }//GEN-LAST:event_tf33MouseEntered

    private void tf34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf34MouseEntered
        printaAgendamento(tf34);
    }//GEN-LAST:event_tf34MouseEntered

    private void tf35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf35MouseEntered
        printaAgendamento(tf35);
    }//GEN-LAST:event_tf35MouseEntered

    private void tf36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf36MouseEntered
        printaAgendamento(tf36);
    }//GEN-LAST:event_tf36MouseEntered

    private void tf37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf37MouseEntered
        printaAgendamento(tf37);
    }//GEN-LAST:event_tf37MouseEntered

    private void tf38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf38MouseEntered
        printaAgendamento(tf38);
    }//GEN-LAST:event_tf38MouseEntered

    private void tf39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf39MouseEntered
        printaAgendamento(tf39);
    }//GEN-LAST:event_tf39MouseEntered

    private void tf40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf40MouseEntered
        printaAgendamento(tf40);
    }//GEN-LAST:event_tf40MouseEntered

    private void tf41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf41MouseEntered
        printaAgendamento(tf41);
    }//GEN-LAST:event_tf41MouseEntered

    private void tf42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf42MouseEntered
        printaAgendamento(tf42);
    }//GEN-LAST:event_tf42MouseEntered

    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalendarioMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarioMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarioMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarioMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarioMes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjuda;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVerHorario;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbDom;
    private javax.swing.JLabel lbQua;
    private javax.swing.JLabel lbQui;
    private javax.swing.JLabel lbSab;
    private javax.swing.JLabel lbSeg;
    private javax.swing.JLabel lbSex;
    private javax.swing.JLabel lbTer;
    private javax.swing.JPanel pnCalendario;
    private javax.swing.JPanel pnSheet;
    private javax.swing.JComboBox selecao_ano;
    private javax.swing.JComboBox<String> selecao_mes;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf14;
    private javax.swing.JTextField tf15;
    private javax.swing.JTextField tf16;
    private javax.swing.JTextField tf17;
    private javax.swing.JTextField tf18;
    private javax.swing.JTextField tf19;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf20;
    private javax.swing.JTextField tf21;
    private javax.swing.JTextField tf22;
    private javax.swing.JTextField tf23;
    private javax.swing.JTextField tf24;
    private javax.swing.JTextField tf25;
    private javax.swing.JTextField tf26;
    private javax.swing.JTextField tf27;
    private javax.swing.JTextField tf28;
    private javax.swing.JTextField tf29;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf30;
    private javax.swing.JTextField tf31;
    private javax.swing.JTextField tf32;
    private javax.swing.JTextField tf33;
    private javax.swing.JTextField tf34;
    private javax.swing.JTextField tf35;
    private javax.swing.JTextField tf36;
    private javax.swing.JTextField tf37;
    private javax.swing.JTextField tf38;
    private javax.swing.JTextField tf39;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf40;
    private javax.swing.JTextField tf41;
    private javax.swing.JTextField tf42;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JTextField tfSaudacao;
    // End of variables declaration//GEN-END:variables

/*----------------------------------------------------------------------------------------------------------------------------*/
    //Inicializa construção do calendário
    private void inicializaCalendario() {
        final Data hoje = new Data();
        hoje.setDataToToday();
        
        mes_fixo = hoje.getMes();
        ano_fixo = hoje.getAno();
        
        tfSaudacao.setText(hoje.getDiaSemanaHoje()+", "+hoje.getDia()+"/"+String.format("%2d", mes_fixo)+"/"+ano_fixo);
        
        //insere opção de anos anteriores e posteriores no campo combo box
        int ano_maximo = ano_fixo + 50;
        for(int i = 2000; i < ano_maximo; i++) {
            selecao_ano.addItem(i);
        }
        //seleciona automaticamente o ano atual
        selecao_ano.setSelectedItem(ano_fixo);
        
        //seleciona automaticamente o mês atual
        switch (mes_fixo) {
            case 1 -> selecao_mes.setSelectedIndex(0);
            case 2 -> selecao_mes.setSelectedIndex(1);
            case 3 -> selecao_mes.setSelectedIndex(2);
            case 4 -> selecao_mes.setSelectedIndex(3);
            case 5 -> selecao_mes.setSelectedIndex(4);
            case 6 -> selecao_mes.setSelectedIndex(5);
            case 7 -> selecao_mes.setSelectedIndex(6);
            case 8 -> selecao_mes.setSelectedIndex(7);
            case 9 -> selecao_mes.setSelectedIndex(8);
            case 10 -> selecao_mes.setSelectedIndex(9);
            case 11 -> selecao_mes.setSelectedIndex(10);
            case 12 -> selecao_mes.setSelectedIndex(11);
            default -> {
            }
        }
    }
    
    //preenche os dias do mês de acordo com os parâmetros de mês e ano
    private void geraCalendario () {
        mes_altera = selecao_mes.getSelectedIndex() + 1;
        ano_altera = Integer.parseInt(selecao_ano.getSelectedItem().toString());
        
        //obtém o dia da semana do primeiro dia do mês
        Calendar calendario = Calendar.getInstance();
        calendario.set(ano_altera, mes_altera - 1, 1);
        
        int setDia = calendario.get(Calendar.DAY_OF_WEEK);
        
        //inicializa campos de texto que poderiam receber valor 0 como vazios
        tf1.setText(" ");
        tf2.setText(" ");
        tf3.setText(" ");
        tf4.setText(" ");
        tf5.setText(" ");
        tf6.setText(" ");
        tf7.setText(" ");
        tf29.setText(" ");
        tf30.setText(" ");
        tf31.setText(" ");
        tf32.setText(" ");
        tf33.setText(" ");
        tf34.setText(" ");
        tf35.setText(" ");
        tf36.setText(" ");
        tf37.setText(" ");
        tf38.setText(" ");
        tf39.setText(" ");
        tf40.setText(" ");
        tf41.setText(" ");
        tf42.setText(" ");
        
        
        //laço que atribui os dias aos seus respectivos campos
        for (int i = 1; i <= getDiasPorMes(mes_altera); i++) {
            switch (setDia) {
                case 1 -> tf1.setText(""+i);
                case 2 -> tf2.setText(""+i);
                case 3 -> tf3.setText(""+i);
                case 4 -> tf4.setText(""+i);
                case 5 -> tf5.setText(""+i);
                case 6 -> tf6.setText(""+i);
                case 7 -> tf7.setText(""+i);
                case 8 -> tf8.setText(""+i);
                case 9 -> tf9.setText(""+i);
                case 10 -> tf10.setText(""+i);
                case 11 -> tf11.setText(""+i);
                case 12 -> tf12.setText(""+i);
                case 13 -> tf13.setText(""+i);
                case 14 -> tf14.setText(""+i);
                case 15 -> tf15.setText(""+i);
                case 16 -> tf16.setText(""+i);
                case 17 -> tf17.setText(""+i);
                case 18 -> tf18.setText(""+i);
                case 19 -> tf19.setText(""+i);
                case 20 -> tf20.setText(""+i);
                case 21 -> tf21.setText(""+i);
                case 22 -> tf22.setText(""+i);
                case 23 -> tf23.setText(""+i);
                case 24 -> tf24.setText(""+i);
                case 25 -> tf25.setText(""+i);
                case 26 -> tf26.setText(""+i);
                case 27 -> tf27.setText(""+i);
                case 28 -> tf28.setText(""+i);
                case 29 -> tf29.setText(""+i);
                case 30 -> tf30.setText(""+i);
                case 31 -> tf31.setText(""+i);
                case 32 -> tf32.setText(""+i);
                case 33 -> tf33.setText(""+i);
                case 34 -> tf34.setText(""+i);
                case 35 -> tf35.setText(""+i);
                case 36 -> tf36.setText(""+i);
                case 37 -> tf37.setText(""+i);
                case 38 -> tf38.setText(""+i);
                case 39 -> tf39.setText(""+i);
                case 40 -> tf40.setText(""+i);
                case 41 -> tf41.setText(""+i);
                case 42 -> tf42.setText(""+i); 
            }
            setDia++;
        }
    }
    
    //obtèm a quantidade de dias por cada mês
    public int getDiasPorMes(int mes){
      int total_dias_mes;
        
        switch (mes) {
            case 1 -> total_dias_mes = 31;    
            case 2 -> {
                if (ano_altera % 4 ==0) {
                    total_dias_mes = 29;
                }else{
                    total_dias_mes = 28;
                }
            }     
            case 3 -> total_dias_mes = 31;    
            case 4 -> total_dias_mes = 30;   
            case 5 -> total_dias_mes = 31;     
            case 6 -> total_dias_mes = 30;    
            case 7 -> total_dias_mes = 31;
            case 8 -> total_dias_mes = 31;   
            case 9 -> total_dias_mes = 30;   
            case 10 -> total_dias_mes = 31;
            case 11 -> total_dias_mes = 30;  
            case 12 -> total_dias_mes = 31;
            default -> {total_dias_mes = 30;}
        }  
        return total_dias_mes;
    }
    
    //retorna um botão com base no dia inserido
    public javax.swing.JTextField buscaDia(int dia) {
        if (getDiaTF(tf1) == dia){
            return tf1;
        }else if(getDiaTF(tf2) == dia){
            return tf2;
        }else if(getDiaTF(tf3) == dia){
            return tf3;
        }else if(getDiaTF(tf4) == dia){
            return tf4;
        }else if(getDiaTF(tf5) == dia){
            return tf5;
        }else if(getDiaTF(tf6) == dia){
            return tf6;
        }else if(getDiaTF(tf7) == dia){
            return tf7;
        }else if(getDiaTF(tf8) == dia){
            return tf8;
        }else if(getDiaTF(tf9) == dia){
            return tf9;
        }else if(getDiaTF(tf10) == dia){
            return tf10;
        }else if(getDiaTF(tf11) == dia){
            return tf11;
        }else if(getDiaTF(tf12) == dia){
            return tf12;
        }else if(getDiaTF(tf13) == dia){
            return tf13;
        }else if(getDiaTF(tf14) == dia){
            return tf14;
        }else if(getDiaTF(tf15) == dia){
            return tf15;
        }else if(getDiaTF(tf16) == dia){
            return tf16;
        }else if(getDiaTF(tf17) == dia){
            return tf17;
        }else if(getDiaTF(tf18) == dia){
            return tf18;
        }else if(getDiaTF(tf19) == dia){
            return tf19;
        }else if(getDiaTF(tf19) == dia){
            return tf19;
        }else if(getDiaTF(tf20) == dia){
            return tf20;
        }else if(getDiaTF(tf21) == dia){
            return tf21;
        }else if(getDiaTF(tf22) == dia){
            return tf22;
        }else if(getDiaTF(tf23) == dia){
            return tf23;
        }else if(getDiaTF(tf24) == dia){
            return tf24;
        }else if(getDiaTF(tf25) == dia){
            return tf25;
        }else if(getDiaTF(tf26) == dia){
            return tf26;
        }else if(getDiaTF(tf27) == dia){
            return tf27;
        }else if(getDiaTF(tf28) == dia){
            return tf28;
        }else if(getDiaTF(tf29) == dia){
            return tf29;
        }else if(getDiaTF(tf30) == dia){
            return tf30;
        }else if(getDiaTF(tf31) == dia){
            return tf31;
        }else if(getDiaTF(tf32) == dia){
            return tf32;
        }else if(getDiaTF(tf33) == dia){
            return tf33;
        }else if(getDiaTF(tf34) == dia){
            return tf34;
        }else if(getDiaTF(tf35) == dia){
            return tf35;
        }else if(getDiaTF(tf36) == dia){
            return tf36;
        }else if(getDiaTF(tf37) == dia){
            return tf37;
        }else if(getDiaTF(tf38) == dia){
            return tf38;
        }else if(getDiaTF(tf39) == dia){
            return tf39;
        }else if(getDiaTF(tf40) == dia){
            return tf40;
        }else if(getDiaTF(tf41) == dia){
            return tf41;
        }else if(getDiaTF(tf42) == dia){
            return tf42;
        }else{
            return tf1;
        }
    }

    //retorna o dia conforme o botão inserido
    private int getDiaTF(javax.swing.JTextField tf){
        return Integer.parseInt(tf.getText());
    }
    
    //faz o agendamento para cada textfield
    public void geraAgendamento(javax.swing.JTextField tf) {
        
        if (JOptionPane.showConfirmDialog(null, "Você deseja cadastrar uma atividade comum?","CADASTRAR ATIVIDADES",JOptionPane.YES_NO_OPTION) == 0){
            
            String nome = JOptionPane.showInputDialog(null, "Qual é o nome da disciplina?");
            String professor = JOptionPane.showInputDialog(null, "Escreva o nome do profesor dessa disciplina: ");
            int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o tipo da atividade: "
                    + "\n0- atividade\n1- seminario\n2- prova \n3- outro"));
            
            Agendamento agendamento = new Agendamento(nome, professor, Integer.parseInt(tf.getText()), mes_altera);
            agendamento.setTipo(0);
            agendamentos.add(agendamento);
        }
    }
    
    //printa as atividades cadastradas em cada data textfield
    public void printaAgendamento(javax.swing.JTextField tf) {
        for(Agendamento agendamento : agendamentos){
            if(Integer.parseInt(tf.getText()) == agendamento.getDia() && mes_altera == agendamento.getMes()){
                JOptionPane pane = new JOptionPane(agendamento); 
                JDialog dialog = pane.createDialog("Agendamento para essa data"); 
                dialog.setLocation(10, 10); 
                dialog.setVisible(true);
            }
        }
    }
}