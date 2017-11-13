/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.abelrodriguez.nb.plugins.gitflow.controllers;

import es.abelrodriguez.nb.plugins.gitflow.constants.PrintType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.RepositoryBuilder;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

/**
 *
 * @author Abel Rodríguez
 */
public class GitController {
    
    ConsoleController console = new ConsoleController();;
    
    
    public void Init() {
        
        String gitPath = "C:\\temp\\repositorio\\.git";
        
        try {
            
            
            Repository repository = new FileRepositoryBuilder()
                    .setGitDir(new File(gitPath))
                    .build();


            if (repository.getObjectDatabase().exists()) {
                console.print("Es un repositorio");
            } else {
                console.print("fatal: Not a git repository", PrintType.ERROR);
            }

            repository.close();

            //List<String> command =  Arrays.asList("git", "rev-parse", "--git-dir");
            //List<String> command =  Arrays.asList("git", "-C", path, "status", ">/dev/null", "2>&1");
            
            
           
            //console.execute(command);
            
            
        } catch (IOException ex) {
            Logger.getLogger(GitController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
