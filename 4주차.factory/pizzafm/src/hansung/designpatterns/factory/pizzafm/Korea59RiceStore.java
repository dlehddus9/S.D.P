package hansung.designpatterns.factory.pizzafm;

public class Korea59RiceStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("bacon")) {
            return new Korea59RiceBaconPizza(); //베이컨피자
        } else if (item.equals("byte")) { //바이트골드피자
            return new Korea59RiceBytePizza();
        } else if (item.equals("hotspicy")) { //핫스파이시피자
            return new Korea59RiceHotspicyPizza();
        } else if (item.equals("sweetpotato")) { //고구마피자
            return new Korea59RiceSweetpotatoPizza();
        } else return null;
    }
}
