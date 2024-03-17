import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
    System.out.println("Покупатель: " + actor.getName() + " пришел в магазин.");
    this.takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.forEach((actor) -> {
            System.out.println("Покупатель с именем " + actor.getName() + " ушел из магазина.");
        });
    }

    @Override
    public void update() {
        System.out.println("Обвновление магазина.");
        this.takeOrders();
        this.giveOrders();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Магазин добавил покупателя с именем " + actor.getName() + " в очередь.");
    queue.add(actor);
    }

    @Override
    public void takeOrders() {
        System.out.println("Магазин приглашает сделать заказ.");
        this.queue.forEach((actor) -> {
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
            }
        });
        System.out.println("Магазин принял заказы.");
    }

    @Override
    public void giveOrders() {
        System.out.println("Магазин выдает заказы.");
        this.queue.forEach((actor) -> {
            if (actor.isMakeOrder() && !actor.isTakeOrder()){
                actor.setTakeOrder(true);
            }
        });
    }

    @Override
    public void releaseFromQueue() {
        System.out.println("Освобождение из очереди.");
        List<Actor> actorsToRelease = new ArrayList<>();
        for (Iterator<Actor> it = this.queue.iterator(); it.hasNext();) {
            Actor actor = it.next();
            if (actor.isTakeOrder()) {
                actorsToRelease.add(actor);
                it.remove();
                System.out.println("Покупатель с именем " + actor.getName() + " удален из очереди.");
            }
        }
        this.releaseFromMarket(actorsToRelease);
    }
}
