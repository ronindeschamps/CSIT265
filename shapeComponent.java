/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module12_deschamps_assignment1;

import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
import static java.awt.Color.GREEN;
import static java.awt.Color.RED;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;
import javax.swing.JTabbedPane;

/**
 *
 * @author ronin
 */
public class shapeComponent extends JComponent {
    public void paintComponent(Graphics g){
        
        Graphics2D g2 = (Graphics2D) g;
        Rectangle rect1 = new Rectangle(5,5,100,200);
        g2.draw(rect1);
        g2.setColor(BLUE);
        g2.fill(rect1);
    
        Ellipse2D.Double oval = new Ellipse2D.Double(220, 150, 150, 50);
        g2.draw(oval);
        g2.setColor(GREEN);
        g2.fill(oval);
       
        Rectangle rect2 = new Rectangle(380, 5, 100, 100);
        g2.draw(rect2);
        g2.setColor(RED);
        g2.fill(rect2);
        g2.setColor(BLACK);
;
        Line2D.Double side1 = new Line2D.Double(190, 5, 190, 100);
        g2.draw(side1);
        Line2D.Double side2 = new Line2D.Double(190, 5, 290, 55);
        g2.draw(side2);
        Line2D.Double side3 = new Line2D.Double(290, 55, 190, 100);
        g2.draw(side3);
        Ellipse2D.Double circle = new Ellipse2D.Double(120, 100, 50, 50);
        g2.draw(circle);
        
        
        int[] xpoints = {310, 300, 310, 360, 370, 360};
        int[] ypoints = {5, 50, 100, 100, 50, 5};      
        Polygon poly = new Polygon(xpoints, ypoints, 6);
        g2.draw(poly);
        
        g2.drawString("My Advanced GUI", 230, 130);
        
        
        
    }
    
}
