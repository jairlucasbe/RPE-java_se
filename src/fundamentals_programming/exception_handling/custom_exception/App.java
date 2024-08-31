package fundamentals_programming.exception_handling.custom_exception;

import fundamentals_programming.exception_handling.custom_exception.exceptions.InvalidEmailDomainException;

public class App {
    public static void main(String[] args) {
        checkEmail("jlucasb@unsa.edu.pe");
    }

    public static void checkEmail(String email){
        try{
            checkSupportEmail(email);
        }catch (InvalidEmailDomainException e) {
            System.out.println(e.toString());
        }
    }

    public static void checkSupportEmail(String email) throws InvalidEmailDomainException{
        String[] emailComponents = email.split("@");
        if(!emailComponents[1].equals("gmail.com") && !emailComponents[1].equals("outlook.com")){
            throw new InvalidEmailDomainException("unsupported domain email");
        }
    }
}
