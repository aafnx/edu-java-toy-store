public class main {
    public static void main(String[] args) {
        Store store = new Store();
//        store.loadStore();
        store.addToy(new Toy(1, "Кукла", 30));
        store.addToy(new Toy(2, "Мяч", 70));
        store.play();

//        Prizes prizes = new Prizes(store);

//
//        prizes.addToPrizes(ball);
//        prizes.addToPrizes(test);
//        System.out.println(prizes.getPrize());
//        System.out.println(prizes.getPrize());
//        prizes.getPrize();
//
//        System.out.println(test);
    }
}
