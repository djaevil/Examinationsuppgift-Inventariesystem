public class Consumable extends Item {
    private String effect;

    public Consumable(String name, double weight, int value, String effect) {
        super(name, weight, value);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    @Override
    public String toString() {
        return super.toString() + ", Effect: " + effect;
    }
}
