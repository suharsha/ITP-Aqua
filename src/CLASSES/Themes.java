/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Suharsha Wick
 */
public class Themes {
    public boolean setTheme(int id) {
        
        try 
        {
            if (id==1){
                UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
                return true;
        }
            else if (id==2){
                UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
                    return true;
        }
            else if (id==3){
                UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
                return true;
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return false;
        }
        return false;
    }
    public boolean setIcon(JFrame j) {
        j.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGES/favicon.png")));
        return true;
    }

    public void setSize(JFrame j){
        j.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
