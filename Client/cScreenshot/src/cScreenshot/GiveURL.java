/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cScreenshot;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author ramana
 */
class GiveURL {
    
    final URI uri;
    public GiveURL(String resourceLink) throws URISyntaxException {
        
        this.uri = new URI(resourceLink);
        createFrame(new URI(resourceLink));
    }
    
    private void createFrame(URI url){
        
        
        class OpenUrlAction implements ActionListener {
            
            @Override 
            public void actionPerformed(ActionEvent e) {
                open(uri);
            }
        }
        
        JFrame jframe = new JFrame("URL to the screenshot");
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setAlwaysOnTop(true);
        jframe.setEnabled(true);
        jframe.setBounds(100, 100, 600, 200);
        jframe.setBackground(Color.blue);
        JButton button = new JButton();
        button.setText("<HTML><FONT color=\"#000099\"><U>Link to Image</U></FONT>"
            + "</HTML>");
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setBackground(Color.RED);
        button.setToolTipText(url.toString());
        button.setVisible(true);
        jframe.add(button);
        button.addActionListener(new OpenUrlAction());
        
    }
    private static void open(URI uri) {
        if (Desktop.isDesktopSupported()) {
          try {
            Desktop.getDesktop().browse(uri);
          } catch (IOException e) { /* TODO: error handling */ }
        } else { /* TODO: error handling */ }
      }
}
