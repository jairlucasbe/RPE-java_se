package fundamentals_programming.exception_handling.exception_hierarchy;

import fundamentals_programming.exception_handling.exception_hierarchy.exceptions.InsufficientFundsException;
import fundamentals_programming.exception_handling.exception_hierarchy.exceptions.UnauthorizedAccessException;

public class BankAccount {
    private double balance = 500;
    private boolean isAuthorized = false;

    public void withdraw(double amount) throws InsufficientFundsException, UnauthorizedAccessException {
        if(!isAuthorized){
            throw new UnauthorizedAccessException("You must be logged in");
        }
        if(balance < amount){
            throw new InsufficientFundsException("You don't have sufficient funds");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New Balance " + balance);
    }

    public void authorize(){
        isAuthorized = true;
    }
}
