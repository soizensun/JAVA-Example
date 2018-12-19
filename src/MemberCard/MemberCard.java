package MemberCard;

// elab-source: MemberCard.java

public class MemberCard implements Pointable {
    private int point;
    private String name;
    private double score;

    public MemberCard(String name) {
        this.name = name;
    }

    @Override
    public void addScore(double score) {
        if(score >= 0){
            this.score += score;
            this.point = (int)this.score / 250;
        }
    }

    @Override
    public void usePoint(int point) {
        if(point > 0){
            if(point < this.point)
                this.point -= point;
        }
    }

    @Override
    public int getPoint() {
        return this.point;
    }

    @Override
    public String getInfo() {
        String s;
        s = "MemberCard{name='" + getName() + "', totalPurchase=" + getScore() + ", point=" + getPoint() + "}";
        return s;
    }

    private double getScore() {
        return this.score;
    }

    private String getName() {
        return this.name;
    }


}
