public class MontyHallSimulation {
    public static void main(String[] args) {
        Winner goodPlayer = new Winner();
        Looser badPlayer = new Looser();

        Game superGame = new Game();
        superGame.setPlayer(goodPlayer);
        superGame.Play(1000);
        System.out.println("Good player stats:");
        superGame.printStats();

        superGame.setPlayer(badPlayer);
        superGame.Play(1000);
        System.out.println("Bad player stats:");
        superGame.printStats();
    }
}
