public class WizardRobe extends Armor implements Equippable {
    //private int extraMana = 30;

    public WizardRobe() {
        super("WizardRobe", 2, 10, 5, "Magical silk");
    }

//    public int getExtraMana() {
//        return extraMana;
//    }

    @Override
    public void equip() {
        System.out.println("You have equipped the Wizard Robe!");
    }

    @Override
    public void unequip() {
        System.out.println("You have unequipped the Wizard Robe!");
    }
}
