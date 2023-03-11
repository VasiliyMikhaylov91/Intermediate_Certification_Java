import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ToyShop {
    private List<Toy> toyList = new ArrayList<>();
    private List<Toy> lotteryList;
    private ArrayDeque<Toy> winnerQueue = new ArrayDeque();

    public void addToy(Toy newToy) {
        toyList.add(newToy);
    }


    public void lottery() {
        lotteryList = new ArrayList<>();
        for (Toy toy: toyList) {
            if (toy.getNumbers() != 0) {
                lotteryList.add(toy);
            }
        }
        int lotteryRange = 0;
        for (Toy toy: lotteryList) {
            lotteryRange += toy.getFrequency();
        }
        int lotteryNumber = (int) (Math.random() * lotteryRange) + 1;
        Toy winToy = null;
        int lowLimit = 1;
        for (Toy toy: lotteryList) {
            int highLimit = lowLimit + toy.getFrequency();
            if (lotteryNumber >= lowLimit && lotteryNumber < highLimit) {
                winToy = toy;
                break;
            }
            lowLimit = highLimit;
        }
        winToy.reduceNumbers();
        winnerQueue.addLast(winToy);
    }

    public void getWinToy() {
        if (!winnerQueue.isEmpty()) {
            Toy toy = winnerQueue.getFirst();
            try(FileWriter writer = new FileWriter("YourPrise.txt", false)) {
                writer.write(toy.getName());
                writer.flush();
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
