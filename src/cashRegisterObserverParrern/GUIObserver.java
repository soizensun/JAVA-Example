package cashRegisterObserverParrern;

import javax.swing.*;
import java.awt.*;

public class GUIObserver implements Observer {

    private JFrame frame;
    private JTextArea area;

    public GUIObserver() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("CashRegister GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        area = new JTextArea(150, 150);
        frame.add(area);
        area.setBackground(Color.ORANGE);
        area.setText("<< purchase >>\n\n");
    }
    double sum = 0;
    @Override
    public void update(double purchase) {
        area.setBackground(Color.ORANGE);
        area.setText("<< purchase >>\n\n");
        sum += purchase;
        area.append(">>  ");
        area.append(sum + "\n");
    }
}
