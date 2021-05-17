/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_projects;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class WindowClose extends WindowAdapter
{
    Frame obj;
    public WindowClose(Frame f)
    {
        obj = f;
    }
    public void windowClosing(WindowEvent e)
    {
        int res = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Close?", "Close Window", JOptionPane.YES_NO_CANCEL_OPTION);
        if(res == JOptionPane.YES_OPTION)
        {
            Window w = e.getWindow();
            obj.setVisible(true);
            w.dispose();
        }
    }
}
