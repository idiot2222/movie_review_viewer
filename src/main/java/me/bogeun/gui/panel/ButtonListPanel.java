package me.bogeun.gui.panel;

import me.bogeun.data.DataProcessor;

import javax.swing.*;
import java.awt.*;

import static me.bogeun.gui.GuiUtils.withMargin;

public class ButtonListPanel extends JPanel {
    public ButtonListPanel() {

        setLayout(new GridLayout(2, 1));

        add(withMargin(new DataButtonPanel(), 10));
        add(withMargin(new ExecuteButtonPanel(), 10));

    }

    private class DataButtonPanel extends JPanel {
        public DataButtonPanel() {
            setLayout(new GridLayout(2, 2));

            DataProcessor.getRawDataRetrieveButtons()
                    .forEach(this::add);
        }
    }

    private class ExecuteButtonPanel extends JPanel {
        public ExecuteButtonPanel() {
            setLayout(new GridLayout(5, 2));

            DataProcessor.getProcessedDataButtons()
                    .forEach(this::add);
        }
    }


}
