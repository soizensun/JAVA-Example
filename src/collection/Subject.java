package collection;

public class Subject {
    private String name;
    private int level;

    public Subject(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
