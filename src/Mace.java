public class Mace extends Weapon implements Equippable {
    public Mace() {
        super("Mace", 6.7, 30, 15);
    }

    @Override
    public void equip() {
        System.out.println("You have equipped the Mace!");
    }

    @Override
    public void unequip() {
        System.out.println("You have unequipped the Mace!");
    }
}
