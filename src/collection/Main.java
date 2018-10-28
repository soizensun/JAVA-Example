package collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<<     Array     >>>>>>>>>>");

        Student[] studentArray = new Student[3]; // array
        studentArray[0] = new Student("Jing");
        studentArray[1] = new Student("Jang");
        studentArray[2] = new Student("Cheeta");

        int[] number = new int[3];
        number[0] = 9;
        number[1] = 4;
        number[2] = 3;

        // normal for loop
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i]);
        }

        // for each loop
        for(Student s : studentArray){
            System.out.println(s);
        }
///////////////////////////////////////////////////////////////////////////////
        System.out.println("<<<<<<<<<<     ArrayList     >>>>>>>>>>");

        ArrayList<String> subject = new ArrayList<String>();
        ArrayList<Student> studentArrayList = new ArrayList<Student>();

//        studentArrayList.add()
        studentArrayList.add(new Student("Chai"));
        studentArrayList.add(new Student("Big"));
        studentArrayList.add(new Student("Zen"));

        System.out.println("size : " + studentArrayList.size());
        System.out.println("Emtry? : " + studentArrayList.isEmpty());
        System.out.println(studentArrayList);

        for(Student s : studentArrayList){
            s.addScore(100);
            System.out.println(s.getName());
        }
        System.out.println(studentArrayList);

//        studentArrayList.remove(object);

        studentArrayList.clear();
        System.out.println(studentArrayList);
// ///////////////////////////////////////////////////////////////////////////////
        System.out.println("<<<<<<<<<<     HashSet     >>>>>>>>>>");

        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        integerHashSet.add(10);
        integerHashSet.add(70);
        integerHashSet.add(1016);
        integerHashSet.add(16);
        integerHashSet.add(1556);
        integerHashSet.add(1556); // ซำ้ไม่นับ
        integerHashSet.add(1556);
        integerHashSet.add(1556);

        System.out.println(integerHashSet);

/////////////////////////////////////////////////////////////////////////
        System.out.println("<<<<<<<<<<     TreeSet     >>>>>>>>>>");
        // primitive type wrapper

        // tree set ต้องเป็น เรียงลำดับได้
        // 1. use interface comparable
        //    Student implement Compareable
        Set<Student> studentSet = new TreeSet<Student>();
        studentSet.add(new Student("Non"));
        studentSet.add(new Student("Tae"));
        studentSet.add(new Student("Big"));

        System.out.println(studentSet);

        // 2. use interface Comparator
        //    create class SubjectLevelComparator that implement comparator
        //    to compare level
        Set<Subject> subjectSet = new TreeSet<Subject>(new SubjectLevelComparator());
        subjectSet.add(new Subject("A", 2));
        subjectSet.add(new Subject("B", 3));
        subjectSet.add(new Subject("B", 1));

        System.out.println(subjectSet);

        // 3. use anonymous class
        //    Comparator is an anonymous class
        //    - use to save for creating Comparator class such as 2.
        Set<Subject> subjectSet1 = new TreeSet<Subject>(new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        subjectSet1.add(new Subject("F", 2));
        subjectSet1.add(new Subject("R", 3));
        subjectSet1.add(new Subject("B", 1));

        System.out.println(subjectSet1);
//////////////////////////////////////////////////////////////////////////////////////
        System.out.println("<<<<<<<<<<     TreeMap     >>>>>>>>>>");

        Map<String, Student> studentMap = new TreeMap<>();
        studentMap.put("6010405092", new Student("kitpavin"));
        studentMap.put("0000000000", new Student("Earth"));
        studentMap.put("6014575454", new Student("tomtam"));
        studentMap.put("6014575454", new Student("tomtam1"));
        studentMap.put("6014575454", new Student("tomtam2"));

        for (String id : studentMap.keySet()) {
            Student s = studentMap.get(id);
            s.addScore(100);
            System.out.println(id + " " + s.toString());
        }
//////////////////////////////////////////////////////////////////////////////
//        Collections.sort(studentArrayList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });

//        Arrays.sort(studentArray, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });

    }
}
