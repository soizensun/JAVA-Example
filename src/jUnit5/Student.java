package jUnit5;

public class Student extends Person1 {
    private String id;
    private double score;

    public Student(String name, String id) {
        super(name);
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void addScore(double score) {
        if(score < 0){
            throw new IllegalArgumentException("Soure must be positive");
        }
        this.score += score;

    }
}
