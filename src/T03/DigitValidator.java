package T03;

//elab-source:DigitValidator.java
public class DigitValidator implements PasswordValidator {

    @Override
    public boolean validate(String password) {
        if(password.length() >= 6){
            boolean status = false;
            for (int i = 0; i < password.length(); i ++){
                if(( password.charAt(i) + "").equals("0") || ( password.charAt(i) + "").equals("1") || ( password.charAt(i) + "").equals("2") || ( password.charAt(i) + "").equals("3") || ( password.charAt(i) + "").equals("4") || ( password.charAt(i) + "").equals("5") || ( password.charAt(i) + "").equals("6") || ( password.charAt(i) + "").equals("7") || ( password.charAt(i) + "").equals("8") || ( password.charAt(i) + "").equals("9")){
                    status = true;

                }
            }
            return status;
        }
        else{
            return false;
        }
    }
}
