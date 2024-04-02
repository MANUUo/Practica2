package practica2;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author meme1
 */
public class Viajes extends javax.swing.JFrame {

    /**
     * Creates new form Viajes
     */
    JLabel lblCarro = new JLabel();
    JLabel lblCarro2 = new JLabel();
    JLabel lblCarro3 = new JLabel();
    
    private String PP;
    private String PD;
    private String Vehiculo;
    
    public Viajes() {
        initComponents();
        //Vehiculo 1
        lblCarro.setBounds(150, 50, 120, 80);
        ImageIcon image = new ImageIcon("src/Vehiculos/carro1.png");
        Icon icon = new  ImageIcon(image.getImage().getScaledInstance(lblCarro.getWidth(), lblCarro.getHeight(), Image.SCALE_DEFAULT));
        lblCarro.setIcon(icon);
        getContentPane().add(lblCarro);
        
        //Vehiculo 2
        lblCarro2.setBounds(150, 150, 120, 80);
        ImageIcon image2 = new ImageIcon("src/Vehiculos/moto1.png");
        Icon icon2 = new  ImageIcon(image2.getImage().getScaledInstance(lblCarro2.getWidth(), lblCarro2.getHeight(), Image.SCALE_DEFAULT));
        lblCarro2.setIcon(icon2);
        getContentPane().add(lblCarro2);
        
        //Vehiculo 3
        lblCarro3.setBounds(150, 250, 120, 80);
        ImageIcon image3 = new ImageIcon("src/Vehiculos/carrop1.png");
        Icon icon3 = new  ImageIcon(image3.getImage().getScaledInstance(lblCarro3.getWidth(), lblCarro3.getHeight(), Image.SCALE_DEFAULT));
        lblCarro3.setIcon(icon3);
        getContentPane().add(lblCarro3);
    }

    
    public void setPP(String pp){
        this.PP = pp;
        lblPP.setText(pp);
    }
    
    public void setPD(String pd){
        this.PD = pd;
        lblPD.setText(pd);
    }
    
    public void setVehiculo(String vehiculo){
        this.Vehiculo = vehiculo;
        lblVehiculo.setText(vehiculo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMuro = new javax.swing.JLabel();
        btnInicio1 = new javax.swing.JButton();
        btnInicio2 = new javax.swing.JButton();
        btnInicio3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblPD = new javax.swing.JLabel();
        lblPP = new javax.swing.JLabel();
        lblVehiculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnInicio1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnInicio1.setText("Iniciar");
        btnInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio1ActionPerformed(evt);
            }
        });

        btnInicio2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnInicio2.setText("Iniciar");
        btnInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio2ActionPerformed(evt);
            }
        });

        btnInicio3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnInicio3.setText("Iniciar");
        btnInicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicio3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jButton1.setText("Iniciar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPD.setText("Punto de Destino");

        lblPP.setText("Punto de Partida");

        lblVehiculo.setText("Vehiculo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 612, Short.MAX_VALUE)
                .addComponent(lblMuro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(btnInicio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInicio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(btnInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnInicio2)
                .addGap(81, 81, 81)
                .addComponent(btnInicio3)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblPP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVehiculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio1ActionPerformed
        Carro auto = new Carro(this, lblCarro.getX());
        auto.start();
    }//GEN-LAST:event_btnInicio1ActionPerformed

    private void btnInicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio2ActionPerformed
        Carro2 auto2 = new Carro2(this,lblCarro2.getX());
        auto2.start();
    }//GEN-LAST:event_btnInicio2ActionPerformed

    private void btnInicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicio3ActionPerformed
        Carro3 auto3 = new Carro3(this, lblCarro3.getX());
        auto3.start();
    }//GEN-LAST:event_btnInicio3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Carro auto = new Carro(this, lblCarro.getX());
        auto.start();
        Carro2 auto2 = new Carro2(this,lblCarro2.getX());
        auto2.start();
        Carro3 auto3 = new Carro3(this, lblCarro3.getX());
        auto3.start();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio1;
    private javax.swing.JButton btnInicio2;
    private javax.swing.JButton btnInicio3;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel lblMuro;
    private javax.swing.JLabel lblPD;
    private javax.swing.JLabel lblPP;
    private javax.swing.JLabel lblVehiculo;
    // End of variables declaration//GEN-END:variables
}
