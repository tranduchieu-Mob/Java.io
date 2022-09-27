import javax.naming.spi.DirObjectFactory;

public class Wallet {
    private int id;
    private String accountBank;
    private String nameBank;
    private double amount;

    public Wallet(int id, String accountBank, String nameBank, double amount) {
        this.id = id;
        this.accountBank = accountBank;
        this.nameBank = nameBank;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Wallet [accountBank=" + accountBank + ", amount=" + amount + ", id=" + id + ", nameBank=" + nameBank
                + "]";
    }
    
}
