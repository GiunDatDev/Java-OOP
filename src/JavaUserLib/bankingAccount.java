package JavaUserLib;

public class bankingAccount {
    private String clientName;
    private String accountNum;
    private String phoneNumber;
    private String email;
    private String sinNumber;

    public bankingAccount(String clientName, String accountNumber, String phoneNumber, String email, String sinNumber) {
        this.clientName = clientName;
        this.accountNum = accountNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.sinNumber = sinNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSinNumber() {
        return sinNumber;
    }

    public void setSinNumber(String sinNumber) {
        this.sinNumber = sinNumber;
    }
}

