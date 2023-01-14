public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNo(1234567L);
        savingsAccount.setAccountHolderName("Ajay");
        savingsAccount.setAccountStatus("Active");
        savingsAccount.setAvailableBalance(1000);
        savingsAccount.setTotalBalance(savingsAccount.getAvailableBalance());
        savingsAccount.setInternetAndMobileBanking(true);
        savingsAccount.setInterestRate(8);
        savingsAccount.setModeOfOperation("Self");

        savingsAccount.accountBalance();
        System.out.println("Balance = " + savingsAccount.accountBalance());
       // savingsAccount.debit( 200);
       // System.out.println("your balance amount is = " + savingsAccount.getAvailableBalance());
        System.out.println("your available balance after debiting is = " + savingsAccount.debit( 200));
        System.out.println("your updated balance after crediting is = " + savingsAccount.credit(300));

    }
}
