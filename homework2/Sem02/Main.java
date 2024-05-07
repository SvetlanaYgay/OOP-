package Sem02;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor client1 = new Human("Василий");
        Actor client2 = new Human("Петр");
        Actor client3 = new Human("Маша");
        Actor client4 = new Human("Света");
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        market.update();
    }
}
