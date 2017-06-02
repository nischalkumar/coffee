package di.vending.coffee.dispenser;

import di.vending.coffee.coffee.Ingeredient;
import di.vending.coffee.exception.IngredientInAvailableException;

/**
 * Created by nischal.k on 02/06/17.
 */
public class HotWaterDispenser implements Dispenser {
    private int quantity;





    public HotWaterDispenser() {
        this.quantity = 1000;
    }

    @Override
    public void dispense(Ingeredient ingeredient) throws IngredientInAvailableException {
        if(ingeredient.getQuantity()>quantity) {
            throw new IngredientInAvailableException("hot water not available");
        }
        quantity= quantity-ingeredient.getQuantity();
    }

    @Override
    public int getQuantityLeft() {
        return quantity;
    }


}
