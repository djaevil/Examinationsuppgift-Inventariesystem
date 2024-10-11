import java.util.Scanner;
import java.util.List;
import static java.lang.System.exit;

public class Game {
    public static void main(String[] args) {

        Player player = new Player();
        Inventory inventory = player.getInventory();
        Enemy enemy = new Enemy();

        System.out.println("You stand before your enemy, Sauron!");
        System.out.println("What do you want to do?");
        System.out.println(List.of("1. Attack", "2. Check equipped items", "3. Check inventory", "4. Check stats", "5. Backflip into the volcano"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter option 1, 2, 3, 4 or 5: ");
        int option = scanner.nextInt();

        while (true) {
            if (option == 1) {
                player.attack(enemy);
                if (enemy.enemyHealth <= 0) {
                    System.out.println("You defeated Sauron! You win!");
                    exit(0);
                } else if (player.health <= 0) {
                    System.out.println("Game over!");
                    exit(0);
                } else {
                    System.out.println("Now what?");
                    System.out.println(List.of("1. Attack", "2. Check equipped items", "3. Check inventory", "4. Check stats", "5. Backflip into the volcano"));
                    option = scanner.nextInt();
                }
            } else if (option == 2) {
                player.equippedItems();
                System.out.println("Do you want to unequip any items?");
                System.out.println(List.of("1. Weapon", "2. Armor", "3. Both", "4. No"));

                int unequipOption = scanner.nextInt();

                if (unequipOption == 1) {
                    player.unequipWeapon();
                } else if (unequipOption == 2) {
                    player.unequipArmor();
                } else if (unequipOption == 3) {
                    player.unequipWeapon();
                    player.unequipArmor();
                } else if (unequipOption == 4) {
                    System.out.println("You chose not to unequip any items.");
                } else {
                    System.out.println("You chose death. Game over!");
                    exit(0);
                }
                System.out.println("Now what?");
                System.out.println(List.of("1. Attack", "2. Check equipped items", "3. Check inventory", "4. Check stats", "5. Backflip into the volcano"));
                option = scanner.nextInt();
            } else if (option == 3) {
                inventory.showInventory();
                System.out.println("Do you want to use or equip any items?");
                System.out.println(List.of("1. Equip weapon", "2. Equip armor", "3. Use consumable", "4. No"));
                int useOption = scanner.nextInt();

                if (useOption == 1) {
                    System.out.println("Which weapon do you want to equip?");
                    inventory.getWeapons();
                    System.out.println("Enter the name of the weapon: ");
                    String weaponOption = scanner.next();
                    switch (weaponOption) {
                        case "Sword" -> player.equipWeapon(new Sword());
                        case "MagicalStick" -> player.equipWeapon(new MagicalStick());
                        case "Mace" -> player.equipWeapon(new Mace());
                        default -> {
                            System.out.println("You chose death. Game over!");
                            exit(0);
                        }
                    }
                } else if (useOption == 2) {
                    System.out.println("Which armor do you want to equip?");
                    inventory.getArmor();
                    System.out.println("Enter the name of the armor: ");
                    String armorOption = scanner.next();
                    switch (armorOption) {
                        case "KnightArmor" -> player.equipArmor(new KnightArmor());
                        case "WizardRobe" -> player.equipArmor(new WizardRobe());
                        default -> {
                            System.out.println("You chose death. Game over!");
                            exit(0);
                        }
                    }
                } else if (useOption == 3) {
                    System.out.println("Which consumable do you want to use?");
                    inventory.getConsumables();
                    System.out.println("Enter the name of the consumable: ");
                    String consumableOption = scanner.next();
                    switch (consumableOption) {
                        case "HealthPotion" -> player.useConsumable(new HealthPotion());
                        case "ManaPotion" -> player.useConsumable(new ManaPotion());
                        case "DamagePotion" -> player.useConsumable(new DamagePotion());
                        default -> {
                            System.out.println("You chose death. Game over!");
                            exit(0);
                        }
                    }
                } else if (useOption == 4) {
                    System.out.println("You chose not to use any items.");
                } else {
                    System.out.println("You chose death. Game over!");
                    exit(0);
                }
                System.out.println("Now what?");
                System.out.println(List.of("1. Attack", "2. Check equipped items", "3. Check inventory", "4. Check stats", "5. Backflip into the volcano"));
                option = scanner.nextInt();
            } else if (option == 4) {
                player.showStats();
                System.out.println("Now what?");
                System.out.println(List.of("1. Attack", "2. Check equipped items", "3. Check inventory", "4. Check stats", "5. Backflip into the volcano"));
                option = scanner.nextInt();
            } else if (option == 5) {
                System.out.println("You tripple backflip mega spin hole-in-one dunk yourself into the volcano.");
                System.out.println("Sauron watches in awe as you disappear into the lava.");
                System.out.println("He then proceeds to jump after you and dies...");
                System.out.println("You win!");
                exit(0);
            } else {
                System.out.println("You chose death. Game over!");
                exit(0);
            }
        }
    }
}
