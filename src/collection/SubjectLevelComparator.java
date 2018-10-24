package collection;

import java.util.Comparator;

public class SubjectLevelComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Subject)o1).getLevel() - ((Subject)o2).getLevel();
    }
}
