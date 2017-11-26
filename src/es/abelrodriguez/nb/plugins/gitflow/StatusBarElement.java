package es.abelrodriguez.nb.plugins.gitflow;

import es.abelrodriguez.nb.plugins.gitflow.console.ConsoleController;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    final static ConsoleController console = new ConsoleController();
    
    static {
        
        
        jLabel = new JLabel("gitflow");
        jLabel.setBorder(null);
        jLabel.addMouseListener(new MouseAdapter() {
            @Override
                public void mousePressed(MouseEvent e) {
                    if ( e.isMetaDown() ) {
                        
                        JPopupMenu popup;
                        popup = new JPopupMenu();
                        popup.add(new JMenuItem("Start New Feature"));
                        popup.add(new JMenuItem("Start New Release"));
                        popup.add(new JMenuItem("Start New Hotfix"));
                        
                        popup.show(e.getComponent(), e.getX(), -popup.getPreferredSize().height);
                        
                        
                        
                        console.print("Component initialized!");
                        
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

}
