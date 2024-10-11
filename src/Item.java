public class Item {
    private String name;
    private double weight;
    private int value;

    public Item(String name, double weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }
     public String getName() {
        return name;
     }

//     public double getWeight() {
//        return weight;
//     }
//
//     public int getValue() {
//        return value;
//     }

     @Override
        public String toString() {
            return "Name: " + name + ", weight: " + weight + ", Value: " + value;
        }

     @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            return name.equals(item.name) && weight == item.weight && value == item.value;
        }

     @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + (int) weight;
            result = 31 * result + value;
            return result;
        }
}