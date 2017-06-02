package di.vending.coffee;

import di.vending.coffee.coffee.CoffeeType;

import java.util.List;
import java.util.Map;

/**
 * Created by nischal.k on 02/06/17.
 */
public interface CoffeeFactory {
    float vend(CoffeeType coffeeType, float price);

    Map<CoffeeType, Integer> getMenu();

    int refundLast();

    List<CoffeeType> getHistory();
}
