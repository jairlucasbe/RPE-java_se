package fundamentals_programming.exception_handling.custom_exception;

public class EdadException extends Exception{
    public EdadException(){
        super();
    }

    public EdadException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "mensaje desde el toString";
    }
}
