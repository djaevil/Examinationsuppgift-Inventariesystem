public class ManaPotion extends Consumable implements Usable {
    private int manaRestored;

    public ManaPotion() {
        super("ManaPotion", 1, 10, "Restores 25MP");
        this.manaRestored = 25;
    }

    public int getManaRestored() {
        return manaRestored;
    }

    @Override
    public void use() {
        System.out.println("You used a Mana Potion! " + getEffect());
    }
}
