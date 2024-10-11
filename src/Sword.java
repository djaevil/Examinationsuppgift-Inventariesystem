public class Sword extends Weapon implements Equippable {
    public Sword() {
        super("Sword", 4.3, 25, 13);
    }

    @Override
    public void equip() {
        System.out.println("You have equipped the Sword!");
    }

    @Override
    public void unequip() {
        System.out.println("You have unequipped the Sword!");
    }
}
