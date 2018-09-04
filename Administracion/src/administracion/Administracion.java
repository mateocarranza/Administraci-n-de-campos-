
package administracion;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import servicio.ConexionTemporal;


public class Administracion extends javax.swing.JFrame {
    

    private int pesoF;

    public Administracion() {
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setVisible(true);
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
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        jLabel2.setText("Tipo de material:");

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

        jButton5.setText("salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtFpeso, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jTxtFpesoS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtFpesoF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtFcarga, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtFpatente))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabel2)
                    .addComponent(jTxtFcarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTxtFpesoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTxtFcarga.getText().equals("") | (jTxtFpatente.getText().equals("") | (jTxtFpeso.getText().equals("") | jTxtFpesoS.getText().equals(""))) ){
            JOptionPane.showMessageDialog(null, "Debes cargar todos los datos antes de ingresar", "error", JOptionPane.DEFAULT_OPTION);
        }else{
            Camion c = new Camion();
            c.setPatente(jTxtFpatente.getText());
            c.setPeso(Integer.parseInt(jTxtFpeso.getText()));
            c.setPesoS(Integer.parseInt(jTxtFpesoS.getText()));
            c.setMaterial(jTxtFcarga.getText());
            if(c.getPeso() > c.getPesoS()){
                JOptionPane.showMessageDialog(null, "el peso de salida debe ser mayor que el de entrada", "error", JOptionPane.DEFAULT_OPTION);
            }else{
               pesoF = c.pefoF();
                c.cargaDeDatos();
                c.cargaDedatosTenporal();
                jTxtFpatente.setText("");
                jTxtFpeso.setText("");
                jTxtFcarga.setText("");
                jTxtFpesoS.setText("");
                jTxtFpesoF.setText(Integer.toString(pesoF)); 
            }
            
        }
         

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxtFcargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFcargaActionPerformed
        jTxtFcarga.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (jTxtFcarga.getText().equals("") | (jTxtFpatente.getText().equals("") | (jTxtFpeso.getText().equals("") | jTxtFpesoS.getText().equals(""))) ){
            JOptionPane.showMessageDialog(null, "Debes cargar todos los datos antes de ingresar", "error", JOptionPane.DEFAULT_OPTION);
        }else{
            Camion c = new Camion();
            c.setPatente(jTxtFpatente.getText());
            c.setPeso(Integer.parseInt(jTxtFpeso.getText()));
            c.setPesoS(Integer.parseInt(jTxtFpesoS.getText()));
            c.setMaterial(jTxtFcarga.getText());
            if(c.getPeso() > c.getPesoS()){
                JOptionPane.showMessageDialog(null, "el peso de salida debe ser mayor que el de entrada", "error", JOptionPane.DEFAULT_OPTION);
            }else{
               pesoF = c.pefoF();
                c.cargaDeDatos();
                c.cargaDedatosTenporal();
                jTxtFpatente.setText("");
                jTxtFpeso.setText("");
                jTxtFcarga.setText("");
                jTxtFpesoS.setText("");
                jTxtFpesoF.setText(Integer.toString(pesoF)); 
            }
            
        }
        }                                     
                
        });
    }//GEN-LAST:event_jTxtFcargaActionPerformed

    private void jTxtFpatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpatenteActionPerformed
        jTxtFpatente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (jTxtFcarga.getText().equals("") | (jTxtFpatente.getText().equals("") | (jTxtFpeso.getText().equals("") | jTxtFpesoS.getText().equals(""))) ){
            JOptionPane.showMessageDialog(null, "Debes cargar todos los datos antes de ingresar", "error", JOptionPane.DEFAULT_OPTION);
        }else{
            Camion c = new Camion();
            c.setPatente(jTxtFpatente.getText());
            c.setPeso(Integer.parseInt(jTxtFpeso.getText()));
            c.setPesoS(Integer.parseInt(jTxtFpesoS.getText()));
            c.setMaterial(jTxtFcarga.getText());
            if(c.getPeso() > c.getPesoS()){
                JOptionPane.showMessageDialog(null, "el peso de salida debe ser mayor que el de entrada", "error", JOptionPane.DEFAULT_OPTION);
            }else{
               pesoF = c.pefoF();
                c.cargaDeDatos();
                c.cargaDedatosTenporal();
                jTxtFpatente.setText("");
                jTxtFpeso.setText("");
                jTxtFcarga.setText("");
                jTxtFpesoS.setText("");
                jTxtFpesoF.setText(Integer.toString(pesoF)); 
            }
            
        }
        }                                     
                
        });
    }//GEN-LAST:event_jTxtFpatenteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Inicio i = new Inicio();
        } catch (SQLException ex) {
            Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTxtFpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpesoActionPerformed
        jTxtFpeso.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (jTxtFcarga.getText().equals("") | (jTxtFpatente.getText().equals("") | (jTxtFpeso.getText().equals("") | jTxtFpesoS.getText().equals(""))) ){
            JOptionPane.showMessageDialog(null, "Debes cargar todos los datos antes de ingresar", "error", JOptionPane.DEFAULT_OPTION);
        }else{
            Camion c = new Camion();
            c.setPatente(jTxtFpatente.getText());
            c.setPeso(Integer.parseInt(jTxtFpeso.getText()));
            c.setPesoS(Integer.parseInt(jTxtFpesoS.getText()));
            c.setMaterial(jTxtFcarga.getText());
            if(c.getPeso() > c.getPesoS()){
                JOptionPane.showMessageDialog(null, "el peso de salida debe ser mayor que el de entrada", "error", JOptionPane.DEFAULT_OPTION);
            }else{
               pesoF = c.pefoF();
                c.cargaDeDatos();
                c.cargaDedatosTenporal();
                jTxtFpatente.setText("");
                jTxtFpeso.setText("");
                jTxtFcarga.setText("");
                jTxtFpesoS.setText("");
                jTxtFpesoF.setText(Integer.toString(pesoF)); 
            }
            
        }
        }                                     
                
        });
    }//GEN-LAST:event_jTxtFpesoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            Carga_dia ca = new Carga_dia();
        } catch (SQLException ex) {
            Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTxtFpesoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpesoSActionPerformed
        jTxtFpesoS.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (jTxtFcarga.getText().equals("") | (jTxtFpatente.getText().equals("") | (jTxtFpeso.getText().equals("") | jTxtFpesoS.getText().equals(""))) ){
            JOptionPane.showMessageDialog(null, "Debes cargar todos los datos antes de ingresar", "error", JOptionPane.DEFAULT_OPTION);
        }else{
            Camion c = new Camion();
            c.setPatente(jTxtFpatente.getText());
            c.setPeso(Integer.parseInt(jTxtFpeso.getText()));
            c.setPesoS(Integer.parseInt(jTxtFpesoS.getText()));
            c.setMaterial(jTxtFcarga.getText());
            if(c.getPeso() > c.getPesoS()){
                JOptionPane.showMessageDialog(null, "el peso de salida debe ser mayor que el de entrada", "error", JOptionPane.DEFAULT_OPTION);
            }else{
               pesoF = c.pefoF();
                c.cargaDeDatos();
                c.cargaDedatosTenporal();
                jTxtFpatente.setText("");
                jTxtFpeso.setText("");
                jTxtFcarga.setText("");
                jTxtFpesoS.setText("");
                jTxtFpesoF.setText(Integer.toString(pesoF)); 
            }
            
        }
        }                                     
                
        });
    }//GEN-LAST:event_jTxtFpesoSActionPerformed

    private void jTxtFpesoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpesoFActionPerformed

    }//GEN-LAST:event_jTxtFpesoFActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConexionTemporal c = new ConexionTemporal();
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (resp == 0){
            try {
                c.borrarTabla(ConexionTemporal.obtener());
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
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
