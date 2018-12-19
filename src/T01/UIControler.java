package T01;


//elab-source: UIControler.java

import java.util.Scanner;

public class UIControler {
    private int round;
    private Scanner in;
    public double sum;

    UIControler(int round) {
        this.round = round;
        in = new Scanner(System.in);
        sum = 0.0;
    }

    public void run() throws Exception {

        for (int i = 0; i < round; i++) {
//            String s = in.nextLine();
//            String command = s.split(" ")[0];
            String command = in.next();
            if(command.equals("House")){
//                if(s.split(" ")[1].equals(null)){
//                    throw new Exception("parameter not enough");
//                }
//                else{
//                    String waSq = s.split(" ")[1];
                String waSq = in.next();
                    House house = new House(Double.parseDouble(waSq));
                    sum += house.calculateArea();
//                }

            }
            else if(command.equals("Pond")){
//                if(s.split(" ")[1].equals(null)){
//                    throw new Exception("parameter not enough");
//                }
//                else{
//                    String r = s.split(" ")[1];
                String r = in.next();
                    Pond pond = new Pond(Double.parseDouble(r));
                    sum += pond.calculateArea();
//                }

            }
            else if(command.equals("Building")){
//                if(s.split(" ")[1].equals(null) || s.split(" ")[2].equals(null)|| s.split(" ")[3].equals(null)){
//                    throw new Exception("parameter not enough");
//                }
//                else{
//                    String width = s.split(" ")[1];
//                    String hight = s.split(" ")[2];
//                    String layer = s.split(" ")[3];
                    String width = in.next();
                    String hight = in.next();
                    String layer = in.next();
                    Building building = new Building(Double.parseDouble(width), Double.parseDouble(hight), Double.parseDouble(layer));
                    sum += building.calculateArea();
//                }

            }
            else{
                throw new Exception("Please use correct command!");
            }
        }
    }

    public double getSum() {
        return sum;
    }
}
