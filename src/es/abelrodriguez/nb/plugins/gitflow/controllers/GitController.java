/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.abelrodriguez.nb.plugins.gitflow.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abel Rodríguez
 */
public class GitController {
    
    ConsoleController console = new ConsoleController();;
    
    
    public void Init() {
        
        try {
            //if ! git rev-parse --git-dir >/dev/null 2>&1; then
            //console.execute(Arrays.asList("dir"));
            console.execute(Arrays.asList("git", "rev-parse", "--git-dir"));
            
            
        } catch (IOException ex) {
            Logger.getLogger(GitController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
