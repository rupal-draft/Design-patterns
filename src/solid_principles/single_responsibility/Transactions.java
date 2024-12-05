package solid_principles.single_responsibility;

import java.math.BigDecimal;

public class Transactions {
    // This is good as it does transactions and at right place.
    public void deposit(BigDecimal amount,int accountNumber){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
        System.out.println("Amount deposited");
    }

    public void withdraw(BigDecimal draw,int accountNumber){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(draw));
        System.out.println("Amount withdrawn");
    }
}
