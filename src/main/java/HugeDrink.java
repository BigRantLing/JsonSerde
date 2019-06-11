public class HugeDrink implements Equipment{
    private String name;
    private int capacity;
    private String effect;

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getEffect() {
        return effect;
    }
}
