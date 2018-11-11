package L06_monsterBall;


public class MainMasterBall {
    public static void main(String[] args) {
        MonsterBall monsterBall = new MonsterBall(200, 100, 1);
        System.out.println(monsterBall.getPrice());
        System.out.println(monsterBall.getSell());
        System.out.println(monsterBall.getValue());
    }

}
