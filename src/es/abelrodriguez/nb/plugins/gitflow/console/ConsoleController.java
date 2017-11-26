/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.abelrodriguez.nb.plugins.gitflow.console;

import es.abelrodriguez.nb.plugins.gitflow.constants.Constants;
import es.abelrodriguez.nb.plugins.gitflow.constants.PrintType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.api.io.IOProvider;
import org.netbeans.api.io.InputOutput;

/**
 *
 * @author Abel Rodríguez
 */
public class ConsoleController {
    InputOutput io = IOProvider.getDefault().getIO(Constants.CONSOLE_TABNAME, false);
    ProcessBuilder pb;
    
    public void execute(List<String> command) throws IOException  {
        
        
        pb = new ProcessBuilder(command);
        //pb.command(command);
        
        Process p = pb.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        while ((line = reader.readLine()) != null)
        {
            this.print(line);
        }
    }
    
    public void print(String str) {
        this.print(str, PrintType.INFO);
    }
    
    public void print(String str, PrintType type) {
        switch(type) {
            case ERROR:
                this.printError(str);
                break;
            default:
                this.printInfo(str);
                break;
        }
    }
    
    private void printInfo(String str) {
        try {
            io.getOut().println(str);
            io.getOut().close();
            
        } catch (Exception ex) {
            Logger.getLogger(ConsoleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void printError(String str) {
        try {
            io.getErr().println(str);
            io.getErr().close();
            
        } catch (Exception ex) {
            Logger.getLogger(ConsoleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
