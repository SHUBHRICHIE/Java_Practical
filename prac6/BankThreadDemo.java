class BankAccount {
    private double balance = 1000.0;

    public synchronized void deposit(double amt) {
        double current = balance;
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
        }
        balance = current + amt;
        System.out.println(Thread.currentThread().getName() + " deposited " + amt + " | Balance: " + balance);
    }

    public synchronized void withdraw(double amt) {
        double current = balance;
        if (current >= amt) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
            balance = current - amt;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amt + " | Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " Failed withdrawal (Insufficient Fund)");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Deposit extends Thread {
    private BankAccount acc;
    private double amt;

    public Deposit(BankAccount acc, double amt, String name) {
        super(name);
        this.acc = acc;
        this.amt = amt;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            acc.deposit(amt);
        }
    }
}

class Withdraw extends Thread {
    private BankAccount acc;
    private double amt;

    public Withdraw(BankAccount acc, double amt, String name) {
        super(name);
        this.acc = acc;
        this.amt = amt;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            acc.withdraw(amt);
        }
    }
}

public class BankThreadDemo {
    public static void main(String[] args) {
        BankAccount sharedAcc = new BankAccount();

        Deposit depThread = new Deposit(sharedAcc, 200.0, "Deposit Thread");
        Withdraw witThread = new Withdraw(sharedAcc, 150.0, "Withdraw Thread");

        depThread.setPriority(Thread.MIN_PRIORITY);
        witThread.setPriority(Thread.MAX_PRIORITY);

        depThread.start();
        witThread.start();

        try {
            depThread.join();
            witThread.join();
        } catch (InterruptedException e) {
        }
        
        System.out.println("Final Balance: " + sharedAcc.getBalance());
    }
}