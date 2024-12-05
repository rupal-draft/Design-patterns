package solid_principles.single_responsibility;

import java.util.HashMap;

public class AccountOperations {
    private static HashMap<Integer,Account> accountHashMap = new HashMap<>();

    public void addAccount(Account account){
        accountHashMap.put(account.getAccountNumber(),account);
        System.out.println("Account added");
    }

    public void updateAccount(Account account){
        accountHashMap.put(account.getAccountNumber(),account);
        System.out.println("Account updated");
    }

    public Account getAccount(int accountNumber){
        return accountHashMap.get(accountNumber);
    }


    /** This method should not be part of AccountOperations
     * Reason is account operations are responsible for doing
     * operation for account like add account, update account
     * get account. However deposit is something called as transaction
     * which eventually not responsible by account.
     *
     * Adding this method violates Single Responsibility principle
     * Create new class which actually does TransactionOperations.
     * **/
    public void deposit(int amount , int accountNumber){
        //Move this method to different class
    }
}
