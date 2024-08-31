package fundamentals_programming.exception_handling.exception_hierarchy;

import fundamentals_programming.exception_handling.exception_hierarchy.exceptions.InsufficientFundsException;
import fundamentals_programming.exception_handling.exception_hierarchy.exceptions.UnauthorizedAccessException;

public class App {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        try {
            bank.withdraw(600);
        } catch (InsufficientFundsException e) {
            System.out.println(e.toString());
        } catch (UnauthorizedAccessException e) {
            System.out.println(e.toString());
        }
    }
}
