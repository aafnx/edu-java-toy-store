public class main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addToy(new Toy(1, "Кукла", 30));
        store.addToy(new Toy(2, "Мяч", 50));
        store.addToy(new Toy(3, "Робот", 20));

        store.play();
    }
}
