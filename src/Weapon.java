public class Weapon extends Item {
    private int damage;

    public Weapon(String name, double weight, int value, int damage) {
        super(name, weight, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Damage: " + damage;
    }
}
