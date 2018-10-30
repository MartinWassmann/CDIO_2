import java.util.Scanner;


// Har indtil videre ikke andet end name, den burde da kunne have noget mere?

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
        Bankkonto bankkonto = new Bankkonto(1000);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public double getBalance() {
        return this.balance();
    }
}