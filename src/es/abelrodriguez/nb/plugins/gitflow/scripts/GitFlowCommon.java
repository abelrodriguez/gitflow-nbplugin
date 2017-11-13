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
public class GitFlowCommon {
    
    public void git_do(){
        
    }
    
    public static boolean git_repo_is_headless(Repository repository){
        
        //TO-DO: Check this return
        
        boolean isHeadless = true;
        
        try {
            isHeadless = (repository.resolve("HEAD") != null);
        } catch (IncorrectObjectTypeException ex) {
            Exceptions.printStackTrace(ex);
        } catch (RevisionSyntaxException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        
        return isHeadless;
    }
    
    public static boolean require_clean_working_tree(Repository repository) {
        
    }
    
    private static boolean git_is_clean_working_tree(Repository repository) {
        
        repository.
	if ! git diff --no-ext-diff --ignore-submodules --quiet --exit-code; then
		return 1
	elif ! git diff-index --cached --quiet --ignore-submodules HEAD --; then
		return 2
	else
		return 0
	fi
}
}
