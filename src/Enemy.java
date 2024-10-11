public class Enemy {
    public String name = "Sauron";
    public int enemyHealth = 35;
    public int enemyAttackDamage = 17;

    public void attack(Player player) {
        if (player.defence > 0 && player.defence >= enemyAttackDamage) {
            player.defence -= enemyAttackDamage;
            System.out.println(name + " attacked Player for " + enemyAttackDamage + " damage!");
        } else if (player.defence > 0) {
            player.defence -= enemyAttackDamage;
            player.health += player.defence;
            System.out.println(name + " attacked Player for " + enemyAttackDamage + " damage!");
        } else if (player.health <= enemyAttackDamage) {
            player.health = 0;
            System.out.println("You died!");
        } else {
            player.health -= enemyAttackDamage;
            System.out.println(name + " attacked Player for " + enemyAttackDamage + " damage!");
        }
    }
}
