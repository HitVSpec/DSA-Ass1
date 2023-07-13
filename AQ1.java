public class AQ1 {
    private int account_no;
    private String name;
    private Double balance;

    public AQ1(int account_no, String name, Double balance)
        throws InvalidBalanceException{
            this.account_no = account_no;
            this.name = name;
            if(balance <= 0){
                throw new InvalidBalanceException("Balance cannot be less than 0");
            }
            this.balance = balance;
    }
    public static void main(String[] args){
        try{
            AQ1 bk = new AQ1(1234, "Rahul", -900.0);
        }
        catch(InvalidBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
class InvalidBalanceException extends Exception{
    public InvalidBalanceException(String message){
        super(message);
    }
}
