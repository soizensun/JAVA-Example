package callbackV2_Measurer;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    private static int average(Collection<?> collection, Measurer m) {
        int sum = 0;
        for (Object a : collection) {
            sum += m.getMeasure(a);
        }
        return sum/collection.size();
    }

    public static void main(String[] args) {
        Student s1 = new Student("kitpavin", 12, 45);
        Student s2 = new Student("dsfasd", 12, 45);
        Student s3 = new Student("qwer", 12, 45);
        Student s4 = new Student("kitpaxcvbvin", 12, 45);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        //inner class
        Measurer ageMeasurer = new Measurer() {
            @Override
            public int getMeasure(Object obj) {
                return ((Student)obj).getAge();
            }
        };
        System.out.println(Main.average(studentArrayList, ageMeasurer));


        //anonymous class
        System.out.println(Main.average(studentArrayList, new Measurer() {
            @Override
            public int getMeasure(Object obj) {
                return ((Student)obj).getScore();
            }
        }));


        //ramda
        System.out.println(Main.average(studentArrayList, obj -> ((Student)obj).getScore()));
    }

}
