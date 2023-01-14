public class SavingsAccountImpl {
        public static void main(String[] args) {
            SavingsAccount savingsAccount = new SavingsAccount("savings account",28,"Arko",400);

            System.out.println("Account Type = " + savingsAccount.accountType);
            System.out.println("Account HolderAge = " + savingsAccount.accountHolderAge);
            System.out.println("Account Number = " + savingsAccount.accountNumber);
            System.out.println("Account Holder's Name = " + savingsAccount.accountHolderName);
            System.out.println("Account Balance = " + savingsAccount.accountBalance);
            System.out.println("AccountStatus = " + savingsAccount.accountStatus);

            SavingsAccount ac1 = new SavingsAccount("savings account",28,
                    "Moon S",800);

            SavingsAccount ac2 = new SavingsAccount("savings account",30,
                    "Abc",1000);

            System.out.println("Balance before transfer");
            System.out.println("ac1 balance : "+ac1.accountBalance());
            System.out.println("ac2 balance : "+ac2.accountBalance());

            ac1.transfer(100,ac2);
            System.out.println("Balance after transfer");
            System.out.println("ac1 balance : "+ac1.accountBalance());
            System.out.println("ac2 balance : "+ac2.accountBalance());

            ac1.deposit(100);
            System.out.println("Balance after credit");
            System.out.println("ac1 balance : "+ac1.accountBalance());

            ac1.withdraw(200);
            System.out.println("Balance after debit");
            System.out.println("ac1 balance : "+ac1.accountBalance());

        }
    }


