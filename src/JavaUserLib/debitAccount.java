package JavaUserLib;

public class debitAccount extends bankingAccount{
    private double accountBalance;
    private String cardType;

    public debitAccount(String clientName, String accountNumber, String phoneNumber, String customerEmail, String sinNumber) {
        super(clientName, accountNumber, phoneNumber, customerEmail, sinNumber);
        this.accountBalance = 500;
        this.cardType = "Debit";
    }

    public void showInfo(){
        System.out.println("************************************************");
        System.out.println("Client name: " + getClientName());
        System.out.println("Client account number: " + getAccountNum());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Client S.I.N number: " + getSinNumber());
        System.out.println("ACCOUNT BALANCE: " + this.accountBalance);
        System.out.println("Card type: " + this.cardType);
        System.out.println("************************************************");
    }
}