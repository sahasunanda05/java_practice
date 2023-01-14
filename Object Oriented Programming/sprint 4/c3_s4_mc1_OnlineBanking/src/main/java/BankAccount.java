public abstract class BankAccount {
    private String accountHolderName;
    protected long accountNo;
    private String accountOpeningDate;
    private String modeOfOperation;
    private boolean internetAndMobileBanking;
    private double totalBalance;
    private double availableBalance;
    private float interestRate;
    private String accountStatus;
    public abstract void showAccountBalance();

    public BankAccount(String accountHolderName, String accountOpeningDate, String modeOfOperation, boolean internetAndMobileBanking, double totalBalance, double availableBalance, float interestRate, String accountStatus) {
        this.accountHolderName = accountHolderName;
        this.accountOpeningDate = accountOpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.internetAndMobileBanking = internetAndMobileBanking;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
        this.interestRate = interestRate;
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNo=" + accountNo +
                ", accountOpeningDate='" + accountOpeningDate + '\'' +
                ", modeOfOperation='" + modeOfOperation + '\'' +
                ", internetAndMobileBanking=" + internetAndMobileBanking +
                ", totalBalance=" + totalBalance +
                ", availableBalance=" + availableBalance +
                ", interestRate=" + interestRate +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
}
