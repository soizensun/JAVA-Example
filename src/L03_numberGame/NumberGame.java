package L03_numberGame;

public class NumberGame {
    private int target;
    private int num;

    public NumberGame(int target, int num) {
        this.target = target;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int getTarget() {
        return target;
    }

    public void compare(){
        if (num < target){
            System.out.println("too low");
        }
        else if (num > target){
            System.out.println("too high");
        }
        else {
            System.out.println("equal");
        }
    }

}
