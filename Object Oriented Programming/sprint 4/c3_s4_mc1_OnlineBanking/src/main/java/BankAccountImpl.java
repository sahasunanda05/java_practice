public class BankAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SUNANDA","20-05-2010","self",true,50000,50000,7.8f,"active");
        CurrentAccount currentAccount = new CurrentAccount("Arko","05-01-2000","joint",true,4000000,4000000,9.3f,"active");
        RecurringDepositAccount recurringDepositAccount = new RecurringDepositAccount("MOON","20-10-2021","single",false,25000,25000,4.5f,"active");
        System.out.println(savingsAccount);
        System.out.println(currentAccount);
        System.out.println(recurringDepositAccount);

    }
}
