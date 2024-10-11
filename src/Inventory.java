import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();

        items.add(new Sword());
        items.add(new Mace());
        items.add(new MagicalStick());
        items.add(new KnightArmor());
        items.add(new WizardRobe());
        items.add(new HealthPotion());
        items.add(new ManaPotion());
        items.add(new DamagePotion());
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void showInventory() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            for (Item item : items) {
                System.out.println(item.getName());
            }
        }
    }

    public void getWeapons() {
        for (Item item : items) {
            if (item instanceof Weapon) {
                System.out.println(item.getName());
            }
        }
    }

    public void getArmor() {
        for (Item item : items) {
            if (item instanceof Armor) {
                System.out.println(item.getName());
            }
        }
    }

    public void getConsumables() {
        for (Item item : items) {
            if (item instanceof Consumable) {
                System.out.println(item.getName());
            }
        }
    }
}
