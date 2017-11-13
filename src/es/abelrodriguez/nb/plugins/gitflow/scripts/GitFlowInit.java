/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.abelrodriguez.nb.plugins.gitflow.scripts;

import java.io.IOException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.RevisionSyntaxException;
import org.eclipse.jgit.lib.Repository;
import org.openide.util.Exceptions;

/**
 *
 * @author Abel Rodríguez
 */
public class GitFlowInit {
    
    public void Init(Repository repository) {
        
        if (repository.getObjectDatabase().exists()) {
            //TO-DO: git_do init
        } else {
            
            if (GitFlowCommon.git_repo_is_headless(repository) && ) {
                    
            
        }
        
        
    }
}
