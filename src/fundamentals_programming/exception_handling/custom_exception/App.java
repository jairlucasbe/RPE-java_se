package fundamentals_programming.exception_handling.custom_exception;

public class App {
    public static void main(String[] args){
        try {
            calculateAge(101);
        } catch (EdadException e) {
            System.out.println(e.getMessage());
        }
    }



    public static void calculateAge(int age) throws EdadException{
        if(age>100){
            throw new EdadException("la edad es muy grande");
        }
    }
}
