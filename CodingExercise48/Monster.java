import java.util.*;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        
        values.add(name);
        values.add(String.valueOf(hitPoints));
        values.add(String.valueOf(strength));
        
        return values;
    }
    
    @Override 
    public void read(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        
        name = list.get(0);
        hitPoints = Integer.parseInt(list.get(1));
        strength = Integer.parseInt(list.get(2));
    }
    
    @Override
    public String toString() {
        return "Monster{name='%s', hitPoints=%d, strength=%d}".formatted(getName(), getHitPoints(), getStrength());
    }
    
    public String getName() {
        return name;
    }
    
    public int getHitPoints() {
        return hitPoints;
    }
    
    public int getStrength() {
        return strength;
    }
}
