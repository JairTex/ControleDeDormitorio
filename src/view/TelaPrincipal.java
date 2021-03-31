//Autoria:Antônio Alan Silva Lima
//        Jair Soares Teixeira

package view;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    //Atributo
    private String ocupado = "Não";
    
    //Métodos especiais
    public void ocupar(){
        this.ocupado = "Sim";
    }
    public void desocupar(){
        this.ocupado = "Não";
    }
    
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPnlControleDeDormitorio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCama1 = new javax.swing.JLabel();
        btnEditInfoCama1 = new javax.swing.JButton();
        btnInfoCama1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtStatus1 = new javax.swing.JTextField();
        lblCama2 = new javax.swing.JLabel();
        btnEditInfoCama2 = new javax.swing.JButton();
        btnInfoCama2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtStatus2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtStatus4 = new javax.swing.JTextField();
        btnInfoCama4 = new javax.swing.JButton();
        lblCama4 = new javax.swing.JLabel();
        btnEditInfoCama4 = new javax.swing.JButton();
        txtStatus3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnInfoCama3 = new javax.swing.JButton();
        lblCama3 = new javax.swing.JLabel();
        btnEditInfoCama3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtStatus6 = new javax.swing.JTextField();
        btnInfoCama6 = new javax.swing.JButton();
        lblCama6 = new javax.swing.JLabel();
        btnEditInfoCama6 = new javax.swing.JButton();
        txtStatus5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnInfoCama5 = new javax.swing.JButton();
        lblCama5 = new javax.swing.JLabel();
        btnEditInfoCama5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPnlControleDeDormitorio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Controle de Dormitório");

        lblCama1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCama1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCama1.setText("Cama 1");

        btnEditInfoCama1.setText("...");
        btnEditInfoCama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama1ActionPerformed(evt);
            }
        });

        btnInfoCama1.setText("Informações");
        btnInfoCama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Ocupado:");

        txtStatus1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus1ActionPerformed(evt);
            }
        });

        lblCama2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCama2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCama2.setText("Cama 2");

        btnEditInfoCama2.setText("...");
        btnEditInfoCama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama2ActionPerformed(evt);
            }
        });

        btnInfoCama2.setText("Informações");
        btnInfoCama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Ocupado:");

        txtStatus2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Ocupado:");

        txtStatus4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus4ActionPerformed(evt);
            }
        });

        btnInfoCama4.setText("Informações");
        btnInfoCama4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama4ActionPerformed(evt);
            }
        });

        lblCama4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCama4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCama4.setText("Cama 4");

        btnEditInfoCama4.setText("...");
        btnEditInfoCama4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama4ActionPerformed(evt);
            }
        });

        txtStatus3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus3ActionPerformed(evt);
            }
        });

        jLabel12.setText("Ocupado:");

        btnInfoCama3.setText("Informações");
        btnInfoCama3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama3ActionPerformed(evt);
            }
        });

        lblCama3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCama3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCama3.setText("Cama 3");

        btnEditInfoCama3.setText("...");
        btnEditInfoCama3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama3ActionPerformed(evt);
            }
        });

        jLabel14.setText("Ocupado:");

        txtStatus6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatus6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus6ActionPerformed(evt);
            }
        });

        btnInfoCama6.setText("Informações");
        btnInfoCama6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama6ActionPerformed(evt);
            }
        });

        lblCama6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCama6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCama6.setText("Cama 6");

        btnEditInfoCama6.setText("...");
        btnEditInfoCama6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama6ActionPerformed(evt);
            }
        });

        txtStatus5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatus5.setMaximumSize(new java.awt.Dimension(102, 32));
        txtStatus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus5ActionPerformed(evt);
            }
        });

        jLabel11.setText("Ocupado:");

        btnInfoCama5.setText("Informações");
        btnInfoCama5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama5ActionPerformed(evt);
            }
        });

        lblCama5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCama5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCama5.setText("Cama 5");

        btnEditInfoCama5.setText("...");
        btnEditInfoCama5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama5ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sleep2.png"))); // NOI18N

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtStatus1.setText(String.valueOf(ocupado));
        txtStatus2.setText(String.valueOf(ocupado));
        txtStatus4.setText(String.valueOf(ocupado));
        txtStatus3.setText(String.valueOf(ocupado));
        txtStatus6.setText(String.valueOf(ocupado));
        txtStatus5.setText(String.valueOf(ocupado));

        javax.swing.GroupLayout jPnlControleDeDormitorioLayout = new javax.swing.GroupLayout(jPnlControleDeDormitorio);
        jPnlControleDeDormitorio.setLayout(jPnlControleDeDormitorioLayout);
        jPnlControleDeDormitorioLayout.setHorizontalGroup(
            jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnInfoCama1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlControleDeDormitorioLayout.createSequentialGroup()
                                    .addComponent(lblCama1)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditInfoCama1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(lblCama2)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnEditInfoCama2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnInfoCama2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlControleDeDormitorioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnInfoCama3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(lblCama3)
                                            .addGap(20, 20, 20)
                                            .addComponent(btnEditInfoCama3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtStatus4))
                                        .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnInfoCama4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                                .addComponent(lblCama4)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEditInfoCama4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                    .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                            .addComponent(lblCama5)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnEditInfoCama5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnInfoCama5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(34, 34, 34))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlControleDeDormitorioLayout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jLabel14)
                                    .addGap(86, 86, 86)))
                            .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInfoCama6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                                        .addComponent(lblCama6)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditInfoCama6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36))))
                    .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlControleDeDormitorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPnlControleDeDormitorioLayout.setVerticalGroup(
            jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlControleDeDormitorioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlControleDeDormitorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCama1)
                    .addComponent(btnEditInfoCama1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCama3)
                    .addComponent(btnEditInfoCama3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCama5)
                    .addComponent(btnEditInfoCama5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoCama1)
                    .addComponent(btnInfoCama3)
                    .addComponent(btnInfoCama5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCama2)
                    .addComponent(btnEditInfoCama2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCama4)
                    .addComponent(btnEditInfoCama4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCama6)
                    .addComponent(btnEditInfoCama6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoCama2)
                    .addComponent(btnInfoCama4)
                    .addComponent(btnInfoCama6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlControleDeDormitorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addComponent(btnSair)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlControleDeDormitorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPnlControleDeDormitorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Objetos
    Dormitorio Cama1 = new Dormitorio();
    Dormitorio Cama2 = new Dormitorio();
    Dormitorio Cama3 = new Dormitorio();
    Dormitorio Cama4 = new Dormitorio();
    Dormitorio Cama5 = new Dormitorio();
    Dormitorio Cama6 = new Dormitorio();
    
    private void btnInfoCama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama1ActionPerformed
        //Condição para a impressão de informações. Só será impresso se a informação não for nula!
        if (Cama1.nomeDiscente != null && Cama1.ano != null && Cama1.curso != null && Cama1.matricula != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede:\nNome: " + Cama1.nomeDiscente 
                                        + "\nCurso: " + Cama1.curso + "\nAno: " + Cama1.ano 
                                        + "\nMatrícula: " + Cama1.matricula,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
        }
            //Se não, CAMA DESOCUPADA!
        else{JOptionPane.showMessageDialog(null, "Cama desocupada!");
            desocupar();
            txtStatus1.setText(String.valueOf(ocupado));
        }
    }//GEN-LAST:event_btnInfoCama1ActionPerformed
    private void txtStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus1ActionPerformed
    }//GEN-LAST:event_txtStatus1ActionPerformed
    private void txtStatus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus3ActionPerformed
    }//GEN-LAST:event_txtStatus3ActionPerformed
    private void txtStatus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus2ActionPerformed
    }//GEN-LAST:event_txtStatus2ActionPerformed
    private void txtStatus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus4ActionPerformed
    }//GEN-LAST:event_txtStatus4ActionPerformed
    private void btnEditInfoCama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama1ActionPerformed
        //Botões JOptionPane
        String[] escolha = {"Atualizar um dado", "Fazer um novo Cadastro", "Desocupar", "Sair"};
        String[] escolha2 = {"Nome", "Curso", "ano", "matricula", "Sair"};
        
        //resposta (Variável local para a escolha da opção no menu principal.
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            int resposta2 = JOptionPane.showOptionDialog(null,"O que deseja fazer?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[3]);
            switch(resposta2){
                case 0: //Case Atualizar dado
                    int resposta3 = JOptionPane.showOptionDialog(null,"Qual dado deseja editar?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha2, escolha2[4]);                
                    switch(resposta3){
                        case 0:
                            Cama1.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                        break;
                        case 1:
                            Cama1.curso = JOptionPane.showInputDialog("Curso: ");
                        break;
                        case 2:
                            Cama1.ano = JOptionPane.showInputDialog("Ano: ");
                        break;
                        case 3:
                            Cama1.matricula = JOptionPane.showInputDialog("Matrícula: ");
                        break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                        break;
                        case -1:
                            JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                        break;
                        default: // No caso de existir alguma resposta imprevísta 
                            JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta3);
                    }
                    break;
                case 1: //Case fazer um novo cadastro
                Cama1.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                if (Cama1.nomeDiscente != null){
                    Cama1.curso = JOptionPane.showInputDialog("Curso: ");
                        if (Cama1.curso != null){
                            Cama1.ano = JOptionPane.showInputDialog("Ano: ");
                                if (Cama1.ano != null){
                                    Cama1.matricula = JOptionPane.showInputDialog("Matrícula: ");
                                        if(Cama1.matricula != null){
                                            ocupar();
                                            txtStatus1.setText(String.valueOf(ocupado));
                                            break;
                                        }//fimIfMatricula
                                        else{
                                        JOptionPane.showMessageDialog(null, "Operação cancelada");
                                        }//fimElseMatricula
                                }//fimIfAno
                                else{
                                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                                }//fimElseAno
                        }//fimIfCurso
                        else{
                            JOptionPane.showMessageDialog(null, "Operação cancelada");
                        }//fimElseCurso
                }//fimIfNomeDiscente
                else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                    }//FimElseResposta
                break;
                case 2: //Desocupar
                    int resposta4 = JOptionPane.showConfirmDialog(null, "Deseja realmente desocupar esta cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (resposta4 == JOptionPane.OK_OPTION){
                        Cama1.nomeDiscente = null;
                        Cama1.matricula = null;
                        Cama1.ano = null;
                        Cama1.curso = null;
                        desocupar();
                        txtStatus1.setText(String.valueOf(ocupado));
                    }
                    else {
                    break;
                    }
                break;
                case 3: //botãoSair
                    JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                case -1: //exit
                    JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                default: // No caso de existir alguma resposta imprevísta 
                    JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta2);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação

    }//GEN-LAST:event_btnEditInfoCama1ActionPerformed
    private void btnInfoCama3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama3ActionPerformed
       
        if (Cama3.nomeDiscente != null && Cama3.ano != null && Cama3.curso != null && Cama3.matricula != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede:\nNome: " + Cama3.nomeDiscente 
                                        + "\nCurso: " + Cama3.curso + "\nAno: " + Cama3.ano
                                        + "\nMatrícula: " + Cama3.matricula,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
        }
        else{JOptionPane.showMessageDialog(null, "Cama desocupada!");
            desocupar();
            txtStatus3.setText(String.valueOf(ocupado));
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoCama3ActionPerformed
    private void btnInfoCama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama2ActionPerformed
       
        if (Cama2.nomeDiscente != null && Cama2.ano != null && Cama2.curso != null && Cama2.matricula != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede:\nNome: " + Cama2.nomeDiscente 
                                        + "\nCurso: " + Cama2.curso + "\nAno: " + Cama2.ano 
                                        + "\nMatrícula: " + Cama2.matricula,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
        }
        else{JOptionPane.showMessageDialog(null, "Cama desocupada!");
            desocupar();
            txtStatus2.setText(String.valueOf(ocupado));
        }
   
    }//GEN-LAST:event_btnInfoCama2ActionPerformed
    private void btnInfoCama4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama4ActionPerformed
        
        if (Cama4.nomeDiscente != null && Cama4.ano != null && Cama4.curso != null && Cama4.matricula != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede:\nNome: " + Cama4.nomeDiscente 
                                        + "\nCurso: " + Cama4.curso + "\nAno: " + Cama4.ano 
                                        + "\nMatrícula: " + Cama4.matricula,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
        }
        else{JOptionPane.showMessageDialog(null, "Cama desocupada!");
            desocupar();
            txtStatus4.setText(String.valueOf(ocupado));
        }
    }//GEN-LAST:event_btnInfoCama4ActionPerformed
    private void btnEditInfoCama4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama4ActionPerformed
        String[] escolha = {"Atualizar um dado", "Fazer um novo Cadastro", "Desocupar", "Sair"};
        String[] escolha2 = {"Nome", "Curso", "ano", "matricula", "Sair"};
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            int resposta2 = JOptionPane.showOptionDialog(null,"O que deseja fazer?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[3]);
            switch(resposta2){
                case 0:
                    int resposta3 = JOptionPane.showOptionDialog(null,"Qual dos valores você deseja editar?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha2, escolha2[4]);                
                    switch(resposta3){
                        case 0:
                            Cama4.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                        break;
                        case 1:
                            Cama4.curso = JOptionPane.showInputDialog("Curso: ");
                        break;
                        case 2:
                            Cama4.ano = JOptionPane.showInputDialog("Ano: ");
                        break;
                        case 3:
                            Cama4.matricula = JOptionPane.showInputDialog("Matrícula: ");
                        break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                        break;
                        case -1:
                            JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                        break;
                        default: // No caso de existir alguma resposta imprevísta 
                        JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta3);
                    }
                    break;
                    case 1: //cadastrar
                    Cama4.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                    if (Cama4.nomeDiscente != null){
                        Cama4.curso = JOptionPane.showInputDialog("Curso: ");
                            if (Cama4.curso != null){
                                Cama4.ano = JOptionPane.showInputDialog("Ano: ");
                                    if (Cama4.ano != null){
                                        Cama4.matricula = JOptionPane.showInputDialog("Matrícula: ");
                                            if(Cama4.matricula != null){
                                                ocupar();
                                                txtStatus4.setText(String.valueOf(ocupado));
                                                break;
                                            }//fimIfMatricula
                                            else{
                                            JOptionPane.showMessageDialog(null, "Operação cancelada");
                                            }//fimElseMatricula
                                    }//fimIfAno
                                    else{
                                        JOptionPane.showMessageDialog(null, "Operação cancelada");
                                    }//fimElseAno
                            }//fimIfCurso
                            else{
                                JOptionPane.showMessageDialog(null, "Operação cancelada");
                            }//fimElseCurso
                    }//fimIfNomeDiscente
                    else{
                        JOptionPane.showMessageDialog(null, "Operação cancelada");
                        }//FimElseResposta
                    break;
                case 2: //desocupar
                    int resposta4 = JOptionPane.showConfirmDialog(null, "Deseja realmente desocupar esta cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (resposta4 == JOptionPane.OK_OPTION){
                    Cama4.nomeDiscente = null;
                    Cama4.matricula = null;
                    Cama4.ano = null;
                    Cama4.curso = null;
                    desocupar();
                    txtStatus4.setText(String.valueOf(ocupado));
                    }
                    else {
                        break;
                    }
                break;
                case 3: //botãoSair
                JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                case -1: //exit
                JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                default: // No caso de existir alguma resposta imprevísta 
                JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta2);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação
        
    }//GEN-LAST:event_btnEditInfoCama4ActionPerformed
    private void btnEditInfoCama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama2ActionPerformed
        
        String[] escolha = {"Atualizar um dado", "Fazer um novo Cadastro", "Desocupar", "Sair"};
        String[] escolha2 = {"Nome", "Curso", "ano", "matricula", "Sair"};
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            int resposta2 = JOptionPane.showOptionDialog(null,"O que deseja fazer?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[3]);
            switch(resposta2){
                case 0:
                    int resposta3 = JOptionPane.showOptionDialog(null,"Qual dos valores você deseja editar?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha2, escolha2[4]);                
                    switch(resposta3){
                        case 0:
                            Cama2.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                        break;
                        case 1:
                            Cama2.curso = JOptionPane.showInputDialog("Curso: ");
                        break;
                        case 2:
                            Cama2.ano = JOptionPane.showInputDialog("Ano: ");
                        break;
                        case 3:
                            Cama2.matricula = JOptionPane.showInputDialog("Matrícula: ");
                        break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                        break;
                        case -1:
                            JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                        break;
                        default: // No caso de existir alguma resposta imprevísta 
                        JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta3);
                    }
                    break;
                    case 1: //cadastrar
                    Cama2.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                    if (Cama2.nomeDiscente != null){
                        Cama2.curso = JOptionPane.showInputDialog("Curso: ");
                            if (Cama2.curso != null){
                                Cama2.ano = JOptionPane.showInputDialog("Ano: ");
                                    if (Cama2.ano != null){
                                        Cama2.matricula = JOptionPane.showInputDialog("Matrícula: ");
                                            if(Cama2.matricula != null){
                                                ocupar();
                                                txtStatus2.setText(String.valueOf(ocupado));
                                                break;
                                            }//fimIfMatricula
                                            else{
                                            JOptionPane.showMessageDialog(null, "Operação cancelada");
                                            }//fimElseMatricula
                                    }//fimIfAno
                                    else{
                                        JOptionPane.showMessageDialog(null, "Operação cancelada");
                                    }//fimElseAno
                            }//fimIfCurso
                            else{
                                JOptionPane.showMessageDialog(null, "Operação cancelada");
                            }//fimElseCurso
                    }//fimIfNomeDiscente
                    else{
                        JOptionPane.showMessageDialog(null, "Operação cancelada");
                        }//FimElseResposta
                break;
                case 2: //desocupar
                    int resposta4 = JOptionPane.showConfirmDialog(null, "Deseja realmente desocupar esta cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (resposta4 == JOptionPane.OK_OPTION){
                    Cama2.nomeDiscente = null;
                    Cama2.matricula = null;
                    Cama2.ano = null;
                    Cama2.curso = null;
                    desocupar();
                    txtStatus2.setText(String.valueOf(ocupado));
                    }
                    else {
                    break;
                    }
                break;
                case 3: //sair
                    JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                case -1: //exit
                    JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                default: // No caso de existir alguma resposta imprevísta 
                JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta2);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação

    }//GEN-LAST:event_btnEditInfoCama2ActionPerformed
    private void btnEditInfoCama3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama3ActionPerformed
        String[] escolha = {"Atualizar um dado", "Fazer um novo Cadastro", "Desocupar", "Sair"};
        String[] escolha2 = {"Nome", "Curso", "ano", "matricula", "Sair"};
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            int resposta2 = JOptionPane.showOptionDialog(null,"O que deseja fazer?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[3]);
            switch(resposta2){
                case 0:
                int resposta3 = JOptionPane.showOptionDialog(null,"Qual dos valores você deseja editar?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha2, escolha2[4]);                
                switch(resposta3){
                    case 0:
                        Cama3.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                    break;
                    case 1:
                        Cama3.curso = JOptionPane.showInputDialog("Curso: ");
                    break;
                    case 2:
                        Cama3.ano = JOptionPane.showInputDialog("Ano: ");
                    break;
                    case 3:
                        Cama3.matricula = JOptionPane.showInputDialog("Matrícula: ");
                    break;
                    case 4: 
                        JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                    break;
                    case -1:
                        JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                    break;
                    default: // No caso de existir alguma resposta imprevísta 
                    JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta3);
                }
                break;
                case 1: //CadastrarNovoUsuário
                Cama3.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                if (Cama3.nomeDiscente != null){
                    Cama3.curso = JOptionPane.showInputDialog("Curso: ");
                        if (Cama3.curso != null){
                            Cama3.ano = JOptionPane.showInputDialog("Ano: ");
                                if (Cama3.ano != null){
                                    Cama3.matricula = JOptionPane.showInputDialog("Matrícula: ");
                                        if(Cama3.matricula != null){
                                            ocupar();
                                            txtStatus3.setText(String.valueOf(ocupado));
                                            break;
                                        }//fimIfMatricula
                                        else{
                                        JOptionPane.showMessageDialog(null, "Operação cancelada");
                                        }//fimElseMatricula
                                }//fimIfAno
                                else{
                                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                                }//fimElseAno
                        }//fimIfCurso
                        else{
                            JOptionPane.showMessageDialog(null, "Operação cancelada");
                        }//fimElseCurso
                }//fimIfNomeDiscente
                else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                    }//FimElseResposta
                break;
                case 2: //Desocupar
                    int resposta4 = JOptionPane.showConfirmDialog(null, "Deseja realmente desocupar esta cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (resposta4 == JOptionPane.OK_OPTION){
                    Cama3.nomeDiscente = null;
                    Cama3.matricula = null;
                    Cama3.ano = null;
                    Cama3.curso = null;
                    desocupar();
                    txtStatus3.setText(String.valueOf(ocupado));
                    }
                    else {
                    break;
                    }
                break;
                case 3: //botãosair
                    JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                case -1: //exit
                    JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                default: // No caso de existir alguma resposta imprevísta 
                JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta2);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação

    }//GEN-LAST:event_btnEditInfoCama3ActionPerformed
    private void btnEditInfoCama5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama5ActionPerformed
        String[] escolha = {"Atualizar um dado", "Fazer um novo Cadastro", "Desocupar", "Sair"};
        String[] escolha2 = {"Nome", "Curso", "ano", "matricula", "Sair"};
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            int resposta2 = JOptionPane.showOptionDialog(null,"O que deseja fazer?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[3]);
            switch(resposta2){
                case 0:
                    int resposta3 = JOptionPane.showOptionDialog(null,"Qual dos valores você deseja editar?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha2, escolha2[4]);                
                    switch(resposta3){
                        case 0:
                            Cama5.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                        break;
                        case 1:
                            Cama5.curso = JOptionPane.showInputDialog("Curso: ");
                        break;
                        case 2:
                            Cama5.ano = JOptionPane.showInputDialog("Ano: ");
                        break;
                        case 3:
                            Cama5.matricula = JOptionPane.showInputDialog("Matrícula: ");
                        break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                        break;
                        case -1:
                            JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                        break;
                        default: // No caso de existir alguma resposta imprevísta 
                        JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta3);
                    }
                    break;
                    case 1: //CadastrarNovoUsuário
                    Cama5.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                    if (Cama5.nomeDiscente != null){
                        Cama5.curso = JOptionPane.showInputDialog("Curso: ");
                            if (Cama5.curso != null){
                                Cama5.ano = JOptionPane.showInputDialog("Ano: ");
                                    if (Cama5.ano != null){
                                        Cama5.matricula = JOptionPane.showInputDialog("Matrícula: ");
                                            if(Cama5.matricula != null){
                                                ocupar();
                                                txtStatus5.setText(String.valueOf(ocupado));
                                                break;
                                            }//fimIfMatricula
                                            else{
                                            JOptionPane.showMessageDialog(null, "Operação cancelada");
                                            }//fimElseMatricula
                                    }//fimIfAno
                                    else{
                                        JOptionPane.showMessageDialog(null, "Operação cancelada");
                                    }//fimElseAno
                            }//fimIfCurso
                            else{
                                JOptionPane.showMessageDialog(null, "Operação cancelada");
                            }//fimElseCurso
                    }//fimIfNomeDiscente
                    else{
                        JOptionPane.showMessageDialog(null, "Operação cancelada");
                        }//FimElseResposta
                break;
                case 2://Desocupar
                    int resposta4 = JOptionPane.showConfirmDialog(null, "Deseja realmente desocupar esta cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (resposta4 == JOptionPane.OK_OPTION){
                    Cama5.nomeDiscente = null;
                    Cama5.matricula = null;
                    Cama5.ano = null;
                    Cama5.curso = null;
                    desocupar();
                    txtStatus5.setText(String.valueOf(ocupado));
                    }
                    else {
                    break;
                    }
                break;
                case 3: //botãoSair
                    JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                case -1: //exit
                    JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                default: // No caso de existir alguma resposta imprevísta 
                    JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta2);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação      
    }//GEN-LAST:event_btnEditInfoCama5ActionPerformed
    private void btnInfoCama6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama6ActionPerformed
        if (Cama6.nomeDiscente != null && Cama6.ano != null && Cama6.curso != null && Cama6.matricula != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede:\nNome: " + Cama6.nomeDiscente 
                                        + "\nCurso: " + Cama6.curso + "\nAno: " + Cama6.ano 
                                        + "\nMatrícula: " + Cama6.matricula,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
        }
        else{JOptionPane.showMessageDialog(null, "Cama desocupada!");
            desocupar();
            txtStatus6.setText(String.valueOf(ocupado));
        }
    }//GEN-LAST:event_btnInfoCama6ActionPerformed
    private void txtStatus6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus6ActionPerformed
    }//GEN-LAST:event_txtStatus6ActionPerformed
    private void btnEditInfoCama6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama6ActionPerformed
        String[] escolha = {"Atualizar um dado", "Fazer um novo Cadastro", "Desocupar", "Sair"};
        String[] escolha2 = {"Nome", "Curso", "ano", "matricula", "Sair"};
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            int resposta2 = JOptionPane.showOptionDialog(null,"O que deseja fazer?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha, escolha[3]);
            switch(resposta2){
                case 0:
                int resposta3 = JOptionPane.showOptionDialog(null,"Qual dos valores você deseja editar?\n","Selecione uma opção.", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, escolha2, escolha2[4]);                
                switch(resposta3){
                    case 0:
                        Cama6.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                    break;
                    case 1:
                        Cama6.curso = JOptionPane.showInputDialog("Curso: ");
                    break;
                    case 2:
                        Cama6.ano = JOptionPane.showInputDialog("Ano: ");
                    break;
                    case 3:
                        Cama6.matricula = JOptionPane.showInputDialog("Matrícula: ");
                    break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                    break;
                    case -1:
                        JOptionPane.showMessageDialog(null, "Operação Finalizada!");                    
                    break;
                    default: // No caso de existir alguma resposta imprevísta 
                    JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta3);
                }
                break;
                case 1://CadastrarNovousuário
                Cama6.nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
                if (Cama6.nomeDiscente != null){
                    Cama6.curso = JOptionPane.showInputDialog("Curso: ");
                        if (Cama6.curso != null){
                            Cama6.ano = JOptionPane.showInputDialog("Ano: ");
                                if (Cama6.ano != null){
                                    Cama6.matricula = JOptionPane.showInputDialog("Matrícula: ");
                                        if(Cama6.matricula != null){
                                            ocupar();
                                            txtStatus6.setText(String.valueOf(ocupado));
                                            break;
                                        }//fimIfMatricula
                                        else{
                                        JOptionPane.showMessageDialog(null, "Operação cancelada");
                                        }//fimElseMatricula
                                }//fimIfAno
                                else{
                                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                                }//fimElseAno
                        }//fimIfCurso
                        else{
                            JOptionPane.showMessageDialog(null, "Operação cancelada");
                        }//fimElseCurso
                }//fimIfNomeDiscente
                else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                    }//FimElseResposta
                break;
                case 2: //Desocupar
                    int resposta4 = JOptionPane.showConfirmDialog(null, "Deseja realmente desocupar esta cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (resposta4 == JOptionPane.OK_OPTION){
                    Cama6.nomeDiscente = null;
                    Cama6.matricula = null;
                    Cama6.ano = null;
                    Cama6.curso = null;
                    desocupar();
                    txtStatus6.setText(String.valueOf(ocupado));
                    }
                    else {
                    break;
                    }
                break;
                case 3: ///botãoSair
                JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                case -1: //exit
                JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                break;
                default: // No caso de existir alguma resposta imprevísta 
                JOptionPane.showMessageDialog(null, "Resposta inesperada! " + resposta2);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação
    }//GEN-LAST:event_btnEditInfoCama6ActionPerformed
    private void btnInfoCama5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama5ActionPerformed
        if (Cama5.nomeDiscente != null && Cama5.ano != null && Cama5.curso != null && Cama5.matricula != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede:\nNome: " + Cama5.nomeDiscente 
                                        + "\nCurso: " + Cama5.curso + "\nAno: " + Cama5.ano 
                                        + "\nMatrícula: " + Cama5.matricula,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
        }
        else{JOptionPane.showMessageDialog(null, "Cama desocupada!");
            desocupar();
            txtStatus5.setText(String.valueOf(ocupado));
        }
    }//GEN-LAST:event_btnInfoCama5ActionPerformed
    private void txtStatus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus5ActionPerformed
    }//GEN-LAST:event_txtStatus5ActionPerformed
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditInfoCama1;
    private javax.swing.JButton btnEditInfoCama2;
    private javax.swing.JButton btnEditInfoCama3;
    private javax.swing.JButton btnEditInfoCama4;
    private javax.swing.JButton btnEditInfoCama5;
    private javax.swing.JButton btnEditInfoCama6;
    private javax.swing.JButton btnInfoCama1;
    private javax.swing.JButton btnInfoCama2;
    private javax.swing.JButton btnInfoCama3;
    private javax.swing.JButton btnInfoCama4;
    private javax.swing.JButton btnInfoCama5;
    private javax.swing.JButton btnInfoCama6;
    private javax.swing.JButton btnSair;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPnlControleDeDormitorio;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblCama1;
    private javax.swing.JLabel lblCama2;
    private javax.swing.JLabel lblCama3;
    private javax.swing.JLabel lblCama4;
    private javax.swing.JLabel lblCama5;
    private javax.swing.JLabel lblCama6;
    private javax.swing.JTextField txtStatus1;
    private javax.swing.JTextField txtStatus2;
    private javax.swing.JTextField txtStatus3;
    private javax.swing.JTextField txtStatus4;
    private javax.swing.JTextField txtStatus5;
    private javax.swing.JTextField txtStatus6;
    // End of variables declaration//GEN-END:variables
}