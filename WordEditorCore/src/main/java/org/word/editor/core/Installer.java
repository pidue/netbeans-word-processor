/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.word.editor.core;

import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    @Override
    public void close() {
        super.close(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean closing() {
        NotifyDescriptor d = new NotifyDescriptor.Confirmation(
                "Do you really want to exit the application?",
                "Exit",
                NotifyDescriptor.YES_NO_OPTION);
        if (DialogDisplayer.getDefault().notify(d) == NotifyDescriptor.YES_OPTION) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void uninstalled() {
        super.uninstalled(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validate() throws IllegalStateException {
        super.validate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void restored() {
        // TODO
    }

}
