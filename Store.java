import java.util.ArrayList;

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

    public void play() {
        // метод запускает розыгрыш
    }

}
