import T5.Transaction;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {

    private double balance;

    Account() {
        this.balance = 0;
    }

    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /**
     * Nap tien vao tai khoan.
     *
     * @param amount tien nap.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            this.balance += amount;
        }
    }

    /**
     * Rut tien.
     *
     * @param amount tien.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
        }
    }

    /**
     * Ham them giao dich.
     *
     * @param amount    tien.
     * @param operation loai giao dich.
     */
    public void addTransaction(double amount, String operation) {
        if (operation != "deposit" && operation != "withdraw") {
            System.out.println("Yeu cau khong hop le!");
        } else {
            if (operation.equals("deposit")) {
                this.deposit(amount);
            } else if (operation == "withdraw") {
                this.withdraw(amount);
            }
            Transaction tran = new Transaction(operation, amount, balance);
            transitionList.add(tran);
        }
    }

    /**
     * Ham in.
     */
    public void printTransaction() {

        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < transitionList.size(); i++) {
            double amount = transitionList.get(i).getAmount();
            double balance = transitionList.get(i).getBalance();

            if (transitionList.get(i).getOperation() == "deposit") {
                System.out.println("Giao dich " + (i + 1) + ": Nap tien $" + df.format(amount)
                        + ". So du luc nay: $" + df.format(balance) + ".");
            } else {
                System.out.println("Giao dich " + (i + 1) + ": Rut tien $" + df.format(amount)
                        + ". So du luc nay: $" + df.format(balance) + ".");
            }
        }
    }

    /**
     * Ham main.
     *
     * @param args dau vao.
     */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(1000.456, "deposit");
        acc.addTransaction(500, "withdraw");
        acc.printTransaction();
    }


}
