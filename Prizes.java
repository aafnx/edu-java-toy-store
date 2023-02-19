import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.ArrayDeque;

public class Prizes {
    Queue<Toy> prizes;
    Store store;
    public Prizes(Store store) {
        this.store = store;
        this.prizes = new ArrayDeque<Toy>();
    }
    public void addToPrizes(Toy toy) {
        this.prizes.add(toy);
    }
    // запись в файл нужно вынести в отдельный метод/класс
    public Toy getPrize() {
        try (FileWriter fw = new FileWriter("prizesAwarded.txt", true)) {
            Toy prizeToy = this.prizes.remove();
            fw.write(prizeToy.toString());
            fw.write("\n");
            return prizeToy;
        } catch (NoSuchElementException e) {
            System.out.println("Призов для выдачи нет");
            return null;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
