/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentpane;

import java.awt.AWTEvent;
import java.awt.Graphics;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mely
 */
public class ContentPane extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JPanel pan = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawString("This is written by an anonymous class!", 10, 10);
		    //neuer Kommentar für Git
            }
        }; //BEST COMMENT EVER!!
        ContentPane cp= new ContentPane();
       cp.setContentPane(pan);
       cp.setLocation(0, 0);
       cp.setLocation(2,3);
      cp.setSize(300, 250);
      cp.setVisible(true);
      cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      cp.setVisible(false);

    }
    public void thisIsANewMethod() {
        JPanel pan = new JPanel();
        //new code line
    }

    public void thisIsAnotherNewMethod(){
        //hello!!
    }
}
