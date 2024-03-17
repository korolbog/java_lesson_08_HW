public class Main {
    public static void main(String[] args) {
        Human alex = new Human("Alex");
        Human ben = new Human("Ben");
        Human carl = new Human("Carl");

        Market lidl = new Market();
        lidl.acceptToMarket(alex);
        lidl.acceptToMarket(ben);
        lidl.update();
        lidl.acceptToMarket(carl);
        lidl.releaseFromQueue();
    }
}