package unittest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

public class Classroom {
    private Collection<Student> students = new ArrayList<Student>();


    public Classroom() {

    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addScoreById(String id, double score) {
        boolean check = false;
        for (Student s : students) {
            if(s.getId().equals(id)){
                s.addScore(score);
                check = true;
            }
        }
        if(check == false){
            throw new NoSuchElementException("Don't have this id");
        }
    }
    double re = 0;
    public double  getScoreById(String id) {
        boolean check = false;
        for (Student s : students) {
            if(s.getId().equals(id)) {
                re = s.getScore();
                check = true;
            }
        }
        if(check == false){
            throw new NoSuchElementException("Don't have this id");
        }
        return  re;
    }

    public double averageScore() {
        if(students.size() != 0){
            return this.totalScore() / students.size();
        }
        return 0;
    }

    double sum = 0;
    public double totalScore() {
        if(students.size() != 0){
            for (Student s : students) {
                sum += s.getScore();
            }
            return sum;
        }
        else return sum;
    }

    public int size() {
        return students.size();
    }


}
