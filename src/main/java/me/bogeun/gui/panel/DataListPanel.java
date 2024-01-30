package me.bogeun.gui.panel;

import javax.swing.*;
import java.util.List;

public class DataListPanel extends JSplitPane {

    public static JTextArea dataTextField;

    static {
        dataTextField = new JTextArea();

        dataTextField.setEditable(false);
    }

    public static void printDataList(String text) {
        dataTextField.setText(text);
    }

    public static void printDataList(List<?> list) {
        String text = list.stream()
                .map(Object::toString)
                .reduce((s1, s2) -> s1 + "\n" + s2)
                .orElse("");

        printDataList(text);
    }

    public DataListPanel() {
        setOrientation(VERTICAL_SPLIT);
        setResizeWeight(0.1);
        setDividerSize(0);

        JLabel title = new JLabel("데이터 리스트");
        title.setHorizontalAlignment(SwingConstants.CENTER);

        setLeftComponent(title);
        setRightComponent(new JScrollPane(dataTextField));
    }
}
