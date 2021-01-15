/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkh;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import qlkh.entities.Users;

import qlkh.utils.Constants;
import qlkh.views.IView;

/**
 *
 * @author user
 */
public class SignUp extends javax.swing.JFrame implements IView {

    /**
     * Creates new form SignUp
     */
    private static Locale locale;
    private static ResourceBundle bundle;

    public SignUp(Locale local) {
        this.locale = local;
        setResourceBundle(local);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void addBtnSignUpActionListener(ActionListener listener) {
        btnSignUp.addActionListener(listener);
    }

    //hàm set bundle khi truyền vào
    public void setResourceBundle(Locale local) {
        bundle = ResourceBundle.getBundle("qlkh/utils/languages", local);
    }
    
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        btnSignUp = new keeptoo.KButton();
        jLabel10 = new javax.swing.JLabel();
        repassword = new javax.swing.JPasswordField();
        lblErrFullname = new javax.swing.JLabel();
        lblErrEmail = new javax.swing.JLabel();
        lblErrPassword = new javax.swing.JLabel();
        lblErrUsername = new javax.swing.JLabel();
        lblErrRePassword = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setGradientFocus(600);
        kGradientPanel1.setStartColor(new java.awt.Color(153, 0, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(bundle.getString("signUpFullname"));
        jLabel5.setToolTipText("");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(bundle.getString("signUpTitle4"));
        jLabel6.setToolTipText("");
        jLabel6.setAlignmentY(0.0F);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(bundle.getString("signUpEmail"));
        jLabel7.setToolTipText("");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(bundle.getString("signUpUsername"));
        jLabel8.setToolTipText("");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(bundle.getString("signUpPassword"));
        jLabel9.setToolTipText("");

        password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setToolTipText("");
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        btnSignUp.setText(bundle.getString("signUpBtnContinue"));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignUp.setkBorderRadius(40);
        btnSignUp.setkEndColor(new java.awt.Color(0, 204, 204));
        btnSignUp.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        btnSignUp.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btnSignUp.setkStartColor(new java.awt.Color(204, 0, 204));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(bundle.getString("signUpRePassword"));
        jLabel10.setToolTipText("");

        repassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        repassword.setForeground(new java.awt.Color(102, 102, 102));
        repassword.setToolTipText("");
        repassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        lblErrFullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrFullname.setForeground(new java.awt.Color(255, 0, 0));

        lblErrEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrEmail.setForeground(new java.awt.Color(255, 0, 0));

        lblErrPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrPassword.setForeground(new java.awt.Color(255, 0, 0));

        lblErrUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrUsername.setForeground(new java.awt.Color(255, 0, 0));

        lblErrRePassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrRePassword.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(lblErrRePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addComponent(name)
                        .addComponent(lblErrFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(email)
                        .addComponent(lblErrEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(username)
                        .addComponent(lblErrUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(password)
                        .addComponent(lblErrPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(repassword)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblErrUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblErrPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(repassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblErrRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(590, 50, 480, 770);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(bundle.getString("signUpTitle3"));
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(50, 220, 370, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(bundle.getString("signUpTitle1"));
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(50, 60, 230, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText(bundle.getString("signUpTitle2"));
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(50, 190, 230, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/images/grap.png"))); // NOI18N
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(40, 410, 470, 320);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(bundle.getString("signUpLanguages"));
        jLabel11.setToolTipText("");
        kGradientPanel1.add(jLabel11);
        jLabel11.setBounds(940, 10, 80, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VI", "EN" }));
        kGradientPanel1.add(jComboBox1);
        jComboBox1.setBounds(1040, 10, 50, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpActionPerformed

    /**
     * @param args the command line arguments
     */

    //hàm show view
    public void showView() {
        this.setVisible(true);
    }
    
    public void hideView(){
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnSignUp;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblErrEmail;
    private javax.swing.JLabel lblErrFullname;
    private javax.swing.JLabel lblErrPassword;
    private javax.swing.JLabel lblErrRePassword;
    private javax.swing.JLabel lblErrUsername;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
    
    public void showMessage(String message, int color) {
        lblErrRePassword.setText(bundle.getString(message));
        JOptionPane.showMessageDialog(this, bundle.getString(message));
    }
    public void showErrorMessage(JLabel label, String err) {
        label.setText(err);
        label.setForeground(Color.red);
    }

    public Users getNewUsers() {
        Users users = new Users();
        users.setName(name.getText());
        users.setEmail(email.getText());
        users.setUserName(username.getText());
        users.setPassword(String.valueOf(password.getPassword()));
        return users;
    }

    @Override
    public List<Object> getElements(boolean isInsert) {
        List<Object> objects = new ArrayList<>();
        // set Name text field
        name.setName("name");
        email.setName("email");
        username.setName("username");
        password.setName("password");
        repassword.setName("password_confirmation");

        //add object to map
        objects.add(name);
        objects.add(email);
        objects.add(username);
        objects.add(password);
        objects.add(repassword);
        return objects;
    }

    @Override
    public void showErrors(Map<String, String> errors) {
        
        //get error messages
        String errorNameMsg = ((errors.get("name") == null) ? "" : errors.get("name"));
        String errorEmailMsg = ((errors.get("email") == null) ? "" : errors.get("email"));
        String errorUsernameMsg = ((errors.get("username") == null) ? "" : errors.get("username"));
        String errorPasswordMsg = ((errors.get("password") == null) ? "" : errors.get("password"));
        String errorPasswordConfirmMsg = ((errors.get("password_confirmation") == null) ? "" : errors.get("password_confirmation"));
        //show messages
        showErrorMessage(lblErrFullname,errorNameMsg);
        showErrorMessage(lblErrEmail,errorEmailMsg);
        showErrorMessage(lblErrUsername,errorUsernameMsg);
        showErrorMessage(lblErrPassword,errorPasswordMsg);
        showErrorMessage(lblErrRePassword,errorPasswordConfirmMsg);
        
    }
}
