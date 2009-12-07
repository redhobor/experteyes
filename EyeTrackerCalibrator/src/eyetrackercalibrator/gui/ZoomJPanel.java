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
/*
 * ZoomJPanel.java
 *
 * Created on October 19, 2007, 12:53 PM
 */

package eyetrackercalibrator.gui;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author  SQ
 */
public class ZoomJPanel extends javax.swing.JPanel {
    private BufferedImage originalImage = null;
    private int scale = 2;
    private Point2D.Double selectedPoint = new Point2D.Double(0d,0d);
    
    /** Creates new form ZoomJPanel */
    public ZoomJPanel() {
        initComponents();
        // Clear artifact
        scrollableMarkableJLable.setText(null);
        Cursor crosshairCursor = new Cursor(Cursor.CROSSHAIR_CURSOR);
        scrollableMarkableJLable.setCursor(crosshairCursor);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zoomInButton = new javax.swing.JButton();
        zoomOutButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollableMarkableJLable = new eyetrackercalibrator.gui.ScrollableMarkableJLable();
        jLabel1 = new javax.swing.JLabel();

        zoomInButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zoomInButton.setText("+");
        zoomInButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        zoomInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomInButtonActionPerformed(evt);
            }
        });

        zoomOutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zoomOutButton.setText("-");
        zoomOutButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        zoomOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomOutButtonActionPerformed(evt);
            }
        });

        doneButton.setText("Done");

        scrollableMarkableJLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrollableMarkableJLableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(scrollableMarkableJLable);

        jLabel1.setText("Zoom:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(doneButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 154, Short.MAX_VALUE)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(zoomInButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(zoomOutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(doneButton)
                    .add(zoomOutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(zoomInButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void scrollableMarkableJLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollableMarkableJLableMouseClicked
        // Get current point
        setSelectedPoint(evt.getPoint());
        repaint();
    }//GEN-LAST:event_scrollableMarkableJLableMouseClicked
    
    private void zoomOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomOutButtonActionPerformed
// Scale the picture
        scale--;
        scale = Math.max(scale,1);
        displayScalePicture(scale);
    }//GEN-LAST:event_zoomOutButtonActionPerformed
    
    private void zoomInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomInButtonActionPerformed
// Scale the picture
        scale++;
        try{
            displayScalePicture(scale);
        }catch(OutOfMemoryError e){
            scale--;
            // Open warning about out of memory
            // Open dialog to warn user
            JOptionPane.showMessageDialog(this,
                    "We are currently out of memory therefore cannot zoom any further.",
                    "Cannot zoome further",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_zoomInButtonActionPerformed
    
    /**
     * Setting image will reset the selected point on the picute
     */
    public void setImage(BufferedImage image){
        // Clear old selected point
        setSelectedPoint(null);
        
        originalImage = image;
        // Reset scale
        scale = 2;
        if(image != null){
            displayScalePicture(2);
        }else{
            scrollableMarkableJLable.setIcon(null);
        }
        
        repaint();
    }
    
    /**
     * Display scaled picture along with its selected point in scale
     * @param scale cannot be less than 1
     */
    private void displayScalePicture(int scale){
        // Handle image scaling
        if(scale > 1){
            int width = originalImage.getWidth() * scale;
            
            scrollableMarkableJLable.setIcon(new ImageIcon(
                    originalImage.getScaledInstance(width,-1,Image.SCALE_FAST)));
        }else{
            scrollableMarkableJLable.setIcon(new ImageIcon(originalImage));
        }
        // Handle point scaling
        Point[] points = scrollableMarkableJLable.getMarkedPoints(MarkableJLabel.MarkColor.GREEN);
        if(points != null){
            points[0].setLocation(
                    this.selectedPoint.x * scale,
                    this.selectedPoint.y * scale);
        }
        
        // enlarge mark size accoringly
        scrollableMarkableJLable.setPointMarkLength(
                MarkableJLabel.DEFAULT_POINT_MARK_LENGTH * scale);
    }
    
    public Point2D getSelectedPoint() {
        if(scrollableMarkableJLable.getMarkedPoints(MarkableJLabel.MarkColor.GREEN) != null){
            return (Point2D) selectedPoint.clone();
        }else{
            return null;
        }
    }
    
    /**
     * @param selectedPoint null to clear the point
     */
    public void setSelectedPoint(Point2D selectedPoint) {
        if(selectedPoint == null){
            scrollableMarkableJLable.setMarkedPoints(null, MarkableJLabel.MarkColor.GREEN);
            this.selectedPoint.setLocation(0d,0d);
        }else{
            // Convert selected point to scale
            this.selectedPoint.setLocation(
                    selectedPoint.getX() / (double)scale,
                    selectedPoint.getY() / (double)scale);
            
            Point[] points = scrollableMarkableJLable.getMarkedPoints(MarkableJLabel.MarkColor.GREEN);
            
            if(points == null){
                points = new Point[1];
                points[0] = new Point();
            }
            points[0].setLocation(selectedPoint);
            scrollableMarkableJLable.setMarkedPoints(points, MarkableJLabel.MarkColor.GREEN);
        }
        repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private eyetrackercalibrator.gui.ScrollableMarkableJLable scrollableMarkableJLable;
    private javax.swing.JButton zoomInButton;
    private javax.swing.JButton zoomOutButton;
    // End of variables declaration//GEN-END:variables
    
    public void addDoneButtonActionListener(ActionListener listener){
        doneButton.addActionListener(listener);
    }
    
    public void removeDoneButtonActionListener(ActionListener listener){
        doneButton.removeActionListener(listener);
    }
}