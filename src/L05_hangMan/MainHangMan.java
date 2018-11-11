package L05_hangMan;

public class MainHangMan {
    public static void main(String[] args) {
        HangMan hangMan = new HangMan("ekkarat", 6);
        System.out.println("Test medthod : showAmount");
        System.out.println(hangMan.showAmount());
        System.out.println("-----------------------------------------");

        System.out.println("Test medthod : check");
        System.out.println("z ------------------");
        try {
            System.out.println(hangMan.check('z'));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("life " + hangMan.getLife());
        System.out.println("result " + hangMan.getResult());

        System.out.println("e ------------------");
        try {
            System.out.println(hangMan.check('e'));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("life " + hangMan.getLife());
        System.out.println("result " + hangMan.getResult());

        System.out.println("k ------------------");
        try {
            System.out.println(hangMan.check('k'));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("life " + hangMan.getLife());
        System.out.println("result " + hangMan.getResult());

        System.out.println("z ------------------");
        try {
            System.out.println(hangMan.check('z'));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("life " + hangMan.getLife());
        System.out.println("result " + hangMan.getResult());
    }
}
