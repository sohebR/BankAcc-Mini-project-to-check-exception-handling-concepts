public class BankAcc{
    double balance;
    BankAcc(double amount)
    {
        this.balance=amount;
    }
    
    public void Withdraw(double amount) throws ZeroBalance
    {
       if(balance == 0) 
       {
           throw new ZeroBalance();
       }
    }
}