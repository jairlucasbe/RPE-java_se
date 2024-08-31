package fundamentals_programming.exception_handling.exception_hierarchy.exceptions;

public class BankingException extends Exception{

    public BankingException(){
        super();
    }

    public BankingException(String message){
        super(message);
    }

    public BankingException(String message, Throwable cause){
        super(message,cause);
    }

    public BankingException(Throwable cause){
        super(cause);
    }
}
