import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Store {
    ArrayList<Toy> store;

    public Store() {
        this.store = new ArrayList<Toy>();
    }
    public ArrayList<Toy> getToys() {
        return store;
    }
    public void addToy(Toy toy) {
        this.store.add(toy);
    }
    public void setToyChance(int id, double chance) {
        for (Toy toy : this.store) {
            if (toy.getId() == id) {
                toy.setChance(chance);
                return;
            }
        }
    }
    public Toy getRandomToy() {
        double totalChance = 0;
        for (Toy toy : this.store) {
            totalChance += toy.getChance();
        }
        double random = new Random().nextDouble() * totalChance;
        for (Toy toy : this.store) {
            random -= toy.getChance();
            if (random <= 0) {
                return toy;
            }
        }
        return null;
    }

    public void play() {
        Toy prizeToy = this.getRandomToy();
        if (prizeToy != null) {
            this.store.remove(prizeToy);
            try {
                FileWriter writer = new FileWriter("./src/prizesAwarded.txt", true);
                writer.write(prizeToy + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
