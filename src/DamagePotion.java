public class DamagePotion extends Consumable implements Usable {
    private int damageGained;

    public DamagePotion() {
        super("DamagePotion", 1, 10, "Gives 15 extra attack damage!");
        this.damageGained = 15;
    }

    public int getDamage() {
        return damageGained;
    }

    @Override
    public void use() {
        System.out.println("You used a Damage Potion! " + getEffect());
    }
}
