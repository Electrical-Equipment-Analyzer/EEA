/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sju.ee98.daq;

import edu.sju.ee98.daq.ui.MainFrame;


/**
 *
 * @author Leo
 */
public class Manager extends edu.sju.ee98.daq.ui.Manager {

    public Manager() {
        this.mainFrame = new MainFrame(this);
    }
    
}
