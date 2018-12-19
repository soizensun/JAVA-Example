package weaterorama;

import javax.swing.*;
import java.awt.*;

public class CurrentConditionsObserverDisPlay implements Observer {

    private JFrame frame;
    private JTextArea area;

    public CurrentConditionsObserverDisPlay() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Current Condition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        area = new JTextArea(150, 150);
        frame.add(area);
        area.setBackground(Color.ORANGE);
        area.setText("<< Current Conditions >>\n\n");
    }

    @Override
    public void update(double temp, double humi, double pres) {
        area.setBackground(Color.ORANGE);
        area.setText("<< Current Conditions >>\n\n");

        area.append("   Temperature >> " + temp + "\n");
        area.append("   Humidity >> " + humi + "\n");
        area.append("   Pressure >> " + pres + "\n");
    }
}
