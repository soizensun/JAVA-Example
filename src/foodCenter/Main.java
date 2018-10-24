package foodCenter;

public class Main {
    public static void main(String[] args) {
        Green green1 = new Green();
        green1.topUp(200);
        System.out.println("green card has " + green1.getBalance() + "baht.");
        green1.topUp(100);
        System.out.println("green card has " + green1.getBalance() + "baht.");
        green1.topUp(200);
        System.out.println("green card has " + green1.getBalance() + "baht.");
        System.out.println("================================================");

        Blue blue1 = new Blue();
        System.out.println("blue card has " + blue1.getPoint() + "points.");
        System.out.println("blue card has " + blue1.getBalance() + "baht.");
        blue1.topUp(100);
        System.out.println("blue card has " + blue1.getPoint() + "points.");
        System.out.println("blue card has " + blue1.getBalance() + "baht.");
        blue1.spend(50);
        System.out.println("blue card has " + blue1.getPoint() + "points.");
        blue1.topUp(200);
        System.out.println("blue card has " + blue1.getPoint() + "points.");
        System.out.println("blue card has " + blue1.getBalance() + "baht.");
        System.out.println("================================================");

        // up casting
        FoodCenterCard  card1 = new Blue(); // เรียก method อะไรได้บ้าง ดูที่ static type(FoodCenterCard)

        // card1.getPoint(); error
        // down casting
        ((Blue) card1).getPoint(); // FoodCenterPoint ไม่มี getPoint จึงต้องทำการ case เป็น Blue ก่อน

        FoodCenterCardReader reader = new FoodCenterCardReader();
        reader.setPrice(40);
        reader.read(green1);
        try {
            reader.setPrice(50);
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        reader.setPrice(10);
        reader.readPoint(blue1);
    }
}
