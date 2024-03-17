public interface ActorBehaviour {
    boolean setMakeOrder (boolean makeOrder);
    boolean setTakeOrder (boolean takeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}

/**
 * Интерфейс ActorBehaviour, который будет содержать
 * описание возможных действий актора в очереди/магазине:
 * void: setMakeOrder
 * void: setTakeOrder
 * boolean: isMakeOrder
 * boolean: isTakeOrder
 */