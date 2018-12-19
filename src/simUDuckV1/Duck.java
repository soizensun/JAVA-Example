package simUDuckV1;

public abstract class Duck {
    public void quack(){
        System.out.println("Make quack noice");
    }

    public abstract void display();

    public void swim(){
        System.out.println("swim");
    }

}
