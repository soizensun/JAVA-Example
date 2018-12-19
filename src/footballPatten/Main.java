package footballPatten;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Team team = new Team();
            team = FileManager.readFile("team.csv");
            System.out.println("----- Welcome to football management game -----");
            System.out.println("Please select patten do you want your team manage.");
            System.out.println("[s] to start, [e] to exit");
            String s = scanner.next();
            if(s.toUpperCase().equals("S")){
                while(true){
                    System.out.println("[1] 4-4-2 patten, [2] 4-5-1 patten, [3] 4-3-3 patten, [4] 3-4-3 patten, [e] to exit");
                    String i = scanner.next();
                    if(i.toUpperCase().equals("E")){
                        System.out.println("Thank you for attention.");
                        System.out.println("------------------------");
                        break;
                    }
                    else if(i.equals("1")){
                        team.showPatten(new Patten442());
                    }
                    else if(i.equals("2")){
                        team.showPatten(new Patten451());
                    }
                    else if(i.equals("3")){
                        team.showPatten(new Patten433());
                    }
                    else if(i.equals("4")){
                        team.showPatten(new Patten343());
                    }

                    else {
                        System.out.println("Incorrect input!!!");
                    }
                }
            }
            else if(s.toUpperCase().equals("E")){
                System.out.println("Thank you for attention.");
                System.out.println("------------------------");
            }
            else{
                System.out.println("Incorrect input!!!");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
