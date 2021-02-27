/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_prgming;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Sonal L R
 */
public class Image_display extends Applet {
    Image picture;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        picture=getImage(getDocumentBase(),"Rose.jpg");
    }
    public void paint(Graphics g)
    {
        g.drawImage(picture,30,30,this);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
