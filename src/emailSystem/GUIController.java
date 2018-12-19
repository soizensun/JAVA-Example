package emailSystem;

import java.util.Scanner;

public class GUIController {


    public static void run(EmailSystem emailSystem){
        Scanner in = new Scanner(System.in);
        System.out.println("=========== SWCon Email System ===========");
        while (true){

            System.out.print("Command --> Log I)n  S)end message  R)ead messages  Log O)ut  Q)uit  :  ");

            String command = in.nextLine().toUpperCase();
            if(command.equals("I")){
                System.out.print("User name: ");
                String username = in.nextLine();
                emailSystem.logIn(username);
            }
            else if(command.equals("S")){
                if(emailSystem.getOnlineUser() != null){
                    System.out.print("Enter recipient: ");
                    String to = in.nextLine();
                    System.out.print("Enter text: ");
                    String text = in.nextLine();

                    Email email = new Email(to, text);
                    emailSystem.send(email);
                }
                else{
                    System.out.println("Please log in before.");
                }
            }
            else if(command.equals("R")){
                if(emailSystem.getOnlineUser() != null){
                    System.out.println(emailSystem.readLog());
                }
                else{
                    System.out.println("Please log in before.");
                }
            }
            else if(command.equals("O")){
                emailSystem.LogOut();
            }
            else if(command.equals("Q")){
                break;
            }

        }
    }
}



