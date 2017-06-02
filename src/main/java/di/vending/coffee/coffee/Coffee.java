package di.vending.coffee.coffee;

import java.util.List;

/**
 * Created by nischal.k on 02/06/17.
 */
public interface Coffee {
    List<Ingeredient> getIngredients();
    int getPrice();
}
