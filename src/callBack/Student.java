package callBack;

public class Student {
    private int age;
    private double score;

    public Student(int age){
        this.age = age;
    }

    public void addScore(double score){
        this.score += score;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

//
//    @Override
//    public double getMeasure() {
//        return age;
//    }
}
