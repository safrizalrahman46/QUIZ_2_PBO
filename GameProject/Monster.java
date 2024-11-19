package GameProject;

public class Monster extends DamageableObject {
    int threatLevel;
    String color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    public String makeNoise() {
        return name + " roars threateningly!";
    }

    @Override
    public void onKilled() {
        System.out.println(name + " has been defeated!");
    }
}
