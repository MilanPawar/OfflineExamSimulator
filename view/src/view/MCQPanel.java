package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class MCQPanel extends JPanel {
private List<JRadioButton> options;
private ButtonGroup buttonGroup;
public MCQPanel() {
//	setTitle("Image Gallery");
//    setSize(800, 600);
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
options = new ArrayList<>();
buttonGroup = new ButtonGroup();
setLayout(new GridLayout(4, 1));
for (int i = 1; i <= 4; i++) {
JRadioButton option = new JRadioButton("Option " + i);
options.add(option);
buttonGroup.add(option);
add(option);
}
}
}