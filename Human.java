public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean setMakeOrder(boolean makeOrder) {
        if (makeOrder){
            System.out.println("Покупатель с именем " + this.getName() + " сделал заказ.");
        }

        return super.isMakeOrder = makeOrder;
    }

    @Override
    public boolean setTakeOrder(boolean takeOrder) {
        if (takeOrder){
            System.out.println("Покупатель с именем " + this.getName() + " получил заказ.");
        }
        return super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
