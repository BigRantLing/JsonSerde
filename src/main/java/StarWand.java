import java.util.List;

public class StarWand implements Equipment{
    private String name;
    private int length;
    private int price;
    private List<String> effect;

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEffect(List<String> effect) {
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getEffect() {
        return effect;
    }
}
