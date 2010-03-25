/*
* Copyright (c) 2009 by Thomas Busey and Ruj Akavipat
* All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
*     * Redistributions of source code must retain the above copyright
*       notice, this list of conditions and the following disclaimer.
*     * Redistributions in binary form must reproduce the above copyright
*       notice, this list of conditions and the following disclaimer in the
*       documentation and/or other materials provided with the distribution.
*     * Neither the name of the Experteyes nor the
*       names of its contributors may be used to endorse or promote products
*       derived from this software without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY Thomas Busey and Ruj Akavipat ''AS IS'' AND ANY
* EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
* WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL Thomas Busey and Ruj Akavipat BE LIABLE FOR ANY
* DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
* (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
* LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
* ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package gui;

import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;

/*
 * ThresholdPanel.java
 *
 * Created on March 20, 2008, 3:09 PM
 */
/**
 *
 * @author  dwyatte
 */
public class ThresholdPanel extends javax.swing.JPanel {

    private boolean dirty = false;
    FitEyeModelSetup parent;
    // starting values
    private int crThresh = 128;
    private int pupilThresh = 128;

    public void setCrThresh(int crThresh) {
        this.crThresh = crThresh;
        this.crThreshSlider.setValue(crThresh);
    }

    public void setPupilThresh(int pupilThresh) {
        this.pupilThresh = pupilThresh;
        this.pupilThreshSlider.setValue(pupilThresh);
    }

    /** @return true when threshold values change but no pupil estimation is run */
    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean isDirty) {
        this.dirty = isDirty;
    }

    // threshold enumeration
    public enum ThresholdType {

        NO_THRESH_TYPE, PUPIL_THRESH_TYPE, CR_THRESH_TYPE
    }
    ThresholdType threshType = ThresholdType.NO_THRESH_TYPE;

    /** Creates new form ThresholdPanel */
    public ThresholdPanel() {
        initComponents();
        // set default state of buttons
        setNoThreshold();
    }

    public void setParent(FitEyeModelSetup parent) {
        this.parent = parent;
    }

    public void setNoThreshold() {
        noThreshButton.setSelected(true);
        threshType = ThresholdType.NO_THRESH_TYPE;
    }

    public ThresholdType getThresholdType() {
        return threshType;
    }

    public int getCRThresh() {
        return crThresh;
    }

    public int getPupilThresh() {
        return pupilThresh;
    }

    public void addPupilThreshSliderStateChangeListener(ChangeListener listener) {
        pupilThreshSlider.addChangeListener(listener);
    }

    public void addEstimatePupilLocationButtonActionListener(ActionListener listener) {
        this.estimatePupilLocationButton.addActionListener(listener);
    }

    public void addLoadPupilLocationButtonActionListener(ActionListener listener) {
        this.loadEstimatedPupilLocationButton.addActionListener(listener);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        crThreshButton = new javax.swing.JRadioButton();
        estimatePupilLocationButton = new javax.swing.JButton();
        noThreshButton = new javax.swing.JRadioButton();
        threshTypeLabel = new javax.swing.JLabel();
        loadEstimatedPupilLocationButton = new javax.swing.JButton();
        crThreshSlider = new javax.swing.JSlider();
        crThreshLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pupilThreshLabel = new javax.swing.JLabel();
        pupilThreshSlider = new javax.swing.JSlider();
        pupilThreshButton = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(50, 50));

        buttonGroup1.add(crThreshButton);
        crThreshButton.setText("CR");
        crThreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crThreshButtonActionPerformed(evt);
            }
        });

        estimatePupilLocationButton.setText("Estimate pupil locations");
        estimatePupilLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estimatePupilLocationButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(noThreshButton);
        noThreshButton.setText("None");
        noThreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noThreshButtonActionPerformed(evt);
            }
        });

        threshTypeLabel.setText("Threshold Type");

        loadEstimatedPupilLocationButton.setText("Load pupil locations");
        loadEstimatedPupilLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadEstimatedPupilLocationButtonActionPerformed(evt);
            }
        });

        crThreshSlider.setMaximum(255);
        crThreshSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                crThreshSliderStateChanged(evt);
            }
        });

        crThreshLabel.setText("CR Threshold");

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("resources/ThresholdPanel"); // NOI18N
        jLabel1.setText(bundle.getString("Instruction Label")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pupilThreshLabel.setText("Pupil Threshold");

        pupilThreshSlider.setMaximum(255);
        pupilThreshSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pupilThreshSliderStateChanged(evt);
            }
        });

        buttonGroup1.add(pupilThreshButton);
        pupilThreshButton.setText("Pupil");
        pupilThreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pupilThreshButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(loadEstimatedPupilLocationButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(estimatePupilLocationButton))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(threshTypeLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(crThreshLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(pupilThreshLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(noThreshButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(pupilThreshButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(crThreshButton))
                            .add(crThreshSlider, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, pupilThreshSlider, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)))
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pupilThreshSlider, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(pupilThreshLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(crThreshLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .add(crThreshSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(threshTypeLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(noThreshButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(pupilThreshButton)
                        .add(crThreshButton)))
                .add(32, 32, 32)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(loadEstimatedPupilLocationButton)
                    .add(estimatePupilLocationButton))
                .add(276, 276, 276))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void crThreshSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_crThreshSliderStateChanged
        crThresh = crThreshSlider.getValue();
        // repaint image with new info
        parent.setFrame(parent.getFrame());

        this.dirty = true;
    }//GEN-LAST:event_crThreshSliderStateChanged

    private void pupilThreshSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pupilThreshSliderStateChanged
        pupilThresh = pupilThreshSlider.getValue();
        // repaint image with new info
        parent.setFrame(parent.getFrame());

        this.dirty = true;
    }//GEN-LAST:event_pupilThreshSliderStateChanged

    private void crThreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crThreshButtonActionPerformed
        threshType = ThresholdType.CR_THRESH_TYPE;
        // repaint image with new info
        parent.setFrame(parent.getFrame());
}//GEN-LAST:event_crThreshButtonActionPerformed

    private void noThreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noThreshButtonActionPerformed
        threshType = ThresholdType.NO_THRESH_TYPE;
        // repaint image with new info
        parent.setFrame(parent.getFrame());
}//GEN-LAST:event_noThreshButtonActionPerformed

    private void pupilThreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pupilThreshButtonActionPerformed
        threshType = ThresholdType.PUPIL_THRESH_TYPE;
        // repaint image with new info
        parent.setFrame(parent.getFrame());
}//GEN-LAST:event_pupilThreshButtonActionPerformed

    private void estimatePupilLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estimatePupilLocationButtonActionPerformed
        this.dirty = false;
    }//GEN-LAST:event_estimatePupilLocationButtonActionPerformed

    private void loadEstimatedPupilLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadEstimatedPupilLocationButtonActionPerformed
        this.dirty = false;
    }//GEN-LAST:event_loadEstimatedPupilLocationButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton crThreshButton;
    private javax.swing.JLabel crThreshLabel;
    private javax.swing.JSlider crThreshSlider;
    private javax.swing.JButton estimatePupilLocationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loadEstimatedPupilLocationButton;
    private javax.swing.JRadioButton noThreshButton;
    private javax.swing.JRadioButton pupilThreshButton;
    private javax.swing.JLabel pupilThreshLabel;
    private javax.swing.JSlider pupilThreshSlider;
    private javax.swing.JLabel threshTypeLabel;
    // End of variables declaration//GEN-END:variables
}