class account{
    String accountNo;
    String userName;
    Double balance;
    
    account(String accNo, String userName, Double bal){
        this.accountNo = accNo;
        this.userName = userName;
        this.balance = bal;
    }

    public void Display_Account_Detail(){
        System.out.println("Account Number is: "+accountNo);
        System.out.println("Account user Name: "+userName);
        System.out.println("Account balance: "+balance);
    }
    
    public Double Account_Balance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNo;
    }

    public String getAccountUserName(){
        return userName;
    }
}

class Saving_Account extends account{
    Double InterestRate;
    Saving_Account(String accNo, String userName, Double bal, Double rate){
        super(accNo, userName, bal);
        this.InterestRate = rate;
    }

    public void Display_Account_Detail(){
        super.Display_Account_Detail();
        System.out.println("Interest rate is: " + InterestRate +"%");
    }

    public Double getInterestRate(){
        return InterestRate;
    }
}

public class mainMethod{
    public static void main(String[] args) {
        Saving_Account a = new Saving_Account("2250197622", "Anshu Mittal", 50000.0, 2.5);
        a.Display_Account_Detail();
        a.Account_Balance();

        Saving_Account b = new Saving_Account("2250198622", "Deepak", 30000.0, 1.5);
        b.Display_Account_Detail();
        b.Account_Balance();
    }
}