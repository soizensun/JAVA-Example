package weaterorama;

import javax.swing.*;
import java.awt.*;

public class StatisticsObserverDisPlay implements Observer {
    private double previousTemp, previousHumi, previousPres;

    private JFrame frame;
    private JTextArea area;

    double maxTemp = -999999;
    double minTemp = 999999;
    double maxHumi = -999999;
    double minHumi = 999999;
    double maxPres = -999999;
    double minPres = 999999;

    public StatisticsObserverDisPlay() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("statistics display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        area = new JTextArea(150, 150);
        frame.add(area);
        area.setBackground(Color.PINK);
        area.setText("<< Average Condition >> \n\n");
    }


    @Override
    public void update(double temp, double humi, double pres) {
        area.setBackground(Color.PINK);
        if (previousTemp == 0) previousTemp = temp;
        if(previousHumi == 0) previousHumi = humi;
        if(previousPres == 0)  previousTemp = temp;
        // calculate Temp
        double avgTemp = (previousTemp + temp)/2;
        previousTemp = avgTemp;
        if(temp > maxTemp) maxTemp = temp;
        if(temp < minTemp) minTemp = temp;

        // calculate humi
        double avgHumi = (previousHumi + humi)/2;
        previousHumi = avgHumi;
        if(humi > maxHumi) maxHumi = humi;
        if(humi < minHumi) minHumi = humi;

        // calculate pres
        double avgPres = (previousPres + pres)/2;
        previousPres = avgPres;
        if(pres > maxPres) maxPres = pres;
        if(pres < minPres) minPres = pres;


        area.setText("<< Average Condition >> \n\n");

        area.append(" Temperature -----" + "\n");
        area.append("   Average     >> " + avgTemp + "\n");
        area.append("   maximum  >> " + maxTemp + "\n");
        area.append("   minimum   >> " + minTemp + "\n");
        area.append(" Humidity --------" + "\n");
        area.append("   Average     >> " + avgHumi + "\n");
        area.append("   maximum  >> " + maxHumi + "\n");
        area.append("   minimum   >> " + minHumi + "\n");
        area.append(" Pressure --------" + "\n");
        area.append("   Average     >> " + avgPres + "\n");
        area.append("   maximum  >> " + maxPres + "\n");
        area.append("   minimum   >> " + minPres + "\n");
    }
}
