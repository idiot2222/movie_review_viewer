package me.bogeun.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GuiUtils {

    public static JComponent withMargin(JComponent component, int i) {
        return withMargin(component, i, i, i, i);
    }

    public static JComponent withMargin(JComponent component, int top, int left, int bottom, int right) {
        component.setBorder(new EmptyBorder(top, left, bottom, right));

        return component;
    }
}
