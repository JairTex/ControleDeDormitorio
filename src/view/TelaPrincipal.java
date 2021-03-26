
package view;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    protected String nomeDiscente, nomeDiscente2, nomeDiscente3, nomeDiscente4, nomeDiscente5, nomeDiscente6,
            matricula, matricula2, matricula3, matricula4, matricula5, matricula6,
            discente, discente2, discente3, discente4, discente5, discente6, 
            curso, curso2, curso3, curso4, curso5, curso6, 
            ano, ano2, ano3, ano4, ano5, ano6;
    private boolean ocupado;
    
    /**
     * Creates new form TelaPrincipal
     */
            
    public TelaPrincipal() {
        initComponents();
    }

    public void ocupar(){
        this.ocupado = true;
    }
    public void desocupar(){
        this.ocupado = false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInfoCama1 = new javax.swing.JButton();
        btnInfoCama2 = new javax.swing.JButton();
        btnInfoCama4 = new javax.swing.JButton();
        btnInfoCama3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtStatus1 = new javax.swing.JTextField();
        btnEditInfoCama1 = new javax.swing.JButton();
        txtStatus2 = new javax.swing.JTextField();
        btnEditInfoCama2 = new javax.swing.JButton();
        txtStatus3 = new javax.swing.JTextField();
        btnEditInfoCama3 = new javax.swing.JButton();
        txtStatus4 = new javax.swing.JTextField();
        btnEditInfoCama4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEditInfoCama5 = new javax.swing.JButton();
        btnInfoCama5 = new javax.swing.JButton();
        txtStatus5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnEditInfoCama6 = new javax.swing.JButton();
        btnInfoCama6 = new javax.swing.JButton();
        txtStatus6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        btnInfoCama1.setText("Informações");
        btnInfoCama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama1ActionPerformed(evt);
            }
        });

        btnInfoCama2.setText("Informações");
        btnInfoCama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama2ActionPerformed(evt);
            }
        });

        btnInfoCama4.setText("Informações");
        btnInfoCama4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama4ActionPerformed(evt);
            }
        });

        btnInfoCama3.setText("Informações");
        btnInfoCama3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Controle de Dormitório");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sleep2.png"))); // NOI18N

        txtStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus1ActionPerformed(evt);
            }
        });

        btnEditInfoCama1.setText("...");
        btnEditInfoCama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama1ActionPerformed(evt);
            }
        });

        txtStatus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus2ActionPerformed(evt);
            }
        });

        btnEditInfoCama2.setText("...");
        btnEditInfoCama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama2ActionPerformed(evt);
            }
        });

        txtStatus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus3ActionPerformed(evt);
            }
        });

        btnEditInfoCama3.setText("...");
        btnEditInfoCama3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama3ActionPerformed(evt);
            }
        });

        txtStatus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus4ActionPerformed(evt);
            }
        });

        btnEditInfoCama4.setText("...");
        btnEditInfoCama4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cama 1");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cama 4");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cama 3");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cama 2");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cama 6");

        btnEditInfoCama5.setText("...");
        btnEditInfoCama5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama5ActionPerformed(evt);
            }
        });

        btnInfoCama5.setText("Informações");
        btnInfoCama5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama5ActionPerformed(evt);
            }
        });

        txtStatus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cama 5");

        btnEditInfoCama6.setText("...");
        btnEditInfoCama6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoCama6ActionPerformed(evt);
            }
        });

        btnInfoCama6.setText("Informações");
        btnInfoCama6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCama6ActionPerformed(evt);
            }
        });

        txtStatus6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatus6ActionPerformed(evt);
            }
        });

        jLabel10.setText("Ocupado:");

        jLabel11.setText("Ocupado:");

        jLabel12.setText("Ocupado:");

        jLabel13.setText("Ocupado:");

        jLabel14.setText("Ocupado:");

        jLabel15.setText("Ocupado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditInfoCama1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditInfoCama2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInfoCama1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(btnEditInfoCama3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditInfoCama4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(btnInfoCama2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnInfoCama3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(53, 53, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnInfoCama4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditInfoCama5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditInfoCama6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnInfoCama6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfoCama5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(btnEditInfoCama1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditInfoCama2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInfoCama2)
                            .addComponent(btnInfoCama1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEditInfoCama4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(btnEditInfoCama3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnInfoCama3)
                                    .addComponent(btnInfoCama4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(btnEditInfoCama6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInfoCama6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnInfoCama5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEditInfoCama5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))))
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoCama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama1ActionPerformed
        if (nomeDiscente != null && ano != null && curso != null && matricula != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede\nNome: " + nomeDiscente 
                                        + "\nCurso: " + curso + "\nAno: " + ano 
                                        + "\nMatrícula: " + matricula,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
            ocupar();
            txtStatus1.setText(String.valueOf(ocupado));
        }else{JOptionPane.showMessageDialog(null, "Dados incompletos!!");
            desocupar();
            txtStatus1.setText(String.valueOf(ocupado));
        }
    }//GEN-LAST:event_btnInfoCama1ActionPerformed

    private void txtStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus1ActionPerformed
             // TODO add your handling code here:
    }//GEN-LAST:event_txtStatus1ActionPerformed

    private void txtStatus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatus2ActionPerformed

    private void txtStatus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatus3ActionPerformed

    private void txtStatus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatus4ActionPerformed

    private void btnEditInfoCama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama1ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            nomeDiscente = JOptionPane.showInputDialog("Digite o nome do discente: "); 
            curso = JOptionPane.showInputDialog("Curso: ");
            ano = JOptionPane.showInputDialog("Ano: ");
            matricula = JOptionPane.showInputDialog("Matrícula: "); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação

    }//GEN-LAST:event_btnEditInfoCama1ActionPerformed

    private void btnInfoCama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama2ActionPerformed
        if (nomeDiscente2 != null && ano2 != null && curso2 != null && matricula2 != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede\nNome: " + nomeDiscente2 
                                        + "\nCurso: " + curso2 + "\nAno: " + ano2
                                        + "\nMatrícula: " + matricula2,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
            ocupar();
            txtStatus2.setText(String.valueOf(ocupado));
        }else{JOptionPane.showMessageDialog(null, "Dados incompletos!!");
            desocupar();
            txtStatus2.setText(String.valueOf(ocupado));
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoCama2ActionPerformed

    private void btnInfoCama3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama3ActionPerformed
        if (nomeDiscente3 != null && ano3 != null && curso3 != null && matricula3 != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede\nNome: " + nomeDiscente3 
                                        + "\nCurso: " + curso3 + "\nAno: " + ano3 
                                        + "\nMatrícula: " + matricula3,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
            ocupar();
            txtStatus3.setText(String.valueOf(ocupado));
        }else{JOptionPane.showMessageDialog(null, "Dados incompletos!!");
            desocupar();
            txtStatus3.setText(String.valueOf(ocupado));
        }
   
    }//GEN-LAST:event_btnInfoCama3ActionPerformed

    private void btnInfoCama4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama4ActionPerformed
        if (nomeDiscente4 != null && ano4 != null && curso4 != null && matricula4 != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede\nNome: " + nomeDiscente4 
                                        + "\nCurso: " + curso4 + "\nAno: " + ano4 
                                        + "\nMatrícula: " + matricula4,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
            ocupar();
            txtStatus4.setText(String.valueOf(ocupado));
        }else{JOptionPane.showMessageDialog(null, "Dados incompletos!!");
            desocupar();
            txtStatus4.setText(String.valueOf(ocupado));
        }
    }//GEN-LAST:event_btnInfoCama4ActionPerformed

    private void btnEditInfoCama4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama4ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            nomeDiscente4 = JOptionPane.showInputDialog("Digite o nome do discente: "); 
            curso4 = JOptionPane.showInputDialog("Curso: ");
            ano4 = JOptionPane.showInputDialog("Ano: ");
            matricula4 = JOptionPane.showInputDialog("Matrícula: "); 
        }//fimIfCOnfirmação
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação
        
    }//GEN-LAST:event_btnEditInfoCama4ActionPerformed

    private void btnEditInfoCama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama2ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            nomeDiscente2 = JOptionPane.showInputDialog("Digite o nome do discente: "); 
            curso2 = JOptionPane.showInputDialog("Curso: ");
            ano2 = JOptionPane.showInputDialog("Ano: ");
            matricula2 = JOptionPane.showInputDialog("Matrícula: "); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação

    }//GEN-LAST:event_btnEditInfoCama2ActionPerformed

    private void btnEditInfoCama3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama3ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            nomeDiscente3 = JOptionPane.showInputDialog("Digite o nome do discente: "); 
            curso3 = JOptionPane.showInputDialog("Curso: ");
            ano3 = JOptionPane.showInputDialog("Ano: ");
            matricula3 = JOptionPane.showInputDialog("Matrícula: ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação

    }//GEN-LAST:event_btnEditInfoCama3ActionPerformed

    private void btnEditInfoCama5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama5ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            nomeDiscente5 = JOptionPane.showInputDialog("Digite o nome do discente: "); 
            curso5 = JOptionPane.showInputDialog("Curso: ");
            ano5 = JOptionPane.showInputDialog("Ano: ");
            matricula5 = JOptionPane.showInputDialog("Matrícula: ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação        
    }//GEN-LAST:event_btnEditInfoCama5ActionPerformed

    private void btnInfoCama5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama5ActionPerformed
        if (nomeDiscente5 != null && ano5 != null && curso5 != null && matricula5 != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede\nNome: " + nomeDiscente5 
                                        + "\nCurso: " + curso5 + "\nAno: " + ano5 
                                        + "\nMatrícula: " + matricula5,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
            ocupar();
            txtStatus5.setText(String.valueOf(ocupado));
        }else{JOptionPane.showMessageDialog(null, "Dados incompletos!!");
            desocupar();
            txtStatus5.setText(String.valueOf(ocupado));
        }
    }//GEN-LAST:event_btnInfoCama5ActionPerformed

    private void txtStatus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatus5ActionPerformed

    private void btnEditInfoCama6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoCama6ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja editar os dados referentes a cama?\n", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.OK_OPTION){
            nomeDiscente6 = JOptionPane.showInputDialog("Digite o nome do discente: "); 
            curso6 = JOptionPane.showInputDialog("Curso: ");
            ano6 = JOptionPane.showInputDialog("Ano: ");
            matricula6 = JOptionPane.showInputDialog("Matrícula: ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }//fimElseconfirmação
    }//GEN-LAST:event_btnEditInfoCama6ActionPerformed

    private void btnInfoCama6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCama6ActionPerformed
        if (nomeDiscente6 != null && ano6 != null && curso6 != null && matricula6 != null){
            JOptionPane.showMessageDialog(null,"Dados do hóspede\nNome: " + nomeDiscente6 
                                        + "\nCurso: " + curso6 + "\nAno: " + ano6 
                                        + "\nMatrícula: " + matricula6,
                                        "ATENÇÃO", JOptionPane.PLAIN_MESSAGE);
            ocupar();
            txtStatus6.setText(String.valueOf(ocupado));
        }else{JOptionPane.showMessageDialog(null, "Dados incompletos!!");
            desocupar();
            txtStatus6.setText(String.valueOf(ocupado));
        }
    }//GEN-LAST:event_btnInfoCama6ActionPerformed

    private void txtStatus6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatus6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatus6ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtStatus1;
    private javax.swing.JTextField txtStatus2;
    private javax.swing.JTextField txtStatus3;
    private javax.swing.JTextField txtStatus4;
    private javax.swing.JTextField txtStatus5;
    private javax.swing.JTextField txtStatus6;
    // End of variables declaration//GEN-END:variables
}
