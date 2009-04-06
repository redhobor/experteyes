/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProjectSelectAdvanceSetUpDialog.java
 *
 * Created on Mar 26, 2009, 4:57:45 PM
 */
package eyetrackercalibrator.gui;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author ruj
 */
public class ProjectSelectAdvanceSetUpDialog extends javax.swing.JDialog {


    double distanceFromMonitor = 0;
    double monitorHeightCM = 0;
    double monitorWidthCM = 0;

    /** @return 0 if anything is wrong. Positive double otherwise */
    public double getDistanceFromMonitor() {
        return distanceFromMonitor;
    }

    public void setDistanceFromMonitor(double distanceFromMonitor) {
        setTextField(distanceFromMonitorTextField, distanceFromMonitor);
        this.distanceFromMonitor = getTextFieldDoubleValue(distanceFromMonitorTextField);
    }

    /** @return 0 if anything is wrong. Positive double otherwise */
    public double getMonitorHeight() {
        return monitorHeightCM;
    }

    public void setMonitorHeight(double monitorHeight) {
        setTextField(monitorHeightCMTextField, monitorHeight);
        this.monitorHeightCM = getTextFieldDoubleValue(monitorHeightCMTextField);
    }

    /** @return 0 if anything is wrong. Positive double otherwise */
    public double getMonitorWidth() {
        return monitorWidthCM;
    }

    public void setMonitorWidth(double monitorWidth) {
        setTextField(monitorWidthCMTextField, monitorWidth);
        this.monitorWidthCM = getTextFieldDoubleValue(monitorWidthCMTextField);
    }

    /** Creates new form ProjectSelectAdvanceSetUpDialog */
    public ProjectSelectAdvanceSetUpDialog(JFrame owner, String title, boolean modal) {
        super(owner, title, modal);
        initComponents();
    }

    protected void setTextField(JTextField textField, double value) {
        if (value > 0) {
            textField.setText(String.valueOf(value));
        } else {
            textField.setText("");
        }
    }

    protected double getTextFieldDoubleValue(JTextField textField) {
        String text = textField.getText();
        if (text.length() > 0) {
            try {
                return Double.parseDouble(text);
            } catch (NumberFormatException numberFormatException) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldEmptyPositiveDoubleInputVerifier1 = new eyetrackercalibrator.gui.util.TextFieldEmptyPositiveDoubleInputVerifier();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        monitorWidthCMTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        monitorHeightCMTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        distanceFromMonitorTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Monitor size:");

        jLabel11.setText("Width");

        monitorWidthCMTextField.setInputVerifier(textFieldEmptyPositiveDoubleInputVerifier1);

        jLabel10.setText("x Height");

        monitorHeightCMTextField.setInputVerifier(textFieldEmptyPositiveDoubleInputVerifier1);

        jLabel18.setText("cm");

        jLabel1.setText("Distance from the monitor:");

        distanceFromMonitorTextField.setInputVerifier(textFieldEmptyPositiveDoubleInputVerifier1);

        jLabel19.setText("cm");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .add(saveButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cancelButton))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1))
                    .add(jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(jLabel11)
                        .add(2, 2, 2)
                        .add(monitorWidthCMTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(distanceFromMonitorTextField))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel10)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(monitorHeightCMTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel18))
                    .add(jLabel19))
                .add(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(jLabel10)
                    .add(monitorWidthCMTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9)
                    .add(jLabel18)
                    .add(monitorHeightCMTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(distanceFromMonitorTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel19))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelButton)
                    .add(saveButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        distanceFromMonitor = getTextFieldDoubleValue(distanceFromMonitorTextField);
        monitorHeightCM = getTextFieldDoubleValue(monitorHeightCMTextField);
        monitorWidthCM = getTextFieldDoubleValue(monitorWidthCMTextField);
        this.dispose();
}//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField distanceFromMonitorTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField monitorHeightCMTextField;
    private javax.swing.JTextField monitorWidthCMTextField;
    private javax.swing.JButton saveButton;
    private eyetrackercalibrator.gui.util.TextFieldEmptyPositiveDoubleInputVerifier textFieldEmptyPositiveDoubleInputVerifier1;
    // End of variables declaration//GEN-END:variables
}
