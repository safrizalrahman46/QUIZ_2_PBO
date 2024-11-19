package GameProject;

public class Player extends DamageableObject {
    int score;
    int livesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int lives) {
        super(name, posX, posY, maxHealth);
        this.livesRemaining = lives;
    }

    @Override
    public void onKilled() {
        livesRemaining--;
        System.out.println(name + " has been killed! Lives remaining: " + livesRemaining);
        if (livesRemaining <= 0) {
            System.out.println("Game Over!");
        }
    }
}
