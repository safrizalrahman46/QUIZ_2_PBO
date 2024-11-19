package GameProject;

public abstract class DamageableObject extends GameObject {
    int maxHealth;
    int health;

    public DamageableObject(String name, int posX, int posY, int maxHealth) {
        super(name, posX, posY);
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Remaining health: " + health);
        if (isDead()) onKilled();
    }

    public abstract void onKilled();
}
