package Test3;

public class Main {
    public static void main(String[] args) {
String n = "kit0avin";
for (int i = 0; i < n.length(); i ++){
    System.out.println(n.charAt(i));
    if(( n.charAt(i) + "").equals("0")){
        System.out.println("cccccc");
    }
}
    }
}
