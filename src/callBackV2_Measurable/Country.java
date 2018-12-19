package callBackV2_Measurable;

public class Country implements Measurable{
    private String name;
    private int popuation;
    private int area;

    public Country(String name, int popuation, int area) {
        this.name = name;
        this.popuation = popuation;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getPopuation() {
        return popuation;
    }

    public int getArea() {
        return area;
    }

    @Override
    public int getMeasure() {
        return popuation;
    }
}
