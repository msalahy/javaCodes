
package firstclasslesson;

public class Bank {
    private String accountNumber;
    private double balance;
    private String custumerName;
    private String customerEmail;
    
    private int depositFund;
    private int AddedDepositFund;
    private int withrawFund;

    public void setName (String custumerName)
    {
        this.custumerName = custumerName;
    }   
    public String getName(){
        return this.custumerName;
    }

    
    // Available money
    public void setDepositFund (int depositFund)
    {
        this.depositFund= depositFund;
    }
    public int getDepositFund(){
        return this.depositFund;
    }
    
    // how much you want to add today 
    public void addedDepositFund (int AddedDepositFund)
    {
        this.AddedDepositFund=AddedDepositFund;
    }
         // how much you want to withdraw today 
    public void withrawFund (int withrawFund)
    {
        this.withrawFund = withrawFund;
    }
    
    //This will give you the added and already amount of money.
    public int addedFund(){
        return this.depositFund=depositFund+AddedDepositFund;
    }
    public int getwithrawFund()
    {
        if(withrawFund<=depositFund)
        {
            return this.depositFund=depositFund-withrawFund;
        }
        else
            return -1;
    }    
}
