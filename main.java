public class main {
    public static void main(String[] args) {
        Store store = new Store();
        Toy test = new Toy(1, "Тест", 0.3F);
        Toy ball = new Toy(2, "Мяч", 0.7F);
        store.addToy(test);
        store.addToy(ball);

        Prizes prizes = new Prizes(store);

        prizes.addToPrizes(ball);
        prizes.addToPrizes(test);
        System.out.println(prizes.getPrize());
        System.out.println(prizes.getPrize());
        prizes.getPrize();

        System.out.println(test);
    }
}
