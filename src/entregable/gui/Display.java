package entregable.gui;

import entregable.logic.Persona;

/**
 *
 * @author tineo
 */
public class Display extends javax.swing.JFrame {

    private final Persona usuario;

    /**
     * Creates new form Display
     *
     * @param _usuario
     */
    public Display(Persona _usuario) {
        this.usuario = _usuario;

        initComponents();

        // Load data
        lbWelcome.setText("Bienvenido, " + this.usuario.getNombre().toUpperCase());
        modalOption.setVisible(false);
        modalOption.setEnabled(false);

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
        lbWelcome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOptions = new javax.swing.JList<>();
        fieldOption = new javax.swing.JTextField();
        modalOption = new javax.swing.JLabel();
        btnOption = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbSaldoTitle = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        lbOperacion = new javax.swing.JLabel();
        fieldOperation = new javax.swing.JTextField();
        modalOperation = new javax.swing.JLabel();
        btnOperation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbWelcome.setFont(new java.awt.Font("Noto Mono", 0, 24)); // NOI18N
        lbWelcome.setText("Welcome");

        listOptions.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. Consulta", "2. Retiro", "3. Deposito", "4. Salir" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listOptions);

        fieldOption.setText("1");

        modalOption.setForeground(new java.awt.Color(255, 0, 0));
        modalOption.setText("Ingrese opcion valida");

        btnOption.setText("Acceder");
        btnOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Noto Mono", 0, 24)); // NOI18N
        lbTitulo.setText("Cuenta Bancaria");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbSaldoTitle.setText("Saldo de la cuenta");

        lbSaldo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lbSaldo.setText("Oculto");

        lbOperacion.setText("Operacion");

        fieldOperation.setText("monto");

        modalOperation.setForeground(new java.awt.Color(255, 0, 0));
        modalOperation.setText("Ingrese opcion valida");

        btnOperation.setText("Ejecutar operacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modalOption)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(btnOption))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fieldOption, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(89, 89, 89)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(213, 213, 213)
                                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(283, 283, 283)
                                                .addComponent(lbOperacion))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(241, 241, 241)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnOperation)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(modalOperation)
                                                        .addGap(8, 8, 8)))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbSaldoTitle)
                        .addGap(124, 124, 124)
                        .addComponent(lbSaldo)))
                .addGap(238, 238, 238))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSaldoTitle)
                            .addComponent(lbSaldo))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(fieldOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(modalOption)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOption)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(lbOperacion)
                                .addGap(38, 38, 38)
                                .addComponent(fieldOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modalOperation)
                                .addGap(18, 18, 18)))
                        .addComponent(btnOperation))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionActionPerformed
        // TODO add your handling code here:
        String optionText = fieldOption.getText();
        int option = Integer.parseInt(optionText);

        switch (option) {
            case 1:
                //mostrarSaldo();
                break;
            case 2:
                //ejecutarRetiro();
                break;
            case 3:
                //ejecutarDeposito();
                break;
            case 4:
                //volverLogin();
                break;
            default:
                modalOption.setText("Ingrese opcion valida");
                modalOption.setVisible(true);
                modalOption.setEnabled(true);

        }
    }//GEN-LAST:event_btnOptionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOperation;
    private javax.swing.JButton btnOption;
    private javax.swing.JTextField fieldOperation;
    private javax.swing.JTextField fieldOption;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbOperacion;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbSaldoTitle;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JList<String> listOptions;
    private javax.swing.JLabel modalOperation;
    private javax.swing.JLabel modalOption;
    // End of variables declaration//GEN-END:variables
}
