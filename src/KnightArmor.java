public class KnightArmor extends Armor implements Equippable {
    public KnightArmor() {
        super("KnightArmor", 22.3, 55, 100, "Steel");
    }

    @Override
    public void equip() {
        System.out.println("You have equipped the Knight Armor!");
    }

    @Override
    public void unequip() {
        System.out.println("You have unequipped the Knight Armor!");
    }
}
