package fundamentals_programming.exception_handling.basic_exception_handling;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        try{
            Integer numberOne = Integer.parseInt(JOptionPane.showInputDialog("number one : "));
            Integer numberTwo = Integer.parseInt(JOptionPane.showInputDialog("number two : "));
            JOptionPane.showMessageDialog(null,String.valueOf(numberOne/numberTwo) + " " + Integer.toString(numberOne*numberTwo));
        }catch(NumberFormatException e){
            System.out.println("Isn't a valid number");
        }catch(ArithmeticException e){
            System.out.println("The second number shouldn't be zero");
        }catch(Exception e){
            System.out.println(e.getClass());
        }
    }
}
