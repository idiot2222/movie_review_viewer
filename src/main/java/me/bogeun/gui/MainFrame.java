package me.bogeun.gui;

import me.bogeun.gui.panel.MainSplitPane;

import javax.swing.*;

public class MainFrame extends JFrame {


    public MainFrame() {
        setResizable(false);
        setSize(1000, 600);
        setLocationRelativeTo(null);

        add(GuiUtils.withMargin(new MainSplitPane(), 10));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


}
