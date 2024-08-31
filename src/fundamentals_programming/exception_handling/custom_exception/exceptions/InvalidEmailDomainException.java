package fundamentals_programming.exception_handling.custom_exception.exceptions;

public class InvalidEmailDomainException extends Exception{
    public InvalidEmailDomainException(){
        super();
    }

    public InvalidEmailDomainException(String message){
        super(message);
    }

    public InvalidEmailDomainException(String message, Throwable cause){
        super(message,cause);
    }

    public InvalidEmailDomainException(Throwable cause){
        super(cause);
    }

    @Override
    public String toString() {
        return "InvalidEmailDomainException : \nmessage : " + getMessage() + "\nclass : " + getClass() + "\ncause : " + getCause();
    }
}
