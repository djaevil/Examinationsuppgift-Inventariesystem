public class Player {
    public int health;
    public int maxHealth = 25;
    public int mana;
    public int maxMana = 50;
    public int attackDamage;
    public int defaultAttackDamage = 5;
    public int defence;
    public Inventory inventory;
    public Weapon equippedWeapon;
    public Armor equippedArmor;

    public Player() {
        this.health = maxHealth;
        this.mana = maxMana;
        this.attackDamage = defaultAttackDamage;
        this.defence = 0;
        this.inventory = new Inventory();
        this.equippedWeapon = null;
        this.equippedArmor = null;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void showStats() {
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Damage: " + attackDamage);
        System.out.println("Defence: " + defence);
    }

    public void equipWeapon(Weapon weapon) {
        if (weapon instanceof Equippable) {
            if (equippedWeapon != null) {
                System.out.println(equippedWeapon.getName() + " has already been equipped!");
            } else {
                this.equippedWeapon = weapon;
                this.attackDamage += weapon.getDamage() - defaultAttackDamage;
                inventory.removeItem(weapon);
                System.out.println(weapon.getName() + " has been equipped!");
            }
       } else {
            System.out.println(weapon.getName() + " cannot be equipped!");
        }
    }

    public void unequipWeapon() {
        if (equippedWeapon != null) {
            inventory.addItem(equippedWeapon);
            this.attackDamage -= equippedWeapon.getDamage() - defaultAttackDamage;
            this.equippedWeapon = null;
            System.out.println("Weapon has been unequipped!");
        } else {
            System.out.println("There is no equipped weapon!");
        }
    }

    public void equipArmor(Armor armor) {
        if (armor instanceof Equippable) {
            if (equippedArmor != null) {
                System.out.println(equippedArmor.getName() + " has already been equipped!");
            } else {
                this.equippedArmor = armor;
                this.defence = armor.getDefence();
                inventory.removeItem(armor);
                System.out.println(armor.getName() + " has been equipped!");
            }
        } else {
            System.out.println(armor.getName() + " cannot be equipped!");
        }
    }

    public void unequipArmor() {
        if (equippedArmor != null) {
            inventory.addItem(equippedArmor);
            this.defence = 0;
            this.equippedArmor = null;
            System.out.println("Armor has been unequipped!");
        } else {
            System.out.println("There is no equipped armor!");
        }
    }

    public void equippedItems() {
        System.out.println("Equipped items: ");
        if (equippedWeapon != null) {
            System.out.println("Weapon: " + equippedWeapon.getName());
        } else {
            System.out.println("No equipped weapon! ");
        }
        if (equippedArmor != null) {
            System.out.println("Armor: " + equippedArmor.getName());
        } else {
            System.out.println("No equipped armor! ");
        }
    }

    public void useConsumable(Consumable consumable) {
        if (consumable instanceof Usable) {
            ((Usable) consumable).use();
            if (consumable instanceof HealthPotion) {
                this.health += ((HealthPotion) consumable).getHealthRestored();
                if (health > maxHealth) {
                    health = maxHealth;
                }
            } else if (consumable instanceof ManaPotion) {
                this.mana += ((ManaPotion) consumable).getManaRestored();
                if (mana > maxMana) {
                    mana = maxMana;
                }
            } else if (consumable instanceof DamagePotion) {
                this.attackDamage += ((DamagePotion) consumable).getDamage();
            }
            inventory.removeItem(consumable);
        } else {
            System.out.println(consumable.getName() + " cannot be used!");
        }
    }

    public void attack(Enemy enemy) {
        if (enemy.enemyHealth <= attackDamage) {
            System.out.println("You killed " + enemy.name + "!");
            enemy.enemyHealth = 0;
        } else {
            enemy.enemyHealth -= attackDamage;
            System.out.println("You attacked " + enemy.name + " for " + attackDamage + " damage!");
            enemy.attack(this);
        }
    }
}
