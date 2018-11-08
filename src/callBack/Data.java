package callBack;

import java.util.ArrayList;
import java.util.Collection;

public class Data {

    public static double average(Collection<Measurable> collection){
        double sum = 0;
        for (Measurable mea :
                collection) {
            sum += mea.getMeasure();
        }
        return sum/collection.size();
    }

    public static double average(Collection<?> collection, Measurer measurer){
        double sum = 0;
        for (Object obj :
                collection) {
            sum += measurer.measure(obj);
        }
        return sum/collection.size();
    }

    public static void main(String[] args) {
//        Student s1 = new Student(10);
//        Student s2 = new Student(20);
//        Student s3 = new Student(30);
//        Student s4 = new Student(40);
//
//        ArrayList<Measurable> studentArrayList= new ArrayList<>();
//        studentArrayList.add(s1);
//        studentArrayList.add(s2);
//        studentArrayList.add(s3);
//        studentArrayList.add(s4);
//
//        System.out.println(Data.average(studentArrayList));
//        ///////////////////////////////////////////////////
//
//        MemberCard m1 = new MemberCard(10);
//        MemberCard m2 = new MemberCard(20);
//        MemberCard m3 = new MemberCard(30);
//
//        ArrayList<Measurable> memberArrayList = new ArrayList<>();
//        memberArrayList.add(m1);
//        memberArrayList.add(m2);
//        memberArrayList.add(m3);
//
//        System.out.println(Data.average(memberArrayList));
//       ////////////////////////////////////////////////////

        Measurer ageMeasurer = new Measurer(){
            @Override
            public double measure(Object obj) {
                return ((Student)obj).getAge();
            }
        };

        Student s1 = new Student(10);
        Student s2 = new Student(20);
        Student s3 = new Student(30);
        Student s4 = new Student(40);
        s1.addScore(100);
        s2.addScore(100);
        s3.addScore(100);
        s4.addScore(100);

        ArrayList<Student> studentArrayList= new ArrayList<>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        System.out.println(Data.average(studentArrayList, ageMeasurer));
        System.out.println(Data.average(studentArrayList, new Measurer() {
            @Override
            public double measure(Object obj) {
                return ((Student)obj).getScore();
            }
        }));


        System.out.println(Data.average(studentArrayList, obj -> ((Student)obj).getScore()));
    }

}
