package di.vending.coffee.dispenser;

import di.vending.coffee.coffee.Ingeredient;

import java.util.List;

/**
 * Created by nischal.k on 02/06/17.
 */
public interface DispenserFactory {
    void dispense(List<Ingeredient> ingeredients);
}
