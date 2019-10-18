class BankAccount {
    String account = "423325435123";
    double balance = 8291643.00;
    double calculateInterest(double balance) {
        int time = 3;
        double rate = 4.0;
        double interest = (balance * rate * time) / 100.0 ;
        return interest;
    }
}
class CheckingAccount extends BankAccount {
    int extralimitfield;
}
class SavingsAccount extends BankAccount {

}
class CertificateOfDeposit extends BankAccount {

}
final class Bank {
    public static void main (String[] args) {
        CheckingAccount ca = new CheckingAccount();
        SavingsAccount sb = new SavingsAccount();
        CertificateOfDeposit cod = new CertificateOfDeposit();
        System.out.println("CheckingAccount :" +ca.account);
        System.out.println("CheckingAccount Balance :" +ca.balance);
        System.out.println("Savings Bank :" +sb.account);
        System.out.println("Savings Bank Balance :" +sb.balance);
        System.out.println("CertificateOfDeposit :" +cod.account);
        System.out.println("CertificateOfDeposit :" +cod.balance);
        System.out.println(cod.calculateInterest(34252.353));

    }
}
