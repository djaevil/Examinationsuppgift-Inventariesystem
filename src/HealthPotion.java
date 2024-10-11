public class HealthPotion extends Consumable implements Usable {
    private int healthRestored;

    public HealthPotion() {
        super("HealthPotion", 1, 10, "Restores 15HP");
        this.healthRestored = 15;
    }

    public int getHealthRestored() {
        return healthRestored;
    }

    @Override
    public void use() {
        System.out.println("You used a Health Potion! " + getEffect());
    }
}
