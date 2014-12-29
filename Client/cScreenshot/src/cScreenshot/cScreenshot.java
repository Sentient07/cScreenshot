/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cScreenshot;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author ramana
 */
public class cScreenshot extends javax.swing.JFrame {
    boolean mulMonitor = false;
    boolean temp = false;
    /**
     * Creates new form cScreenshot
     */
    public cScreenshot() {
        initComponents();
    }
    
    private BufferedImage takeScreenShot(Robot ro1, Rectangle rec1){
        
        BufferedImage sshot = null;
        
        return sshot;
        
    }
    
    private void closeWindow(){
        this.setVisible(false);
        new java.util.Timer().schedule( 
            new java.util.TimerTask() {
                
                @Override
                public void run() {
                // your code here
                temp = true;
                }
            },5000 
        );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        sMonitor = new javax.swing.JRadioButton();
        mMonitor = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("cScreenshot");

        jToggleButton1.setText("Capture");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Monitor Configuration");

        buttonGroup1.add(sMonitor);
        sMonitor.setText("Single Monitor");
        sMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMonitorActionPerformed(evt);
            }
        });

        buttonGroup1.add(mMonitor);
        mMonitor.setText("Multiple Monitor");
        mMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMonitorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(sMonitor)
                                .addGap(26, 26, 26)
                                .addComponent(mMonitor)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sMonitor)
                    .addComponent(mMonitor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.closeWindow();
        
        if(!(sMonitor.isSelected()) && !(mMonitor.isSelected())){
            javax.swing.JOptionPane.showMessageDialog(rootPane,
                    "Select One of the Radio Buttons Before Proceeding");
        }

        else {
            
            Calendar now = Calendar.getInstance();
            Robot robo = null ;
            
            try {
                robo = new Robot();
            } catch (AWTException ex) {
                Logger.getLogger(cScreenshot.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
            
            BufferedImage screenshot ;
            
            
            if (this.mulMonitor == false) {
                
                screenshot = robo.createScreenCapture(new 
                    Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                
                Toolkit.getDefaultToolkit().beep();
                    
                
            }
            else {
                GraphicsEnvironment ge = 
                        GraphicsEnvironment.getLocalGraphicsEnvironment();
                GraphicsDevice[] screens = ge.getScreenDevices();

                Rectangle allScreenBounds = new Rectangle();
                for (GraphicsDevice screen : screens) {
                    Rectangle screenBounds = 
                            screen.getDefaultConfiguration().getBounds();

                    allScreenBounds.width += screenBounds.width;
                    allScreenBounds.height = Math.max(allScreenBounds.height,
                            screenBounds.height);
                }

            Robot robot = null;
                try {
                    robot = new Robot();
                } catch (AWTException ex) {
                    Logger.getLogger(cScreenshot.class.getName()).
                            log(Level.SEVERE, null, ex);
                }
            screenshot = robot.createScreenCapture(allScreenBounds);
            
            }

            String url = "http://127.0.0.1:8888/";
            URL link = null;
            try {
                link = new URL(url);
            } catch (MalformedURLException ex) {
                Logger.getLogger(cScreenshot.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
            HttpURLConnection uconn = null;
            try {
                uconn = (HttpURLConnection) link.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(cScreenshot.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
            
            uconn.setConnectTimeout(5000);
            uconn.setDoOutput(true);
            
            int nRead;
            ByteArrayOutputStream data = new ByteArrayOutputStream();
            DataOutputStream dStream = null;
            byte[] ostream = new byte[16384];
            
            try{
                dStream = new DataOutputStream(uconn.getOutputStream());
                ImageIO.write(screenshot, "jpg", data);
                ostream = data.toByteArray();
                dStream.write(ostream, 0, ostream.length);
                
            } catch ( IOException e) {
                Logger.getLogger(cScreenshot.class.getName())
                        .log(Level.SEVERE, null, e);
            }
            
            try {
                dStream.flush();
                dStream.close();
                BufferedReader in = null;
                in = new BufferedReader(
                new InputStreamReader(uconn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                
                
                try {
                    GiveURL genURL = new GiveURL(response.toString());
                } catch (URISyntaxException ex) {
                    Logger.getLogger(cScreenshot.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(cScreenshot.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
                

            //print result
        }
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void sMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMonitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sMonitorActionPerformed

    private void mMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMonitorActionPerformed
        // TODO add your handling code here:
        mulMonitor = true;
    }//GEN-LAST:event_mMonitorActionPerformed

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
            java.util.logging.Logger.getLogger(cScreenshot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cScreenshot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cScreenshot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cScreenshot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cScreenshot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton mMonitor;
    private javax.swing.JRadioButton sMonitor;
    // End of variables declaration//GEN-END:variables
}
