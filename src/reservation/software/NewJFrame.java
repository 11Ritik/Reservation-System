/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.software;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 11rit
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        userTB = new javax.swing.JTextField();
        passTB = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("USERNAME :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 29));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("PHONE NO :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 119, 100, 30));

        userTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTBActionPerformed(evt);
            }
        });
        getContentPane().add(userTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 235, -1));
        getContentPane().add(passTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 235, -1));

        loginBtn.setBackground(new java.awt.Color(255, 255, 102));
        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 344, -1, -1));

        registerBtn.setBackground(new java.awt.Color(255, 255, 102));
        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registerBtn.setText("SIGNUP");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\ritik\\VIT\\sem 2\\DBMS\\project\\gettyimages-961628368-170667a.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        
        String user= userTB.getText();
        long pass= Integer.parseInt(passTB.getText());
        String newUser = null;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver loaded");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","kholo");
            Statement stmt =con.createStatement();
            String query="select * from profile where pno="+pass;
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("query executed");
            while (rs.next()){
                newUser=rs.getString(2);
            }
            if(user.equals(newUser))
            {
                search s=new search();
                s.show();
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(new JFrame(),"wrong credentials");
            }
            
        }
        catch(ClassNotFoundException e){
            System.out.println("Driver not loaded");
        }
        catch(NumberFormatException e){
            System.out.println("number not found exception");
        }
        catch(SQLException e){
            System.out.println("query not executed");
        }
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        signup sp= new signup();
        sp.show();
        dispose();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void userTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTBActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField passTB;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField userTB;
    // End of variables declaration//GEN-END:variables
}
