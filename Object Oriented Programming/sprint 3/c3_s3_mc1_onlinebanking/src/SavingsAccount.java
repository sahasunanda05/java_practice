public class SavingsAccount {
    private String accountHolderName;
    private long accountNo;
    private String accountOpeningDate;
    private String accountStatus;
    private double availableBalance;
    private double totalBalance;
    private boolean internetAndMobileBanking;
    private float interestRate;
    private String modeOfOperation;

    public String getAccountHolderName() {

        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {

        this.accountHolderName = accountHolderName;
    }

    public long getAccountNo() {

        return accountNo;
    }

    public void setAccountNo(long accountNo) {

        this.accountNo = accountNo;
    }

    public String getAccountOpeningDate() {

        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {

        this.accountOpeningDate = accountOpeningDate;
    }

    public String getAccountStatus() {

        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {

        this.accountStatus = accountStatus;
    }

    public double getAvailableBalance() {

        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {

        this.availableBalance = availableBalance;
    }

    public double getTotalBalance() {

        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {

        this.totalBalance = totalBalance;
    }

    public boolean isInternetAndMobileBanking() {

        return internetAndMobileBanking;
    }

    public void setInternetAndMobileBanking(boolean internetAndMobileBanking) {
        this.internetAndMobileBanking = internetAndMobileBanking;
    }

    public float getInterestRate() {

        return interestRate;
    }

    public void setInterestRate(float interestRate) {

        this.interestRate = interestRate;
    }

    public String getModeOfOperation() {

        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {

        this.modeOfOperation = modeOfOperation;
    }

    //    to get the balance from my saving account
    public double accountBalance() {

        return availableBalance;
    }

    public double debit(double amount) {
        //creating local variable       your balance                the amount you are withdrawing
        availableBalance = availableBalance - amount;
        return availableBalance;
    }

    public double credit( double amount) {
        //creating local variable       your balance                the amount you are depositing
        availableBalance = availableBalance + amount;
        return availableBalance;
    }
}
