package weaterorama;

import java.util.ArrayList;

public class WeaterData implements Sample{
    private double temp;
    private double humi;
    private double pres;

    // new
    ArrayList<Observer> observersArrayList;

    public WeaterData() {
        // new
        observersArrayList = new ArrayList<Observer>();
    }

    public double getTemp() {
        return temp;
    }

    public double getHumi() {
        return humi;
    }

    public double getPres() {
        return pres;
    }

    // new
    public void measuramentChange(double temp, double humi, double pres){
        this.temp = temp;
        this.humi = humi;
        this.pres = pres;
        notification();
    }

    // new
    @Override
    public void registerObserver(Observer observer) {
        observersArrayList.add(observer);
    }

    // new
    @Override
    public void removeObserver(Observer observer) {
        observersArrayList.remove(observer);
    }

    // new
    @Override
    public void notification() {
        for (Observer o : observersArrayList) {
            o.update(this.temp, this.humi, this.pres);
        }
    }
}
