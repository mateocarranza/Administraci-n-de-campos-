
package administracion;

import servicio.Conexion;

public class Camion extends javax.swing.JFrame {
    
    private String patente;
    private int peso;
    private String carga;
    private int pesoS;
    private int pesoF;

    public Camion() {
        initComponents();
        setVisible(true);
        setResizable(false);

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtFpatente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtFcarga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTxtFpeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTxtFpesoS = new javax.swing.JTextField();
        jTxtFpesoF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxtFpatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFpatenteActionPerformed(evt);
            }
        });

        jLabel1.setText("Patente:");

        jTxtFcarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFcargaActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de carga:");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTxtFpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFpesoActionPerformed(evt);
            }
        });

        jLabel3.setText("Peso de entrada:");

        jButton3.setText("Ir a carga");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTxtFpesoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFpesoSActionPerformed(evt);
            }
        });

        jTxtFpesoF.setEditable(false);
        jTxtFpesoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFpesoFActionPerformed(evt);
            }
        });

        jLabel4.setText("Peso de salida:");

        jLabel5.setText("Peso final:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtFcarga)
                            .addComponent(jTxtFpeso)
                            .addComponent(jTxtFpatente)
                            .addComponent(jTxtFpesoS)
                            .addComponent(jTxtFpesoF)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFpatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFpesoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFpesoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtFcarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        patente = jTxtFpatente.getText();
        peso = Integer.parseInt(jTxtFpeso.getText());
        pesoS = Integer.parseInt(jTxtFpesoS.getText());
        carga = jTxtFcarga.getText();
        pesoF = ( pesoS - peso );
        Conexion c = new Conexion();
        c.addMessage(patente, pesoF, carga);
        jTxtFpatente.setText("");
        jTxtFpeso.setText("");
        jTxtFcarga.setText("");
        jTxtFpesoS.setText("");
        jTxtFpesoF.setText(Integer.toString(pesoF)); 
        jTxtFpesoF.setText(Integer.toString(pesoF)); 
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxtFcargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFcargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFcargaActionPerformed

    private void jTxtFpatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFpatenteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio i = new Inicio();
        dispose();   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTxtFpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpesoActionPerformed

    }//GEN-LAST:event_jTxtFpesoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Carga_dia ca = new Carga_dia();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTxtFpesoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpesoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFpesoSActionPerformed

    private void jTxtFpesoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpesoFActionPerformed
        pesoF = ( pesoS - peso );
        jTxtFpesoF.setText(Integer.toString(pesoF)); 
    }//GEN-LAST:event_jTxtFpesoFActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTxtFcarga;
    private javax.swing.JTextField jTxtFpatente;
    private javax.swing.JTextField jTxtFpeso;
    private javax.swing.JTextField jTxtFpesoF;
    private javax.swing.JTextField jTxtFpesoS;
    // End of variables declaration//GEN-END:variables
}
