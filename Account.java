import java.util.Scanner;
public class Account implements IAccount {
    private String name;
    private int accountNumber;
    private String email;
    private double accountBalance;
    
    Scanner scanner = new Scanner(System.in);

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return double return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void changeEmail(String email) {
        System.out.println("Name: " + name + "  So TK: " + accountNumber + "  Email moi: " + email + "  So du TK: " + accountBalance);

    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + "  So TK: " + accountNumber + "  Email: " + email + "  So du TK: " + accountBalance);
    }

    @Override
    public void recharge(double amount) {
        double tong;
        tong = accountBalance + amount;
        System.out.println("Name: " + name + "  So TK: " + accountNumber + "  Email: " + email +"  Account balance = " + tong);
    }
}
