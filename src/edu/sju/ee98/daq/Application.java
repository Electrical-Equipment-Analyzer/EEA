/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sju.ee98.daq;

import edu.sju.ee98.daq.ui.MainFrame;
import java.util.Locale;

/**
 *
 * @author Leo
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        MainFrame mainFrame = MainFrame().;
        
        Locale.setDefault(Locale.US);
        new Manager();

    }
}
