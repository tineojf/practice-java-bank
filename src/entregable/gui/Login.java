package entregable.gui;

import entregable.logic.Persona;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author tineo
 */
public class Login extends javax.swing.JFrame {

    private int contadorLogin = 0;
    private final ArrayList<Persona> listaUsuarios = new ArrayList();

    /**
     * Creates new form Display
     */
    public Login() {
        initComponents();

        // Create admin user
        Persona admin = new Persona("admin", "tineo", "atunca", "admin");
        this.listaUsuarios.add(admin);

        // Login visibility
        lbUser.setVisible(!lbUser.isVisible());
        lbPassword.setVisible(!lbPassword.isVisible());
        modalLogin.setVisible(false);
        modalLogin.setEnabled(false);

        fieldUser.setVisible(!fieldUser.isVisible());
        fieldPassword.setVisible(!fieldPassword.isVisible());

        // Register visibility
        lbUserRegister.setVisible(!lbUserRegister.isVisible());
        lbApellidoP.setVisible(!lbApellidoP.isVisible());
        lbApellidoM.setVisible(!lbApellidoM.isVisible());
        lbPasswordRegister.setVisible(!lbPasswordRegister.isVisible());
        modalRegister.setVisible(false);
        modalRegister.setEnabled(false);

        fieldUserRegister.setVisible(!fieldUserRegister.isVisible());
        fieldApellidoP.setVisible(!fieldApellidoP.isVisible());
        fieldApellidoM.setVisible(!fieldApellidoM.isVisible());
        fieldPasswordRegister.setVisible(!fieldPasswordRegister.isVisible());
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
        btnDisplay = new javax.swing.JButton();
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
        fieldApellidoP = new javax.swing.JPasswordField();
        fieldApellidoM = new javax.swing.JPasswordField();
        modalRegister = new javax.swing.JLabel();
        lbApellidoM = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        lbBank.setFont(new java.awt.Font("Noto Mono", 0, 48)); // NOI18N
        lbBank.setText("BANK");

        jSeparator2.setForeground(new java.awt.Color(255, 102, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        fieldUser.setToolTipText("Username");

        lbUser.setText("Username");

        lbPassword.setText("Password");

        modalLogin.setForeground(new java.awt.Color(255, 0, 0));
        modalLogin.setText("Ingresa un valor correcto");
        modalLogin.setEnabled(false);

        btnLoginTitle.setFont(new java.awt.Font("Noto Mono", 0, 24)); // NOI18N
        btnLoginTitle.setText("Login");
        btnLoginTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginTitleActionPerformed(evt);
            }
        });

        btnRegistroTitle.setFont(new java.awt.Font("Noto Mono", 0, 24)); // NOI18N
        btnRegistroTitle.setText("Registro");
        btnRegistroTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroTitleActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Noto Mono", 0, 30)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 255));
        btnLogin.setText("Acceder");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        fieldPassword.setToolTipText("Password");

        lbUserRegister.setText("Username");

        fieldUserRegister.setToolTipText("Username");

        lbPasswordRegister.setText("Password");

        fieldPasswordRegister.setToolTipText("Password");

        lbApellidoP.setText("Apellido Paterno");

        fieldApellidoP.setToolTipText("Apellido");

        fieldApellidoM.setToolTipText("Apellido");

        modalRegister.setForeground(new java.awt.Color(255, 0, 0));
        modalRegister.setText("Ingresa un valor correcto");
        modalRegister.setEnabled(false);

        lbApellidoM.setText("Apellido Materno");

        btnSignUp.setFont(new java.awt.Font("Noto Mono", 0, 30)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(0, 204, 51));
        btnSignUp.setText("Registrar");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnLoginTitle)
                        .addGap(161, 161, 161))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldUser)
                                    .addComponent(lbUser)
                                    .addComponent(lbPassword)
                                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLogin)
                                    .addComponent(modalLogin))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbUserRegister)
                                .addComponent(fieldUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(btnRegistroTitle)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbApellidoM)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbApellidoP)
                                        .addComponent(fieldApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fieldApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbPasswordRegister)
                                .addComponent(fieldPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSignUp)
                            .addComponent(modalRegister))))
                .addGap(189, 189, 189))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnDisplay))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(lbBank)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbBank)
                        .addGap(80, 80, 80)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnRegistroTitle)
                        .addGap(50, 50, 50)
                        .addComponent(lbUserRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbApellidoP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbApellidoM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbPasswordRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modalRegister)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(btnLoginTitle))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(lbUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lbPassword)
                                .addGap(18, 18, 18)
                                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modalLogin)
                        .addGap(58, 58, 58)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnSignUp))
                .addGap(91, 91, 91)
                .addComponent(btnDisplay)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bloquearBotones() {
        fieldUser.setEnabled(false);
        fieldPassword.setEnabled(false);
    }
    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // Change Login to Display
        //Display pantalla = new Display();
        //pantalla.setVisible(true);
        bloquearBotones();
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnLoginTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginTitleActionPerformed
        // TODO add your handling code here:
        lbUser.setVisible(!lbUser.isVisible());
        lbPassword.setVisible(!lbPassword.isVisible());

        fieldUser.setVisible(!fieldUser.isVisible());
        fieldPassword.setVisible(!fieldPassword.isVisible());


    }//GEN-LAST:event_btnLoginTitleActionPerformed

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
    }//GEN-LAST:event_btnRegistroTitleActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (!fieldUser.getText().isEmpty() && !fieldPassword.getText().isEmpty()) {
            // Ir a frame Display
            String username = fieldUser.getText();
            String password = fieldPassword.getText();

            for (Persona usuario : listaUsuarios) {
                if (usuario.getNombre().equals(username) && usuario.verificarPassword(password)) {
                    Display display = new Display();
                    display.setVisible(true);

                    //cierra ventana Login
                    this.dispose();
                    return;
                } else {
                    contadorLogin++;
                    if (contadorLogin == 3) {
                        modalLogin.setText("Limite intentos permitidos (" + contadorLogin + ")");
                        modalLogin.setVisible(true);
                        modalLogin.setEnabled(true);
                        bloquearBotones();
                        return;
                    }
                }
            }
        } else {
            modalLogin.setText("Ingresa un valor correcto");
            modalLogin.setVisible(true);
            modalLogin.setEnabled(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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

            modalRegister.setText("Usuario registrado exitosamente");
            modalRegister.setForeground(new Color(0, 255, 0));
            modalRegister.setVisible(true);
            modalRegister.setEnabled(true);

        } else {
            modalRegister.setText("Ingresa un valor correcto");
            modalRegister.setVisible(true);
            modalRegister.setEnabled(true);
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginTitle;
    private javax.swing.JButton btnRegistroTitle;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPasswordField fieldApellidoM;
    private javax.swing.JPasswordField fieldApellidoP;
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
