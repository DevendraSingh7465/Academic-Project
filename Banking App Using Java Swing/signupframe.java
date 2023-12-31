import java.awt.Color;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;
/**
 *
 * @author deven
 */
public class signupframe extends javax.swing.JFrame {

    /**
     * Creates new form signupframe
     */
    public signupframe() {
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

        genderbuttongroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signin_button2 = new javax.swing.JButton();
        exit_btn2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        signup_entered_username = new javax.swing.JTextField();
        signup_entered_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signup_button2 = new javax.swing.JButton();
        signup_showpass_botton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        gender_male = new javax.swing.JRadioButton();
        gender_female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        signup_entered_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        signup_entered_mobileno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Banking App");
        setBackground(new java.awt.Color(120, 69, 166));
        setMaximumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(242, 151, 101));
        jPanel1.setPreferredSize(new java.awt.Dimension(363, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Welcome back!");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("for Sign in");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("Click on below Button ");

        signin_button2.setBackground(new java.awt.Color(251, 223, 208));
        signin_button2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        signin_button2.setText(" Sign In ");
        signin_button2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        signin_button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_button2ActionPerformed(evt);
            }
        });

        exit_btn2.setBackground(new java.awt.Color(251, 223, 208));
        exit_btn2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        exit_btn2.setText(" Exit ");
        exit_btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        exit_btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signin_button2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(exit_btn2)))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(signin_button2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_btn2)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(197, 197, 197)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(283, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 151, 101));
        jLabel2.setText("Create Account");

        signup_entered_username.setBackground(new java.awt.Color(251, 223, 208));
        signup_entered_username.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        signup_entered_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_entered_usernameActionPerformed(evt);
            }
        });

        signup_entered_password.setBackground(new java.awt.Color(251, 223, 208));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setText("Set Password");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("Name");

        signup_button2.setBackground(new java.awt.Color(242, 151, 101));
        signup_button2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        signup_button2.setText("Sign up");
        signup_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_button2ActionPerformed(evt);
            }
        });

        signup_showpass_botton.setBackground(new java.awt.Color(255, 255, 255));
        signup_showpass_botton.setText("Show Password");
        signup_showpass_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_showpass_bottonActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setText("Gender");

        gender_male.setBackground(new java.awt.Color(255, 255, 255));
        genderbuttongroup.add(gender_male);
        gender_male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gender_male.setText("Male");
        gender_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender_maleActionPerformed(evt);
            }
        });

        gender_female.setBackground(new java.awt.Color(255, 255, 255));
        genderbuttongroup.add(gender_female);
        gender_female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gender_female.setText("Female");
        gender_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender_femaleActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setText("Set Username");

        signup_entered_name.setBackground(new java.awt.Color(251, 223, 208));
        signup_entered_name.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        signup_entered_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_entered_nameActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setText("Mobile No.");

        signup_entered_mobileno.setBackground(new java.awt.Color(251, 223, 208));
        signup_entered_mobileno.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        signup_entered_mobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_entered_mobilenoActionPerformed(evt);
            }
        });
        signup_entered_mobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                signup_entered_mobilenoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                signup_entered_mobilenoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(125, 125, 125))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(signup_button2)
                        .addGap(149, 149, 149))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(gender_male)
                            .addGap(18, 18, 18)
                            .addComponent(gender_female))
                        .addComponent(signup_entered_name, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(signup_entered_username, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(signup_entered_mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(signup_entered_password, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(signup_showpass_botton))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signup_entered_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gender_female, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gender_male)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signup_entered_mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signup_entered_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(signup_entered_password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signup_showpass_botton)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signup_button2)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signup_entered_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_entered_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_entered_usernameActionPerformed

    private void signup_entered_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_entered_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_entered_nameActionPerformed

    private void signin_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_button2ActionPerformed
        
        signinframe sf1 = new signinframe();
        dispose();
        sf1.setVisible(true);
    }//GEN-LAST:event_signin_button2ActionPerformed

    private void signup_showpass_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_showpass_bottonActionPerformed
        if(signup_showpass_botton.isSelected()){
            signup_entered_password.setEchoChar((char)0);
        }
        else{
            signup_entered_password.setEchoChar('*');
        }
    }//GEN-LAST:event_signup_showpass_bottonActionPerformed
    String Gender;
    private void signup_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_button2ActionPerformed
        if(signup_entered_name.getText().equals("") && signup_entered_username.getText().equals("") && signup_entered_password.getText().equals("") && (!gender_male.isSelected() && !gender_female.isSelected() )){
            JOptionPane.showMessageDialog(null,"Please fill the given form");
        } 
        else if(signup_entered_name.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter your name");
        }
        else if((!gender_male.isSelected() && !gender_female.isSelected() )){
            JOptionPane.showMessageDialog(null,"Please click on male or female");
        }
        else if(signup_entered_mobileno.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter your mobile number");
        }
        else if(!signup_entered_mobileno.getText().equals("") && signup_entered_mobileno.getText().length()!=10){
            JOptionPane.showMessageDialog(null,"Please enter valid mobile number.");
            signup_entered_mobileno.setText(null);
        }
        else if(signup_entered_username.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please set username for sign in");
        }
        else if(signup_entered_password.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please set password for sign in");
        }
        else{
            
            Random random = new Random();
            int random_balance = random.nextInt(60000)+20000;
            FileWriter fw;
            try{
                fw = new FileWriter("SignupDetails.txt",true);
                fw.write(signup_entered_name.getText()+"$"+Gender+"$"+signup_entered_mobileno.getText()+"$"+signup_entered_username.getText()+"$"+signup_entered_password.getText()+"$"+random_balance+"\n");
                fw.close();
                
            }
            catch(Exception e){
                e.printStackTrace();
            }
            signinframe sf3 = new signinframe();
            JOptionPane.showMessageDialog(null,"Registration Done. Now you can sign in");
            dispose();
            sf3.setVisible(true);
        }
    }//GEN-LAST:event_signup_button2ActionPerformed

    private void gender_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender_maleActionPerformed
        Gender = "Male";
    }//GEN-LAST:event_gender_maleActionPerformed

    private void gender_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender_femaleActionPerformed
         Gender = "Female";
    }//GEN-LAST:event_gender_femaleActionPerformed

    private void exit_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btn2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_btn2ActionPerformed

    private void signup_entered_mobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_entered_mobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_entered_mobilenoActionPerformed

    private void signup_entered_mobilenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signup_entered_mobilenoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
    }//GEN-LAST:event_signup_entered_mobilenoKeyTyped

    private void signup_entered_mobilenoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signup_entered_mobilenoKeyReleased
//        String mobileNo = signup_entered_mobileno.getText();
//        if(mobileNo.length()==10){
//            signup_entered_mobileno.setBackground(Color.green);
//            
//        }
//        else{
//            signup_entered_mobileno.setBackground(Color.red);
//        }
    }//GEN-LAST:event_signup_entered_mobilenoKeyReleased

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
            java.util.logging.Logger.getLogger(signupframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_btn2;
    private javax.swing.JRadioButton gender_female;
    private javax.swing.JRadioButton gender_male;
    private javax.swing.ButtonGroup genderbuttongroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton signin_button2;
    private javax.swing.JButton signup_button2;
    private javax.swing.JTextField signup_entered_mobileno;
    private javax.swing.JTextField signup_entered_name;
    private javax.swing.JPasswordField signup_entered_password;
    private javax.swing.JTextField signup_entered_username;
    private javax.swing.JRadioButton signup_showpass_botton;
    // End of variables declaration//GEN-END:variables
}
