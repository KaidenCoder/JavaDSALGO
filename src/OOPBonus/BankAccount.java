package OOPBonus;

public class BankAccount {
    private int balance;
    private double interest;

    public void SavingsAccount(int initialBalance, double initialInterest)
    {
        balance = initialBalance;
        interest = initialInterest;
    }

    public void deposit(int amount)
    {
        balance = balance + amount;
    }

    public void withdraw(int amount)
    {
        balance = balance - amount;
    }

    public void addInterest()
    {
        balance = (int)(balance + (balance * interest));
    }

    public int getBalance()
    {
        return balance;
    }


}
