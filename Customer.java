public class Customer{
    public static void main(String args[]){
       try{
           BankAcc C1=new BankAcc(0);
           C1.Withdraw(200);
       }catch(ZeroBalance e){
           System.out.println(e.getMessage());
       }
    }
}