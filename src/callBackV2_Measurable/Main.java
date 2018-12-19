package callBackV2_Measurable;

import callbackV2_Measurer.Measurer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class Main {
    public static int Average(Collection<Measurable> a){
        int sum = 0;
        for (Measurable q : a) {
            sum += q.getMeasure();
        }
        return sum/a.size();
    }

    public static void main(String[] args) {
        Student s1 = new Student("kitpavin", 12, 45);
        Student s2 = new Student("dsfasd", 12, 45);
        Student s3 = new Student("qwer", 12, 45);
        Student s4 = new Student("kitpaxcvbvin", 12, 45);

        ArrayList<Measurable> studentArrayList = new ArrayList<>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);


        System.out.println(Main.Average(studentArrayList));
    }
}
