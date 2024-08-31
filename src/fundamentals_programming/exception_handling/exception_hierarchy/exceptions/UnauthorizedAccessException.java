package fundamentals_programming.exception_handling.exception_hierarchy.exceptions;

public class UnauthorizedAccessException extends BankingException{

    public UnauthorizedAccessException(String message){
        super(message);
    }

    @Override
    public String toString(){
        String cause = getCause()==null ? "Unidentified" : getCause().toString();
        return String.format("Unauthorized Access Exception\nclass\t : %s \npath\t : %s \nmessage\t : %s \ncause\t : %s", getClass().getSimpleName(), getClass().getName(), getMessage(), cause);
    }

}
