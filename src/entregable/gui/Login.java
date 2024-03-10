package entregable.gui;

import entregable.logic.Persona;
import entregable.logic.Tools;
import java.awt.Color;
import java.util.ArrayList;

public class Login extends javax.swing.JFrame {

    private int contadorLogin = 3;
    private final ArrayList<Persona> listaUsuarios = new ArrayList();

    /**
     * Creates new form Display
     */
    public Login() {
        initComponents();

        // Create admin user
        Persona admin = new Persona("admin", "tineo", "atunca", "admin");
        admin.deposito(531324);
        this.listaUsuarios.add(admin);

        this.desactivarInputLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbBank = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        fieldUser = new javax.swing.JTextField();
        lbUser = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        modalLogin = new javax.swing.JLabel();
        btnLoginTitle = new javax.swing.JButton();
        btnRegistroTitle = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        fieldPassword = new javax.swing.JPasswordField();
        lbUserRegister = new javax.swing.JLabel();
        fieldUserRegister = new javax.swing.JTextField();
        lbPasswordRegister = new javax.swing.JLabel();
        fieldPasswordRegister = new javax.swing.JPasswordField();
        lbApellidoP = new javax.swing.JLabel();
        modalRegister = new javax.swing.JLabel();
        lbApellidoM = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        fieldApellidoP = new javax.swing.JTextField();
        fieldApellidoM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        lbBank.setFont(new java.awt.Font("Nimbus Roman", 1, 48)); // NOI18N
        lbBank.setForeground(new java.awt.Color(10, 9, 8));
        lbBank.setText("BANK");

        jSeparator2.setForeground(new java.awt.Color(255, 102, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        fieldUser.setToolTipText("Username");

        lbUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbUser.setText("Username");

        lbPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbPassword.setText("Password");

        modalLogin.setForeground(new java.awt.Color(255, 0, 0));
        modalLogin.setText("Ingresa un valor correcto");
        modalLogin.setEnabled(false);

        btnLoginTitle.setBackground(new java.awt.Color(204, 66, 78));
        btnLoginTitle.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnLoginTitle.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginTitle.setText("Login");
        btnLoginTitle.setBorderPainted(false);
        btnLoginTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLoginTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginTitleActionPerformed(evt);
            }
        });

        btnRegistroTitle.setBackground(new java.awt.Color(223, 217, 101));
        btnRegistroTitle.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnRegistroTitle.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroTitle.setText("Registro");
        btnRegistroTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroTitleActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(204, 66, 78));
        btnLogin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Acceder");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        fieldPassword.setToolTipText("Password");

        lbUserRegister.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbUserRegister.setText("Username");

        fieldUserRegister.setToolTipText("Username");

        lbPasswordRegister.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbPasswordRegister.setText("Password");

        fieldPasswordRegister.setToolTipText("Password");

        lbApellidoP.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbApellidoP.setText("Apellido Paterno");

        modalRegister.setForeground(new java.awt.Color(255, 0, 0));
        modalRegister.setText("Ingresa un valor correcto");
        modalRegister.setEnabled(false);

        lbApellidoM.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbApellidoM.setText("Apellido Materno");

        btnSignUp.setBackground(new java.awt.Color(223, 217, 101));
        btnSignUp.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Registrar");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        fieldApellidoP.setToolTipText("Apellido");

        fieldApellidoM.setToolTipText("Apellido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(lbBank)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldUser)
                                .addComponent(lbUser)
                                .addComponent(lbPassword)
                                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(modalLogin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbApellidoM)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbApellidoP)
                                    .addGap(79, 79, 79))
                                .addComponent(lbPasswordRegister))
                            .addComponent(lbUserRegister)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fieldPasswordRegister)
                                .addComponent(fieldApellidoM, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldApellidoP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldUserRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(150, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistroTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modalRegister)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(187, 187, 187))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbBank)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistroTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(lbUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lbPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(modalLogin)
                                .addGap(62, 62, 62)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(lbUserRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbApellidoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbApellidoM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPasswordRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(modalRegister)))
                        .addGap(46, 46, 46)))
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        if (!fieldUserRegister.getText().isEmpty()
                && !fieldApellidoP.getText().isEmpty()
                && !fieldApellidoM.getText().isEmpty()
                && !fieldPasswordRegister.getText().isEmpty()) {
            // Ir a frame Display
            Persona nuevoUsuario = new Persona(
                    fieldUserRegister.getText(),
                    fieldApellidoP.getText(),
                    fieldApellidoM.getText(),
                    fieldPasswordRegister.getText()
            );

            listaUsuarios.add(nuevoUsuario);

            fieldUserRegister.setText("");
            fieldApellidoP.setText("");
            fieldApellidoM.setText("");
            fieldPasswordRegister.setText("");

            modalRegister.setForeground(new Color(0, 255, 0));
            Tools.activarModal(modalRegister, "Usuario registrado exitosamente");

        } else {
            Tools.activarModal(modalRegister, "Ingresa un valor correcto");
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (!fieldUser.getText().isEmpty() && !fieldPassword.getText().isEmpty()) {
            // Ir a frame Display
            String username = fieldUser.getText();
            String password = fieldPassword.getText();

            for (Persona usuario : listaUsuarios) {
                if (usuario.getNombre().equals(username) && usuario.verificarPassword(password)) {
                    Display display = new Display(usuario);
                    display.setVisible(true);
                    display.setLocationRelativeTo(null);

                    //cierra ventana Login
                    this.dispose();
                    return;
                } else {
                    if (contadorLogin == 1) {
                        modalLogin.setText("Limite intentos permitidos (3)");
                        this.bloquearBotones();
                        return;
                    } else {
                        contadorLogin--;
                        String mensaje = "Te quedan " + contadorLogin + " intentos";
                        Tools.activarModal(modalLogin, mensaje);
                    }
                }
            }
        } else {
            Tools.activarModal(modalLogin, "Ingresa un valor correcto");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistroTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroTitleActionPerformed
        // TODO add your handling code here:
        lbUserRegister.setVisible(!lbUserRegister.isVisible());
        lbApellidoP.setVisible(!lbApellidoP.isVisible());
        lbApellidoM.setVisible(!lbApellidoM.isVisible());
        lbPasswordRegister.setVisible(!lbPasswordRegister.isVisible());

        fieldUserRegister.setVisible(!fieldUserRegister.isVisible());
        fieldApellidoP.setVisible(!fieldApellidoP.isVisible());
        fieldApellidoM.setVisible(!fieldApellidoM.isVisible());
        fieldPasswordRegister.setVisible(!fieldPasswordRegister.isVisible());
        btnSignUp.setVisible(!btnSignUp.isVisible());
    }//GEN-LAST:event_btnRegistroTitleActionPerformed

    private void btnLoginTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginTitleActionPerformed
        // TODO add your handling code here:
        lbUser.setVisible(!lbUser.isVisible());
        lbPassword.setVisible(!lbPassword.isVisible());

        fieldUser.setVisible(!fieldUser.isVisible());
        fieldPassword.setVisible(!fieldPassword.isVisible());
        btnLogin.setVisible(!btnLogin.isVisible());
    }//GEN-LAST:event_btnLoginTitleActionPerformed

    private void bloquearBotones() {
        fieldUser.setEnabled(false);
        fieldPassword.setEnabled(false);
    }

    private void desactivarInputLabel() {
        // Login visibility - false
        lbUser.setVisible(false);
        lbPassword.setVisible(false);
        modalLogin.setVisible(false);

        fieldUser.setVisible(false);
        fieldPassword.setVisible(false);
        btnLogin.setVisible(false);

        // Register visibility - false
        lbUserRegister.setVisible(false);
        lbApellidoP.setVisible(false);
        lbApellidoM.setVisible(false);
        lbPasswordRegister.setVisible(false);
        modalRegister.setVisible(false);

        fieldUserRegister.setVisible(false);
        fieldApellidoP.setVisible(false);
        fieldApellidoM.setVisible(false);
        fieldPasswordRegister.setVisible(false);
        btnSignUp.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginTitle;
    private javax.swing.JButton btnRegistroTitle;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JTextField fieldApellidoM;
    private javax.swing.JTextField fieldApellidoP;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JPasswordField fieldPasswordRegister;
    private javax.swing.JTextField fieldUser;
    private javax.swing.JTextField fieldUserRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbApellidoM;
    private javax.swing.JLabel lbApellidoP;
    private javax.swing.JLabel lbBank;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPasswordRegister;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbUserRegister;
    private javax.swing.JLabel modalLogin;
    private javax.swing.JLabel modalRegister;
    // End of variables declaration//GEN-END:variables
}
