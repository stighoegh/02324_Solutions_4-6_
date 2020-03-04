package dto;
import java.io.Serializable;

public class IngDTO implements Serializable {
        int id;
        String name;
        int amount;

    public IngDTO(int id, String name, int amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }
       @Override
        public String toString() {
            return id + " \'" + name + "\'" + " (" + amount + " gram)";
        }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
