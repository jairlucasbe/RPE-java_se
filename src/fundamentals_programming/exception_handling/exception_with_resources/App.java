package fundamentals_programming.exception_handling.exception_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String filePath = "src/fundamentals_programming/exception_handling/exception_with_resources/file.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage() + "\n" + e.getClass());
        }
    }
}
