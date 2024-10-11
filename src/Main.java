public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        System.out.println("Items in the inventory: ");

        Inventory inventory = player.getInventory();
        inventory.showInventory();

        inventory.addItem(new DamagePotion());

        inventory.addItem(new Sword());

        System.out.println("--------BLABLAAAAAAAAAAAAA--------------");

        inventory.showInventory();

        inventory.removeItem(new Mace());

        System.out.println("-------No more Mace!-------");

        inventory.showInventory();








//        // Equip a sword from the inventory
//        // Predefined in the inventory

//
//        // Equip armor from the inventory
//          // Predefined in the inventory
//        KnightArmor armor = new KnightArmor();
//        player.equipArmor(armor);  // Output: "John is equipping armor: Knight Armor"
//
//        // Display currently equipped items
//        player.equippedItems();  // Output: Weapon: Sword, Armor: Knight Armor
//
//        System.out.println("Items in the inventory before unequipping: ");
//        inventory.showInventory();
//
//        // Now unequip the sword and armor
//        player.unequipWeapon();  // Output: "John has unequipped weapon: Sword"
//        player.unequipArmor();   // Output: "John has unequipped armor: Knight Armor"
//
//        // Try to unequip again (nothing is equipped now)
//        player.unequipWeapon();  // Output: "No weapon is currently equipped."
//        player.unequipArmor();   // Output: "No armor is currently equipped."
//
//        // Display inventory again to show the items are back
//        System.out.println("Items in the inventory after unequipping: ");
//        inventory.showInventory();
    }
}
