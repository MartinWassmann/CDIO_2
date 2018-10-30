
public class Bankkonto {

    private double deposit;
    private double withdraw;
    private double amount;
    private double balance;

          // Constructor, en simple klasse i denne omgang

    public Bankkonto(double balance) {

        this.balance = balance;

    }
      

    // Metode til når der skal penge ind på kontoen.
    public double depositmoney() {

            deposit = amount;
            balance += deposit;
            System.out.println("Den nye balance er " + balance);
            return balance;

        }

        //Metode til når der skal penge du af kontoen.

        public double withdrawmoney() {

           withdraw = amount;
           this.balance -= withdraw;
            System.out.println("Den nye balance er " + this.balance);
            return this.balance;

        }

        // standard get metode der returnerer balancen.
    public double getBalance() {
        return this.balance;

    }
                       // standard set metode der returnerer balancen.

    public double setBalance() {
        this.balance = balance;
        return this.balance;
    }
}

