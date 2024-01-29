package interface_exercise;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Tim", 10, 15);
        Player player2 = new Player("Agnieszka", 40,10);
        System.out.println(player1);
        player2.read(player1.write());
        System.out.println(player1);
        System.out.println(player2);
    }
}
