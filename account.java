package Constructors;

public class account {
    private String accountnumber;
    private double accoutnbalance;
    private String customername;
    private String sudtomeremailadress;
    private String customerphonenumber;

    public account() {
        this("235235" , 2.50 , "Default name" , "default address" , "default number");
        System.out.println("Empty constructor called");
    }
    public account(String accountnumber , double accoutnbalance , String customername ,String sudtomeremailadress , String customerphonenumber) {

        System.out.println("Account with parameters are called ");
        this.accountnumber=accountnumber;
        this.accoutnbalance=accoutnbalance;
        this.customername=customername;
        this.sudtomeremailadress=sudtomeremailadress;
        this.customerphonenumber=customerphonenumber;

    }

    public void deposit(double depositamount) {
        this.accoutnbalance +=depositamount;
        System.out.println("Deposit of " +depositamount + " made. New balance is "+ this.accoutnbalance);
    }

    public void withdrawl(double withdrawlamount) {
        if(this.accoutnbalance - withdrawlamount <=0) {
            System.out.println("Only "+accoutnbalance + " available. Withdrawl not proceeded.");
        }else {
            this.accoutnbalance -= withdrawlamount;
            System.out.println("Withdrawl of "+withdrawlamount + " processed. Remaining balance" + this.accoutnbalance);
        }
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getAccoutnbalance() {
        return accoutnbalance;
    }

    public void setAccoutnbalance(double accoutnbalance) {
        this.accoutnbalance = accoutnbalance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getSudtomeremailadress() {
        return sudtomeremailadress;
    }

    public void setSudtomeremailadress(String sudtomeremailadress) {
        this.sudtomeremailadress = sudtomeremailadress;
    }

    public String getCustomerphonenumber() {
        return customerphonenumber;
    }

    public void setCustomerphonenumber(String customerphonenumber) {
        this.customerphonenumber = customerphonenumber;
    }
}
