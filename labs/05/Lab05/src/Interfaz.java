import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Interfaz extends javax.swing.JFrame {

    Entrada entrada = new Entrada();
    
    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Casos COVID-19 por Municipio");

        jButton1.setText("Generar graficas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jRadioButton1.setText("Recuperados");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Fallecidos");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Todos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Filtro por estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel2)))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float[] casosPorMunicipiosTodos = entrada.casosPorMunicipiosTodos();
        float[] casosPorMunicipiosMuertos = entrada.casosPorMunicipiosMuertos();
        float[] municipiosGraficar = new float[22];
        
        boolean[] botones = new boolean[]{jRadioButton1.isSelected(),jRadioButton2.isSelected(),jRadioButton3.isSelected()};
        
        if(botones[0]&!botones[1]){
            for(int i=0;i<22;i++){
                municipiosGraficar[i]=casosPorMunicipiosTodos[i]-casosPorMunicipiosMuertos[i];
            }
        }
        if(!botones[0]&botones[1]){
            for(int i=0;i<22;i++){
                municipiosGraficar[i]=casosPorMunicipiosMuertos[i];
            }
        }
        if(botones[0]==botones[1]||botones[2]){
            for(int i=0;i<22;i++){
                municipiosGraficar[i]=casosPorMunicipiosTodos[i];
            }
        }
        
        
        //Barras
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        datos.setValue(municipiosGraficar[0], "BARANOA", "Municipio");
        datos.setValue(municipiosGraficar[1], "CAMPO DE LA CRUZ", "Municipio");
        datos.setValue(municipiosGraficar[2], "CANDELARIA", "Municipio");
        datos.setValue(municipiosGraficar[3], "GALAPA", "Municipio");
        datos.setValue(municipiosGraficar[4], "JUAN DE ACOSTA", "Municipio");
        datos.setValue(municipiosGraficar[5], "LURUACO", "Municipio");
        datos.setValue(municipiosGraficar[6], "MALAMBO", "Municipio");
        datos.setValue(municipiosGraficar[7], "MANATI", "Municipio");
        datos.setValue(municipiosGraficar[8], "PALMAR DE VARELA", "Municipio");
        datos.setValue(municipiosGraficar[9], "PIOJO", "Municipio");
        datos.setValue(municipiosGraficar[10], "POLO NUEVO", "Municipio");
        datos.setValue(municipiosGraficar[11], "PONEDERA", "Municipio");
        datos.setValue(municipiosGraficar[12], "PUERTO COLOMBIA", "Municipio");
        datos.setValue(municipiosGraficar[13], "REPELON", "Municipio");
        datos.setValue(municipiosGraficar[14], "SABANAGRANDE", "Municipio");
        datos.setValue(municipiosGraficar[15], "SABANALARGA", "Municipio");
        datos.setValue(municipiosGraficar[16], "SANTA LUCIA", "Municipio");
        datos.setValue(municipiosGraficar[17], "SANTO TOMAS", "Municipio");
        datos.setValue(municipiosGraficar[18], "SOLEDAD", "Municipio");
        datos.setValue(municipiosGraficar[19], "SUAN", "Municipio");
        datos.setValue(municipiosGraficar[20], "TUBARA", "Municipio");
        datos.setValue(municipiosGraficar[21], "USIACURI", "Municipio");
        
        JFreeChart barras = ChartFactory.createBarChart("Casos por municipio", "Municipio", "Casos", datos, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel1 = new ChartPanel(barras);
        panel1.setMouseWheelEnabled(true);

        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(panel1, BorderLayout.NORTH);
        pack();
        repaint();
        
        //Pastel
        float prueba=0;
        for(int i=0;i<22;i++){
            prueba+=municipiosGraficar[i];
        }
        
                
        DefaultPieDataset datos1 = new DefaultPieDataset();

        datos1.setValue("BARANOA (" + (municipiosGraficar[0] * 100) / prueba + "%)", municipiosGraficar[0]);
        datos1.setValue("CAMPO DE LA CRUZ (" + (municipiosGraficar[1] * 100) / prueba + "%)", municipiosGraficar[1]);
        datos1.setValue("CANDELARIA (" + (municipiosGraficar[2] * 100) / prueba + "%)", municipiosGraficar[2]);
        datos1.setValue("GALAPA (" + (municipiosGraficar[3] * 100) / prueba + "%)", municipiosGraficar[3]);
        datos1.setValue("JUAN DE ACOSTA (" + (municipiosGraficar[4] * 100) / prueba + "%)", municipiosGraficar[4]);
        datos1.setValue("LURUACO (" + (municipiosGraficar[5] * 100) / prueba + "%)", municipiosGraficar[5]);
        datos1.setValue("MALAMBO (" + (municipiosGraficar[6] * 100) / prueba + "%)", municipiosGraficar[6]);
        datos1.setValue("MANATI (" + (municipiosGraficar[7] * 100) / prueba + "%)", municipiosGraficar[7]);
        datos1.setValue("PALMAR DE VARELA (" + (municipiosGraficar[8] * 100) / prueba + "%)", municipiosGraficar[8]);
        datos1.setValue("PIOJO (" + (municipiosGraficar[9] * 100) / prueba + "%)", municipiosGraficar[9]);
        datos1.setValue("POLO NUEVO (" + (municipiosGraficar[10] * 100) / prueba + "%)", municipiosGraficar[10]);
        datos1.setValue("PONEDERA (" + (municipiosGraficar[11] * 100) / prueba + "%)", municipiosGraficar[11]);
        datos1.setValue("PUERTO COLOMBIA (" + (municipiosGraficar[12] * 100) / prueba + "%)", municipiosGraficar[12]);
        datos1.setValue("REPELON (" + (municipiosGraficar[13] * 100) / prueba + "%)", municipiosGraficar[13]);
        datos1.setValue("SABANAGRANDE (" + (municipiosGraficar[14] * 100) / prueba + "%)", municipiosGraficar[14]);
        datos1.setValue("SABANALARGA (" + (municipiosGraficar[15] * 100) / prueba + "%)", municipiosGraficar[15]);
        datos1.setValue("SANTA LUCIA (" + (municipiosGraficar[16] * 100) / prueba + "%)", municipiosGraficar[16]);
        datos1.setValue("SANTO TOMAS (" + (municipiosGraficar[17] * 100) / prueba + "%)", municipiosGraficar[17]);
        datos1.setValue("SOLEDAD (" + (municipiosGraficar[18] * 100) / prueba + "%)", municipiosGraficar[18]);
        datos1.setValue("SUAN (" + (municipiosGraficar[19] * 100) / prueba + "%)", municipiosGraficar[19]);
        datos1.setValue("TUBARA (" + (municipiosGraficar[20] * 100) / prueba + "%)", municipiosGraficar[20]);
        datos1.setValue("USIACURI (" + (municipiosGraficar[21] * 100) / prueba + "%)", municipiosGraficar[21]);
        
        JFreeChart pastel = ChartFactory.createPieChart("Casos por municipio", datos1, true, true, false);

        ChartPanel panel_temporal = new ChartPanel(pastel);
        panel_temporal.setMouseWheelEnabled(true);

        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(panel_temporal, BorderLayout.NORTH);

        pack();
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
