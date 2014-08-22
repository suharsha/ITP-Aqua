/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Suharsha Wick
 */
public class Themes {
    public void setTheme(int id) {
        try 
        {
            if (id==1)
                UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
            else if (id==2)
                UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
            else if (id==3)
                UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }
    public void setIcon(JFrame j) {
        j.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGES/favicon.png")));
    }
    
}
