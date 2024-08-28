package fundamentals_programming.exception_handling.exception_chaining;

public class App {
    public static void main(String[] args) {
        try{
            superior();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void superior() throws Exception{
        try{
            medio();
        }catch(Exception e){
            throw new Exception("Excepción superior",e);
        }
    }

    public static void medio() throws Exception{
        try{
            interior();
        }catch(Exception e){
            throw  new Exception("Excepcion medio",e);
        }
    }

    public static void interior() throws Exception{
        throw new Exception("Excepción interior");
    }
}
