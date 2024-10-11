public class Armor extends Item {
    private int defence;
    private String material;

    public Armor(String name, double weight, int value, int defence, String material) {
        super(name, weight, value);
        this.defence = defence;
        this.material = material;
    }

    public int getDefence() {
        return defence;
    }

    @Override
    public String toString() {
        return super.toString() + ", Defence: " + defence;
    }
}
