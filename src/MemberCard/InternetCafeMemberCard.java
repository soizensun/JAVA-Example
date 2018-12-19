package MemberCard;

// elab-source: InternetCafeMemberCard.java

public class InternetCafeMemberCard implements Pointable {
    private String name;
    private int totalHour;
    private int point;

    public InternetCafeMemberCard(String name) {
        this.name = name;
        this.totalHour = 0;
        this.point = 0;
    }


    @Override
    public void addScore(double score) {
        this.totalHour += score;
        this.point += (int)score/2;
    }


    @Override
    public void usePoint(int point) {
        if (this.point >= point)
            this.point -= point;
    }

    @Override
    public int getPoint() {
        return this.point;
    }

    @Override
    public String getInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "InternetCafeMemberCard{" +
                "name='" + name + '\'' +
                ", totalHour=" + totalHour +
                ", point=" + point +
                '}';
    }
}

