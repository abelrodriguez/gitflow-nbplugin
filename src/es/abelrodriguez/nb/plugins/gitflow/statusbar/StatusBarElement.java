package es.abelrodriguez.nb.plugins.gitflow.statusbar;

import es.abelrodriguez.nb.plugins.gitflow.controllers.GitController;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import org.openide.awt.StatusLineElementProvider;
import org.openide.util.lookup.ServiceProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Abel Rodríguez
 */
@ServiceProvider(service = StatusLineElementProvider.class, position = -5)
public final class StatusBarElement implements StatusLineElementProvider {
    
    final static JLabel jLabel;
    final static GitController gitflow;
    
    static {
        gitflow = new GitController();
        
        jLabel = new JLabel("gitflow");
        jLabel.setBorder(null);
        jLabel.addMouseListener(new MouseAdapter() {
            @Override
                public void mousePressed(MouseEvent e) {
                    if ( e.isMetaDown() ) {
                        
                        ActionListener menuListener = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent event) {
                              System.out.println("Popup menu item ["
                                  + event.getActionCommand() + "] was pressed.");
                            }
                        };
                        
                        JPopupMenu popup;
                        popup = new JPopupMenu();
                        popup.add(new JMenuItem("Start New Feature")).addActionListener(menuListener);
                        popup.add(new JMenuItem("Start New Release"));
                        popup.add(new JMenuItem("Start New Hotfix"));
                        
                        popup.show(e.getComponent(), e.getX(), -popup.getPreferredSize().height);
                        
                        newFeature();
                    }
                }
                
            
        });
        
        
    }
    
    @Override
    public Component getStatusLineElement() {
        //return jLabel;
        JPanel statusPanel = new JPanel();
        statusPanel.add(jLabel);
        return statusPanel; 
    }
    
    private static void newFeature() {
        
         
         
        try {
            gitflow.Init();
        } catch (IOException ex) {
            Logger.getLogger(StatusBarElement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
