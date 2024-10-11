public class MagicalStick extends Weapon implements Equippable {
    public MagicalStick() {
        super("MagicalStick", 1.5, 10, 20);
    }

    @Override
    public void equip() {
        System.out.println("You have equipped the Magical Stick!");
    }

    @Override
    public void unequip() {
        System.out.println("You have unequipped the Magical Stick!");
    }

}
