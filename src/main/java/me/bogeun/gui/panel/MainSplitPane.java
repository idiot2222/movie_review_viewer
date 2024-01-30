package me.bogeun.gui.panel;

import javax.swing.*;

import static me.bogeun.gui.GuiUtils.withMargin;

public class MainSplitPane extends JSplitPane {

    public MainSplitPane() {
        setOrientation(HORIZONTAL_SPLIT);
        setDividerLocation(600);
        setDividerSize(0);

        setLeftComponent(withMargin(new DataListPanel(), 10));
        setRightComponent(withMargin(new ButtonListPanel(), 10));
    }

}
