package Mailbox;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        MailBox mailBox = new MailBox();
        System.out.println("Welcome to Comsi Condominium");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Please select menu [I] = insert mail ; [C] = check total mail ; [G] = get mail ; [E] = exit");
            String command = sc.next();
            if(command.toLowerCase().charAt(0) == 'i'){
                System.out.println("Please enter [roomNumber numberOfMail] e.g. 14019 5");
                int roomNumber = sc.nextInt();
                int amountLetter = sc.nextInt();
                try {
                    mailBox.setLetter(roomNumber, amountLetter);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


            }
            else if(command.toLowerCase().charAt(0) == 'c') {
                System.out.println("Please enter [roomNumber] e.g. 14019");
                int roomNumber = sc.nextInt();

                try {
                    System.out.println("Total Mail in Your MailBox :  " + mailBox.showLetter(roomNumber));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else if (command.toLowerCase().charAt(0) == 'g'){
                System.out.println("Please enter [roomNumber] e.g. 14019");
                int roomNumber = sc.nextInt();
                try {
                    mailBox.getLetter(roomNumber);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(command.toLowerCase().charAt(0 )== 'e'){
                break;
            }
        }
    }
}
