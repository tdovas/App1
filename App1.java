/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;
import javax.swing.JOptionPane;
/**
 *
 * @author tdovas
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please type your name:");
        if (name==null)
            name = "Unknown";
        JOptionPane.showMessageDialog(null, "Hello " + name);
        System.exit(0);
    }
    
}
