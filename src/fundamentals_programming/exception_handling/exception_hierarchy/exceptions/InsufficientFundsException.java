package fundamentals_programming.exception_handling.exception_hierarchy.exceptions;

public class InsufficientFundsException extends BankingException{

    public InsufficientFundsException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "Insufficient Funds Exception\nclass : " + getClass().getSimpleName() + "\nmessage : " + getMessage() + "\ncause : " + getCause();
    }

}
