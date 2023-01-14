import java.util.Random;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountHolderName, String accountOpeningDate, String modeOfOperation, boolean internetAndMobileBanking, double totalBalance, double availableBalance, float interestRate, String accountStatus) {
        super(accountHolderName, accountOpeningDate, modeOfOperation, internetAndMobileBanking, totalBalance, availableBalance, interestRate, accountStatus);
        accountNo = autoGeneratedAccountNo();
    }

    @Override
    public void showAccountBalance() {
        System.out.println(getAvailableBalance());
    }

    public long autoGeneratedAccountNo() {
        long branchCodeCA = 4052;
        Random obj = new Random();
        long accountNo = branchCodeCA * 100000000 + obj.nextLong(100000000L);
        return accountNo;
    }
    public double debit(double amount) {
        setAvailableBalance(getAvailableBalance() - amount);
        return getAvailableBalance();
    }

    public double credit( double amount) {
        setAvailableBalance(getAvailableBalance() + amount);
        return getAvailableBalance();
    }
}