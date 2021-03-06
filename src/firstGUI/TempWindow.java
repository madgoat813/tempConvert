/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstGUI;

import java.text.DecimalFormat;

/**
 *
 * @author tmcfall
 */
public class TempWindow extends javax.swing.JFrame {

    /**
     * Creates new form TempWindow
     */
    public TempWindow() {
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

        tempPrompt = new javax.swing.JLabel();
        FtoC = new javax.swing.JButton();
        tempInput = new javax.swing.JTextField();
        CtoF = new javax.swing.JButton();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tempPrompt.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        tempPrompt.setForeground(new java.awt.Color(255, 0, 204));
        tempPrompt.setText("Enter a Temperature:");

        FtoC.setText("F to C");
        FtoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FtoCActionPerformed(evt);
            }
        });

        CtoF.setText("C to F");
        CtoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtoFActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Source Code Pro Black", 0, 36)); // NOI18N
        result.setForeground(new java.awt.Color(0, 0, 255));
        result.setText("?????");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tempPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CtoF)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempInput, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FtoC))
                        .addGap(18, 18, 18)
                        .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempPrompt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FtoC))
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CtoF)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FtoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FtoCActionPerformed
        DecimalFormat df = new DecimalFormat("#.00");
        String fahr = tempInput.getText();
        double numFahr = Double.parseDouble(fahr);
        double numCelc = (numFahr - 32) * 5/9;
        String celc = Double.toString(numCelc);
        result.setText(celc + " C");
    }//GEN-LAST:event_FtoCActionPerformed

    private void CtoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtoFActionPerformed
        DecimalFormat df = new DecimalFormat("#.00");
        String celc = tempInput.getText();
        double numCelc = Double.parseDouble(celc);
        double numFahr = numCelc * 9/5 + 32;
        String fahr = Double.toString(numFahr);
        result.setText(fahr + " F");
    }//GEN-LAST:event_CtoFActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CtoF;
    private javax.swing.JButton FtoC;
    private javax.swing.JLabel result;
    private javax.swing.JTextField tempInput;
    private javax.swing.JLabel tempPrompt;
    // End of variables declaration//GEN-END:variables
}
