public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Hieu");
        account.setAccountNumber(27071999);
        account.setEmail("D.hieu270799@gmail.com");
        account.setAccountBalance(15.3);

        account.displayInfo();
        account.changeEmail("d.hieu2707@gmail.com");
        account.recharge(26.5);
    }
 
}