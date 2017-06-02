package di.vending.coffee;

import di.vending.coffee.coffee.BlackCoffee;
import di.vending.coffee.coffee.Coffee;
import di.vending.coffee.coffee.CoffeeType;
import di.vending.coffee.dispenser.DispenserFacotryImpl;
import di.vending.coffee.dispenser.DispenserFactory;
import di.vending.coffee.exception.IngredientInAvailableException;
import di.vending.coffee.exception.PriceLessException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nischal.k on 02/06/17.
 */
public class CoffeeFactoryImpl implements CoffeeFactory {
    private final Map<CoffeeType, Coffee> coffeeMap;
    private final Map<CoffeeType, Integer> coffeePriceMap;
    private final DispenserFactory dispenserFactory;

    private final List<CoffeeType> history;

    public CoffeeFactoryImpl() {
        this.dispenserFactory = new DispenserFacotryImpl();
        Map<CoffeeType, Coffee> coffeeMap = new HashMap<>();
        BlackCoffee blackCoffee = new BlackCoffee();
        coffeeMap.put(CoffeeType.black, blackCoffee);
        this.coffeeMap = coffeeMap;

        Map<CoffeeType, Integer> coffeePriceMap = new HashMap<>();
        coffeePriceMap.put(CoffeeType.black, blackCoffee.getPrice());
        this.coffeePriceMap = coffeePriceMap;

        this.history = new ArrayList<>();
    }

    public float vend(CoffeeType coffeeType, float price) {
        Coffee coffee = coffeeMap.get(coffeeType);
        if(price<coffee.getPrice()) {
            throw new PriceLessException("prices is less");
        }
        try {
            dispenserFactory.dispense(coffee.getIngredients());
        } catch (IngredientInAvailableException e) {
            System.out.println("could not dispnse");
            return price;
        }
        history.add(coffeeType);
        return price-coffee.getPrice();
    }

    public Map<CoffeeType, Integer> getMenu() {
        return coffeePriceMap;
    }

    public int refundLast() {
        throw  new UnsupportedOperationException("can not refund once paid");
    }

    public List<CoffeeType> getHistory() {
        return history;
    }
}
