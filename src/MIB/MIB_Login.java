/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIB;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author atacankais
 */
public class MIB_Login extends javax.swing.JFrame {

    /**
     * Creates new form MIB_Login
     */
    public MIB_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LösenordText = new javax.swing.JPasswordField();
        LoggaInButton = new javax.swing.JButton();
        AnvändarnamnText = new javax.swing.JTextField();
        Användarnamn = new javax.swing.JLabel();
        Lösenord = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LösenordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LösenordTextActionPerformed(evt);
            }
        });

        LoggaInButton.setText("Logga in");
        LoggaInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoggaInButtonMouseClicked(evt);
            }
        });
        LoggaInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoggaInButtonActionPerformed(evt);
            }
        });

        AnvändarnamnText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnvändarnamnTextActionPerformed(evt);
            }
        });

        Användarnamn.setText("Användarnamn:");

        Lösenord.setText("Lösenord:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("Inloggning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoggaInButton)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Användarnamn)
                    .addComponent(Lösenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LösenordText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(AnvändarnamnText, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnvändarnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Användarnamn))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LösenordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lösenord))
                .addGap(28, 28, 28)
                .addComponent(LoggaInButton)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoggaInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoggaInButtonActionPerformed
        
        var username = AnvändarnamnText.getText();
        var password = LösenordText.getPassword();
        try
        {
            class.forName(com.mysql.cj.jdbc.Driver);
            connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mibdb", "mibdba", "mibkey");
            ResultSet rs =smnt.executeQuery("SELECT * from Agent where Agent_ID ='"+username"')
        }
    }//GEN-LAST:event_LoggaInButtonActionPerformed

    private void LösenordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LösenordTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LösenordTextActionPerformed

    private void AnvändarnamnTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnvändarnamnTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnvändarnamnTextActionPerformed

    private void LoggaInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoggaInButtonMouseClicked
        String lösenord = new String(LösenordText.getPassword());
        if(AnvändarnamnText.getText().equals("user") && lösenord.equals("pass") )
        {
            JOptionPane.showMessageDialog(null, "Inloggning lyckades");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Inloggning misslyckades");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_LoggaInButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MIB_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MIB_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MIB_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MIB_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MIB_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Användarnamn;
    private javax.swing.JTextField AnvändarnamnText;
    private javax.swing.JButton LoggaInButton;
    private javax.swing.JLabel Lösenord;
    private javax.swing.JPasswordField LösenordText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
