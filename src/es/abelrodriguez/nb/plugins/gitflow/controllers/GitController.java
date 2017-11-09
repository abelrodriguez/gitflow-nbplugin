/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.abelrodriguez.nb.plugins.gitflow.controllers;

import es.abelrodriguez.nb.plugins.gitflow.constants.PrintType;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;
import javax.swing.Action;
import org.netbeans.api.io.IOProvider;
import org.netbeans.api.io.InputOutput;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author Abel Rodríguez
 */
public class GitController {
    
    ConsoleController console = new ConsoleController();;
    
    
    public void Init() throws IOException {
        //String[] command = {"/bin/bash", "src/es/abelrodriguez/nb/plugins/gitflow/scripts/git-flow-init.sh"};
        //String[] command = {"/bin/bash", "C:\\_datos\\programacion\\java\\gitflow-nbplugin\\src\\es\\abelrodriguez\\nb\\plugins\\gitflow\\scripts\\git-flow-init"};
        /*
        System.out.println("Entra");
        String[] cmd = { "git-bash.exe", "C:\\_datos\\programacion\\java\\gitflow-nbplugin\\src\\es\\abelrodriguez\\nb\\plugins\\gitflow\\scripts\\git-flow"} ;
        
        pb = new ProcessBuilder(cmd);
        //pb = new ProcessBuilder(command);
        Process p = pb.start();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }*/
        
        //console.execute(Arrays.asList("git", "rev-parse", "--git-dir", ">/dev/null", "2>&1;"));
        console.execute(Arrays.asList("git"));

    }
    
    
}
