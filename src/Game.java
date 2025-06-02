public class Game {
    Player player1;
    Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String play() {
        String result = " ";
        int counterPlayer1 = 0;
        int counterPlayer2 = 0;
        int rounds = 5;


        for (int i = 1; i <= rounds; i++) {
            String player1Move = this.player1.hands(); // paper
            String player2Move = this.player2.hands(); // rock

            System.out.println("Player1 move: " + player1Move);
            System.out.println("Player2 move: " + player2Move);

            if (player1Move.equals("paper")) {
                if (player2Move.equals("paper")) {
                    System.out.println("It's a tie");
                } else if (player2Move.equals("scissors")) {
                    counterPlayer2++;
                    System.out.println(("You've lost..."));
                } else if (player2Move.equals("rock")) {
                    counterPlayer1++;
                    System.out.println("You win!!!");
                } else {
                    System.out.println("It's a tie");
                }
            }

            if (player1Move.equals("rock")) {
                if (player2Move.equals("paper")) {
                    counterPlayer2++;
                    System.out.println("You've lost...");
                } else if (player2Move.equals("scissors")) {
                    counterPlayer1++;
                    System.out.println("You win!!!");
                } else {
                    System.out.println("It's a tie");
                }
            }


            if (player1Move.equals("scissors")) {
                if (player2Move.equals("paper")) {
                    counterPlayer1++;
                    System.out.println("You win!!!");
                } else if (player2Move.equals("rock")) {
                    counterPlayer2++;
                    System.out.println("You've lost");
                } else {
                    System.out.println("It's a tie");
                }
            }
        }
        if (counterPlayer2 ==  counterPlayer1) {
            System.out.println("It's a tie bitcheees. Game Over.");
        } else if (counterPlayer2 >=3 || counterPlayer1 >= 3) {
            if (counterPlayer2 >= 2) {
                System.out.println("The winner is Player 2. Game over.");
            } else {
                System.out.println("The winner is Player 1. Game over.");
            }
        }

        return result;
    }

}
