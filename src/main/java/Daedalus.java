
import java.util.List;
import java.util.Map;

public class Daedalus implements Equipment {
    private String name;
    private String weight;
    private int damage;
    private List<String> roles;
    private Map<String,String> origin;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public void setOrigin(Map<String, String> origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getDamage() {
        return damage;
    }

    public List<String> getRoles() {
        return roles;
    }

    public Map<String, String> getOrigin() {
        return origin;
    }
}
