package di.vending.coffee.dispenser;

import di.vending.coffee.coffee.IngerdientType;
import di.vending.coffee.coffee.Ingeredient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nischal.k on 02/06/17.
 */
public class DispenserFacotryImpl implements DispenserFactory{
    private final Map<IngerdientType, Dispenser> dispenserMap;

    public DispenserFacotryImpl() {
        Map<IngerdientType, Dispenser> dispenserMap  = new HashMap<>();
        dispenserMap.put(IngerdientType.hotWater, new HotWaterDispenser());
        this.dispenserMap = dispenserMap;
    }

    @Override
    public void dispense(List<Ingeredient> ingeredients) {
        for(Ingeredient ingredient: ingeredients) {
            Dispenser dispenser = dispenserMap.get(ingredient.getIngerdientType());
            if (dispenser == null) {
                throw new UnsupportedOperationException("dispenser not supported");
            }
            dispenser.dispense(ingredient);
            System.out.println("dispenseed" + ingredient);
        }
    }
}
