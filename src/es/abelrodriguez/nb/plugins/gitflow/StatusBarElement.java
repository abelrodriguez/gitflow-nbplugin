package es.abelrodriguez.nb.plugins.gitflow;

import java.awt.Component;
import javax.swing.JLabel;
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
@ServiceProvider(service = StatusLineElementProvider.class)
public final class StatusBarElement implements StatusLineElementProvider {
    
    final static JLabel jLabel;
    
    static {
        jLabel = new JLabel("test");
        jLabel.setBorder(null);
    }
    
    @Override
    public Component getStatusLineElement() {
        return jLabel;
    }

}
