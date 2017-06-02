package di.vending.coffee.coffee;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nischal.k on 02/06/17.
 */
public class BlackCoffee implements Coffee{
    private final List<Ingeredient> ingredients;
    private final int price;

    public BlackCoffee() {
        Ingeredient hotwater = new Ingeredient(IngerdientType.hotWater,10);
//        Ingeredient cream = new Ingeredient(IngerdientType.creamPoweder, 1000);
//        this.ingredients = Arrays.asList(hotwater, cream);
        this.ingredients = Arrays.asList(hotwater);
        this.price = 50;
    }

    @Override
    public List<Ingeredient> getIngredients() {
        return ingredients;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
