/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkh.utils.custombarchart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jfree.chart.axis.SubCategoryAxis;

/**
 *
 * @author Windows 10
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private static final String[] valueOfCbbBarchart = {"Những năm gần nhất", "Năm gần nhất", "7 ngày gần nhất"};
    private static List<BarChartItem> items = new ArrayList<>();
    private static List<BarChartItems> mapItems = new ArrayList<>();

    public NewJFrame() {
        initComponents();
        loadComboBoxBarchart();
        for (int m = 1; m <=6; m++) {
            List<BarChartItem> list = new ArrayList<>();
            int valueImport = 0;
            int valueExport = 0;
            if (m % 2 == 0) {
                valueImport = 10 * 50;
                valueExport = 5;
            } else {
                valueImport = 5;
                valueExport = 10 * 50;
            }
            BarChartItem item1 = new BarChartItem(valueImport, "Import Amount");
            BarChartItem item2 = new BarChartItem(valueExport, "Export Amount");

            BarChartItems item = new BarChartItems(String.valueOf(m) + " a", item1, item2);
            mapItems.add(item);
        }
        String title1 = "Car Usage Statistics";
        String title2 = "Which car do you like?";
        String horizontalTitle = "Month";
        String verticalTitle = " no thing";
        BarChart_AWT chart = new BarChart_AWT("aaaâ",
                title2, mapItems, horizontalTitle, verticalTitle);
        panelBarChart.add(chart);
        SubCategoryAxis domainAxis = new SubCategoryAxis(" ");
        
  

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbbBarchart = new javax.swing.JComboBox<String>();
        panelBarChart = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        panelBarChart.setBackground(new java.awt.Color(255, 255, 255));
        panelBarChart.setLayout(new java.awt.CardLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cbbBarchart, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbBarchart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = cbbBarchart.getSelectedItem().toString();
        if (text.equals(valueOfCbbBarchart[0])) {
            System.out.println("vi tri 0");
        } else if (text.equals(valueOfCbbBarchart[1])) {
            System.out.println("vi tri 1");
        } else if (text.equals(valueOfCbbBarchart[2])) {
            System.out.println("vi tri 2");
        } else if (text.equals(valueOfCbbBarchart[3])) {
            System.out.println("vi tri 3");
        } else {
            System.out.println("vi tri 4");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void loadComboBoxBarchart() {
        for (int i = 0; i < valueOfCbbBarchart.length; i++) {
            cbbBarchart.addItem(valueOfCbbBarchart[i]);
        }
    }

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbBarchart;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelBarChart;
    // End of variables declaration//GEN-END:variables
}
