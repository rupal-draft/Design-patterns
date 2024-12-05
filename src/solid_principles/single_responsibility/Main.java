package solid_principles.single_responsibility;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){
        Account account = new Account();
        AccountOperations accountOperations = new AccountOperations();
        Transactions transactions = new Transactions();
        account.setAccountNumber(123);
        account.setTotalAmount(BigDecimal.valueOf(99999999));
        account.setName("Rupal Paul");
        accountOperations.addAccount(account);
        transactions.deposit(BigDecimal.valueOf(1),123);
    }
}
