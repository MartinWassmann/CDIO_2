import java.util.Scanner;

public class Main {
    public void main(String[] args) {

        double amount;
        int sum;

        Scanner scan = new Scanner(System.in);


        Dice die1 = new Dice();
        Dice die2 = new Dice();

        //Spiller 1 oprettes med sin bankkonto

        System.out.println("Indtast navn for spiller 1 ");
        Player player1 = new Player(scan.next());


        System.out.println("Indtast navn for spiller 2 ");
        Player player2 = new Player (scan.next());

        // Hvordan inkorperes bankkontos variable med spiller klassen????


        Player currentplayer = player1;

        while (player1.getBalance() < 3000 && player2.getBalance() < 3000)

            // sætter balance til 0 hvis den er negativ

              if (player1.getBalance() < 0 ) {
                player1.;
            } if (player2.getBalance() < 0)  {
                player2.(0);
            }


            // rulle teknik her til terningen (vil hellere have en metode at bruge hvis det kan lade sig gøre)
            sum = 0;

            sum = die1.roll() + die2.roll();


            // selve spillet, det skal raffineres.
            switch (sum) {
                case 2:
                    amount = 250;
                    Player.deposit;
                    System.out.println("Der er kolde kontanter i tårenet, du tjener 250! ");
                    break;
                case 3:
                    this.balance1 -= 100;
                    System.out.println("Du er faldet i krateret og det koster hele 100 at komme op ");
                    break;
                case 4:
                    this.balance += 100;
                    System.out.println("Du er nået frem til paladsets porte, du får 100kr af guds engle ");
                    break;
                case 5:
                    this.balance -= 20;
                    System.out.println(" Du fryser så meget i den kolde ørken at du brænder 20 for at holde varmen");
                    break;
                case 6:
                    this.balance += 180;
                    System.out.println(" Du er ankommet til den afkransede by, du får 180 ");
                    break;
                case 7:
                    System.out.println("Du besøger klostrede, det har ingen effekt på din balance");
                    break;
                case 8:
                    this.balance -= 70;
                    System.out.println("Du besøger desværre den sorte grotte og det betyder desværre du lider et tab på 80 ");
                    break;
                case 9:
                    System.out.println("Du finder nogle hyggelige hytter i bjergene og din balance stiger med 60");
                    this.balance += 60;
                    break;
                case 10:
                    System.out.println("Du løber ind i nogle varerulve og løber for dit liv. Du taber desværre 80 på vejen. ");
                    System.out.println("Du får en tur til");
                    this.balance -= 80;
                    break;
                case 11:
                    System.out.println("Du falder desværre i kløften og skal betale hele 50 for at komme op igen. ");
                    this.balance -= 50;
                    break;
                case 12:
                    System.out.println("Du har fundet guld i bjergene og sælger det for 650, du er rig!. ");
                    this.balance += 650;
                    break;

                    // Skifter spiller så man ikke behøver duplikere loop

                    if (die1.getValue() == die2.getValue()) {
                    }
                else if(currentplayer == player1) {
                    currentplayer = player2;
                } else {
                    currentplayer = player1;
                }
            }
        }
    }

    /*(Man kan ikke slå 1 med to terninger)
    Tower 		+250
    Crater 		-100
    Palace gates		+100
    Cold Desert	 	-20
    Walled city 		+180
    Monastery 		0
    Black cave 		-70
    Huts in the mountain 		+60
    The Werewall (werewolf-wall)		-80,	men spilleren får en ekstra tur.
    The pit 		-50
    Goldmine 		+650


}
}
}
