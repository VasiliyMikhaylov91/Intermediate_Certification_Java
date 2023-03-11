public class Main {
    public static void main(String[] args) {
        ToyShop ts = new ToyShop();
        ts.addToy(new Toy(1,"Car", 4, 33));
        ts.addToy(new Toy(2,"Doll", 6, 33));
        ts.addToy(new Toy(3,"Bus", 12, 34));
        ts.lottery();
        ts.getWinToy();
    }
}
