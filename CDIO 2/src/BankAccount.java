public class BankAccount {

    private int balance;

    // Constructor, en simple klasse i denne omgang

    public BankAccount(int balance) {

        this.balance = balance;

    }


    // Metode til når der skal penge ind på kontoen.
    public int deposit(int amount) {

        balance += amount;
        System.out.println("Den nye balance er " + balance);
        return balance;

    }

    //Metode til når der skal penge du af kontoen.

    public int withdraw(int amount) {

        this.balance -= amount;
        System.out.println("Den nye balance er " + this.balance);
        return this.balance;

    }

    // standard get metode der returnerer balancen.
    public int getBalance() {
        return this.balance;

    }
    // standard set metode der returnerer balancen.


}

