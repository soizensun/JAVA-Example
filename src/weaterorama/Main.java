package weaterorama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        WeaterData weaterData = new WeaterData();
        CurrentConditionsObserverDisPlay currentConditionsObserverDisPlay = new CurrentConditionsObserverDisPlay();
        StatisticsObserverDisPlay statisticsObserverDisPlay = new StatisticsObserverDisPlay();

        // register for add ObserverDisPlay to observer ArrayList in WeaterData
        weaterData.registerObserver(currentConditionsObserverDisPlay);
        weaterData.registerObserver(statisticsObserverDisPlay);

        while (true){
            System.out.println("<<<< Please input new data >>>>");

            System.out.print("Temperature << ");
            double temp = Double.parseDouble(s.nextLine());
            System.out.print("Humidity << ");
            double humid = Double.parseDouble(s.nextLine());
            System.out.print("Pressure << ");
            double pressure = Double.parseDouble(s.nextLine());

            weaterData.measuramentChange(temp, humid, pressure);
        }
    }


}
