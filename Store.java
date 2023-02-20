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

    public void setToyWeight(int id, double chance) {
        for (Toy toy : this.store) {
            if (toy.getId() == id) {
                toy.setChance(chance);
                return;
            }
        }
    }

//    public void loadStore() {
//        this.addToy(new Toy(1, "Кукла", 30));
//        this.addToy(new Toy(2, "Мяч", 70));
//    }

    public Toy getRandomToy() {
        double totalWeight = 0;
        for (Toy toy : this.store) {
            totalWeight += toy.getChance();
        }
        double random = new Random().nextDouble() * totalWeight;
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
                FileWriter writer = new FileWriter("prizesAwarded.txt", true);
                writer.write(prizeToy + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
