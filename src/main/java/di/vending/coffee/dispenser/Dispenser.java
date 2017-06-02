package di.vending.coffee.dispenser;

import di.vending.coffee.coffee.Ingeredient;
import di.vending.coffee.exception.IngredientInAvailableException;

/**
 * Created by nischal.k on 02/06/17.
 */
public interface Dispenser {
    void dispense(Ingeredient ingeredient) throws IngredientInAvailableException;
    public int getQuantityLeft();
}
