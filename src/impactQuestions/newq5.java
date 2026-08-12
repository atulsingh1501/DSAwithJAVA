package impactQuestions;

// 5. Encapsulation - BankAccount

public class newq5 {

    private int balance;

    public void setBalance(int b) {
        balance = b;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        newq5 b = new newq5();

        b.setBalance(5000);

        System.out.println("Balance: " + b.getBalance());
    }
}
