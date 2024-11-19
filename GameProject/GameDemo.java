package GameProject;

public class GameDemo {
    public static void main(String[] args) {
        Player player = new Player("Hero", 10, 10, 100, 3);
        Monster monster = new Monster("Dragon", 50, 50, 200, 5, "Red");

        player.takeDamage(20);
        monster.takeDamage(50);
        System.out.println(monster.makeNoise());
        monster.takeDamage(150);
    }
}
