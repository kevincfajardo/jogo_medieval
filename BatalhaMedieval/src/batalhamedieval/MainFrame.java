/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhamedieval;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */


public class MainFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setResizable(false);
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grbClassP1 = new javax.swing.ButtonGroup();
        grbClassP2 = new javax.swing.ButtonGroup();
        txtP1Name = new javax.swing.JTextField();
        txtP2Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnWarrior = new javax.swing.JRadioButton();
        btnBerseker = new javax.swing.JRadioButton();
        btnPaladin = new javax.swing.JRadioButton();
        cbxWPP1 = new javax.swing.JComboBox<>();
        lbP1hp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnWarriorP2 = new javax.swing.JRadioButton();
        btnBersekerP2 = new javax.swing.JRadioButton();
        btnPaladinP2 = new javax.swing.JRadioButton();
        cbxWPP2 = new javax.swing.JComboBox<>();
        lbP2hp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtP1Name.setText("Player - 1");
        txtP1Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtP1NameActionPerformed(evt);
            }
        });

        txtP2Name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtP2Name.setText("Player - 2");

        jLabel1.setText("Nome:");

        jLabel2.setText("Nome:");

        grbClassP1.add(btnWarrior);
        btnWarrior.setSelected(true);
        btnWarrior.setText("Guerreiro");

        grbClassP1.add(btnBerseker);
        btnBerseker.setText("Barbaro");

        grbClassP1.add(btnPaladin);
        btnPaladin.setText("Paladino");

        cbxWPP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espada", "Machado", "Lança", "Bastão" }));

        lbP1hp.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        lbP1hp.setForeground(new java.awt.Color(51, 255, 51));
        lbP1hp.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("HP:");

        grbClassP2.add(btnWarriorP2);
        btnWarriorP2.setSelected(true);
        btnWarriorP2.setText("Guerreiro");
        btnWarriorP2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnWarriorP2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        grbClassP2.add(btnBersekerP2);
        btnBersekerP2.setText("Barbaro");
        btnBersekerP2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        grbClassP2.add(btnPaladinP2);
        btnPaladinP2.setText("Paladino");
        btnPaladinP2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        cbxWPP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espada", "Machado", "Lança", "Bastão" }));

        lbP2hp.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        lbP2hp.setForeground(new java.awt.Color(51, 255, 51));
        lbP2hp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbP2hp.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText(":HP");

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane1.setViewportView(txtLog);

        btnStart.setBackground(new java.awt.Color(0, 153, 0));
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Iniciar");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setBackground(new java.awt.Color(255, 0, 0));
        btnStop.setForeground(new java.awt.Color(255, 255, 255));
        btnStop.setText("Interromper");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnRestart.setBackground(new java.awt.Color(255, 255, 0));
        btnRestart.setText("Reiniciar");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtP1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtP2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWarrior)
                            .addComponent(btnBerseker)
                            .addComponent(btnPaladin)
                            .addComponent(cbxWPP1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbP1hp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnWarriorP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBersekerP2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnPaladinP2, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbP2hp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(cbxWPP2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtP2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnWarrior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBerseker)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPaladin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnWarriorP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBersekerP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPaladinP2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxWPP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbP1hp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxWPP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbP2hp)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtP1NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtP1NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtP1NameActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        //Pra continuar de onde parou, em caso de apertar interromper
        if(!_continue){
            defineCharacter();
            _continue = false;
        }
        flagP1 = true;
        flagP2 = true;
        Thread p1Thread = new Thread(p1Run);
        Thread p2Thread = new Thread(p2Run);
        p1Thread.start();
        p2Thread.start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        flagP1 = false;
        flagP2 = false;
        _continue = true;
        try {
            callLog("Jogo Interrompido \n\n");
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        flagP1 = false;
        flagP2 = false;
        _continue = false;
        try {
            callLog("Jogo Reiniciado \n\n");
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtLog.setText("");
        defineCharacter();
        flagP1 = true;
        flagP2 = true;
        Thread p1Thread = new Thread(p1Run);
        Thread p2Thread = new Thread(p2Run);
        p1Thread.start();
        p2Thread.start();
    }//GEN-LAST:event_btnRestartActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    //Define os dados dos personagens
    public void defineCharacter(){
        if(btnWarrior.isSelected()){
            p1 = new Player(txtP1Name.getText(), "Guerrreiro", 4, 3, 30);
        } else if (btnBerseker.isSelected()){
            p1 = new Player(txtP1Name.getText(), "Barbaro", 5, 2, 40);
        } else {
            p1 = new Player(txtP1Name.getText(), "Paladino", 3, 4, 25);
        }
        lbP1hp.setText(""+p1.getHealth());
        l1 = new Log(p1.getName());
        
        if(btnWarriorP2.isSelected()){
            p2 = new Player(txtP2Name.getText(), "Guerrreiro", 4, 3, 30);
        } else if (btnBersekerP2.isSelected()){
            p2 = new Player(txtP2Name.getText(), "Barbaro", 5, 2, 40);
        } else {
            p2 = new Player(txtP2Name.getText(), "Paladino", 3, 4, 25);
        }
        lbP2hp.setText(""+p2.getHealth());
        l2 = new Log(p2.getName());
        
        defineWeapon1();
        defineWeapon2();
        
    }
    //Define os dados da arma do P1
    private void defineWeapon1(){
        switch (cbxWPP1.getSelectedIndex()) {
            case 0:
                p1.setWeaponName("Espada");
                p1.setDamage(8);
                p1.setAttackSpeed(2);
                break;
            case 1:
                p1.setWeaponName("Machado");
                p1.setDamage(12);
                p1.setAttackSpeed(4);
                break;
            case 2:
                p1.setWeaponName("Lança");
                p1.setDamage(10);
                p1.setAttackSpeed(3);
                break;
            default:
                p1.setWeaponName("Bastão");
                p1.setDamage(6);
                p1.setAttackSpeed(1);
                break;
        }
    }
    //Define os dados da arma do P2
    private void defineWeapon2(){
        switch (cbxWPP2.getSelectedIndex()) {
            case 0:
                p2.setWeaponName("Espada");
                p2.setDamage(8);
                p2.setAttackSpeed(2);
                break;
            case 1:
                p2.setWeaponName("Machado");
                p2.setDamage(12);
                p2.setAttackSpeed(4);
                break;
            case 2:
                p2.setWeaponName("Lança");
                p2.setDamage(10);
                p2.setAttackSpeed(3);
                break;
            default:
                p2.setWeaponName("Bastão");
                p2.setDamage(6);
                p2.setAttackSpeed(1);
                break;
        }
    }
    //Chama o sleep pra facilita a vida
    private void callSleep(int seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void callLog(String txt) throws IOException{
        try (FileWriter fw = new FileWriter("Log.txt", true);
                BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(txt);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    //Thread do P1
    Runnable p1Run = new Runnable() {
        @Override
        public void run(){
            callSleep(2000);
            while(flagP1) {
                String p2Name = p2.getName();
                if(p2.getHealth() <= 0){
                    txtLog.setText(txtLog.getText()+l1.wimMsg());
                    try {
                        callLog(l1.wimMsg());
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    flagP1 = false;
                    flagP2 = false;
                    break;
                }
                
               int dmgValue; 
               txtLog.setText(txtLog.getText()+ l1.attackMsg(p1.getWeaponName()));
                try {
                    callLog(l1.attackMsg(p1.getWeaponName()));
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
               if(p1.weaponAttack(p1.getDextery())){
                    txtLog.setText(txtLog.getText()+l1.hitMsg(p2Name));
                    try {
                        callLog(l1.hitMsg(p2Name) + "");
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    dmgValue = p1.attackDamage(p1.getDamage());
                    p2.takeDmg(dmgValue);
                    txtLog.setText(txtLog.getText()+l1.dmgMsg(p2Name, dmgValue));
                    try {
                        callLog(l1.dmgMsg(p2Name, dmgValue));
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (p2.getHealth() < 0){
                        lbP2hp.setText(""+0);
                    } else {
                        lbP2hp.setText(""+p2.getHealth());
                    }
                    
                } else {
                   txtLog.setText(txtLog.getText() + l1.missAttack());
                   try {
                       callLog(l1.missAttack());
                   } catch (IOException ex) {
                       Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
               
               int seconds = p1.getAttackSpeed()*1000;
               callSleep(seconds);
                
            }
               
        }
    };
    //Thread do P2
    Runnable p2Run = new Runnable() {
        @Override
        public void run(){
            callSleep(2000);
            while(flagP2){
                String p1Name = p1.getName();
                if(p1.getHealth() <= 0){
                     txtLog.setText(txtLog.getText()+l2.wimMsg());
                    try {
                        callLog(l2.wimMsg());
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    flagP1 = false;
                    flagP2 = false;
                    break;
                }
                int dmgValue; 
                txtLog.setText(txtLog.getText()+ l2.attackMsg(p2.getWeaponName()));
                  try {
                      callLog(l2.attackMsg(p2.getWeaponName()));
                  } catch (IOException ex) {
                      Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
               if(p2.weaponAttack(p2.getDextery())){
                    txtLog.setText(txtLog.getText()+l2.hitMsg(p1Name));
                    try {
                        callLog(l2.hitMsg(p1Name));
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dmgValue = p1.attackDamage(p1.getDamage());
                    
                    p1.takeDmg(dmgValue);
                    txtLog.setText(txtLog.getText()+l2.dmgMsg(p1Name, dmgValue));
                    try {
                        callLog(l2.dmgMsg(p1Name, dmgValue));
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (p1.getHealth() < 0){
                        lbP1hp.setText(""+0);
                    } else {
                        lbP1hp.setText(""+p1.getHealth());
                    }
                } else {
                   txtLog.setText(txtLog.getText() + l2.missAttack());
                   try {
                       callLog(l1.missAttack());
                   } catch (IOException ex) {
                       Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
               
               int seconds = p2.getAttackSpeed()*1000;
               callSleep(seconds);
            }

        }
    };
    
    
    
    private Player p1, p2;
    private Log l1, l2;
    private boolean flagP1 = true, flagP2 = true, _continue = false; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnBerseker;
    private javax.swing.JRadioButton btnBersekerP2;
    private javax.swing.JRadioButton btnPaladin;
    private javax.swing.JRadioButton btnPaladinP2;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JRadioButton btnWarrior;
    private javax.swing.JRadioButton btnWarriorP2;
    private javax.swing.JComboBox<String> cbxWPP1;
    private javax.swing.JComboBox<String> cbxWPP2;
    private javax.swing.ButtonGroup grbClassP1;
    private javax.swing.ButtonGroup grbClassP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbP1hp;
    private javax.swing.JLabel lbP2hp;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtP1Name;
    private javax.swing.JTextField txtP2Name;
    // End of variables declaration//GEN-END:variables
}
