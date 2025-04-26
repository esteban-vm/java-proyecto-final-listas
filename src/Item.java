public class Item implements Comparable<Item> {
    private final double value;
    private final String description;

    public Item(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item: value=" + value + ", description='" + description + '\'';
    }


    @Override
    public int compareTo(Item item) {
        return Double.compare(this.value, item.getValue());
    }
}
