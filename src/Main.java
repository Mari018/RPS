public class Main {
    public static void main(String[] args) {


            Player player1 = new Player("Raquel");
            Player player2 = new Player("Henrique");

            Game game = new Game(player1, player2);
            System.out.println(game.play());










    }
}