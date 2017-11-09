/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.abelrodriguez.nb.plugins.gitflow.controllers;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Action;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author Abel Rodríguez
 */
public class GitController {
    
    ProcessBuilder pb;// = new ProcessBuilder();
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
        
        execute(Arrays.asList("git", "rev-parse", "--git-dir", ">/dev/null", "2>&1;"));

    }
    
    private void execute(List<String> command) throws IOException {
        
        
        pb = new ProcessBuilder(command);
        //pb.command(command);
        
        Process p = pb.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        while ((line = reader.readLine()) != null)
        {
            System.out.println(line);
        }
    }
}
