/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module12_deschamps_assignment1;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author ronin
 */
public class Module12_Deschamps_Assignment1 {
    
        
    
    public static void main(String[] args){
    firstGUI gui = new firstGUI();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(1080, 290);
    gui.setTitle("My Advanced GUI");
    gui.setLayout(new BorderLayout());

    

    JTabbedPane tab = new JTabbedPane();
    tab.setBounds(0,0,540,280);
    gui.add(tab);
    
    shapeComponent DC = new shapeComponent();
    tab.add(DC);
    
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    
    p1.add(new JLabel("Page 1"));
    p2.add(new JLabel("Page 2"));
    p3.add(new JLabel("Page 3"));
    
    JButton b1 = new JButton("popup");
    b1.setContentAreaFilled(false);
    JButton b2 = new JButton("popup");
    b2.setContentAreaFilled(false);
    b2.setText("press here");
    b1.setText("press here");
    p1.add(b1);
    p1.add(b2);
    
    
    b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(gui, "Button 1 selected");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(gui, "Button 2 selected");
            }
        });
    
    JRadioButton rb1 = new JRadioButton("Radio Button 1");
    JRadioButton rb2 = new JRadioButton("Radio Button 2");
    JRadioButton rb3 = new JRadioButton("Radio Button 3");
    JRadioButton rb4 = new JRadioButton("Radio Button 4");
    
    ButtonGroup group = new ButtonGroup();
    
    group.add(rb1);
    group.add(rb2);
    group.add(rb3);
    group.add(rb4);

    
    p2.add(rb1);
    p2.add(rb2);
    p2.add(rb3);
    p2.add(rb4);
    
    rb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(gui, "Button 1 selected");
            }
        });

    rb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(gui, "Button 2 selected");
            }
        });
    
    rb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(gui, "Button 3 selected");
            }
        });

    rb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(gui, "Button 4 selected");
            }
        });
    
JCheckBox cb1 = new JCheckBox();
JCheckBox cb2 = new JCheckBox();
JCheckBox cb3 = new JCheckBox();
JCheckBox cb4 = new JCheckBox();

p3.add(cb1);
p3.add(cb2);
p3.add(cb3);
p3.add(cb4);

JTabbedPane tabs = new JTabbedPane();
tabs.add("1", p1);
    tabs.add("2", p2);
    tabs.add("3", p3);

    
JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, tab, tabs);
splitPane.setDividerLocation(500);
gui.getContentPane().add(splitPane);
    
    JMenuBar menuBar = new JMenuBar();
    gui.setJMenuBar(menuBar);
    JMenu exitMenu = new JMenu("Menu");
    menuBar.add(exitMenu);
    JMenuItem exitItem = new JMenuItem("exit");
    exitMenu.add(exitItem);
    
    exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }
        });
    
        
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dim = tk.getScreenSize();
    int xPos = (dim.width / 2)- (gui.getWidth() / 2);
    int yPos = (dim.height / 2)-(gui.getHeight() / 2);
    
    gui.setLocation(xPos, yPos);
    gui.setResizable(false);
    gui.setVisible(true);

}
    
}


