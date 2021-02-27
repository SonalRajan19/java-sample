/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_prgming;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Sonal L R
 */
public class Font_demo extends Applet {
    public void paint(Graphics g)
    {
        Font f=new Font("TimesRoman",Font.PLAIN,18);
        Font f1=new Font("Arial",Font.BOLD,20);
        Font f2=new Font("Italic",Font.TRUETYPE_FONT,22);
        
        g.setFont(f);
        g.drawString("Hello World", 10, 20);
        g.setFont(f1);
        g.drawString("Welcome all", 10, 50);
        g.setFont(f2);
        g.drawString("This is oops class", 10, 80);
    }
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
